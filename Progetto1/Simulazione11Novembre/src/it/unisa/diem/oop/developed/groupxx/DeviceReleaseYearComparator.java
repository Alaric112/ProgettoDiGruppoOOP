/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.groupxx;

/**
 *
 * @author 39334
 */
public class DeviceReleaseYearComparator implements java.util.Comparator<Device>{
    
    public int compare(Device o1, Device o2){
        
       int x = o1.getReleaseDate().compareTo(o2.getReleaseDate());
        
        if(x==0){
            return(o1.getSerialNumber().compareTo(o2.getSerialNumber())); 
        }
        
        return x; 
       
    }
    
}
