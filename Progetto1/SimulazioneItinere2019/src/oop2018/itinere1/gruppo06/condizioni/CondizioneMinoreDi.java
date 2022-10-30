/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppo06.condizioni;

import oop2018.itinere1.gruppo06.dispositivi.Sensore;

/**
 *
 * @author patap
 */
public class CondizioneMinoreDi implements Condizione {
   
    private Sensore sensore;
    private double valoreDiConfronto;

    public CondizioneMinoreDi(Sensore sensore, double ValoreDiConfronto) {
        this.sensore = sensore;
        this.valoreDiConfronto = ValoreDiConfronto;
    }

    @Override
    public boolean verifica(){
        
     return sensore.getValore() < valoreDiConfronto;
        
    }
    
    @Override
    public String toString() {
        return "Tipo condizione: Minore di "+ valoreDiConfronto + " -  attivata per: " + sensore;
    }
    
}
