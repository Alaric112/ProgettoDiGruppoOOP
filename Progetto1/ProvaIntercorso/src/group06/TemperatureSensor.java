/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06;

import group06.provided.Range;
import group06.provided.SensorOutputType;
import static group06.provided.SensorOutputType.ANALOG;
import static group06.provided.SensorOutputType.DIGITAL;
import static group06.provided.SensorOutputType.PWM;
import static group06.provided.SensorOutputType.SPI;
import java.time.LocalDate;

/**
 *
 * @author Portatile
 */
public class TemperatureSensor extends Sensor{
    private final double tempError;
    private final double outputSensitivity;
    private final double tempResolution;
    private final int bits;

    // digitale
    public TemperatureSensor(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manifacturingDate, double tempResolution ,double tempError, int bits){
        super(partNumber, manufacturer, price, vs, sot, manifacturingDate);
        if(sot == ANALOG  || sot == SPI || sot == PWM){
            throw new BadArgumentsForSensorTypeException();
        }
        this.tempError = tempError;
        this.outputSensitivity = 0.0;
        this.tempResolution = tempResolution;
        this.bits = bits;
    }
    
    
    // 
    public TemperatureSensor(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manifacturingDate, double tempError, double outputSensitivity) {
        super(partNumber, manufacturer, price, vs, sot, manifacturingDate);
         if(sot != ANALOG){
            throw new BadArgumentsForSensorTypeException();
        }
        this.tempError = tempError;
        this.outputSensitivity = outputSensitivity;
        this.tempResolution = 0;
        this.bits = 0;
    }
    

    public double getTempError() {
        return tempError;
    }

    public double getOutputSensitivity() {
        return outputSensitivity;
    }

    public double getTempResolution() {
        return tempResolution;
    }

    public int getBits() {
        return bits;
    }

    @Override
    public boolean hasValidPartNumber() {
        String regex = "^AD[0-9]{4}$";
        String regex1 = "^ADT[0-9]{4}$";
        if(getPartNumber().matches(regex) || getPartNumber().matches(regex1)){
             return true;
         }
         return false;
    }

    @Override
    public String toString() {
           
    StringBuffer b = new StringBuffer();
        
    if(getSot() == ANALOG){  
         b.append("\n***Analog Temperature Sensor***");
         b.append("\nTemperature Error(Deg) = ");
         b.append(tempError);         
         b.append("\nOutputSensitivity(mV/°C) = ");
         b.append(outputSensitivity);         
         b.append(super.toString());
         
    }
    else{
        
         b.append("\n***Digital Temperature Sensor***");
         b.append("\nTemperature Resolution = ");
         b.append(tempResolution);
         b.append("\nTemperature Error(Deg) = ");
         b.append(tempError);         
         b.append("\nBits = ");
         b.append(bits);         
         b.append(super.toString());
        
    }
    
         return b.toString();
    }
    
    
    
    
    
}
