/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX;

import java.util.logging.Level;
import java.util.logging.Logger;
import oop2018.itinere1.gruppoXX.azioni.Azione;
import oop2018.itinere1.gruppoXX.condizioni.Condizione;

/**
 *
 * @author patap
 */
public class Regola {
    
    private Condizione condizione;
    private Azione azione;

    public Regola(Condizione condizione, Azione azione) {
        this.condizione = condizione;
        this.azione = azione;
    }

    public Condizione getCondizione() {
        return condizione;
    }

    public Azione getAzione() {
        return azione;
    }    
    
    public boolean applica(){
        
        if(condizione.verifica()){
            
            try {
                azione.esegui();
                return true;
            } catch (Exception ex) {
                return false;

            }
            
        }
        
        return false;
    }

    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        
        s.append("Informazioni regola - ");
        s.append(condizione.toString());
        s.append(azione.toString());
             
        
        return s.toString();
                
    }
    
}
