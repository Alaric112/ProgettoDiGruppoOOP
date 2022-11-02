/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package esercitazione2016;

/**
 *
 * @author patap
 */
public class DipendenteDuplicatoException extends Exception {

    Dipendente d;
    /**
     * Creates a new instance of <code>DipendenteDuplicatoException</code>
     * without detail message.
     * @param d
     */
    public DipendenteDuplicatoException(Dipendente d) {
    
        this.d = d;
    }
}
