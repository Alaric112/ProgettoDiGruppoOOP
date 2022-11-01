/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2017.contest1.gruppo06;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author patap
 */
public class Aeroporto{
    
    private final List<Aeromobile> flotta;
    private final CodeChecker checker;

    public Aeroporto(CodeChecker checker) {
        this.checker = checker;
        this.flotta = new LinkedList();
        
    }
    
    public boolean inserisci(Aeromobile a){
        
        if((checker == null) || (checker.check(a.getCodice()))){
            
            flotta.add(a);
            return true;
        }
        
        return false;
    }
    
    public Aeromobile cerca(String codice){
        
         for(Aeromobile i : flotta ){
          if(i.getCodice().equals(codice)){
              
              return i;
          }
            
        }
        return null;
    }
    
    public Aeromobile rimuovi(String codice){
        
       Aeromobile jimbo = this.cerca(codice);
       
      flotta.remove(jimbo);
      
      return jimbo;
       
    }
    
    public int elementi(){
        
        return flotta.size();
        
    }

    @Override
    public String toString() {
 
    String x = "";    
        
        for( Aeromobile i : flotta){
            
            x+= i.toString()+'\n';
            
        }
        return x;
    }
    
    
}
