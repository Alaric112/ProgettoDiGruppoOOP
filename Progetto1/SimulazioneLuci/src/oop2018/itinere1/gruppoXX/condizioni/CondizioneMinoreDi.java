/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2018.itinere1.gruppoXX.condizioni;

/**
 *
 * @author utente
 */
public class CondizioneMinoreDi implements Condizione{
    private Sensore sensore;
    private double valoreDiConfronto;

    public CondizioneMinoreDi(Sensore sensore, double valoreDiConfronto) {
        this.sensore = sensore;
        this.valoreDiConfronto = valoreDiConfronto;
    }
    
    public boolean verifica(){
        return s.getValore()<valoreDiConfronto;
    }
    
    @Override
    public String toString(){
        StringBuffer b = new StringBuffer("Tipo condizione: Maggiore di ");
        b.append(valoreDiConfronto);
        b.append(super.toString());
        return b.toString();
    }

}
