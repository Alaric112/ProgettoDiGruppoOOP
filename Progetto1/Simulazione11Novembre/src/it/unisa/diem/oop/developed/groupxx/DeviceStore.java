/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.groupxx;

import it.unisa.diem.oop.provided.DeviceFilter;
import it.unisa.diem.oop.provided.Filterable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author patap
 */
public class DeviceStore implements Filterable {
    
    private Set<Device> store;
    private final String name;

    public DeviceStore(String name) {

        this(name, null);
    }
    
    public DeviceStore(String name, Comparator<Device> c){
        
        this.name = name;
        this.store = new TreeSet(c);
        
    }

    public void addDevice(Device d){
        
        if(store.contains(d)){
            
            throw new DeviceInsertionException();
        }
        
        store.add(d);
    }

    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        
        s.append(name);
        s.append(" contains ");
        s.append(store.size());
        s.append("\nPrinting:\n*****\n");
        for(Device i : store){
            
            s.append(i.toString());
            s.append("\n");
        }

        return s.toString();
    }
    
    
    
    @Override
    public DeviceStore filter(DeviceFilter d, Comparator<Device> c) {

        DeviceStore subStore = new DeviceStore(name, c);
        
        for(Device i : store){
            
            if(d.checkDevice(i)){
                
                subStore.addDevice(i);
            }
            
        }
        
        return subStore;
    }
    
}
