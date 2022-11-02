/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06.fare;

import gruppo06.fornite.TruckFilter;

/**
 *
 * @author patap
 */
public class BigTankerFilter implements TruckFilter{
    private final int minCapacity;

    public BigTankerFilter(int minCapacity) {
        this.minCapacity = minCapacity;
    }
    
    
    @Override
    public boolean checkTruck(Truck t){//capire perchè non è Tanker
        
        if (t instanceof Tanker){
        
            final Tanker other = (Tanker) t;
            
            if(other.getCapacity() >= minCapacity ){
                
                return true;
                                
            }

        
        }
            return false;

    }
    
    
}