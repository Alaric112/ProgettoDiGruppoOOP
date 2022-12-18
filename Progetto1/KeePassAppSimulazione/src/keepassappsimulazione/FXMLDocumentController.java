/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package keepassappsimulazione;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author patap
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private PasswordField pswField;
    @FXML
    private Button btnSblocca;
    @FXML
    private Label lblPasswordErrata;
    @FXML
    private TextField tfdTitolo;
    @FXML
    private TextField tfdUsername;
    @FXML
    private TextField tfdPassword;
    @FXML
    private Button btnAggiungi;
    @FXML
    private Button btnCambioPassword;
    @FXML
    private TableView<Item> userTable;
    @FXML
    private MenuItem menuCancella;
    @FXML
    private MenuItem menuDuplica;
    @FXML
    private TableColumn<Item, String> titoloClm;
    @FXML
    private TableColumn<Item, String> nomeUtenteClm;
    @FXML
    private TableColumn<Item, String> passwordClm;    
    @FXML
    private AnchorPane logInPane;
    @FXML
    private SplitPane splitPanePrincipale;
    
    private ObservableList<Item> list;    
    private String passSbloco;
    private File f;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
              
       list = FXCollections.observableArrayList();   
       
       f = new File("save.csv");
       
       ////////////////////////////////// Se non esiste il file, lo crea e scrive la password di defaut pwd
       if(!f.exists()){
           
           try {
               f.createNewFile();
           } catch (IOException ex) {
               Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       try(PrintWriter oss = new PrintWriter(new BufferedWriter(new FileWriter(f)))){        

            oss.write("pwd");
                        
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
           
       }
       
       ////////////////////////////////////////////////////////////////////////
              
       try(Scanner i = new Scanner(new BufferedReader(new FileReader(f)))){
           
            i.useLocale(Locale.US);
            i.useDelimiter(";|\n");
            passSbloco = i.next();
            
            while(i.hasNext()){
                String titolo=i.next();
                String username = i.next();
                String password = i.next();
                Item evento = new Item(titolo, username, password);
                list.add(evento);
            }
            
        }catch(FileNotFoundException exc){
        
        }catch(RuntimeException rExc){//Raggiunta la fine del file   
        
        }             
       
       // DOPO Log IN
       //////
       titoloClm.setCellValueFactory(new PropertyValueFactory("titolo"));
       nomeUtenteClm.setCellValueFactory(new PropertyValueFactory("nomeUtente"));
       passwordClm.setCellValueFactory(new PropertyValueFactory("password"));
              
       titoloClm.setCellFactory(TextFieldTableCell.forTableColumn());
       nomeUtenteClm.setCellFactory(TextFieldTableCell.forTableColumn());
       passwordClm.setCellFactory(TextFieldTableCell.forTableColumn());
              
       userTable.setItems(list); 
       
       btnAggiungi.disableProperty().bind(tfdTitolo.textProperty().isEmpty().or(tfdUsername.textProperty().isEmpty().or(tfdPassword.textProperty().isEmpty())));
       btnSblocca.disableProperty().bind(pswField.textProperty().isEmpty());

       BooleanBinding bb = Bindings.isEmpty(userTable.getSelectionModel().getSelectedItems());
       menuCancella.disableProperty().bind(bb);        
       menuDuplica.disableProperty().bind(bb);   
       
       
    }    

    @FXML
    private void sbloccaAction(ActionEvent event) {
    
                
       if(!pswField.getText().equals(passSbloco)){
                      
            lblPasswordErrata.visibleProperty().set(true);
           
            Alert alert = new Alert(Alert.AlertType.ERROR, "Password errata!", ButtonType.CLOSE);
            alert.show();
           
           return;
       }
              
       logInPane.visibleProperty().set(false);
       splitPanePrincipale.visibleProperty().set(true);
    
    }

    @FXML
    private void AggiungiAction(ActionEvent event) {
    
        Item c = new Item(tfdTitolo.getText(), tfdUsername.getText(), tfdPassword.getText());
        ClearAllfields();
   
    synchronized(list){    
        if(list.contains(c)){
            
            c.setTitolo(c.getTitolo()+"(copia)");
            Alert alert = new Alert(Alert.AlertType.WARNING, "Elemento esistente. E' stata creata una copia", ButtonType.OK);
            alert.show();
        }
        
        list.add(c);
      } 
    }

    @FXML
    private void cambioPasswordAction(ActionEvent event) {
            
    synchronized(f){
        
        TextInputDialog td = new TextInputDialog();
        td.setHeaderText("Vuoi cambiare password all'archivio?");
        td.setContentText("Inserisci nuova password");
        td.setTitle("Cambia Password");
        td.showAndWait();
        String newPassword = td.getResult();
        
        if(newPassword.equals(""))
            return;
        
        System.out.println("Caaaaaaaaaaaaaaa");
        System.out.println(newPassword);
        
        try(BufferedReader in = new BufferedReader(new FileReader("save.csv"))){
            
         String strLine;
         StringBuilder fileContent = new StringBuilder();
    
         // Leggo il file riga per riga
         while ((strLine = in.readLine()) != null) {
     
            if(strLine.equals("pluto")){
               // se la riga è uguale a quella ricercata
               fileContent.append(newPassword+System.lineSeparator());
            } else {
               // ... altrimenti la trascrivo così com'è
               fileContent.append(strLine);
               fileContent.append(System.lineSeparator());
            }
         }
                    
                        
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        
        
       
      }
    }

    @FXML
    private void cancellaAction(ActionEvent event) {
    
        
        Item c = userTable.getSelectionModel().getSelectedItem();

    synchronized(list){     
        list.remove(c);
        }
    }

    @FXML
    private void duplicaAction(ActionEvent event) {
    
        Item c = userTable.getSelectionModel().getSelectedItem();
        
        Item b = new Item(c.getTitolo()+"(copia)", c.getNomeUtente(), c.getPassword());
    synchronized(list){     
        // non usare bug!!!
        //b.setTitolo(c.getTitolo()+"(copia)");
        list.add(b);
    }    
        // forse nel duplica non c'è ne bisogno di questo alert
        Alert alert = new Alert(Alert.AlertType.WARNING, "Elemento esistente. E' stata creata una copia", ButtonType.OK);
        alert.show();
        
    }

    @FXML
    private void updateAction(TableColumn.CellEditEvent<Item, String> event) {
    
//        Item q = userTable.getSelectionModel().getSelectedItem();
//
//        q.setDescrizione(event.getNewValue());
    
    }
    
        private void ClearAllfields(){
        
        tfdTitolo.clear();
        tfdUsername.clear();
        tfdPassword.clear();
        
    }
    
}
