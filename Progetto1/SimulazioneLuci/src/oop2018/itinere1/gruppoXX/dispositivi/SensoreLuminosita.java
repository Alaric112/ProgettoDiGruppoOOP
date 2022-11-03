/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX.dispositivi;

/**
 *
 * @author PC
 */
public class SensoreLuminosita extends Sensore{

    public SensoreLuminosita(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return super.toString() + " -  Tipo: Sensore di luminosità";
    }
    
    
}
