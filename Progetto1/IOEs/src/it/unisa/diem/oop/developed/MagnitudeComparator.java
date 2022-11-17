/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed;

import java.util.Comparator;

/**
 *
 * @author patap
 */
public class MagnitudeComparator implements Comparator<EQEvent> {

    @Override
    public int compare(EQEvent o1, EQEvent o2){
        
        
        return Double.compare(o1.getMagnitude(), o2.getMagnitude());
        
    }
    
}