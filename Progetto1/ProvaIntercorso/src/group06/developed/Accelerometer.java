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

    public Accelerometer(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manifacturingDate, double range, int sensingAxis, double bandwith) {
        super(partNumber, manufacturer, price, vs, sot, manifacturingDate);
        this.range = range;
        this.sensingAxis = sensingAxis;
        this.bandwith = bandwith;
    }
    
        public Accelerometer(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manifacturingDate, double range, double bandwith) {
        this(partNumber, manufacturer, price, vs, sot, manifacturingDate, range, 3, double bandwidth);
        
    }

    public double getRange() {
        return range;
    }

    public int getSensingAxis() {
        return sensingAxis;
    }

    public double getBandwith() {
        return bandwith;
    }
    
    @Override
    public boolean hasValidPartNumber(){
        
       String regex = "^ADXL[0-9]{3}$"; 
       String regex2 = "^ADIS[0-9]{3}$"; 
       
       if((getPartNumber().matches(regex)) || (getPartNumber().matches(regex2))){
           
           return true;
           
       }
       
        return false;
    }    

    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        
        s.append("\n***Accelerometer***");
        s.append("\nRange(g) = ");
        s.append(range);
        s.append("\nNumber of sensing Axis = ");
        s.append(sensingAxis);
        s.append("\nBandwith (KHz)= ");
        s.append(bandwith);
        s.append(super.toString());
        
        return s.toString();
        
    }
    
    
        
        
}
