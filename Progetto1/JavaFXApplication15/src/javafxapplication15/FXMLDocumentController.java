/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication15;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author patap
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<?> terremotoTable;
    @FXML
    private MenuItem menuSalva;
    @FXML
    private TableColumn<?, ?> dateClm;
    @FXML
    private TableColumn<?, ?> magnitudeClm;
    @FXML
    private TableColumn<?, ?> locationClm;
    @FXML
    private TextField txdLimiter;
    @FXML
    private Button btnLoad;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvaAction(ActionEvent event) {
    }

    @FXML
    private void loadAction(ActionEvent event) {
    }
    
}
