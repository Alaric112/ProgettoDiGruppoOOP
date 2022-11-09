/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06.developed;

import group06.provided.Range;
import group06.provided.SensorOutputType;
import java.time.LocalDate;

/**
 *
 * @author patap
 */
public class Accelerometer extends Sensor {
    
    private final double range;
    private final int sensingAxis;
    private final double bandwith;

    public Accelerometer(String partNumber, String manufacturer, double price, Range<Object> vs, SensorOutputType sot, LocalDate manifacturingDate, double range, int sensingAxis, double bandwith) {
        super(partNumber, manufacturer, price, vs, sot, manifacturingDate);
        this.range = range;
        this.sensingAxis = sensingAxis;
        this.bandwith = bandwith;
    }
    
        public Accelerometer(String partNumber, String manufacturer, double price, Range<Object> vs, SensorOutputType sot, LocalDate manifacturingDate, double range, double bandwith) {
        this(partNumber, manufacturer, price, vs, sot, manifacturingDate, double range, 3, double bandwidth);
        
    }
    
}
