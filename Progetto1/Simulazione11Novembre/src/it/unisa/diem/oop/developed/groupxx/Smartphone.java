/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.groupxx;

import it.unisa.diem.oop.provided.MobileCPUType;

/**
 *
 * @author patap
 */
public class Smartphone extends Device {
    
    private final MobileCPUType cpu;
    private final float screenSizeInch;

    public Smartphone(MobileCPUType cpu, float screenSizeInch, String serialNumber, int year, int month, int DayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, DayOfMonth, RAMsize, storageCapacity);
        this.cpu = cpu;
        this.screenSizeInch = screenSizeInch;
    }

    public MobileCPUType getCpu() {
        return cpu;
    }

    public float getScreenSizeInch() {
        return screenSizeInch;
    }
    
    @Override
   public boolean hasTouchScreen(){
       
       return true;
   } 

    @Override
    public String toString() {

    
        StringBuffer s = new StringBuffer();
        
        s.append("SmartPhone\n");
        s.append(super.toString());
        s.append("\nCPU = ");
        s.append(cpu);
        s.append("\nscreenSizeInch = ");
        s.append(screenSizeInch);
        
        return s.toString();
        
        
    }
       
   
   
}
