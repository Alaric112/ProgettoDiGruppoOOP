/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX;

import java.util.List;
import java.util.Map;

/**
 *
 * @author patap
 */
public class Impianto {
    
    private String name;
    private List<Regola> regole;
    private Map<Integer, Dispositivo> dispositivi;

    public Impianto(String name) {
        this.name = name;
        this.dispositivi = new HashMap();
        
    }
    
    
    
}
