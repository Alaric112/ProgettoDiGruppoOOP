/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2019.prova1.gruppo06;

/**
 *
 * @author patap
 */
public class FileServer extends NetworkDevice {
    
    @Override
    protected void process(int sourceAddress, String message){
        
        if(getConnection()== null)
            throw new NetworkException();
        
        System.out.println(this.toString()+": Su richiesta di " + sourceAddress+ " : Accesso a " + message);
        
        // messaggio di risposta
        String reMessage = "Dati risposta: "+message;
        getConnection().accept(this, getAddress(), sourceAddress, reMessage);
        
    }
    
    @Override
    public String toString(){
        
        return super.toString()+": File Server";
    }
    
}
