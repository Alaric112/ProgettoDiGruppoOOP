/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author patap
 */
public class Libro implements Serializable {
   
    //private 
    
    private String tipoVol;
    private String greed;
    private String ISBN;
    private String codVol;
    private String titolo;
    private int anno;
    private double prezzo;
    private double peso;
    private int pagine;

    public Libro(String tipoVol, String greed, String ISBN, String codVol, String titolo, int anno, double prezzo, double peso, int pagine) {
        this.tipoVol = tipoVol;
        this.greed = greed;
        this.ISBN = ISBN;
        this.codVol = codVol;
        this.titolo = titolo;
        this.anno = anno;
        this.prezzo = prezzo;
        this.peso = peso;
        this.pagine = pagine;
    }

        public Libro() {
          
    }
    
    public String getTipoVol() {
        return tipoVol;
    }

    public void setTipoVol(String tipoVol) {
        this.tipoVol = tipoVol;
    }

    public String getGreed() {
        return greed;
    }

    public void setGreed(String greed) {
        this.greed = greed;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCodVol() {
        return codVol;
    }

    public void setCodVol(String codVol) {
        this.codVol = codVol;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }
    
//    @Override
//    public int compareTo(Libro o) {
//
//       return this.ISBN.compareTo(o.getISBN());
//        
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.ISBN);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "tipoVol=" + tipoVol + ", greed=" + greed + ", ISBN=" + ISBN + ", codVol=" + codVol + ", titolo=" + titolo + ", anno=" + anno + ", prezzo=" + prezzo + ", peso=" + peso + ", pagine=" + pagine + '}';
    }
     
    
    
}
