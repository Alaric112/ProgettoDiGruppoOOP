/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2019.prova1.gruppo06;

/**
 *
 * @author patap
 */
public class Computer extends NetworkDevice {
    
    private final String nome;
    
    public Computer(String nome){
        
        this.nome= nome;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    protected void process(int sourceAddress, String message){
        
        System.out.println(toString() + nome +"ha ricevuto da " + sourceAddress+ "Dati risposta: "+message);
        
    }
    
    public void remoteFileAccessRequest(int serverAddress, String fileName){
        
        if(this.getConnection()== null)
            throw new NetworkException();
        
        getConnection().accept(this, getAddress(), serverAddress, fileName);
        
    }
    
        public void remotePrintRequest(int printerAddress, String fileName){
        
        if(this.getConnection()== null)
            throw new NetworkException();
        
        getConnection().accept(this, getAddress(), printerAddress, fileName);
        
    }

    @Override
    public String toString() {
        return super.toString()+": Computer " + nome;
    }
        
        
    
}


