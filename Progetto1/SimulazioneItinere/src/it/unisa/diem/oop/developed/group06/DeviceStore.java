/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.group06;

import it.unisa.diem.oop.provided.DeviceFilter;
import it.unisa.diem.oop.provided.Filterable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author patap
 */
public class DeviceStore implements Filterable {

    private String name;
    private Set<Device> store;
    
    public DeviceStore(String name){
        
        this.name = name;
        store = new TreeSet();
        
    }
    
    public DeviceStore(String name, Comparator<Device> c){
        
        this.name = name;
        store = new TreeSet(c);
    }
   
    public void addDevice(Device d){
        
        if(store.contains(d)){
            
            System.out.println("Sono già contenuto nel tree");
            return;
        }
        
        store.add(d);
        
    }

    @Override
    public String toString() {
        return name + "contains " + store.size() + "items.\nPrinting:\n*****" + store +'\n';
    }
    
   /* 
    @Override
    public DeviceStore filter(DeviceFilter d, Comparator<Device> c){
        
       Iterator<Device> i = store.iterator();
       if (c == null){
           
          
           
       }
        
    
    }
    
    }
*/
}
