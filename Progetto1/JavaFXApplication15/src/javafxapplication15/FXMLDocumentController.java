/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication15;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;

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
    @FXML
    private ProgressIndicator pgIndicator;
    
    private ObservableList<INGEvent> list;
    private IntegerProperty numL;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
//
        dataStart.setValue(LocalDate.now());
        dataEnd.setValue(LocalDate.now());
        
        list = FXCollections.observableArrayList();
          
        dateClm.setCellValueFactory(new PropertyValueFactory("time"));
        magnitudeClm.setCellValueFactory(new PropertyValueFactory("magnitude"));      
        locationClm.setCellValueFactory(new PropertyValueFactory("eventLocationName"));      

       
        terremotoTable.setItems(list);     

        StringConverter sc = new IntegerStringConverter();        
        Bindings.bindBidirectional(txdLimiter.textProperty(), numL, sc);
        
        UnaryOperator<TextFormatter.Change> integerFilter = change -> {
        String newText = change.getControlNewText();
        if (newText.matches("([0-9]*)?")) { 
            return change;
        }
        return null;
        };
        txdLimiter.setTextFormatter(new TextFormatter<>(new IntegerStringConverter(), null, integerFilter));
        
        
    }    

    @FXML
    private void salvaAction(ActionEvent event) {
    }

    @FXML
    private void loadAction(ActionEvent event) {
        
        
    }
    
}
