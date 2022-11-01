/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributore;

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
   
    // Costruttore secondario
    public Bibita(String codice, String nome){
        
        this(codice, nome, 5.0, 10);
    }

    // Questo meccanimo funziona grazie a "implements"
    @Override
    public int compareTo(Bibita x){
        
        return codice.toLowerCase().compareTo(x.getCodice().toLowerCase());
    }
    
    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.codice);
        return hash;
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
    public String toString() {
        return "Codice = " + codice + "\nNome = " + nome + "\nPrezzo=" + prezzo + "\nQuantità = " + numero + "\n";
    }
    
}
