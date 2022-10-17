/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.carrello;

import it.unisa.diem.oop.prodotti.Prodotto;

/**
 *
 * @author patap
 */
public class Carrello {
    private final static int DEFAUT_SIZE=5;
    private int maxDim, riemp;
    private Prodotto prodotti[];
    
    public Carrello(int maxDim) {
        this.maxDim = maxDim;
        this.riemp = 0;
        prodotti = new Prodotto[maxDim];
        
    }
    
    // Costruttore secondario
    // Viene usato in caso nel main non vengono specificati il numero di posti
    // è importante che venga usato la definizione "static" a DEFAUT_SIZE
    public Carrello(){
        this(DEFAUT_SIZE);
    }
    
    public int size(){
        
        return riemp;
    }
    
    public boolean isEmpty(){
        
        return riemp == 0;
    }
    
    public boolean isFull(){
        
        return riemp == maxDim;
    }
        
    
    public void aggiungi(Prodotto s)  {
           
    prodotti[riemp] = s;    
    riemp++;
    
    }
    public int calcolaTotaleScontato(){
        int totale = 0;
        for(int i=0;i<maxDim;i++)
        {
            totale=totale+;
        }
        return  totale;
    }

    @Override
    public String toString() {
        return "contenuto del carrello:" + "\nmaxDim=" + maxDim + "\nriemp=" + riemp + "\nprodotti=" + prodotti + '\n';
    }
    
    
}
