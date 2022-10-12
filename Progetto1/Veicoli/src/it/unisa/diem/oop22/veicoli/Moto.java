/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop22.veicoli;

/**
 *
 * @author patap
 */
public abstract class Moto extends Veicolo{
    private boolean guidaLibera = false;
    
    
    
    public Moto(String numTelaio, String modello, String alimentazione, String targa, boolean guidaLibera){
        super(numTelaio, modello, alimentazione, targa);
                this.guidaLibera = guidaLibera;
    }
           
    public boolean getGuidaLibera(){
        guidaLibera = true;
        return guidaLibera;
    }
    
    public boolean controlloTarga(){
        for(int i = 0; i < 2; i++){
            char c = getTarga().charAt(i);
            if(!(c >= 'A' && c<='Z')){
                return false;
            }
        }
        for(int i = 2; i < 8; i++){
                char c = getTarga().charAt(i);
                if(!(c >= '0' && c<='9')){
                return false;
            }
               
        return true;
        
    }
    
    
}
