/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06;

import group06.provided.Range;
import static group06.provided.SensorOutputType.ANALOG;
import static group06.provided.SensorOutputType.DIGITAL;
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

    public TemperatureSensor(double tempError, double outputSensitivity, double tempResolution, int bits, String partNumber, String manufacturer, double price, Range<Object> vs, LocalDate manifacturingDate){
        super(partNumber, manufacturer, price, vs, DIGITAL, manifacturingDate);
        if(super.getSot() == ANALOG){
            throw new BadArgumentsForSensorTypeException();
        }
        this.tempError = tempError;
        this.outputSensitivity = outputSensitivity;
        this.tempResolution = tempResolution;
        this.bits = bits;
    }
    
    public TemperatureSensor(double tempError, double outputSensitivity, double tempResolution, int bits, String partNumber, String manufacturer, double price, Range<Object> vs, LocalDate manifacturingDate) {
        super(partNumber, manufacturer, price, vs, ANALOG, manifacturingDate);
         if(super.getSot() == DIGITAL){
            throw new BadArgumentsForSensorTypeException();
        }
        this.tempError = tempError;
        this.outputSensitivity = outputSensitivity;
        this.tempResolution = tempResolution;
        this.bits = bits;
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
        if(super.getPartNumber().matches(regex) || super.getPartNumber().matches(regex1)){
             return true;
         }
         return false;
    }

    @Override
    public String toString() {
         StringBuffer b = new StringBuffer("***Analog Temperature Sensor***\n");
         b.append("Temperature Error(Deg) = ");
         b.append(tempError);         
         b.append("\nOutputSensitivity(mV/°C) = ");
         b.append(outputSensitivity);         
         b.append(super.toString());
         return b.toString();
    }
    
    
    
    
    
}
