/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package distributore.eccezioni;

/**
 *
 * @author patap
 */
public class CodiceBibitaPresente extends Exception {

    /**
     * Creates a new instance of <code>CodiceBibitaPresente</code> without
     * detail message.
     */
    public CodiceBibitaPresente() {
    }

    /**
     * Constructs an instance of <code>CodiceBibitaPresente</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CodiceBibitaPresente(String msg) {
        super(msg);
    }
}
