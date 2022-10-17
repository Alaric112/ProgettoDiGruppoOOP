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
    
    LocalDate dataScadenza;

    public ProdottoAlimentare(String codice, String nome, double prezzo, LocalDate DataScadenza) {
        super(codice, nome, prezzo);
        this.dataScadenza = DataScadenza;
    }
    
    @Override
    public String stampa() {
        
        return super.stampa() + "Data di scadenza: " + dataScadenza + '\n';
        
    }
       
}