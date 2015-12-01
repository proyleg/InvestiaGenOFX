/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx.view;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;
import com.gargoylesoftware.htmlunit.html.HtmlSpan;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import investiagenofx.InvestiaGenOFX;

import investiagenofx.model.MyTransactions;
import investiagenofx.model.Transaction;
import investiagenofx.model.Investment;
import investiagenofx.util.MyOwnException;
import investiagenofx.util.OFXUtilites;
import investiagenofx.util.PropertiesInit;
import investiagenofx.util.Utilities;
import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import ofx.OFX;

/**
 * FXML Controller class
 *
 * @author Pierre
 */
public class InvestiaGenOFXController implements Initializable {
    private static HtmlPage page;
    private static  int nbrAccount = 5;
    private static  String[] accountHrefTransac = new String[nbrAccount];
    private static  String[] accountHrefInvest = new String[nbrAccount];
    private static  String[] accountNumber = new String[nbrAccount];

    public static ObservableList<Investment> investments;

    @FXML
    private TextField f_investiaURL;
    @FXML
    private ComboBox<String> f_clientNum;
    @FXML
    private PasswordField f_password;
    @FXML
    private Button f_login;
    @FXML
    private Button f_logout;
    @FXML
    private List<Button> f_accountList;
    @FXML
    private Button f_account0;
    @FXML
    private Button f_account1;
    @FXML
    private Button f_account2;
    @FXML
    private Button f_account3;
    @FXML
    private Button f_account4;
    @FXML
    private DatePicker f_lastDate;
    @FXML
    private MenuItem f_quitter;
    @FXML
    private Label f_message;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        f_investiaURL.setText(PropertiesInit.getInvestiaURL());
        f_lastDate.setValue(LocalDate.parse(PropertiesInit.getLastGenUsedDate()));
        String[] clientNums = PropertiesInit.getClientNumList().split(",");
        for (String clientNum : clientNums) {
            if (!clientNum.trim().isEmpty()) {
                f_clientNum.getItems().add(clientNum.trim());
            }
        }
        resetControls();

