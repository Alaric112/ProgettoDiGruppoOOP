/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06.fare;

import gruppo06.fornite.Filterable;
import gruppo06.fornite.TruckFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author patap
 */
public class TruckFleet implements Filterable, Iterable<Truck> {

    private List<Truck> fleet;
    private String name;

    public TruckFleet(String name) {
        
        this.name = name;
        this.fleet = new ArrayList();
    }
    
    public void add(Truck t){
                
       if(t.validateTruck() == false){
           
            System.out.println("Problema");
            throw new NotValidChassisIDException();
        }
        
        fleet.add(t);
        
    }
    
    public void remove(Truck t){
        
        fleet.remove(t);
        
    }
   
    public void sort(Comparator<Truck> t){
        
        if (t == null){
            
            Collections.sort(fleet);
            return;
        }
        
        Collections.sort(fleet, t);
        
    }
    
    @Override
    public Iterator<Truck> iterator(){
        
        Iterator<Truck> i = fleet.iterator();
        
        return i;
    }

    @Override
    public String toString() {

        StringBuffer s =  new StringBuffer();

        s.append("My");
        s.append(name);
        s.append("Contains ");
        s.append(fleet.size());
        s.append(" trucks.\nListing:\n");
        
        for(Truck i : fleet){
            
            s.append(i.toString());
            s.append("\n");
            
        }
        
        return s.toString();
    }
    
    @Override
    public TruckFleet filter(TruckFilter t, Comparator<Truck> c){
        
    TruckFleet flotta = new TruckFleet(name);
        
    for(Truck i : fleet){    
        if(t.checkTruck(i))
        
           flotta.add(i); 
            
            
        }
    
    flotta.sort(c);

    return flotta;   
    
    
    }
    
}
