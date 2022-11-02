/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercitazione2016;

/**
 *
 * @author patap
 */
public abstract class AbstractDipendente implements Dipendente {
    
    private String nome;
    private int matricola;

    public AbstractDipendente(String nome, int matricola) {
        this.nome = nome;
        this.matricola = matricola;
    }
    
    public AbstractDipendente(int matricola) {
        
        this.matricola = matricola; 
        this.nome = "";      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.matricola;
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
        final AbstractDipendente other = (AbstractDipendente) obj;
        if (this.matricola != other.matricola) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome + " - matricola: " + matricola;
    }
      
}
