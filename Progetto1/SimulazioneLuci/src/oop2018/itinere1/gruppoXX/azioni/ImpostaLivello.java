/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX.azioni;

import oop2018.itinere1.gruppoXX.dispositivi.AttuatoreRegolabile;

/**
 *
 * @author utente
 */
public class ImpostaLivello implements Azione {
    private AttuatoreRegolabile ar;
    private double livelloDaImpostare;

    public ImpostaLivello(AttuatoreRegolabile ar, double livelloDaImpostare) {
        this.ar = ar;
        this.livelloDaImpostare = livelloDaImpostare;
    }
    
    public void Esegui() throws LivelloNonValidoException{
        //fare try catch
        ar.setLivello(livelloDaImpostare);
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer("Tipo azione: Accendi ");
        b.append(valoreDiConfronto);
        b.append(super.toString());
        return b.toString();
    }
    
    
}
