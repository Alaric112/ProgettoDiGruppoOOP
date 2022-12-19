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
        
       CaricaReportService slv = new Background(); 
       slv.setUrl("http://webservices.ingv.it/fdsnws/event/1/query?starttime=2020-11-18T00%3A00%3A00&endtime=2020-11-25T23%3A59%3A59&minmag=2&maxmag=10&mindepth=-10&maxdepth=1000&minlat=-90&maxlat=90&minlon=-180&maxlon=180&minversion=100&orderby=time-asc&format=text&limit=10000");
       // Lega la visibilita del indicatore a quando viene runnato il thread "slv" di servizio
       pgIndicator.visibleProperty().bind(slv.runningProperty());
       // mette in moto il thread
       slv.start();
       // lega la progressione del indicatore alla progressione del thread
       pgIndicator.progressProperty().bind(slv.progressProperty());
       
       magnitudeTable.itemsProperty().bind(slv.valueProperty());
    }
    
}
