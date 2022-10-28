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
public class Department extends LinkedList<Person> implements Sortable{

    @Override
    public void sort(){        
 
        
        
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
