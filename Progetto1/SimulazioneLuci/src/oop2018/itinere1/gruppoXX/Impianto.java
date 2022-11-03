/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oop2018.itinere1.gruppoXX.dispositivi.Dispositivo;

/**
 *
 * @author patap
 */
public class Impianto {
    
    private String name;
    private List<Regola> regole;
    private Map<Integer, Dispositivo> dispositivi;

    public Impianto(String name) {
        this.name = name;
        this.dispositivi = new HashMap();
        
    }
    
    public Dispositivo add(Dispositivo d){
        
      Dispositivo x = dispositivi.put(d.getId(), d);
        
      return x;
    }
    
    public Dispositivo getDispositivo(int id){
        
       return dispositivi.get(id);
        
    }
    
    public void add(Regola r){
        
        regole.add(r);
        
        
    }
    
    public void applicaRegole(){
        
        for (Regola i : regole){
            
            i.applica();
            
        }
        
    }

    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        
        
        
        s.append("=====================\nInformazioni impianto\n=====================\n\nNome: ");
        s.append(name);
        s.append("\n---- Elenco dispositivi ----\n");
        
        for(Dispositivo i : dispositivi.values()){
            
            s.append(i.toString());
            s.append("\n");
        }

        s.append("\n\n---- Elenco regole ----\n");
        
        for(Regola j : regole){
            
            s.append(j.toString());
            s.append("\n");
        }
        
        return s.toString();
           
    }
    
    
    
}
