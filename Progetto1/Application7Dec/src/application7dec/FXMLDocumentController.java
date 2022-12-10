/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package application7dec;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

/**
 *
 * @author patap
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private MenuItem saveButton;
    @FXML
    private TextField nameField;
    @FXML
    private TextField surnameField;
    @FXML
    private TextField codeFIield;
    @FXML
    private Button addButton;
    @FXML
    private Button deleteButton;
    @FXML
    // Le tabelle hanno una lista di oggetti che non è classica, ma una lista osservabile
    // quando facciamo aggiornamenti sulla lista, abbiamo un aggiornamento in tempo reale alla tabella
    // modifico collezzione, tabella eredita immeddiatamente le modifiche se la lista è "osservabile"
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> nameCLN;
    @FXML
    private TableColumn<Student, String> surnameCLN;
    @FXML
    private TableColumn<Student, String> codeCLN;
    
    private ObservableList<Student> list;
    // bisogna creare l'associazzione tra tabella e lista!
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
        // ottengo riferimento alla creazione della lista osservabile, è come se facessi "new Array list()"...  
        list = FXCollections.observableArrayList();
    
        // Associazzione lista - tabella
    
        studentTable.setItems(list);
        
        nameCLN.setCellValueFactory(new PropertyValueFactory("name"));
        surnameCLN.setCellValueFactory(new PropertyValueFactory("surname"));
        codeCLN.setCellValueFactory(new PropertyValueFactory("code"));
        
        addButton.disableProperty().bind(nameField.textProperty().isEmpty().or(surnameField.textProperty().isEmpty()));
        
        
        // Disabilitare il pulsante se la lista è vuota
        saveButton.disableProperty().bind(Bindings.isEmpty(list));
        
        
        // Ho selezionato la riga 
        deleteButton.disableProperty().bind(studentTable.getSelectionModel().selectedItemProperty().isNull());
        
        studentTable.setItems(list);
        
    }    

    @FXML
    private void openAction(ActionEvent event) {
    }

    @FXML
    private void saveAction(ActionEvent event) {
    
        FileChooser fc = new FileChooser();
        
        // possiamo prendere un riferimento e metterlo al interno del nostro controller
        // qualsiasi elemento grafico fa parte della scena, facciamo getScene è otteniamo la scene 
        
        File f = fc.showSaveDialog(null);
        // sulla parte di servizio, è utile fare è salvare l'intero oggetto, scriviamo tutto su uno oggetto
        
        try(ObjectOutputStream oos = new ObjectOutputStream( new BufferedOutputSteam))
        
        
        
    }

    @FXML
    private void quitAction(ActionEvent event) {
    }

    @FXML
    private void addAction(ActionEvent event) {
    // Aggiunta di uno studente
    
    Student s = new Student(nameField.getText(), surnameField.getText(), codeFIield.getText());
    
    list.add(s);
    
    }

    @FXML
    private void deleteAction(ActionEvent event) {
    
        Student s = studentTable.getSelectionModel().getSelectedItem();
        
        list.remove(s);
        
    }
    
}