        f_clientNum.getEditor().addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.DELETE) {
                f_clientNum.getItems().remove(f_clientNum.getValue());
                event.consume();
            }
        }
        );

        f_clientNum.getEditor().textProperty()
                .addListener(new ChangeListener<String>() {
                    // The regular expression controlling the input, in this case we only allow number 0 to 9.
                    String restriction = "[0-9]";

                    private boolean ignore;

                    @Override
                    public void changed(
                            ObservableValue<? extends String> observableValue,
                            String oldValue, String newValue) {
                                if (ignore || newValue == null) {
                                    return;
                                }
                                if (!newValue.matches(restriction + "*")) {
                                    ignore = true;
                                    f_clientNum.getEditor().setText(oldValue);
                                    ignore = false;
                                }
                            }
                }
                );

        f_lastDate.setConverter(new StringConverter<LocalDate>() {
            String pattern = "yyyy-MM-dd";
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

            {
                f_lastDate.setPromptText(pattern.toLowerCase());
            }

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        }
        );

        //This deals with the bug located here where the datepicker value is not updated on focus lost
        //https://bugs.openjdk.java.net/browse/JDK-8092295?page=com.atlassian.jira.plugin.system.issuetabpanels:all-tabpanel
        f_lastDate.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue) {
                    f_lastDate.setValue(f_lastDate.getConverter().fromString(f_lastDate.getEditor().getText()));
                }
            }
        }
        );
    }

    void resetControls() {
        f_login.setDisable(false);
        f_logout.setDisable(true);
        f_clientNum.setDisable(false);
        f_clientNum.getEditor().setText("");
        f_password.setDisable(false);
        f_password.setText("");
        f_investiaURL.setDisable(false);
        f_quitter.setDisable(false);
        for (int i = 0; i < 5; i++) {
            f_accountList.get(i).setVisible(false);
        }
    }

    @FXML
    void quit(ActionEvent event) {
        InvestiaGenOFX.getWebClient().close();
        PropertiesInit.setInvestiaURL(f_investiaURL.getText());
        PropertiesInit.setLastGenUsedDate(f_lastDate.getValue().toString());
        PropertiesInit.setClientNumList(f_clientNum.getItems().toString().replace("[", "").replace("]", ""));
        PropertiesInit.setProperties();
        Platform.exit();
        System.exit(0);
    }

    @FXML
    void login(ActionEvent event) {
        try {
            page = InvestiaGenOFX.getWebClient().getPage(f_investiaURL.getText());
//            page = webClient.getPage("file:///C:/Users/Pierre/Downloads/InvestiaTest/Login.htm");
            // English please 
            HtmlAnchor anchor = page.getHtmlElementById("a0");
            if (anchor.getTextContent().toLowerCase().startsWith("english")) {
                page = InvestiaGenOFX.getWebClient().getPage(f_investiaURL.getText() + anchor.getHrefAttribute());
            }
            HtmlForm form = page.getFormByName("login");
            HtmlTextInput userId = form.getInputByName("login:userId");
            HtmlPasswordInput password = form.getInputByName("login:password");
            userId.setValueAttribute(f_clientNum.getEditor().getText());
            password.setValueAttribute(f_password.getText());
            HtmlSubmitInput signInButton = form.getInputByName("login:j_id52");
            page = signInButton.click();
//            page =  webClient.getPage("file:///C:/Users/Pierre/Downloads/InvestiaTest/InvalidLogin.htm");
//            page = webClient.getPage("file:///C:/Users/Pierre/Downloads/InvestiaTest/Dashboard.htm");
        } catch (Exception ex) {
            f_message.setText("Le système ne smble pas accessible. Voir le fichier de log...");
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            HtmlDivision div = page.getHtmlElementById("login:j_id35");
            f_message.setText(div.asText());
        } catch (ElementNotFoundException e) {
            f_login.setDisable(true);
            f_logout.setDisable(false);
            f_quitter.setDisable(true);
            f_clientNum.setDisable(true);
            f_password.setDisable(true);
            f_investiaURL.setDisable(true);
            f_message.setText("");
            if (!f_clientNum.getItems().contains(f_clientNum.getEditor().getText()) && !f_clientNum.getEditor().getText().trim().isEmpty()) {
                f_clientNum.getItems().add(f_clientNum.getEditor().getText());
            }
            getAccounts();
        }
    }

    @FXML
    void logout(ActionEvent event) {
        HtmlAnchor anchor = page.getHtmlElementById("a1");
        try {
            page = InvestiaGenOFX.getWebClient().getPage(f_investiaURL.getText() + anchor.getHrefAttribute());
//            page = webClient.getPage("file:///C:/Users/Pierre/Downloads/InvestiaTest/Login.htm");
        } catch (Exception ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
        resetControls();
    }

    private void getAccounts() {
        for (int i = 0; i < 100; i++) {
            try {
                HtmlDivision div = page.getHtmlElementById("regPanel:0:table:" + i + ":row");
                f_accountList.get(i).setVisible(true);
                f_accountList.get(i).setText(div.asText().replaceAll("(\r\n)+", "\r\n"));
                HtmlAnchor anchor = page.getHtmlElementById("regPanel:0:table:" + i + ":a6");
//                System.out.println(anchor.getTextContent());
//                System.out.println(anchor.getAttribute("title"));
                accountHrefTransac[i] = anchor.getHrefAttribute();
                accountNumber[i] = anchor.getAttribute("title").split(":")[1].trim();
                anchor = page.getHtmlElementById("regPanel:0:table:" + i + ":a5");
                accountHrefInvest[i] = anchor.getHrefAttribute();
            } catch (Exception ex) {
                break;
            }
        }
    }

    @FXML
    void genTransactions(ActionEvent event) {
        int idxButton = Integer.parseInt(event.toString().split("f_account")[1].substring(0, 1));
        getInvestments(idxButton);
        if (f_lastDate.getValue().isAfter(LocalDate.now())) {
            showInvestmentsSummary();
            return;
        }
        try {
            // Get the transactions page for the account from the pressed button value=0..5 
            page = InvestiaGenOFX.getWebClient().getPage(f_investiaURL.getText() + accountHrefTransac[idxButton]);
            // Switch to display 15 transactions per page
            HtmlSelect select = page.getHtmlElementById("j_id183:pageSize");
            select.setSelectedAttribute("15", true);
            select.click();
            page = InvestiaGenOFX.getWebClient().getPage(f_investiaURL.getText() + accountHrefTransac[idxButton]);
        } catch (Exception ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTransactions myTransactions = new MyTransactions(accountNumber[idxButton]);
        myTransactions = getTransactions(myTransactions);
        String fileName = "";
        try {
            fileName = genOFXFile(myTransactions);
        } catch (MyOwnException ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation ");
        alert.setHeaderText(null);
        alert.setContentText("Fichier OFX généré \rLance le fichier OFX?");
        ButtonType buttonTypeYes = new ButtonType("Oui");
        ButtonType buttonTypeNo = new ButtonType("Non");
        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeYes) {
            try {
                Utilities.launchFile(fileName);
            } catch (IOException ex) {
                Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
            }
            new File(fileName).deleteOnExit();
        }
        showInvestmentsSummary();
    }

    private void getInvestments(int accountIdx) {
        investments = FXCollections.observableArrayList();
        try {
            page = InvestiaGenOFX.getWebClient().getPage(f_investiaURL.getText() + accountHrefInvest[accountIdx]);
        } catch (Exception ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
        HtmlDivision div;
        div = (HtmlDivision) page.getByXPath("//div[@class='dateTxt ']").get(0);
        String[] tokenDate = div.asText().replace(",", "").split(" ");
        LocalDate balanceDate = LocalDate.parse(
                tokenDate[tokenDate.length - 3]
                + tokenDate[tokenDate.length - 2]
                + tokenDate[tokenDate.length - 1],
                DateTimeFormatter.ofPattern("MMMMddyyyy"));
        for (int i = 0; i < 1000; i++) {
            try {
                div = page.getHtmlElementById("table:" + i + ":row");
            } catch (ElementNotFoundException e) {
                break;
            }
            String[] token = div.asText().split("\r\n");
            String name = token[0].trim();
            String percentage = token[1].replace("%", "").trim();
            String marketValue = token[2].replace("CAD", "").replace(",", "").trim();
            if (name.equals("Cash")) {
                Investment investment = new Investment("", name, marketValue, "1", marketValue, percentage, balanceDate);
                investments.add(investment);
                continue;
            }
            div = (HtmlDivision) page.getByXPath("//div[@class='accountDetailsBlind investmentDesc']").get(i);
            HtmlTable table = (HtmlTable) div.getByXPath("table").get(0);
            String symbol = table.getCellAt(1, 1).getTextContent().replace(" ", "");

            div = (HtmlDivision) page.getByXPath("//div[@class='delimeterArrowLeftInv']").get(i);
            table = (HtmlTable) div.getByXPath("table").get(0);
            String quantity = table.getCellAt(5, 1).getTextContent().replace(",", "").trim();
            String lastPrice = table.getCellAt(6, 1).getTextContent().replace("\n", "").replace("CAD", "").trim();
            Investment investment = new Investment(symbol, name, quantity, lastPrice, marketValue, percentage, balanceDate);
            investments.add(investment);
        }
    }

    private MyTransactions getTransactions(MyTransactions myTransactions) {
        gotTransactions:
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                try {
                    HtmlDivision div = page.getHtmlElementById("table:" + j + ":d6");
                    String[] transacInfo = div.asText().split("\r\n");
                    // transactInfo[0] = date format MMM dd, YYYY
                    // transactInfo[1] = Transaction Type
                    LocalDate transDate = LocalDate.parse(transacInfo[0], DateTimeFormatter.ofPattern("MMM dd, yyyy"));
                    if (transDate.isBefore(f_lastDate.getValue())) {
                        break gotTransactions;
                    }
                    switch (transacInfo[1]) {
                        case "Distribution":
                        case "Purchase":
                        case "Redemption":
                        case "Transfer In":
                        case "Transfer Out":
                        case "Switch In":
                        case "Switch Out":
//                            System.out.println("TransDate " + transDate);
//                            System.out.println("TransType " + transacInfo[1]);
                            HtmlSpan span = page.getHtmlElementById("table:" + j + ":order-id");
                            String fitid = span.getTextContent().trim();
//                            span = page.getHtmlElementById("table:" + j + ":desc");
                            span = page.getHtmlElementById("table:" + j + ":symbol");
                            String symbol = span.getTextContent().trim().replace("(", "").replace(")", "");
                            span = page.getHtmlElementById("table:" + j + ":amount");
                            String amount = span.getTextContent().trim().replace("CAD", "").replace("(", "-").replace(")", "").replace(",", "");
//                            span = page.getHtmlElementById("table:" + j + ":deduction");
//                            span = page.getHtmlElementById("table:" + j + ":unit-price");
                            span = page.getHtmlElementById("table:" + j + ":units");
                            String unit = span.getTextContent().trim().replace(",", "");
                            span = page.getHtmlElementById("table:" + j + ":closingUnitBalance");
                            String unitBalance = span.getTextContent().trim().replace(",", "");
                            String price = Float.toString(Float.parseFloat(amount) / Float.parseFloat(unit));

                            Transaction myTransaction = new Transaction(transDate, transacInfo[1], amount, fitid, symbol, unit, price, unitBalance);
                            myTransactions.addTransaction(myTransaction);
                            if (transDate.isAfter(myTransactions.getDateHigh())) {
                                myTransactions.setDateHigh(transDate);
                            }
                            if (transDate.isBefore(myTransactions.getDateLow())) {
                                myTransactions.setDateLow(transDate);
                            }
                    }
                } catch (ElementNotFoundException e) {
                    break;
                } catch (Exception ex) {
                    Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
                    break;
                }
            }
            try {
                HtmlAnchor anchor = page.getHtmlElementById("next-trans-account");
                page = InvestiaGenOFX.getWebClient().getPage(f_investiaURL.getText() + anchor.getHrefAttribute());
            } catch (Exception ex) {
                break;
            }
        }
        return myTransactions;
    }

    private String genOFXFile(MyTransactions myTransactions) throws MyOwnException {
        OFXUtilites.setCurrency("CAD");
        OFX ofx = new OFX();
        ofx.setSIGNONMSGSRSV1(OFXUtilites.genSignonResponseMessageSet(myTransactions.getDtServer(), "Investia"));
        ofx.setINVSTMTMSGSRSV1(OFXUtilites.genTransacInvestmentStatementResponseMessageSet(myTransactions));
        ofx.setSECLISTMSGSRSV1(OFXUtilites.genSecurityListResponseMessageSet(myTransactions, investments));
        String fileName = "Investia-" + myTransactions.getAcctID() + "-" + myTransactions.getDateLow().format(Utilities.myDateFormat()) + ".qfx";
        Utilities.genOFXFile(ofx, fileName);
        return fileName;
    }

    private void showInvestmentsSummary() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(InvestiaGenOFX.class.getResource("view/investmentsSummary.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Sommaire des Investissements");
            dialogStage.getIcons().add(new Image("/myIcons/Teddy-Bear-Sick-icon.png"));
            dialogStage.initModality(Modality.WINDOW_MODAL);
            Scene scene = new Scene(page);
            dialogStage.initOwner(InvestiaGenOFX.getPrimaryStage());
            dialogStage.setX(InvestiaGenOFX.getPrimaryStage().getX() + 20);
            dialogStage.setY(InvestiaGenOFX.getPrimaryStage().getY() + 60);
            dialogStage.setScene(scene);
            dialogStage.showAndWait();
        } catch (Exception ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void about(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        ((Stage) alert.getDialogPane().getScene().getWindow()).getIcons().add(new Image("/myIcons/Teddy-Bear-Sick-icon.png"));
        alert.setTitle("Information");
        alert.setHeaderText("InvestiaGenOFX");
        alert.setContentText("Version 1.1_1");
        alert.show();
    }
}
