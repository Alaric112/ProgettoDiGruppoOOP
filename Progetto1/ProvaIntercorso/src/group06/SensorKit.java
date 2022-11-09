/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group06;

import group06.provided.Filterable;
import group06.provided.SensorFilter;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Portatile
 */
public class SensorKit implements Filterable, Iterable<Sensor>{
    private List<Sensor> sensors;
    private String name;

    public SensorKit(String name) {
        this.name = name;
        sensors = new LinkedList();
    }
    
    public void add(Sensor s) throws BadSensorPartNumberException{

        if(s.hasValidPartNumber()){
            
            sensors.add(s);
            
        }
        else{
            
            throw new BadSensorPartNumberException();
        }
        
        
    }
    
    public void remove(Sensor s){
        sensors.remove(s);
    }
    
    public void sort(Comparator<Sensor> c){
        if(c == null){
            Collections.sort(sensors);
        }
        Collections.sort(sensors, c);
    }
    
    @Override
    public Iterator<Sensor> iterator(){
        Iterator<Sensor> i = sensors.iterator();
        return i;
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer();
        b.append("This Sensor Kit contains ");
        b.append(sensors.size());
        b.append(" sensors.\n");
        
    for(Sensor i : sensors){
        
        b.append(i.toString());
        b.append("\n");
    }
        
        return b.toString();
    }

    @Override
    public SensorKit filter(SensorFilter f, Comparator<Sensor> c)  {
        
    SensorKit subKit = new SensorKit(name);
        
    for(Sensor i : sensors){    
        if(f.checkSensor(i))
        
           try {
               subKit.add(i);
        } catch (BadSensorPartNumberException ex) {

            System.out.println("ERRORE");
        } 
            
            
        }
    
    subKit.sort(c);

    return subKit;  
        
    }
    
    
}
