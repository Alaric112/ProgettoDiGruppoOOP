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
public class BigTankFilter implements TruckFilter{
    private final int minCapacity;

    public BigTankFilter(int minCapacity) {
        this.minCapacity = minCapacity;
    }
    
    public boolean checkTruck(Truck t){//capire perchè non è Tanker
        if(t.getCapacity()>=minCapacity)
        {
            return true;
        }
        return false;
    }
}
