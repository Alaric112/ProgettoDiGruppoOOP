/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package simulazionenumerotelefono;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
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
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.util.converter.IntegerStringConverter;

/**
 *
 * @author patap
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private MenuBar menubar;
    @FXML
    private Menu menuFile;
    @FXML
    private MenuItem menuSalva;
    @FXML
    private MenuItem menuEsci;
    @FXML
    private Label labelNome;
    @FXML
    private TextField tfdNome;
    @FXML
    private Label labelCognome;
    @FXML
    private TextField tfdCognome;
    @FXML
    private Label labelNumTel;
    @FXML
    private TextField tfdNumTel;
    @FXML
    private Button btnAddContatto;
    @FXML
    private TableView<Contact> rubricaTable;
    @FXML
    private TableColumn<Contact, String> nomeClm;
    @FXML
    private TableColumn<Contact, String> cognomeClm;
    @FXML
    private TableColumn<Contact, String> numTelClm;
    
    @FXML
    private ContextMenu tableContextMenu;
    @FXML
    private MenuItem menuCancellaContatto;
    @FXML
    private MenuItem menuCopiaContatto;
    
    private ObservableList<Contact> list;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       GenerateOTP slv = new GenerateOTP();       
       Thread tslv = new Thread(slv);
       tslv.setDaemon(true);
       tslv.start(); 
        
        
        // AFTER LOG IN    
       list = FXCollections.observableArrayList();
 
        File f = new File("saved.bin");        
        if(f.exists()){
            
               try {
                    // trova file "saved.bin"
                    ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("saved.bin")));

                    List<Contact> l = new ArrayList();

                    l = (ArrayList<Contact>) in.readObject();

                    list.addAll(l);

                    in.close();
                    
            } catch (FileNotFoundException e) {
                           System.out.println("errore1");

            } catch (IOException e) {
                           System.out.println("errore2");

	    } catch (ClassNotFoundException e) {
                           System.out.println("errore3");

            }               
        
        }
                
       nomeClm.setCellValueFactory(new PropertyValueFactory("nome"));
       cognomeClm.setCellValueFactory(new PropertyValueFactory("cognome"));
       numTelClm.setCellValueFactory(new PropertyValueFactory("numero"));
                     
       rubricaTable.setItems(list);                
       
       btnAddContatto.disableProperty().bind(tfdNome.textProperty().isEmpty().or(tfdCognome.textProperty().isEmpty().or(tfdNumTel.textProperty().isEmpty())));
       
        UnaryOperator<TextFormatter.Change> integerFilter = change -> {
        String newText = change.getControlNewText();
        if (newText.matches("([0-9]*)?")) { 
            return change;
        }
        return null;
        };

        tfdNumTel.setTextFormatter(new TextFormatter<>(new IntegerStringConverter(), null, integerFilter));
       
        BooleanBinding bb = Bindings.isEmpty(rubricaTable.getSelectionModel().getSelectedItems());
        menuCancellaContatto.disableProperty().bind(bb);
        
        menuCopiaContatto.disableProperty().bind(bb);        
        
    }    

    @FXML
    private void salvaAction(ActionEvent event) {
        
        File f = new File("saved.bin");
        
        if (f == null)
            return;
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)))) {
        
            List<Contact> l = new ArrayList();

            l.addAll(list);

            oos.writeObject(l);
        
                
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        
    }

    @FXML
    private void esciAction(ActionEvent event) {
        
        Platform.exit();
        
    }

    @FXML
    private void addContattoAction(ActionEvent event) {
        
        Contact c = new Contact(tfdNome.getText(), tfdCognome.getText(), tfdNumTel.getText());
        
        if(list.contains(c)){
            
            Alert alert = new Alert(Alert.AlertType.ERROR, "Contatto già esistente", ButtonType.CLOSE);
            alert.show();
            
            ClearAllfields();
            
            return;         
        }
        
        list.add(c);
        
        ClearAllfields();
        
    }

    @FXML
    private void cancellaContattoAction(ActionEvent event) {
        
        Contact c = rubricaTable.getSelectionModel().getSelectedItem();

        list.remove(c);
        
    }

    @FXML
    private void copiaContattoAction(ActionEvent event) {
        
        Contact c = rubricaTable.getSelectionModel().getSelectedItem();
        
        final ClipboardContent clipboardContent = new ClipboardContent();
        clipboardContent.putString(c.getNome()+";"+c.getCognome()+";"+c.getNumero());
        Clipboard.getSystemClipboard().setContent(clipboardContent);
        
    }
    
    private void ClearAllfields(){
        
        tfdNome.clear();
        tfdCognome.clear();
        tfdNumTel.clear();
        
    }
    
    
}
