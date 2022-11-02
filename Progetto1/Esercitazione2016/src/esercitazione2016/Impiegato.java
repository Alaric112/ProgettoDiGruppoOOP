/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercitazione2016;

/**
 *
 * @author patap
 */
public class Impiegato extends AbstractDipendente {
    
    private String sede;

    public Impiegato(String nome, int matricola, String sede) {
        super(nome, matricola);
        this.sede = sede;
    }

    public Impiegato(int matricola) {
        super(matricola);
        this.sede= "";
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return super.toString() + " - Sede: " + sede;
    }
    
    
    
}
