/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simulazionenumerotelefono;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;

/**
 * FXML Controller class
 *
 * @author patap
 */
public class FXMLLogInController implements Initializable {

    @FXML
    private PasswordField tfdPass;
    @FXML
    private Button btnSblocca;
    @FXML
    private Label lblErrorOTP;

    private GenerateOTP slv;
    
    private IntegerProperty num;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
       btnSblocca.disableProperty().bind(tfdPass.textProperty().isEmpty());
       
       StringConverter sc = new IntegerStringConverter();
       num = new SimpleIntegerProperty();
       Bindings.bindBidirectional(tfdPass.textProperty(), num, sc);
       tfdPass.clear();
              
       slv = new GenerateOTP(true);       
       Thread tslv = new Thread(slv);
       tslv.setDaemon(true);
       tslv.start(); 
       
    }    

    @FXML
    private void sbloccaAction(ActionEvent event) {
        
       if(num.getValue() != slv.getOtp()){
                      
           lblErrorOTP.opacityProperty().setValue(1);
           
            Alert alert = new Alert(Alert.AlertType.ERROR, "Codice OTP errato!", ButtonType.CLOSE);
            alert.show();
           
           return;
       }
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
            Stage window = (Stage) btnSblocca.getScene().getWindow();
            Scene scene = new Scene(root);
            
            
            window.setScene(scene);            
            slv.setAttivo(false);
            
                } catch (IOException ex) {
            Logger.getLogger(FXMLLogInController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
