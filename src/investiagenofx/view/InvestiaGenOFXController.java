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
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;
import com.gargoylesoftware.htmlunit.html.HtmlSpan;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

import static investiagenofx.InvestiaGenOFX.webClient;
import static investiagenofx.InvestiaGenOFX.page;
import static investiagenofx.InvestiaGenOFX.accountHref;
import static investiagenofx.InvestiaGenOFX.accountNumber;
import investiagenofx.model.MyTransactions;
import investiagenofx.model.Transaction;
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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
import javafx.stage.Stage;
import javafx.util.StringConverter;
import ofx.OFX;

/**
 * FXML Controller class
 *
 * @author Pierre
 */
public class InvestiaGenOFXController implements Initializable {

    @FXML
    private TextField f_investiaURL;
    @FXML
    private ComboBox f_clientNum;
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
        webClient.close();
        PropertiesInit.setInvestiaURL(f_investiaURL.getText());
        PropertiesInit.setLastGenUsedDate(f_lastDate.getValue().toString());
        PropertiesInit.setClientNumList(f_clientNum.getItems().toString().replace("[", "").replace("]", ""));
        PropertiesInit.setProperties();
        Platform.exit();
    }

    @FXML
    void login(ActionEvent event) {
        try {
            page = webClient.getPage(f_investiaURL.getText());
//            page = webClient.getPage("file:///C:/Users/Pierre/Downloads/InvestiaTest/Login.htm");
            // English please 
            HtmlAnchor anchor = page.getHtmlElementById("a0");
            if (anchor.getTextContent().toLowerCase().startsWith("english")) {
                page = webClient.getPage(f_investiaURL.getText() + anchor.getHrefAttribute());
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
            page = webClient.getPage(f_investiaURL.getText() + anchor.getHrefAttribute());
//          page = webClient.getPage("file:///C:/Users/Pierre/Downloads/InvestiaTest/Login.htm");
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
                f_accountList.get(i).setText(div.asText());
                HtmlAnchor anchor = page.getHtmlElementById("regPanel:0:table:" + i + ":a6");
//                System.out.println(anchor.getTextContent());
//                System.out.println(anchor.getAttribute("title"));
                accountHref[i] = anchor.getHrefAttribute();
                accountNumber[i] = anchor.getAttribute("title").split(":")[1].trim();
            } catch (Exception ex) {
                break;
            }
        }
    }

    @FXML
    void genTransactions(ActionEvent event) {
        int idxButton = Integer.parseInt(event.toString().split("f_account")[1].substring(0, 1));
        try {
            // Get the transactions page for the account from the pressed button value=0..5 
            page = webClient.getPage(f_investiaURL.getText() + accountHref[idxButton]);
            // Switch to display 15 transactions per page
            HtmlSelect select = page.getHtmlElementById("j_id224:pageSize");
            select.setSelectedAttribute("15", true);
            select.click();
            page = webClient.getPage(f_investiaURL.getText() + accountHref[idxButton]);
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
//                            span = page.getHtmlElementById("table:" + j + ":closingUnitBalance");
                            String price = Float.toString(Float.parseFloat(amount) / Float.parseFloat(unit));

                            Transaction myTransaction = new Transaction(transDate, transacInfo[1], amount, fitid, symbol, unit, price);
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
                page = webClient.getPage(f_investiaURL.getText() + anchor.getHrefAttribute());
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
        ofx.setSECLISTMSGSRSV1(OFXUtilites.genSecurityListResponseMessageSet(myTransactions));
        String fileName = "Investia-" + myTransactions.getAcctID() + "-" + myTransactions.getDateLow().format(Utilities.myDateFormat()) + ".qfx";
        Utilities.genOFXFile(ofx, fileName);
        return fileName;
    }

    @FXML
    void about(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        ((Stage) alert.getDialogPane().getScene().getWindow()).getIcons().add(new Image("/myIcons/Teddy-Bear-Sick-icon.png"));
        alert.setTitle("Information");
        alert.setHeaderText("InvestiaGenOFX");
        alert.setContentText("Version 1.0");
        alert.show();
    }
}
