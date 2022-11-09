/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06;

import group06.provided.SensorFilter;

/**
 *
 * @author darbo
 */
public class LSMinOperatingTemperatureFilter implements SensorFilter{
    
    private double minTemperature;

    public LSMinOperatingTemperatureFilter(double minTemperature) {
         this.minTemperature = minTemperature;
         
    }
    
    
    
    @Override
    public boolean checkSensor(Sensor s){
        
        if(s instanceof LightSensor){
            
            return(s.getOperatingTemperature() >= minTemperature ); 
            
        }
        
        return false;
        
    }
    
}
