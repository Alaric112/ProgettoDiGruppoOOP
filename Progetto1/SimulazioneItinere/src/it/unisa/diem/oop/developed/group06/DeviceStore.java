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
        store = new TreeSet<>();
        
    }
    
    public DeviceStore(String name, Comparator<Device> c){
        
        this.name = name;
        store = new TreeSet<>(c);
    }
   
    public void addDevice(Device d){
        
       if(!store.add(d))
        throw new DeviceInsertionException();
    }

    @Override
    public DeviceStore filter(DeviceFilter d, Comparator<Device> c){
    
      DeviceStore subStore = new DeviceStore(this.name, c);  
    
             for(Device x : store ){
    
              if(d.checkDevice(x))
                  subStore.addDevice(x);
        }
        
        return subStore;
    }
    
    @Override
    public String toString() {
    
        String s= this.name + " contains " + store.size() + " items.\nPrinting:";
    
        for(Device d : store ){
    
            s+="\n*****\n";
            s+=d;
    
    
        }
        return s;
    
    }
}
