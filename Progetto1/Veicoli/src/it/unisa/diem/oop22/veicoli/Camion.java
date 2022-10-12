/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop22.veicoli;

/**
 *
 * @author patap
 */
public class Camion extends Veicolo {
   private int numeroAssi;

    public Camion(String numTelaio, String modello, String alimentazione, String targa, int numeroAssi) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroAssi = numeroAssi;
    }
   
    public int getNumeroAssi() {
        return numeroAssi;
    }
    
   @Override
    public boolean controllaTarga()
    {
        // Controllo targa?
       for(int i=0; i < 2; i++){
          
             char c = getTarga().charAt(i);  
              if(!(c >= 'A' && c <='Z')){
                  
                  return false;
              } 
           
       }
       
       for(int i=2; i < 8; i++){
           
              char c = getTarga().charAt(i);  
              if(!(c >= '0' && c <='9')){
                  
                  return false;
              }
              
    }
       return true;
    }

    @Override
    public String toString() {
        return "Camion" + super.toString();
    }
    
   
   
   
}
