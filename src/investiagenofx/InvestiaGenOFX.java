/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.util.WebClientUtils;
import static investiagenofx.util.PropertiesInit.getProperties;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Pierre
 */
public class InvestiaGenOFX extends Application {

    /**
     *
     */
    private static Stage pStage;
    private static WebClient webClient;
    private static Logger log;

    @Override
    public void start(Stage primaryStage) throws Exception {
        pStage = primaryStage;
        // Make sure we are in English on French java plateform
        Locale.setDefault(Locale.ENGLISH);
        webClient = new WebClient(BrowserVersion.FIREFOX_38);
//        WebClientUtils.attachVisualDebugger(webClient);
        Parent root = FXMLLoader.load(getClass().getResource("view/investiaGenOFX.fxml"));

        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image("/myIcons/Teddy-Bear-Sick-icon.png"));
        primaryStage.setTitle("Génération de fichier OFX pour Investia");
        primaryStage.setScene(scene);
        primaryStage.show();

        final BooleanProperty ignoreCloseRequest = new SimpleBooleanProperty(true);

        // When a button has focus and enter key is pressed we fireup the Button
        getPrimaryStage().addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(final KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    if (getPrimaryStage().getScene().getFocusOwner() instanceof Button) {
                        ((Button) getPrimaryStage().getScene().getFocusOwner()).fire();
                        event.consume();
                    }
                }
            }
        });

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(final WindowEvent event) {
                if (ignoreCloseRequest.get()) {
//                    System.out.println("Ignoring close request");
                    event.consume();
//                    ignoreCloseRequest.set(true);
                }
            }
        });

    }

    @Override
    public void init() throws Exception {
        try {
            LogManager.getLogManager().readConfiguration(InvestiaGenOFX.class.getResourceAsStream("logging.properties"));
        } catch (IOException e) {
            System.out.println("Unable to initialize logging.properties");
        }
        log = Logger.getLogger(InvestiaGenOFX.class.getName());

        getProperties();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getPrimaryStage() {
        return pStage;
    }

    public static WebClient getWebClient() {
        return webClient;
    }
}
