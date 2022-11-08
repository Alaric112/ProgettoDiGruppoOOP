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
public class Tanker extends Truck {
    private final TankType ttype;
    private final int capacity;

    public Tanker(TankType ttype, int capacity, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass) {
        super(chassisID, dw, year, month, dayOfMonth, tt, truckClass);
        this.ttype = ttype;
        this.capacity = capacity;
    }
    
    public Tanker(TankType ttype, int capacity, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, int truckClass) {
        super(chassisID, dw, year, month, dayOfMonth, STANDARD, truckClass);
        this.ttype = ttype;
        this.capacity = capacity;
    }

    public TankType getTtype() {
        return ttype;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean validateTruck() {
        
        if((this.getTruckClass() < 9) && (this.getTruckClass()> 0)){
            String regex = "^T[A-z]{3}[0-9]{3}$";
            return getChassisID().matches(regex);
        }
        return false;
        
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer("\nTank Truck\nTank Type = ");
        b.append(ttype);
        b.append("\nTank capacity = ");
        b.append(capacity);
        b.append("\n");
        b.append(super.toString());
        return b.toString();
    }
    
    
}
