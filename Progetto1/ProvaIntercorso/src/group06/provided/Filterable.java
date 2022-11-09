/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group06.provided;

import group06.Sensor;
import group06.SensorKit;
import java.util.Comparator;

/**
 *
 * @author lucagreco
 */
public interface Filterable {
    
    SensorKit filter(SensorFilter sf, Comparator<Sensor> c);
    
}
