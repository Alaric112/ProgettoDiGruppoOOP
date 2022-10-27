/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.group06;

import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;

/**
 *
 * @author patap
 */
public abstract class Device implements Comparable<Device>{
  
    private String serialNumber;
    private LocalDate releaseDate;
    private int RAMsize;
    private int storageCapacity;

    public Device(String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        this.serialNumber = serialNumber;
        this.releaseDate = LocalDate.of(year, month, dayOfMonth);
        this.RAMsize = RAMsize;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.serialNumber);
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
        
       if (!Objects.equals(this.serialNumber, other.serialNumber)) {
            return false;
        }

        return true;
    }
    
    @Override
    public int compareTo(Device x){
        
        return serialNumber.toLowerCase().compareTo(x.getSerialNumber().toLowerCase());
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

    @Override
    public String toString() {
        return "serialNumber=" + serialNumber + "\nreleaseDate= " + releaseDate + "\nRAMsize= " + RAMsize + "GB\nstorageCapacity= " + storageCapacity + "GB\n";
    }
    
    public abstract boolean hasTouchScreen();
    
}
