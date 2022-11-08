/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppoxx;

/**
 *
 * @author patap
 */
public class BigTankerFilter implements TruckFilter {

    private int minCapacity;

    public BigTankerFilter(int minCapacity) {
        this.minCapacity = minCapacity;
    }  
    
    
    @Override
    public boolean checkTruck(Truck t) {

    if(t instanceof Tanker){
    
    Tanker x = (Tanker) t;    
        
        if(x.getCapacity() >= minCapacity ){
            
            
            return true;
            
        }
        
    }

        return false;
    }
    
}
