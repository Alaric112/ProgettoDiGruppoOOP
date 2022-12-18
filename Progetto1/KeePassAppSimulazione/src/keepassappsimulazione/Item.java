/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keepassappsimulazione;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author patap
 */
public class Item implements Serializable {
 
    private String titolo;
    private String nomeUtente;
    private String password;

/**
 * 
 * @param titolo
 * @param nomeUtente
 * @param password 
 */    
    
    public Item(String titolo, String nomeUtente, String password) {
        this.titolo = titolo;
        this.nomeUtente = nomeUtente;
        this.password = password;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.titolo);
        hash = 31 * hash + Objects.hashCode(this.nomeUtente);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.titolo, other.titolo)) {
            return false;
        }
        if (!Objects.equals(this.nomeUtente, other.nomeUtente)) {
            return false;
        }
        return true;
    }
       
    
}
