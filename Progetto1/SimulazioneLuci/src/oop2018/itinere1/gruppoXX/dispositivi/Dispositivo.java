/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX.dispositivi;

/**
 *
 * @author PC
 */
public abstract class Dispositivo {
    private int id;
    private boolean acceso;

    public Dispositivo(int id) {
        this.id = id;
        this.acceso = false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
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

    public boolean isAcceso() {
        return acceso;
    }

    @Override
    public String toString() {
        return "ID dispositivo: " + id + " Stato: " + acceso;
        //StringBuffer b = new StringBuffer("ID dispositivo: ");
        //b.append(id);
        //b.append(" Stato: ");
        //b.append(acceso);
        //return b.toString();
    }
    
    
}
