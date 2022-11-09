/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06;

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
    
    @Override
    public boolean checkSensor(Sensor s){
        
        return(s.getVs().contains(vs));
            
       
    }
    
}
