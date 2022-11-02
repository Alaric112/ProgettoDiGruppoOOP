/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.groupxx;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author patap
 */
public abstract class Device implements Comparable<Device> {
    
    private final String serialNumber;
    private final LocalDate releaseDate;
    private final int RAMsize;
    private final int storageCapacity;

    public Device(String serialNumber, int year, int month, int DayOfMonth, int RAMsize, int storageCapacity) {
        this.serialNumber = serialNumber;
        this.releaseDate = LocalDate.of(year, month, DayOfMonth);
        this.RAMsize = RAMsize;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.serialNumber.toUpperCase());
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
        final Device other = (Device) obj;
        if (!this.serialNumber.equalsIgnoreCase(other.serialNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Device o){
        
       return serialNumber.compareToIgnoreCase(o.serialNumber);
        
        
    }
    
    
    public String getSerialNumber() {
        return serialNumber;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getRAMsize() {
        return RAMsize;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }
    
    public abstract boolean hasTouchScreen();

    @Override
    public String toString() {


        StringBuffer s = new StringBuffer();
        
        s.append("serialNumber = ");
        s.append(serialNumber);
        s.append("\nreleaseDate = ");
        s.append(releaseDate);
        s.append("\nRAMsize = ");
        s.append(RAMsize);
        s.append("\nstorageCapcity");
        s.append(storageCapacity);       
        
        return s.toString();
        
    }

    
    
}
