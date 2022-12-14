/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoraunt;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Logger;

/**
 *
 * @author patap
 */
public class Cuoco implements Runnable {
    
    private Comande comande;

    public Cuoco(Comande comande) {
        this.comande = comande;
    }

    @Override
    public void run() {

        while(true){
            
            Ordinazione ordine = comande.consegnaOrdinazione(); 
            
            try{
                
                sleep(new Random().nextInt(5)+5); 
                
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            
            System.out.println("Piatto pronto: " + ordine.toString());
            
        }

    }
    
    
    
}
