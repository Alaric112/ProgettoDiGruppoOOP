/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06.fare;

import gruppo06.fornite.DriveWheelType;
import gruppo06.fornite.TankType;
import gruppo06.fornite.TruckType;

/**
 *
 * @author patap
 */
public class Tanker extends Truck{
    private final int capacity;
    private final TankType ttype;

    public Tanker(TankType ttype, int capacity, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass){
        super(chassisID, dw, year,month, dayOfMonth,tt,truckClass);
        this.ttype = ttype;
        this.capacity = capacity;
    }

    public Tanker(TankType ttype, int capacity, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, int truckClass) {
        super(chassisID, dw, year,month, dayOfMonth,truckClass);
        this.ttype = ttype;
        this.capacity = capacity;      
    }

    public int getCapacity() {
        return capacity;
    }

    public Tanktype getTtype() {
        return ttype;
    }
    
    @Override
    public boolean validateTruck(){
       if(capacity>=1&&capacity<=8){
         String regex = "^T[A-z]{3}[0-9]{3}$";
         return this.getChassisID().matches(regex);
       }
       return false;
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer("Tank Truck \n Tank Type :");
        b.append(this.ttype);
        b.append("\nTank capacity :");
        b.append(this.capacity);
        b.append(super.toString());
        b.append("validation :");
        if(validateTruck()){
        b.append("PASSED");
        }
        else{
            b.append("NOT PASSED");
        }
        return b.toString();
    }
    
    
}
