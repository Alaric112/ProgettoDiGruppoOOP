/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2017.contest1.gruppo06;

/**
 *
 * @author patap
 */
public class Aliante extends Aeromobile {
    
    private final double efficienza;

    public Aliante(String codice, double efficienza) {
        super(codice);
        this.efficienza = efficienza;
    }

    public double getEfficienza() {
        return efficienza;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo = Aliante - Efficienza = " + efficienza;
    }
   
}
