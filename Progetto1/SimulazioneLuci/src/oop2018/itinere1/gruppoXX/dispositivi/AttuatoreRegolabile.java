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
    private final double livelloMin;
    private final double livelloMax;
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

    public void setLivello(double livello) throws LivelloNonValidoException {
        if(!(livelloMin <= livello && livello <= livelloMax)){
            throw new LivelloNonValidoException();
        }
        this.livello = livello;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Attuatore regolabile Liv/Min/Max = " + livello + "/" + livelloMin + "/" +livelloMax;
        //StringBuffer b = new StringBuffer(super.toString());
        //b.append(", Attuatore regolabile Liv/Min/Max = ");
        //b.append(livello);
        //b.append("/");
        //b.append(livelloMin);
        //b.append("/");
        //b.append(livelloMax);
        //return b.toString();
    }
}
