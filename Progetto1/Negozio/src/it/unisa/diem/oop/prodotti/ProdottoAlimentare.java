/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.prodotti;

import java.time.LocalDate;

/**
 *
 * @author patap
 */
public class ProdottoAlimentare extends Prodotto {
    
    LocalDate DataScadenza;

    public ProdottoAlimentare(String codice, String nome, double prezzo, LocalDate DataScadenza) {
        super(codice, nome, prezzo);
        this.DataScadenza = DataScadenza;
    }
    
    @Override
    public void stampa() {
        System.out.println("Prodotto: " + "\ncodice: " + codice + "\nnome: " + nome + "\nprezzo: " + prezzo + '\n');
        
    }
       
}
