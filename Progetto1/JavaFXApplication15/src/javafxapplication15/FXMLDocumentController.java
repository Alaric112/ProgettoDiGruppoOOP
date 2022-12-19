/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
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
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
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
        
        dataStart.setValue(LocalDate.now());
        dataEnd.setValue(LocalDate.now());
        
        list = FXCollections.observableArrayList();
          
        dateClm.setCellValueFactory(new PropertyValueFactory("time"));
        magnitudeClm.setCellValueFactory(new PropertyValueFactory("magnitude"));      
        locationClm.setCellValueFactory(new PropertyValueFactory("eventLocationName"));      

       
        terremotoTable.setItems(list);     
        terremotoTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        numL = new SimpleIntegerProperty();
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
        
        BooleanBinding xx = Bindings.isEmpty(terremotoTable.getSelectionModel().getSelectedItems());
        menuSalva.disableProperty().bind(xx);
        
        pgIndicator.visibleProperty().set(false);
        
    }    

    @FXML
    private void salvaAction(ActionEvent event) {
    
        FileChooser fc = new FileChooser();
        fc.setTitle("LOreNZo SalVA xd");
        
        ExtensionFilter extFilter = new ExtensionFilter("Roba tipo Mario (.csv)", ".csv");
        fc.getExtensionFilters().add(extFilter);
        
        File f = fc.showSaveDialog(null);
     
        if(f==null) return;
        
        String nomefile = f.getAbsolutePath();
        
        nomefile+= ".csv";                 
        
        try(PrintWriter o = new PrintWriter(new BufferedWriter(new FileWriter(nomefile)))){
                        
            List<INGEvent> exportlist = terremotoTable.getSelectionModel().getSelectedItems();
                        
            for(INGEvent evento: exportlist){
                
            o.print(evento.getTime() + "|" + evento.getMagnitude()+ "|" + evento.getEventLocationName() +"\n");
                                                    
            }
        }catch(Exception e){
            
            System.out.println("Luca greco");
            
        }
    
         System.out.println("E' stato effettuato export al path: " +nomefile);
    
    }

    @FXML
    private void loadAction(ActionEvent event) {
       
        
       list.clear();
       CaricaReportService slv = new CaricaReportService(); 

       
       slv.setUrl("http://webservices.ingv.it/fdsnws/event/1/query?starttime="+Data1+"T00%3A00%3A00&endtime="+Data2+"T23%3A59%3A59&minmag=2&maxmag=10&mindepth=-10&maxdepth=1000&minlat=-90&maxlat=90&minlon=-180&maxlon=180&minversion=100&orderby=time-asc&format=text&limit=10000");
       slv.setLimiteRisultati(numL.get());
       slv.setList(list);
     
       pgIndicator.visibleProperty().bind(slv.runningProperty());
       pgIndicator.progressProperty().bind(slv.progressProperty());   

       slv.start();
       
    }
    
}
