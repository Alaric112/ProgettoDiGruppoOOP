/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppoxx;

import static gruppoxx.TruckType.STANDARD;

/**
 *
 * @author utente
 */
public class Dumper extends Truck{
    
    private final boolean sideDumpCapable;

    public Dumper(boolean sideDumoCapable, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass) {
        super(chassisID, dw, year, month, dayOfMonth, tt, truckClass);
        this.sideDumpCapable = sideDumoCapable;
    }
    
    public Dumper( String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass) {
        super(chassisID, dw, year, month, dayOfMonth, tt, truckClass);
        this.sideDumpCapable = false;
    }
    
    public Dumper( String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, int truckClass) {
        super(chassisID, dw, year, month, dayOfMonth, STANDARD, truckClass);
        this.sideDumpCapable = false;
    }

    public boolean isSideDumpCapable() {
        return sideDumpCapable;
    }

    @Override
    public boolean validateTruck() {
        if(this.getTruckClass()<=8 && this.getTruckClass()>=1){
            String regex = "^D[A-z]{2}[0-9]{4}$";
            return this.getChassisID().matches(regex);
        }
        return false;
        
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer("\nDump Truck\n");
        b.append(super.toString());
        if(isSideDumpCapable()){
            b.append("\nSide Dump = avaiable");
        }

        return b.toString();
    }
    
    
    
}
