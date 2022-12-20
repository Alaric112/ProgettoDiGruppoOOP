/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package gruppo06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

/**
 *
 * @author gruppo06
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane pagina1;
    @FXML
    private TextField txdNome1;
    @FXML
    private TextField txdCognome1;
    @FXML
    private Button btnIniziaQuiz;
    @FXML
    private ProgressIndicator pgIndicator1;
    @FXML
    private AnchorPane page2;
    @FXML
    private Label lblDomandapage2;
    @FXML
    private RadioButton radioTrue;
    @FXML
    private RadioButton radioFalse;
    @FXML
    private Label lblCounterpage2;
    @FXML
    private Button btnAvanti;
    @FXML
    private AnchorPane page3;
    @FXML
    private TableView<TFQuestionUserAttempt> quizTable;
    @FXML
    private TableColumn<TFQuestionUserAttempt, String> domandaClm;
    @FXML
    private TableColumn<TFQuestionUserAttempt, String> rispostaClm;
    @FXML
    private Label lblCongratulazioni3;
    @FXML
    private Button btnExport;
    @FXML
    private Button btnFine;

    private ObservableList<TFQuestionUserAttempt> list;
    private String nomeUtente;
    private String cognomeUtente;
    private int counter;
   // private ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        btnIniziaQuiz.disableProperty().bind(txdNome1.textProperty().isEmpty().or(txdCognome1.textProperty().isEmpty()));
        btnAvanti.disableProperty().bind(radioTrue.selectedProperty().not().and(radioFalse.selectedProperty().not()));
        
        StringProperty valore = lblCounterpage2.textProperty();
        
       list = FXCollections.observableArrayList();

       domandaClm.setCellValueFactory(new PropertyValueFactory("questionTest"));
       rispostaClm.setCellValueFactory(new PropertyValueFactory("givenAnswer"));
       
//       eventCLM.setCellFactory(TextFieldTableCell.forTableColumn());
       
       quizTable.setItems(list);         
       pgIndicator1.visibleProperty().set(false);
      // lblCounterpage2.textProperty().bind(valore);
      
    //   valore.set(counter+1+"/"+list.size());
       
    }    

    @FXML
    private void IniziaQuizAction(ActionEvent event) {
          
        nomeUtente = txdNome1.getText();
        cognomeUtente = txdCognome1.getText();
        
        MyQuizAppService slv = new MyQuizAppService();
        slv.setUrl("http://193.205.163.165/oopdata/questions.csv");
        slv.setList(list);
        
       pgIndicator1.visibleProperty().bind(slv.runningProperty());
       
       slv.start();

       pgIndicator1.progressProperty().bind(slv.progressProperty());       
      

   slv.setOnSucceeded(e ->{
    
       pagina1.visibleProperty().set(false);
       page2.visibleProperty().set(true);
       
       counter++;
       
       lblCounterpage2.textProperty().set(counter+"/"+list.size());
       TFQuestionUserAttempt q = list.get(0);
       lblDomandapage2.setText(q.getQuestionTest());
      
      });      
    }

    @FXML
    private void radioTrueAction(ActionEvent event) {
    }

    @FXML
    private void radioFalseAction(ActionEvent event) {
    }

    @FXML
    private void avantiAction(ActionEvent event) {
    
    if(counter < list.size()){    
       counter++; 
       lblCounterpage2.textProperty().set(counter+"/"+list.size()); 
       TFQuestionUserAttempt q = list.get(counter);
       
       int d= counter-1;
       if(radioTrue.isSelected()){
           
//           System.out.println(list.get(counter));
           list.get(d).setGivenAnswer(true);
//           System.out.println(list.get(counter));

       }else{
           list.get(d).setGivenAnswer(false);
       }
              
       lblDomandapage2.setText(q.getQuestionTest());
        
    }else{
    
        
        
       page2.visibleProperty().set(false);
       page3.visibleProperty().set(true);
       int j =0;
            
       for(TFQuestionUserAttempt evento : list){

           if(evento.isCorrect())
                j++;                               
            }
               
       lblCongratulazioni3.setText("Complimenti "+ nomeUtente +" " + cognomeUtente+"! hai totalizzato "+ j+" punti." );
       
    }
    
    }

    @FXML
    private void exportAction(ActionEvent event) {
    
        FileChooser fc = new FileChooser();
        int i=0;
        
        
        File f = fc.showSaveDialog(null);
        
        if(f==null) return;
        
        String nomefile = f.getAbsolutePath();
        
        nomefile+= ".txt"; 
        
        try(PrintWriter o = new PrintWriter(new BufferedWriter(new FileWriter(nomefile)))){
            
           //LocalDate giorno = LocalDate.now();
                        
            o.print("myQuizApp\nUtente: "+ nomeUtente+" "+ cognomeUtente+"\nTentativo del "+LocalDate.now() +"\n");
            o.print("Domanda, Risposta esatta, risposta data");
            for(TFQuestionUserAttempt evento : list){

            if(evento.isCorrect())
                i++;
                
                o.print(evento.getQuestionTest()+" "+ evento.isAnswer()+" "+ evento.isCorrect()+"\n");
                
                
            System.out.println("E' stato effettuato export al path: " +nomefile);    
                
            }
            
            o.print("Punteggio conseguito: " + i);
            
        }catch(Exception e){
            
        }
    
    }

    @FXML
    private void fineAction(ActionEvent event) {
    
       Platform.exit();
    
    }
    
}
