/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package secondasimu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;

/**
 *
 * @author patap
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private CheckBox checkScolastico;
    @FXML
    private CheckBox checkGiuridico;
    @FXML
    private CheckBox checkUniversitario;
    @FXML
    private TextField textFieldAnnoPartenza;
    @FXML
    private TextField textFieldAnnoFine;
    @FXML
    private TextField textFieldLimite;
    @FXML
    private Button btnAggiorna;
    @FXML
    private Button btnExport;
    @FXML
    private TableView<Libro> bookTable;
    @FXML
    private TableColumn<Libro, String> ISBNClm;
    @FXML
    private TableColumn<Libro, String> codVolClm;
    @FXML
    private TableColumn<Libro, String> titoloClm;
    @FXML
    private TableColumn<Libro, String> annoClm;
    @FXML
    private TableColumn<Libro, String> prezzoClm;
    @FXML
    private TableColumn<Libro, String> pesoClm;
    @FXML
    private TableColumn<Libro, String> pagineClm;
    @FXML
    private ProgressIndicator pgIndicator;
    
    private ObservableList<Libro> list;
    
    private IntegerProperty num = new SimpleIntegerProperty();
    private IntegerProperty minAnno = new SimpleIntegerProperty();
    private IntegerProperty maxAnno = new SimpleIntegerProperty();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

       list = FXCollections.observableArrayList();
        
       ISBNClm.setCellValueFactory(new PropertyValueFactory("ISBN"));
       codVolClm.setCellValueFactory(new PropertyValueFactory("codVol"));
       titoloClm.setCellValueFactory(new PropertyValueFactory("titolo"));
       annoClm.setCellValueFactory(new PropertyValueFactory("anno"));
       prezzoClm.setCellValueFactory(new PropertyValueFactory("prezzo"));
       pesoClm.setCellValueFactory(new PropertyValueFactory("peso"));
       pagineClm.setCellValueFactory(new PropertyValueFactory("pagine"));
       
       bookTable.setItems(list); 
        
       //pgIndicator.visibleProperty().bind();       
                
        StringConverter cv = new IntegerStringConverter();
        Bindings.bindBidirectional(textFieldLimite.textProperty(), num, cv);
        //num.set(100);

        Bindings.bindBidirectional(textFieldAnnoPartenza.textProperty(), minAnno, cv);
        Bindings.bindBidirectional(textFieldAnnoFine.textProperty(), maxAnno, cv);        
        
        //BooleanBinding bb = Bindings.or(checkUniversitario.selectedProperty(), checkGiuridico.selectedProperty());
        
        btnAggiorna.disableProperty().bind(checkUniversitario.selectedProperty().not().and(checkGiuridico.selectedProperty().not().and(checkScolastico.selectedProperty().not())));
        BooleanBinding xx = Bindings.isEmpty(list);
        
        BooleanBinding bb = Bindings.isEmpty(bookTable.getSelectionModel().getSelectedItems());
        btnExport.disableProperty().bind(bb);
   
        bookTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        // Mette un filtro magico che funziona a caso
        // filtra tutte le cose che non sono numeri Interi positivi
        UnaryOperator<Change> integerFilter = change -> {
        String newText = change.getControlNewText();
        if (newText.matches("([0-9]*)?")) { 
            return change;
        }
        return null;
    };

        textFieldAnnoPartenza.setTextFormatter(new TextFormatter<Integer>(new IntegerStringConverter(), null, integerFilter));
        textFieldAnnoFine.setTextFormatter(new TextFormatter<Integer>(new IntegerStringConverter(), null, integerFilter));
        textFieldAnnoFine.setTextFormatter(new TextFormatter<Integer>(new IntegerStringConverter(), null, integerFilter));

    //textFieldAnnoPartenza.setTextFormatter(new TextFormatter<>(new IntegerStringConverter())); 
        
    }    

    @FXML
    private void aggiornaAction(ActionEvent event) {
        
       CaricaCatalogoService slv = new CaricaCatalogoService(); 
       slv.setUrl("http://193.205.163.165/oopdata/Cat_Zani_ext.csv");
       slv.setList(list);
       slv.setNumeroRisultati(num.get());
       
       FiltroTipoVolume filtroTipo = new FiltroTipoVolume(checkScolastico.selectedProperty().getValue(), checkGiuridico.selectedProperty().getValue(), checkUniversitario.selectedProperty().getValue());
       FiltroAnno filtroAnno = new FiltroAnno(minAnno.getValue(), maxAnno.getValue());
       
       slv.setFiltroVolume(filtroTipo);
       slv.setFiltroAnno(filtroAnno);
       
       // Lega la visibilita del indicatore a quando viene runnato il thread "slv" di servizio
       pgIndicator.visibleProperty().bind(slv.runningProperty());
       // mette in moto il thread
       slv.start();
       // lega la progressione del indicatore alla progressione del thread
       pgIndicator.progressProperty().bind(slv.progressProperty());
       
       //bookTable.itemsProperty().bind(slv.valueProperty());
       
       //System.out.println(list);
        
    }

    @FXML
    private void exportAction(ActionEvent event) {
    
            FileChooser fc = new FileChooser();
        
        File f = fc.showSaveDialog(null);
        
        if(f==null) return;
        
        String nomefile = f.getAbsolutePath();
        
        nomefile+= ".csv";                 
        
        try(PrintWriter o = new PrintWriter(new BufferedWriter(new FileWriter(nomefile)))){
                        
            List<Libro> exportlist = bookTable.getSelectionModel().getSelectedItems();
                        
            for(Libro evento: exportlist){
                
            o.print(evento.getISBN() + ";" + evento.getTitolo() + ";" + evento.getAnno() + ";" + evento.getPrezzo() + "\n");
                                                    
            }
        }catch(Exception e){
            
            System.out.println("Luca greco");
            
        }
    
         System.out.println("E' stato effettuato export al path: " +nomefile);
    }
    
}
