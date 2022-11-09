/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06.developed;

import group06.provided.Range;
import group06.provided.SensorOutputType;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author patap
 */
public abstract class Sensor implements Comparable<Sensor> {
 
    private final String partNumber;
    private final String manufacturer;
    private final double price;
    private final Range<double> vs;
    private final SensorOutputType sot;
    private final LocalDate manifacturingDate;

    public Sensor(String partNumber, String manufacturer, double price, Range<double> vs, SensorOutputType sot, LocalDate manifacturingDate) {
        this.partNumber = partNumber;
        this.manufacturer = manufacturer;
        this.price = price;
        this.vs = vs;
        this.sot = sot;
        this.manifacturingDate = manifacturingDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.partNumber.toUpperCase());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sensor other = (Sensor) obj;
        if (this.partNumber.equalsIgnoreCase(other.partNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Sensor o){
        
    return this.partNumber.compareToIgnoreCase(o.partNumber);
        
        
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public SensorOutputType getSot() {
        return sot;
    }

    public LocalDate getManifacturingDate() {
        return manifacturingDate;
    }

    public double getPrice() {
        return price;
    }
    
    
    
    public abstract boolean hasValidPartNumber();

    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        
        s.append("\nPart Number= ");
        s.append(partNumber);
        s.append("\nManufacturer= ");
        s.append(manufacturer);
        s.append("\nPrice($) = ");
        s.append(price);
        s.append("\nSource voltage range (V) = ");
        s.append(vs);
        s.append("\nOutput type = ");
        s.append(sot);
        s.append("\nManifacturing Date = ");
        s.append(manifacturingDate);
        
        return s.toString();
    }
    
    
    
}
