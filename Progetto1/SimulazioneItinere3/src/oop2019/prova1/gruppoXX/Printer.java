/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2019.prova1.gruppoXX;

/**
 *
 * @author patap
 */
public class Printer extends NetworkDevice {

    @Override
    protected void process(int sourceAddress, String message){
             
        System.out.println(this.toString()+": Su richiesta di " + sourceAddress + message);
           
    }
    
    @Override
    public String toString(){
        
        return super.toString()+": Printer";
    }
    
    
    
}
