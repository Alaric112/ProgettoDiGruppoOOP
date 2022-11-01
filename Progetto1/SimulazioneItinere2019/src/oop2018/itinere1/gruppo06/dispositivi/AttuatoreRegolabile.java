/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppo06.dispositivi;

/**
 *
 * @author patap
 */
public class AttuatoreRegolabile extends Attuatore {
    
    private final double livelloMin, livelloMax;
    private double livello;
    
    
    public AttuatoreRegolabile(int id, double livelloMin, double livelloMax, double livello) throws LivelloNonValidoException {
        super(id);
        
        if (!((livello <= livelloMax) && (livello >= livelloMin))){
            
            throw new LivelloNonValidoException();
        }
        
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
        
        if (!((livello <= livelloMax) && (livello >= livelloMin))){
            
            throw new LivelloNonValidoException();
        }
        
        this.livello = livello;
    }

    @Override
    public String toString() {
        return super.toString()+", Attuatore regolabile Liv/Min/Max = " + livello + "/" + livelloMin + "/" +livelloMax;
    }  
    
}
