/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2019.prova1.gruppo06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author patap
 */
public class NetworkHub implements NetworkInterface {
    
    private final String id;
    private Set<NetworkInterface> connections;

    public NetworkHub(String id) {
        
        this.id = id;
        connections = new HashSet();
    }

    @Override
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message){  

        System.out.println(this.toString() + ": da " + sourceAddress +" via " +sourceInterface.toString() + " per " + destAddress + ": Accesso a " + message);
        
        for(NetworkInterface x : connections ){
            
            if(!sourceInterface.equals(x)){
                
                x.accept(this, sourceAddress, destAddress, message);
                
            }
        }
                
      }
    
    @Override
    public void connect(NetworkInterface other){
        
        if(connections.contains(other))
            return;
        
        connections.add(other);
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final NetworkHub other = (NetworkHub) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }
    
    public void printConnections(){
        
        String msg = "Connessioni di: "+ toString();
        
        for (NetworkInterface x : connections){
            
            msg += "\n"+x.toString();
            
        }
        
        System.out.println(msg);
        
    }
    
    @Override
    public String toString(){
        
        return "Hub " + id; 
        
    }
    
}
