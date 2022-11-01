/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2019.prova1.gruppo06;

/**
 *
 * @author patap
 */
public abstract class NetworkDevice implements NetworkInterface {
    
    private final int address;
    private static int counter =0;
    private NetworkInterface connection;
    
    public NetworkDevice(){
        
        counter++;
        this.address= counter;
        connection = null;
        
    }
    
    @Override
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message){
        
        // if(Address == destAddress)
        //this.equals(destAddress)
        if(address == destAddress)
            this.process(sourceAddress, message);
                          
    }
    
    @Override
    public void connect(NetworkInterface other){
        
        connection = other;
    
    }

    public int getAddress() {
        return address;
    }

    public NetworkInterface getConnection() {
        return connection;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.address;
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
        final NetworkDevice other = (NetworkDevice) obj;
        if (this.address != other.address) {
            return false;
        }
        return true;
    }
    
    protected abstract void process(int sourceAddress, String message);
    
    @Override
    public String toString(){
        
        return "Device " + address;
    }
    
}
