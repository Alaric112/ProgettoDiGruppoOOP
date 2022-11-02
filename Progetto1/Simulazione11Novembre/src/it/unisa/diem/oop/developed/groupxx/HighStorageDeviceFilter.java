/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.groupxx;

import it.unisa.diem.oop.provided.DeviceFilter;

/**
 *
 * @author 39334
 */
public class HighStorageDeviceFilter implements DeviceFilter {
    
    private int minSize;

    public HighStorageDeviceFilter(int minSize) {
        this.minSize = minSize;
    }
    
    @Override
    public boolean checkDevice(Device d){
        
        if(d.getStorageCapacity( )> minSize){
            
            return true;
            
        }
        
        return false;
        
    }
    
}
