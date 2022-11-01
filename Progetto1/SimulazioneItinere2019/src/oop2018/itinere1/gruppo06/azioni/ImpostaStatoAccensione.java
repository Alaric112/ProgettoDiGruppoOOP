
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppo06.azioni;

import oop2018.itinere1.gruppo06.dispositivi.Attuatore;

/**
 *
 * @author patap
 */
public class ImpostaStatoAccensione implements Azione {
    
    private Attuatore attuatore;
    private boolean setOn;

    public ImpostaStatoAccensione(Attuatore attuatore, boolean setOn) {
        this.attuatore = attuatore;
        this.setOn = setOn;
    }
    
    
    @Override
    public void esegui(){
        
        if(setOn){   
         attuatore.accendi();
         return;   
        }
        
        attuatore.spegni();
        
    }
    
    @Override
    public String toString(){
    
    if(setOn)  
        return "Tipo azione: Accendi - attivata per: " + attuatore.toString();
    
    return "Tipo azione: Spegni - attivata per: " + attuatore.toString();
        
    }
    
}
