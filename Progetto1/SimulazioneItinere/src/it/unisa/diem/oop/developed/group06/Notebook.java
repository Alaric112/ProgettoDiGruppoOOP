/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.group06;

import it.unisa.diem.oop.provided.CPUType;
import it.unisa.diem.oop.provided.NBScreenType;

/**
 *
 * @author patap
 */
public class Notebook extends Device {
    
    private CPUType type;
    private NBScreenType screenType;
    private boolean touchScreen;

    public Notebook(CPUType type, NBScreenType screenType, boolean touchScreen, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.type = type;
        this.screenType = screenType;
        this.touchScreen = touchScreen;
    }

    public Notebook(CPUType type, NBScreenType screenType, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
      this(type, screenType, false, serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
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
        return "Notebook:\n" + super.toString() +"CPU= " + type + "\nscreenType= " + screenType + "\ntouchScreen= " + touchScreen + '\n';
    }

}