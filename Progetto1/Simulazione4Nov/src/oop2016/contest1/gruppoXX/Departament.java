/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2016.contest1.gruppoXX;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author patap
 */
public class Departament implements Sortable, Filterable {
    
    private List<Person> persone = new LinkedList();
    
    @Override
    public void sort(){
        
        Collections.sort(persone);
        
    }

    @Override
    public List<Person> filter(PersonFilter f) {

        List<Person> subPersone = new LinkedList();
        
        for(Person i : persone){
            
            if(f.checkPerson(i)){
            
            subPersone.add(i);
            
            }
        }
        
        return subPersone;
        
    }
    
    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        
        for(Person i : persone){
            
            s.append(i.toString());
            s.append("\n");
            
            
        }

        return s.toString();
    }
 
}
