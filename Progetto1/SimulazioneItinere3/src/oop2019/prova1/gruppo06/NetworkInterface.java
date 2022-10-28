/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2019.prova1.gruppo06;

/**
 *
 * @author patap
 */
public interface NetworkInterface {
    
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message);
    
    public void connect(NetworkInterface other);
    
}
