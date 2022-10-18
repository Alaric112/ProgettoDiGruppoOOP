/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributore;

/**
 *
 * @author patap
 */
public class Distributore {
     
    private static int DEAFAULT_SIZE = 10;
    private Tessera tessere[];
    private Bibita bibite[];
    private int maxTessere, maxBibite;
    
    public Distributore(int maxTessere, int maxBibite) {
        this.maxTessere = maxTessere;
        this.maxBibite = maxBibite;

        tessere = new Tessera[maxTessere];
        bibite = new Bibita[maxBibite];
    }
    
    // Costruttore secondario
    public Distributore(){
        
        this(DEAFAULT_SIZE, DEAFAULT_SIZE);
        
    }
    
    
    
    
    
    
    
    
}


