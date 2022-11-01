/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2017.contest1.gruppo06;

/**
 *
 * @author patap
 */
public abstract class Aeromobile {
    
    private final String codice;
    private final int numeroSequenziale;
    private static int allocati=0;

    public Aeromobile(String codice) {
        this.codice = codice;
        allocati++;
        this.numeroSequenziale = allocati;
    }

    public String getCodice() {
        return codice;
    }

    public int getNumeroSequenziale() {
        return numeroSequenziale;
    }

    @Override
    public String toString() {
        return "Aeromobile n."+ numeroSequenziale + " - Codice = " + codice;
    }
 
    
}
