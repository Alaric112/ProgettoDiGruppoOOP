package oop2019.prova1.gruppo03;

public class Computer extends NetworkDevice{
    
    private final String name;

    public Computer(String name){
        super();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    
    @Override
    protected void process(int sourceAddress, String message){
        StringBuffer s = new StringBuffer(this.toString());
        s.append(" ha ricevuto da ");
        s.append(sourceAddress);
        s.append(": ");
        s.append(message);
        System.out.println(s.toString());
    }

    public void remoteFileAccessRequest(int serverAddress, String fileName){

        if(this.getConnection() == null){
            throw new NetworkException("Impossibile accedere al file remoto: Connessione Assente");
        }

        getConnection().accept(this, this.getAddress(), serverAddress,fileName);

    }

    public void remotePrintRequest(int printerAddress, String filename){

        if(this.getConnection() == null){
            throw new NetworkException("Impossibile accedere alla stampante: Connessione Assente");
        }

        getConnection().accept(this, this.getAddress(), printerAddress, filename);
    }

    @Override
    public String toString() {
        
        StringBuffer s = new StringBuffer(super.toString());
        s.append(": Computer ");
        s.append(name); 
        return s.toString();
    }

    
}
