/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppo06;

import java.util.logging.Level;
import java.util.logging.Logger;
import oop2018.itinere1.gruppo06.azioni.Azione;
import oop2018.itinere1.gruppo06.condizioni.Condizione;
import oop2018.itinere1.gruppo06.dispositivi.LivelloNonValidoException;

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
    
    public boolean applica() throws LivelloNonValidoException{
        
        if(condizione.verifica()){  
            try {
                azione.esegui();
            } catch (LivelloNonValidoException ex) {
               return false;
            }
            return true;
            
        }
            
        return false;
    }

    public Condizione getCondizione() {
        return condizione;
    }

    public Azione getAzione() {
        return azione;
    }
    
    @Override
    public String toString(){
        
        return "Informazioni regola - " + condizione.toString() + " " + azione.toString();
    }
  
}
