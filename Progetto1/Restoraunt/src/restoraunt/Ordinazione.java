/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoraunt;

import java.io.Serializable;

/**
 *
 * @author patap
 */
public class Ordinazione implements Serializable  {
   
    private String piatto;
    private int tavolo;
    private int quantita;

    public Ordinazione(String piatto, int tavolo, int quantita) {
        this.piatto = piatto;
        this.tavolo = tavolo;
        this.quantita = quantita;
    }

    public String getPiatto() {
        return piatto;
    }

    public void setPiatto(String piatto) {
        this.piatto = piatto;
    }

    public int getTavolo() {
        return tavolo;
    }

    public void setTavolo(int tavolo) {
        this.tavolo = tavolo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {

        return "Piatto: " + piatto+", Tavolo: "+tavolo+", quantita: "+ quantita;
    }
              
}
