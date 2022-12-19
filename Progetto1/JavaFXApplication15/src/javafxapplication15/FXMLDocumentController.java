/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication15;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 *
 * @author patap
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<INGEvent> terremotoTable;
    @FXML
    private MenuItem menuSalva;
    @FXML
    private TableColumn<INGEvent, LocalDateTime> dateClm;
    @FXML
    private TableColumn<INGEvent, String> magnitudeClm;
    @FXML
    private TableColumn<INGEvent, String> locationClm;
    @FXML
    private TextField txdLimiter;
    @FXML
    private Button btnLoad;
    @FXML
    private DatePicker dataStart;
    @FXML
    private DatePicker dataEnd;

    private ObservableList<INGEvent> list;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
//        dataStart.setChronology(value);
          list = FXCollections.observableArrayList();
          
       dateClm.setCellValueFactory(new PropertyValueFactory("time"));
       magnitudeClm.setCellValueFactory(new PropertyValueFactory("magnitude"));      
       locationClm.setCellValueFactory(new PropertyValueFactory("eventLocationName"));      

       
       terremotoTable.setItems(list);     


    }    

    @FXML
    private void salvaAction(ActionEvent event) {
    }

    @FXML
    private void loadAction(ActionEvent event) {
    }
    
}
