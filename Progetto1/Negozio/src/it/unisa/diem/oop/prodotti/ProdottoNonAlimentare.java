/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.prodotti;

/**
 *
 * @author Portatile
 */
public class ProdottoNonAlimentare extends Prodotto{
    private boolean riciclabile;

    public ProdottoNonAlimentare(String codice, String nome, double prezzo, String Materiale) {
        super(codice, nome, prezzo);
        this.riciclabile = riciclabile;
    }


    
    @Override
    public void applicaSconto(){
        if(materiale != null){
            if(riciclabile){
                prezzo -= (prezzo*10)/100;
            }
        }
    }
    
    
    
}
