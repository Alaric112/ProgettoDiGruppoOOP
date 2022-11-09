/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06.developed;

import group06.provided.SensorFilter;

/**
 *
 * @author lorenzo
 */
public class SourceVoltageFilter implements SensorFilter{
    
    private double vs;

    public SourceVoltageFilter(double vs){
        
        this.vs = vs;
        
    }
    
    public boolean checkSensor(Sensor s){
        
        if(s instanceof TemperatureSensor){
            
            return(s.getRange() >= vs );
            
        }
        
        return false;
        
    }
    
    
    
}
