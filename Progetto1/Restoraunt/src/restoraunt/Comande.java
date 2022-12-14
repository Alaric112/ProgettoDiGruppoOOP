/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoraunt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author patap
 */
public class Comande {
    
    private String filename;
    private Queue<Ordinazione> coda;
    //private Boolean leggiBackup;

    public Comande(String filename, Boolean leggiBackup) {
		
        this.filename = filename;
		if (leggiBackup) {
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
				coda = (Queue<Ordinazione>) in.readObject();
				in.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			coda = new LinkedList<Ordinazione>();
		}
    }
    
    public synchronized void aggiungiOrdinazione(Ordinazione ordine){
        
        coda.add(ordine);
        // bisogna avvertire coloro che attendono l'aggiunta di un elemento
        notifyAll();
        
    }
    
    public synchronized Ordinazione consegnaOrdinazione(){
        
        while(coda.isEmpty()){
            try{
                wait();
            }catch(InterruptedException ex){
                
            }
        }
            return coda.remove();
            // nessuno attende sulla condizione di rimozione
    }
    
    public synchronized void salvaOrdinazioni(){
        
        while(coda.isEmpty()){
            try{
                
             wait();   
                
            }catch(InterruptedException ex){
                
            }
            
        }
        
try {
    // Creazione link di scrittura "outputstream" sul file nominato filename
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
    // scrive sul file gli elementi della coda che sono "seriazible"
			out.writeObject(coda);
    // chiude link                    
			out.close();
		} catch (IOException e) {
                    
		}
        
    }
    
}
