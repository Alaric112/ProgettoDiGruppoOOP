/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06.fare;

import gruppo06.fornite.DriveWheelType;
import gruppo06.fornite.TankType;
import gruppo06.fornite.TruckType;
import static gruppo06.fornite.TruckType.STANDARD;

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
        super(chassisID, dw, year,month, dayOfMonth, STANDARD ,truckClass);
        this.ttype = ttype;
        this.capacity = capacity;      
    }

    public int getCapacity() {
        return capacity;
    }

    public TankType getTtype() {
        return ttype;
    }
    
    @Override
    public boolean validateTruck(){
        
       if((this.getTruckClass() >=1 )&& (this.getTruckClass()<=8)){
         String regex = "^T[A-z]{3}[0-9]{3}$";
         
         
         return this.getChassisID().matches(regex);
       }
       
       return false;
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer("\nTank Truck\nTank Type: ");
        b.append(this.ttype);
        b.append("\nTank capacity: ");
        b.append(this.capacity);
        b.append("\n");
        b.append(super.toString());
        b.append("\nSide dump =  ");
        if(validateTruck()){
        b.append("available");
        }
        else{
            b.append("not available");
        }
        return b.toString();
    }
    
    
}
