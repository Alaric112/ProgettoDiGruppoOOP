/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppoxx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        
       if(!t.validateTruck()){
           
           throw new NotValidChassisIDException();
           
       }
       
       fleet.add(t);
        
    }
    
    public void sort(Comparator<Truck> t){
        
        Collections.sort(fleet, t);      
        
    }
    
    @Override
    public Iterator<Truck> iterator(){
        
        return fleet.listIterator();
        
    }

    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        
        s.append("My ");
        s.append(name);
        s.append(" cotanins ");
        s.append(fleet.size());
        s.append(" trucks\nListing:\n\n");
        
        for(Truck i : fleet ){
            
            s.append(i.toString());
            s.append("\n\n");
            
            
        }

        return s.toString();
    }
    
    public TruckFleet filter(TruckFilter t, Comparator<Truck> c){
        
     
    TruckFleet subFleet = new TruckFleet(name);    
    
    for(Truck i : fleet){    
        if(t.checkTruck(i)){
            
                subFleet.add(i);
            
            }
            
        }
            
        subFleet.sort(c);
        return subFleet;
    }
    
}