/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX.azioni;

import oop2018.itinere1.gruppoXX.dispositivi.Attuatore;

/**
 *
 * @author utente
 */
public class ImpostaStatoAccensione implements Azione{
    
    private final Attuatore attuatore;
    private final boolean setOn;

    public ImpostaStatoAccensione(Attuatore attuatore, boolean setOn) {
        this.attuatore = attuatore;
        this.setOn = setOn;
    }
    
    @Override
    public void esegui(){
        
                System.out.println("\nSono prima del if\n");

        
        if(setOn){
            attuatore.accendi();
            return;
        }
        
        System.out.println("\nCIao\n");
        attuatore.spegni();
    }
    
    @Override
    public String toString(){
        StringBuffer b = new StringBuffer("Tipo Azione: ");
        if(setOn){
            b.append(" accendi ");
        }
        else{
            b.append(" spegni ");
        }
        b.append(attuatore.toString());
        return b.toString();
    }
}
