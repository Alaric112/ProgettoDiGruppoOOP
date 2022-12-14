/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulazioneesametodolist;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;

/**
 *
 * @author patap
 */
public class TimedSaving implements Runnable {
    
   // private FXMLDocumentController controller;

    private Report list;
    
//    public TimedSaving(FXMLDocumentController controller) {
//        this.controller = controller;
//    }

    public TimedSaving(Report list) {
        
        System.out.println("Passaggio numero 1:");
        System.out.println(list);
        
        this.list = list;
    }
        
    @Override
    public void run() {

        while(true){
            
            list.salvaEventi();
            // controller.salvaEventi();
            System.out.println("BACKUP EFFETTUATO");
            
            try{
                
                sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TimedSaving.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }

    }

}
