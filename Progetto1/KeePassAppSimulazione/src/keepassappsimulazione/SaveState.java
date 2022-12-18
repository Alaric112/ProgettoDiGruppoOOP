/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keepassappsimulazione;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;

/**
 *
 * @author patap
 */
public class SaveState implements Runnable {

    private final File f;
    private final ObservableList<Item> list;
    private final String passSbloco;
    
    public SaveState(File f, ObservableList<Item> list, String passSbloco) {
        this.f = f;
        this.list = list;
        this.passSbloco = passSbloco;
    }
            
    @Override
    public void run() {
        
        
            while(true){
            
               synchronized(list){
                   synchronized(f){
                try(PrintWriter o = new PrintWriter(new BufferedWriter(new FileWriter(f)))){
                        
                    o.print(passSbloco+"\n");
                    for(Item evento: list){
                                
                        o.print(evento.getTitolo()+ ";" + evento.getNomeUtente() + ";" + evento.getPassword()+"\n");                
            }
        }catch(Exception e){
            
        }
                
                
            // controller.salvaEventi();
            System.out.println("BACKUP EFFETTUATO");
            
              }
            }
            
            try{
                
                sleep(10000);
            } catch (InterruptedException ex) {

            }
            
                 
        } 

    }
    
}
