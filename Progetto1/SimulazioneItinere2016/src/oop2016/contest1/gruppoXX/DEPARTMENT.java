/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2016.contest1.gruppoXX;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author 39334
 */
public class Department extends LinkedList<Person> implements Sortable, Filterable{

    @Override
    public void sort(){        
 
        /* riordina secondo l'ordine naturale definito da Person, diffati Person implementa Comparable<Person>, creando grazie
        al metodo compareTO un ordine naturale, per richiamarlo basta fare cosi... essendo che Departament è una sottoclasse di linkelist
        */
        Collections.sort(this);
        
    }
    
    @Override
    public Department filter(PersonFilter f){
     
        Iterator<Person> i = iterator();       
        Department pf = new Department();
        
        while(i.hasNext()){

            // dovrebbe efftuare una shallow copy del elemento i.next
            // ovvero ottiene il riferimento del oggetto "person" di i.next
            // vedere la slide n°73 del power point "introduzione al linguaggio java"
            
            Person p = i.next();
            
            if(f.checkPerson(p)){
               
               pf.add(p);
                        
                
            }
         
        }
        return pf;

    }
    
    
    
    @Override
    public String toString(){

        String x = "";

        Iterator<Person> i = iterator();  
        
        while(i.hasNext()){
            
            x += i.next().toString();
         
        }
        
        return x;
    }


    
    
}
