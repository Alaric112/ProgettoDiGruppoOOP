/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06.fare;

import gruppo06.fornite.DriveWheelType;
import gruppo06.fornite.TruckType;
import static gruppo06.fornite.TruckType.STANDARD;

/**
 *
 * @author patap
 */
public class Dumper extends Truck{
    private final boolean sideDumpCapable;
    
    public Dumper(boolean sideDumpCapable, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass)
    {
        super(chassisID, dw, year, month, dayOfMonth, tt, truckClass);
        this.sideDumpCapable=sideDumpCapable;
    }
    
    public Dumper(String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass)
    {
        super(chassisID, dw, year, month, dayOfMonth, tt, truckClass);
        sideDumpCapable=false;
    }
    
    public Dumper(String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, int truckClass)
    {
        super(chassisID, dw, year, month, dayOfMonth, STANDARD, truckClass);
        sideDumpCapable=false;
    }
    
    public boolean isSideDumpCapable(){
            return sideDumpCapable;
    }
    
    @Override
    public boolean validateTruck(){
        

       if((this.getTruckClass() > 0) && (this.getTruckClass() < 9)){
         String regex = "^D[A-z]{2}[0-9]{4}$";
         return this.getChassisID().matches(regex);
       }
       return false;
    } 

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer("Dump Truck \n");
        b.append(super.toString());
        b.append("\nSide Dump =");
        if(isSideDumpCapable()){
        b.append("avaiable");
        }
        return b.toString();
    }
    
    
}
