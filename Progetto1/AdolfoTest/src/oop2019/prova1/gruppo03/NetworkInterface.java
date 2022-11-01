package oop2019.prova1.gruppo03;

public interface NetworkInterface {
    
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message);

    public void connect(NetworkInterface other);
}
