/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppo06.dispositivi;

/**
 *
 * @author patap
 */
public abstract class Dispositivo {
   
    private int id;
    private boolean acceso;

    public Dispositivo(int id) {
        this.id = id;
        this.acceso = true;
    }

    @Override
    public String toString() {
        
        if (acceso == true ){
        return "ID dispositivo: " + id + " Stato: acceso";
        }
        return "ID dispositivo: " + id + " Stato: spento";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
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
        final Dispositivo other = (Dispositivo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }
    
    public void accendi(){
        
        acceso = true;
    }
    
    
    public void spegni(){
        
        acceso = false;
    }
    
    public boolean isAcceso(){
        
        return acceso;
    }
    
}
