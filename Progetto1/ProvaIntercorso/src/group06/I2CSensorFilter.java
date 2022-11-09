/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06;

import group06.provided.SensorFilter;
import static group06.provided.SensorOutputType.I2C;

/**
 *
 * @author darbo
 */
public class I2CSensorFilter implements SensorFilter{

    @Override
    public boolean checkSensor(Sensor s) {
        
        return (s.getSot()== I2C);
    }
    
    
    
}
