/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoraunt;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patap
 */
public class BackupAutomatico implements Runnable{

    private Comande comande;

    public BackupAutomatico(Comande comande) {
        this.comande = comande;
    }
    
    
    
    @Override
    public void run() {

        while(true){
            
            comande.salvaOrdinazioni();
            System.out.println("BACKUP EFFETTUATO");
            
            try{
                
                sleep(20000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BackupAutomatico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }
    
    
    
}
