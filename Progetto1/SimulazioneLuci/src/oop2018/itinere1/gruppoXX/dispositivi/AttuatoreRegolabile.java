/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX.dispositivi;

/**
 *
 * @author PC
 */
public abstract class AttuatoreRegolabile extends Attuatore{
    private double livelloMin;
    private double livelloMax;
    private double livello;

    public AttuatoreRegolabile(int id, double livelloMin, double livelloMax, double livello) {
        super(id);
        this.livelloMin = livelloMin;
        this.livelloMax = livelloMax;
        this.livello = livello;
    }

    public double getLivelloMin() {
        return livelloMin;
    }

    public double getLivelloMax() {
        return livelloMax;
    }

    public double getLivello() {
        return livello;
    }

    public void setLivello(double livello) {
        this.livello = livello;
    }

    @Override
    public String toString() {
        return super.toString()+", Attuatore regolabile Liv/Min/Max = " + livello + "/" + livelloMin + "/" +livelloMax;
    }
    
    
}
