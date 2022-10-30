package oop2019.prova1.gruppo03;

public class FileServer extends NetworkDevice{

    public FileServer() {
        super();
    }

    protected void process(int sourceAddress, String message){
        StringBuffer s = new StringBuffer(this.toString());
        s.append(": Su richiesta di ");
        s.append(sourceAddress);
        s.append(": ");
        s.append(message);
        System.out.println(s.toString());

        if(this.getConnection() == null){
            throw new NetworkException("Impossibile connettersi alla rete");
        }
        StringBuffer m = new StringBuffer("Dati risposta: Accesso a ");
        m.append(message);

        this.accept(this.getConnection(),sourceAddress,this.getAddress(),m.toString());
    }

    @Override
    public String toString() {
        
        StringBuffer s = new StringBuffer(super.toString());
        s.append(": File Server");
        return s.toString();
    }
    
}
