/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2019.prova1.test;
import oop2019.prova1.gruppo06.Computer;
import oop2019.prova1.gruppo06.NetworkHub;
import oop2019.prova1.gruppo06.FileServer;
import oop2019.prova1.gruppo06.Printer;
/**
 * 
 */
public class Main {

    public static void main(String args[]) {
        Computer c1=new Computer("Notebook Pasquale");
        Printer p=new Printer();
        Computer c2=new Computer("Desktop Gennaro");
        FileServer fs=new FileServer();
        NetworkHub hub1=new NetworkHub("H07P01");
        NetworkHub hub2=new NetworkHub("H42P00");
        
        //Creazione connessione tra c1 e hub1
        c1.connect(hub1);
        hub1.connect(c1);
        
        //Creazione connessione tra p e hub1
        p.connect(hub1);
        hub1.connect(p);

        //Creazione connessione tra c2 e hub2
        c2.connect(hub2);
        hub2.connect(c2);

        //Creazione connessione tra fs e hub2
        fs.connect(hub2);
        hub2.connect(fs);
        
        //Creazione connessione tra hub1 e hub2
        hub1.connect(hub2);
        hub2.connect(hub1);
        
        System.out.println("CONNESSIONI DI RETE REALIZZATE");
        hub1.printConnections();
        hub2.printConnections();
        
        System.out.println();
        System.out.println("-------------------------------------------------");
        c1.remoteFileAccessRequest(fs.getAddress(), "hello.docx");
        System.out.println("-------------------------------------------------");
        c1.remotePrintRequest(p.getAddress(), "hello.docx");
        System.out.println("-------------------------------------------------");
        c2.remoteFileAccessRequest(fs.getAddress(), "budget.xlsx");
        System.out.println("-------------------------------------------------");
        c2.remotePrintRequest(p.getAddress(), "budget.xlsx");
    }
}
