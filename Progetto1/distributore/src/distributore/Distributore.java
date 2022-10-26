/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributore;

import distributore.eccezioni.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author patap
 */
public class Distributore {
    
    private List <Bibita> bibite;
    // set non permette i duplicati
    private Set <Tessera> tessere;
    
    public Distributore(){
        
       bibite = new ArrayList();
       tessere = new HashSet(); 
        
    }
    
    public void registraTessera(int codice) throws CodiceTesseraPresente{
        
       Tessera t = new Tessera(codice);
        if (!tessere.add(t)) {
            throw new CodiceTesseraPresente();
        }         
        
    }
    
    public void caricaTessera(int codice, double saldo) throws TesseraNonValida{
        
        Tessera t = new Tessera(codice, saldo);
        if(!tessere.remove(t)){
            
            throw new TesseraNonValida();
        }
        tessere.add(t);
    }
    
    public void registraBevanda(Bibita b) throws CodiceBibitaPresente {
              
        if(bibite.contains(b)){
            
            throw new CodiceBibitaPresente();
        }
        
        bibite.add(b);
    }
    
    public void caricaBevanda(String codice, int numero) throws BibitaNonPresente {
        
        
        
    }
    
}
