package oop2019.prova1.gruppo03;

import java.util.Set;
import java.util.HashSet;

public class NetworkHub implements NetworkInterface{
    
    private final String id;
    private Set<NetworkInterface> network;
    

    public NetworkHub(String id){
        this.id = id;
        network = new HashSet<>();
    }

    @Override
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message){
        System.out.println(this.toString() + ": da " + sourceAddress +" via " +sourceInterface.toString() + " per " + destAddress + ": Accesso a " + message);
        
        for(NetworkInterface x : network ){
            
            if(!sourceInterface.equals(x)){
                
                x.accept(this, sourceAddress, destAddress, message);
                
            }
        }
    }

    @Override
    public void connect(NetworkInterface other){

        network.add(other);
    
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NetworkHub other = (NetworkHub) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
 
    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    public void printConnections(){
        StringBuffer s = new StringBuffer("Connessioni di: ");
        s.append(this.toString());
        s.append("\n");
        s.append(network.toString());
        System.out.println(s.toString());
        //TODO sistemare stampa
    }

    @Override
    public String toString() {
        
        StringBuffer s = new StringBuffer("Hub ");
        s.append(this.id);
        return s.toString();
    }


}
