/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package simulazioneesametodolist;

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
import java.time.LocalDate;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Queue;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SortEvent;
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
    private TableView<EQEvent> eventTable;
    @FXML
    private TableColumn<EQEvent, LocalDate> dataCLM;
    @FXML
    private TableColumn<EQEvent, String> eventCLM;
    @FXML
    private Button addEventButton;
    @FXML
    private DatePicker calendar;
    @FXML
    private TextField textField;
    
    private  ObservableList<EQEvent> list;
    
    private Report repo;
    @FXML
    private ContextMenu contextMenu;
    @FXML
    private MenuItem deleteMenuItem;
    @FXML
    private MenuItem importMenuItem;
    @FXML
    private MenuItem exportMenuItem;
    
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        list = FXCollections.observableArrayList();
        
//       			try {
//				ObjectOutputStream on = new ObjectOutputStream(new FileOutputStream("backup.bin"));
//				on.close();
//			} catch (FileNotFoundException e) {
//                            			
//                        
//                        } catch (IOException e) {
//				e.printStackTrace();
//			}
        try {
            // trova file "backup.bin"
        	ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("backup.dat")));
		
                List<EQEvent> l = new ArrayList();
                l = (ArrayList<EQEvent>) in.readObject();
                //list = (ObservableList<EQEvent>) in.readObject();
                list.addAll(l);
                                
		in.close();
    			} catch (FileNotFoundException e) {
			  try {
                              // se non trova il file lo crea?
                              System.out.println("Managgia, non ho trovato il file");
				ObjectOutputStream on = new ObjectOutputStream(new FileOutputStream("backup."));
				on.close();   
                          } 
//                          catch (FileNotFoundException ex) {
//                            			
//                        
//                         }
                          catch (IOException ex) {
				
			} 
                            
                            
			} catch (IOException e) {
				
			} catch (ClassNotFoundException e) {
				
			}
        
       System.out.println("povero lorenzo");
       System.out.println(list);
        
       dataCLM.setCellValueFactory(new PropertyValueFactory("data"));
       eventCLM.setCellValueFactory(new PropertyValueFactory("descrizione"));
       
       eventTable.setItems(list); 
       
       
       // Discendente per data (utile per l'ordinamento)
       dataCLM.setSortType(TableColumn.SortType.DESCENDING);
       eventTable.getSortOrder().add(dataCLM);
       
       StringProperty cont = textField.textProperty();           
       
       // Disattiva pulsante di aggiunta se il textfield è vuoto
       BooleanBinding bb = textField.textProperty().isEmpty();
       addEventButton.disableProperty().bind(bb);
       
       // Disattiva menu di eliminazione se non ci sono elementi nella tabella
       BooleanBinding xx = Bindings.isEmpty(eventTable.getItems());
       deleteMenuItem.disableProperty().bind(xx);
       // ciò vale anche in caso di esporta in CSV
       exportMenuItem.disableProperty().bind(xx);
       
                // Inizializzazione backup
                //        BackupAutomatico backup = new BackupAutomatico(comande);
                //        Thread tbackup = new Thread(backup);
                //        tbackup.start();
                //   Inception molto pericolosa
                //       TimedSaving slv = new TimedSaving(this);       
                //       Thread tslv = new Thread(slv);
                //       tslv.start();

                //       TimedSaving slv = new TimedSaving(list);       
                //       Thread tslv = new Thread(slv);
                //       tslv.start();
       
       System.out.println(list);
                
       this.repo = new Report(list);      
        
       TimedSaving slv = new TimedSaving(repo);       
       Thread tslv = new Thread(slv);
       // con il metodo setDaemon è possibile definire il seguente thread come subordinato del thread principale
       // quando si chiude il programma, si chiudera anche il thread subordinato
       tslv.setDaemon(true);
       tslv.start();
        
    }    


    @FXML
    private void addEventAction(ActionEvent event) {
    
//        EQEvent s = new EQEvent(calendar.getValue(), textField.getText());
//        
//        list.add(s);
//        eventTable.sort();

        repo.add(calendar.getValue(), textField.getText(), eventTable);
        textField.clear();
        
    }
    
//    public synchronized void salvaEventi(){
//        
//    while(list.isEmpty()){
//            try{
//                
//             wait();   
//                
//            }catch(InterruptedException ex){
//                
//            }
//                    
//    }
//    
//    try {
//    // Creazione link di scrittura "outputstream" sul file nominato filename
//			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.bin"));
//    // scrive sul file gli elementi della coda che sono "seriazible"
//			out.writeObject(list);
//    // chiude link                    
//			out.close();
//		} catch (IOException e) {
//                    
//		}
//    
//    
//    
//    } 
    
 
    
//        private synchronized void addEventAction(ActionEvent event) {
//    
//        EQEvent s = new EQEvent(calendar.getValue(), textField.getText());
//        
//        list.add(s);
//        eventTable.sort();
//        textField.clear();
//        
//        notifyAll();
//    }

    @FXML
    private void deleteEventAction(ActionEvent event) {
    
        EQEvent e = eventTable.getSelectionModel().getSelectedItem();
        
        repo.remove(e);
    
    }

    @FXML
    private void importListAction(ActionEvent event) {
        
        
    }

    @FXML
    private void exportListAction(ActionEvent event) {
    
        FileChooser fc = new FileChooser();
        
        File f = fc.showSaveDialog(null);
        
        if(f==null) return;
        
        String nomefile = f.getAbsolutePath();
        
        nomefile+= ".csv"; 
        
        System.out.println(nomefile);
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nomefile)))) {
        
        List<EQEvent> l = new ArrayList();
        
        l.addAll(list);
        
        System.out.println("CIAAAAAAAAOOOOO" + l);
        
        oos.writeObject("cccccc");
                
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        
    }
    
    
}
