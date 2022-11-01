/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.group06;

import it.unisa.diem.oop.provided.MobileCPUType;

/**
 *
 * @author patap
 */
public class Smartphone extends Device{
    
    private MobileCPUType cpu;
    private float screenSizeInch;

    public Smartphone(MobileCPUType cpu, float screenSizeInch, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.cpu = cpu;
        this.screenSizeInch = screenSizeInch;
    }

    @Override
    public boolean hasTouchScreen() {
        return true;
    }

    public MobileCPUType getCpu() {
        return cpu;
    }

    public float getScreenSizeInch() {
        return screenSizeInch;
    }

    @Override
    public String toString() {
        return "Smartphone:\n" + super.toString() +  "CPU= " + cpu + "\nscreenSizeInch= " + screenSizeInch + '\n';
    }
    
}
