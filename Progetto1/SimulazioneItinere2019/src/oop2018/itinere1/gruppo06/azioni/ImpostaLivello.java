/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppo06.azioni;

import oop2018.itinere1.gruppo06.dispositivi.AttuatoreRegolabile;
import oop2018.itinere1.gruppo06.dispositivi.LivelloNonValidoException;

/**
 *
 * @author patap
 */
public class ImpostaLivello implements Azione {
    
    private AttuatoreRegolabile ar;
    private double livelloDaImpostare;

    public ImpostaLivello(AttuatoreRegolabile ar, double livelloDaImpostare) {
        this.ar = ar;
        this.livelloDaImpostare = livelloDaImpostare;
    }

    @Override
    public void esegui() throws LivelloNonValidoException{
     
    /*    
     if(!((livelloDaImpostare <= ar.getLivelloMax()) && (livelloDaImpostare>= ar.getLivelloMin())))
               throw new LivelloNonValidoException();
    */
   
    ar.setLivello(livelloDaImpostare);
    
    }
    
    @Override
    public String toString() {
        return "ImpostaLivello{" + "ar=" + ar + ", livelloDaImpostare=" + livelloDaImpostare + '}';
    }
    
    
    
}
