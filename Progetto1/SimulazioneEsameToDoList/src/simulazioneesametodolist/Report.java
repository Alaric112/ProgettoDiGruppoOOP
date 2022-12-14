/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulazioneesametodolist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;

/**
 *
 * @author patap
 */
public class Report {
 
    private ObservableList list;

    public Report(ObservableList list) {
        this.list = list;
    }
    
    public synchronized void add(LocalDate data, String text, TableView<EQEvent> eventTable) {
    
        EQEvent s = new EQEvent(data, text);
        
        list.add(s);
        eventTable.sort();

        notifyAll();
    }
    
    public synchronized void remove(EQEvent e){
        
        list.remove(e);
        
        notifyAll();
    }
    
    public synchronized void salvaEventi(){
        
    while(list.isEmpty()){
            try{
                
             wait();   
                
            }catch(InterruptedException ex){
                
            }
                    
    }
    
        try {
    // Creazione link di scrittura "outputstream" sul file nominato filename
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.dat"));
    // scrive sul file gli elementi della coda che sono "seriazible"
			out.writeObject(list);
    // chiude link                    
			out.close();
		} catch (IOException e) {
                    
		}
    
        
    }     
}
