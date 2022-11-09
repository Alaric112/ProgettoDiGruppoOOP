/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06.developed;

import group06.provided.LightSensorType;
import group06.provided.Range;
import group06.provided.SensorOutputType;
import java.time.LocalDate;

/**
 *
 * @author Portatile
 */
public class LightSensor extends Sensor{
    private final double wavelength;
    private final boolean proximityDetection;
    private final Range<Double> operatingTemperature;
    private final LightSensorType lst;

    public LightSensor(double wavelength, boolean proximityDetection, <Double>, operatingTemperature, LightSensorType lst, String partNumber, String manufacturer, double price, Range<Object> vs, SensorOutputType sot, LocalDate manifacturingDate) {
        super(partNumber, manufacturer, price, vs, sot, manifacturingDate);
        this.wavelength = wavelength;
        this.proximityDetection = proximityDetection;
        this.operatingTemperature = operatingTemperature;
        this.lst = lst;
    }
    
    public LightSensor(double wavelength, <Double> operatingTemperature, LightSensorType lst, String partNumber, String manufacturer, double price, Range<Object> vs, SensorOutputType sot, LocalDate manifacturingDate) {
        super(partNumber, manufacturer, price, vs, sot, manifacturingDate);
        this.wavelength = wavelength;
        this.operatingTemperature = operatingTemperature;
        this.lst = lst;
    }

    public double getWavelength() {
        return wavelength;
    }

    public boolean isProximityDetection() {
        return proximityDetection;
    }

    public Range<Double> getOperatingTemperature() {
        return operatingTemperature;
    }

    public LightSensorType getLst() {
        return lst;
    }
    
    public boolean hasValidPartNumber(){
        String regex = "^APDS[0-9]{7}$";
        String regex1 = "^VCNL[0-9]{4}$";
         if(super.getPartNumber().matches(regex) || super.getPartNumber().matches(regex1)){
             return true;
         }
         return false;
    }

    @Override
    public String toString() {
         StringBuffer b = new StringBuffer("***LightSensor***\n");
         b.append("Wavelenght(nm) = ");
         b.append(wavelength);         
         b.append("\nProximityDetection = ");
         b.append(proximityDetection);         
         b.append("\nOperating Temperature(°C) = ");
         b.append(operatingTemperature);
         b.append("\nLight Sensor Type = ");
         b.append(lst);
         b.append(super.toString());
         return b.toString();
    }
    
    
}
