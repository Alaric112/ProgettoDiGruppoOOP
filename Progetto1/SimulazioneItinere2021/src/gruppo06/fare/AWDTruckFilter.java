/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06.fare;

import static gruppo06.fornite.DriveWheelType.AWD_4X4;
import static gruppo06.fornite.DriveWheelType.AWD_6X6;
import gruppo06.fornite.TruckFilter;

/**
 *
 * @author patap
 */
public class AWDTruckFilter implements TruckFilter {
   
    @Override
    public boolean checkTruck(Truck t){
        
        if(t.getDw() == AWD_4X4 || t.getDw() == AWD_6X6){
            
            
            return true; 
            
        }
        
            return false;
    }
   
}
