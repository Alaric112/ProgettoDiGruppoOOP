/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop22.veicoli;

/**
 *
 * @author patap
 */
public class Autovettura extends Veicolo {
   
    private int numeroPosti;

    public Autovettura(String numTelaio, String modello, String alimentazione, String targa, int numeroPosti) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroPosti = numeroPosti;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }
 
    @Override
    public boolean controllaTarga() {
        boolean x = false;
        
       // Controllo targa?
       for(int i=0; i < targa.length(); i++){
           
           
           
           
       }
       
        
       return x; 
    }
    
    @Override
    public String toString() {
    String s = super.toString() + '\n'; 
   
    s+= numeroPosti;
    
    return s;
    
    }
    
}
