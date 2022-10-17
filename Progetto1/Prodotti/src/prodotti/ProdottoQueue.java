/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prodotti;

/**
 *
 * @author patap
 */
public class ProdottoQueue {
 
    private final static int DEFAUT_SIZE=5;
    public final int maxDim;
    private Prodotto prodotti[];
    private int riemp;

    public ProdottoQueue(int maxDim) {
        this.maxDim = maxDim;
        prodotti = new Prodotto[maxDim];
        this.riemp = 0;
    }
    
    public ProdottoQueue() {
      this(DEFAUT_SIZE);
    }
    
    
    public void stampaTriste(){
        
      System.out.println("Sono triste :(");
    
    }
}
