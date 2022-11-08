/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppoxx;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author utente
 */
public abstract class Truck implements Comparable<Truck>{
    private final String chassisID;
    private final LocalDate registrationDate;
    private final DriveWheelType dw;
    private final TruckType tt;
    private final int truckClass;

    public Truck(String chassisID,DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass) {
        this.chassisID = chassisID;
        this.dw = dw;
        this.registrationDate=LocalDate.of(year, month, dayOfMonth);
        this.tt = tt;
        this.truckClass = truckClass;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.chassisID.toUpperCase());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Truck other = (Truck) obj;
        if (this.chassisID.equalsIgnoreCase(other.chassisID)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Truck o){
        
        return this.chassisID.compareToIgnoreCase(o.chassisID);
        
    }

    public String getChassisID() {
        return chassisID;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public DriveWheelType getDw() {
        return dw;
    }

    public TruckType getTt() {
        return tt;
    }

    public int getTruckClass() {
        return truckClass;
    }
       
    public abstract boolean validateTruck();
    
    @Override
    public String toString(){
        StringBuffer b = new StringBuffer("chassis ID = ");
        b.append(chassisID);
        b.append("\ntruck type = ");
        b.append(tt);
        b.append("\ndrive-wheel = ");
        b.append(dw);
        b.append("\nregistration Date = ");
        b.append(registrationDate);
        b.append("\ntruck Class = ");
        b.append(truckClass);
        b.append("\nvalidation = ");
        if(validateTruck())
            b.append(" PASSED");
        else
            b.append(" NOT PASSED");
        return b.toString();
    }
 
}
