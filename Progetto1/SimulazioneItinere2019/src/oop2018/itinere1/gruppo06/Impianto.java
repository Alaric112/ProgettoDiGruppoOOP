/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppo06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import oop2018.itinere1.gruppo06.dispositivi.Dispositivo;
import oop2018.itinere1.gruppo06.dispositivi.LivelloNonValidoException;

/**
 *
 * @author patap
 */
public class Impianto {
 
    private String nome;
    private List<Regola> regole;
    private Map<Integer, Dispositivo> dispositivi;

    public Impianto(String nome) {
        this.nome = nome;
        this.regole = new ArrayList();
        this.dispositivi = new HashMap();
    }
    
    public Dispositivo add(Dispositivo d){
        
      if(dispositivi.containsKey(d.getId())){
          
         dispositivi.put(d.getId(), d); 
         return d; 
      }
        
      dispositivi.put(d.getId(), d);
      return null;  
      
    }
    
    public Dispositivo getDispositivo(int id){
        
        return dispositivi.get(id);
        
    }
    
    public void add(Regola r){
        
        regole.add(r);
                
    }
    
    public void applicaRegole(){
        
        for(Regola r : regole){
         
            try {
                r.applica();
            } catch (LivelloNonValidoException ex) {
                System.out.println("==== ERRORE ====");
            }
            
        }        
        
    }
    
    @Override
    public String toString(){
        
        String x = "\n=====================\nInformazioni impianto\n====================="+"\nNome: " + nome +"\n---- Elenco dispositivi ----\n"; 
        
        for(Dispositivo i : dispositivi.values()){
        

            x+=i.toString()+ '\n';
        }
        
         x += "\n---- Elenco Regole ----\n";
        
        for(Regola r : regole){
            
            x+= r.toString()+'\n';
        } 
         
        return x;
    }
}
