/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX.dispositivi;

/**
 *
 * @author PC
 */
public class SensoreTemperatura extends Sensore{

    public SensoreTemperatura(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo: Sensore di temperatura";
        //StringBuffer b = new StringBuffer(super.toString());
        //b.append(" - Tipo: Sensore di temperatura");
        //return b.toString();
    }
    
    
}