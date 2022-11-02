/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercitazione2016;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author patap
 */
public class PresenzeDipendenti {
   
    private Map<Dipendente, Integer> m;

    public PresenzeDipendenti() {
        this.m = new HashMap();
    }
    
    public void aggiornaPresenzaDipendente(Dipendente d, int presenze) throws DipendenteAssenteException{
        
      if(!m.containsKey(d)){
          
          throw new DipendenteAssenteException(d);
      }    
    
      m.replace(d, presenze);
      
    }
    
    public void aggiungiNuovoDipendente(Dipendente d) throws DipendenteDuplicatoException{
        
        if(m.containsKey(d)){
            
            throw new DipendenteDuplicatoException(d);
        }
        
        m.put(d, 0);
        
    }
            
    public void rimuoviDipendente(Dipendente d) throws DipendenteAssenteException{
     
          if(!m.containsKey(d)){
          
          throw new DipendenteAssenteException(d);
      }  
          
      m.remove(d);
          
    }     

    @Override
    public String toString() {
        
        String s="";
        // Set<Map.Entry<Dipendente, Integer>> x = m.entrySet();
        
        for(Map.Entry<Dipendente, Integer> d : m.entrySet()){
           
            s += d.getKey().toString()+" - Presenze: " + d.getValue().toString()+"\n" ;
            
        }
        
        return s;
    }
    
    public Set<Tecnico> getTecnici(){
        
        Set<Tecnico> tecnici = new HashSet();
       
        for(Map.Entry<Dipendente, Integer> d : m.entrySet()){
            
            if(d.getKey() instanceof Tecnico){
                
                tecnici.add((Tecnico) d.getKey());
            }
            
        }
       
        return tecnici;
    }
    
}
