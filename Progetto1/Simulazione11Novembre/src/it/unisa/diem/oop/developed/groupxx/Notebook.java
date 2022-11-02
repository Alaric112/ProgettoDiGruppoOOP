/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.groupxx;

import it.unisa.diem.oop.provided.CPUType;
import it.unisa.diem.oop.provided.NBScreenType;

/**
 *
 * @author patap
 */
public class Notebook extends Device {
    
    private final CPUType type;
    private final NBScreenType screenType;
    private final boolean touchScreen;

    public Notebook(CPUType type, NBScreenType screenType, boolean touchScreen, String serialNumber, int year, int month, int DayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, DayOfMonth, RAMsize, storageCapacity);
        this.type = type;
        this.screenType = screenType;
        this.touchScreen = touchScreen;
    }
    
        public Notebook(CPUType type, NBScreenType screenType, String serialNumber, int year, int month, int DayOfMonth, int RAMsize, int storageCapacity) {
        this(type, screenType, false ,serialNumber, year, month, DayOfMonth, RAMsize, storageCapacity);

    }

    public CPUType getType() {
        return type;
    }

    public NBScreenType getScreenType() {
        return screenType;
    }

    @Override
    public boolean hasTouchScreen() {
        return touchScreen;
    }

    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        
        s.append("Notebook\n");
        s.append(super.toString());
        s.append("\nscreenType = ");
        s.append(screenType);
        if(touchScreen){
            
        s.append("\ntouchScreen available");
        }
        
        return s.toString();
        
    }
    
}
