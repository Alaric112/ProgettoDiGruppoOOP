/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2017.contest1.gruppo06;

/**
 *
 * @author patap
 */
public class AereoAMotore extends Aeromobile {
    
    private final int numMotori;

    public AereoAMotore(String codice, int numMotori) {
        super(codice);
        this.numMotori = numMotori;
    }

    public int getNumMotori() {
        return numMotori;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo = Aereo a motore - Numero rotori = " + numMotori;
    }
   
    
}
