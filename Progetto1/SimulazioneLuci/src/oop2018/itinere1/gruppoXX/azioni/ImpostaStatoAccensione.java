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
    private Attuatore attuatore;
    private boolean SetOn;

    public ImpostaStatoAccensione(Attuatore attuatore, boolean SetOn) {
        this.attuatore = attuatore;
        this.SetOn = SetOn;
    }
    
    @Override
    public void esegui(){
        if(SetOn){
            attuatore.accendi();
        }
        else
            attuatore.spegni();
    }
    
    public String ToString(){
        StringBuffer b = new StringBuffer("Tipo Azione: ");
        if(SetOn){
            b.append("accendi");
        }
        else{
            b.append("spegni");
        }
        b.append(super.toString());
        return b.toString();
    }
}
