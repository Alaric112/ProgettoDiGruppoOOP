/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoraunt;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author patap
 */
public class Cameriere implements Runnable {

    // Il "cameriere" è il produttore in questo caso, essendo che deve aggiungere elementi
    // alla risorsa condivisa.
    
    private String nome;
    private Comande comande;

    public Cameriere(String nome, Comande comande) {
        this.nome = nome;
        this.comande = comande;
    }   
    
    @Override
    public void run() {
        
        while(true){
                    Ordinazione ordine = new Ordinazione(new Menu().getPiatto(), new Random().nextInt(5)+1,  new Random().nextInt(4)+1);
                    
                    try{
                        
                     sleep(new Random().nextInt(5)+5);   
                        
                    }catch (InterruptedException ex){
                        
                    }
                    comande.aggiungiOrdinazione(ordine);
                    System.out.println("Ordinazione presa da "+ nome+": "+ ordine.toString());
                    
        }
        
        
    }
    
}
