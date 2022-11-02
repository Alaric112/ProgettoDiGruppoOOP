/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppo06.fornite;

import gruppo06.fare.Truck;
import gruppo06.fare.TruckFleet;
import java.util.Comparator;

/**
 *
 * @author lucagreco
 */
public interface Filterable { 
    
    
    TruckFleet filter(TruckFilter f, Comparator<Truck> c);
    
}
