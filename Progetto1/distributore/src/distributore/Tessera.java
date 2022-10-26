/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributore;

/**
 *
 * @author patap
 */
public class Tessera {
 
    int codice;
    double saldo;

    public Tessera(int codice, double saldo) {
        this.codice = codice;
        this.saldo = saldo;
    }
    
    // Costruttore secondario
    public Tessera(int codice){
        
        this(codice, 0.0);
        
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.codice;
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
        final Tessera other = (Tessera) obj;
        if (this.codice != other.codice) {
            return false;
        }
        return true;
    }
    
    
}
