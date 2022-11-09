/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06;

import java.util.Comparator;

/**
 *
 * @author lorenzo
 */
public class ManifacturingDateComparator implements Comparator<Sensor>{
    
    @Override
    public int compare(Sensor o1, Sensor o2){
        
       return o1.getManifacturingDate().compareTo(o2.getManifacturingDate());
        
       
    }
    
}
