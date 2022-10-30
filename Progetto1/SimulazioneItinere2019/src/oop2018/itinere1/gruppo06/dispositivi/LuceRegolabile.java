/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppo06.dispositivi;

/**
 *
 * @author patap
 */
public class LuceRegolabile extends AttuatoreRegolabile {

    public LuceRegolabile(int id, double livelloMin, double livelloMax, double livello) throws LivelloNonValidoException {
    super(id, livelloMin, livelloMax, livello);
    }
    
    @Override
    public String toString(){
     
        
        return super.toString()+" - Tipo: Luce regolabile";
        
        
    }
    
}
