/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercitazione2016;

/**
 *
 * @author patap
 */
public class Tecnico extends AbstractDipendente {
    
    private String cellulare;

    public Tecnico(String nome, int matricola, String cellulare) {
        super(nome, matricola);
        this.cellulare = cellulare;
    }

    public Tecnico(int matricola) {
        super(matricola);
        this.cellulare = "";
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cellulare: " + cellulare;
    }
    
    
}
