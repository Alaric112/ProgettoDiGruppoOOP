/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06.fare;

import gruppo06.fornite.DriveWheelType;
import gruppo06.fornite.TruckType;
import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;


/**
 *
 * @author patap
 */
public abstract class Truck implements Comparable<Truck>{
    
    private final String chassisID;
    private final LocalDate registrationDate;
    private final DriveWheelType dw;
    private final TruckType tt;
    private final int truckClass;

    public Truck(String chassisID, DriveWheelType dw ,int year, int month ,int DayOfMonth, TruckType tt, int truckClass) {
        this.chassisID = chassisID;
        this.dw = dw;
        this.registrationDate = LocalDate.of(year, month, DayOfMonth);
        this.tt = tt;
        this.truckClass = truckClass;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.chassisID.toUpperCase());
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
    public String toString() {

        StringBuffer s = new StringBuffer();

        s.append("chassis ID = ");
        s.append(chassisID);
        s.append("\ntruck type = ");
        s.append(tt);
        s.append("\ndrive-wheel = ");
        s.append(dw);
        s.append("\nregistration date = ");
        s.append(registrationDate);
        s.append("\ntruck class = ");
        s.append(truckClass);
        s.append("\nvalidation = ");
        s.append(validateTruck());

        return s.toString();
    }
    
    
    
}
