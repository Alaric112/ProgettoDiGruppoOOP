/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributore;

import distributore.eccezioni.BibitaEsaurita;
import distributore.eccezioni.BibitaNonPresente;
import java.util.Objects;

/**
 *
 * @author patap
 */
public abstract class Bibita implements Comparable<Bibita>{
    private String codice;
    private String nome;
    private double prezzo;
    private int numero;

    public Bibita(String codice, String nome, double prezzo, int numero) {
        this.codice = codice;
        this.nome = nome;
        this.prezzo = prezzo;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bibita other = (Bibita) obj;
        if (!Objects.equals(this.codice, other.codice)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.codice);
        return hash;
    }
    
    
}
