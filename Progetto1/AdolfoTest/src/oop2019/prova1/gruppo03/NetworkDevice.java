package oop2019.prova1.gruppo03;

public abstract class NetworkDevice implements NetworkInterface {
    
    private static int addCounter=0;
    private final int Address;
    private NetworkInterface connection;

    public NetworkDevice(){
        addCounter++;
        this.Address = addCounter;
        connection = null;
    }

    @Override
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message){
        if(destAddress == this.Address){
            this.process(sourceAddress, message);
        }
    }

    @Override
    public void connect(NetworkInterface other){
        connection = other;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NetworkDevice other = (NetworkDevice) obj;
        if (Address != other.Address)
            return false;
        return true;
    }

    public int getAddress(){
        return this.Address;
    }

    public NetworkInterface getConnection(){
        return this.connection;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Address;
        return result;
    }

    protected abstract void process(int sourceAddress, String message);

    @Override
    public String toString() {
        
        StringBuffer s = new StringBuffer("Device ");
        s.append(Address);
        return(s.toString());
    }

}
