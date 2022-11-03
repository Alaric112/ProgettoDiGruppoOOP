/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX.condizioni;

import oop2018.itinere1.gruppoXX.dispositivi.Sensore;

/**
 *
 * @author utente
 */
public class CondizioneMaggioreDi implements Condizione {
    private final Sensore sensore;
    private final double valoreDiConfronto;

    public CondizioneMaggioreDi(Sensore sensore, double valoreDiConfronto) {
        this.sensore = sensore;
        this.valoreDiConfronto = valoreDiConfronto;
    }
    
    public boolean verifica(){
        return sensore.getValore()>valoreDiConfronto;
    }
    
    @Override
    public String toString(){
        StringBuffer b = new StringBuffer("Tipo condizione: Maggiore di ");
        b.append(valoreDiConfronto);
        b.append(" ");
        b.append(super.toString());
        return b.toString();
    }
}
