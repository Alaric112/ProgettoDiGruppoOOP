package oop2019.prova1.gruppo03;

public class Printer extends NetworkDevice{
    
    public Printer(){
        super();
    }

    protected void process(int sourceAddress, String message){

        StringBuffer s = new StringBuffer(this.toString());
        s.append(": Su richiesta di ");
        s.append(sourceAddress);
        s.append(": ");
        s.append(message);
        System.out.println(s.toString());
        
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer(super.toString());
        s.append(": Printer");
        return s.toString();
    }

    
}
