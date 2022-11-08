/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppoxx;

import java.util.Comparator;

/**
 *
 * @author patap
 */
public class TruckClassComparator implements Comparator<Truck> {
 
    
    public int compare(Truck o1, Truck o2){
        
        int x = o1.getTruckClass()-o2.getTruckClass();
       
       if( x == 0){
           
           return o1.getChassisID().compareTo(o2.getChassisID());
           
       } 
      
       return x;
        
    }
    
}
