/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX.azioni;

import oop2018.itinere1.gruppoXX.dispositivi.AttuatoreRegolabile;
import oop2018.itinere1.gruppoXX.dispositivi.LivelloNonValidoException;

/**
 *
 * @author utente
 */
public class ImpostaLivello implements Azione {
    private final AttuatoreRegolabile ar;
    private final double livelloDaImpostare;

    public ImpostaLivello(AttuatoreRegolabile ar, double livelloDaImpostare) {
        this.ar = ar;
        this.livelloDaImpostare = livelloDaImpostare;
    }
    
    @Override
    public void esegui() throws LivelloNonValidoException{
        //fare try catch
        ar.setLivello(livelloDaImpostare);
    }

    @Override
    public String toString() {
        
        StringBuffer b = new StringBuffer();

        b.append(ar.toString());
        b.append("\n");
               
        return b.toString();
    }
    
    
}
