/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package taskservice;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author patap
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button loadButton;
    @FXML
    private TableView<Terremoto> magnitudeTable;
    @FXML
    private TableColumn<Terremoto, LocalDateTime> dateCLM;
    @FXML
    private TableColumn<Terremoto, Double> magnitudeCLM;
    @FXML
    private TableColumn<Terremoto, String> locationCLM;
    @FXML
    private ProgressIndicator pgIndicator;
    
    private ObservableList<Terremoto> list;
    
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       list = FXCollections.observableArrayList();
              
       dateCLM.setCellValueFactory(new PropertyValueFactory("date"));
       magnitudeCLM.setCellValueFactory(new PropertyValueFactory("magnitude"));
       locationCLM.setCellValueFactory(new PropertyValueFactory("eventLocationName"));
       
       magnitudeTable.setItems(list);      
       
    }    

    @FXML
    private void loadAction(ActionEvent event) {
        
       Background slv = new Background(); 
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
