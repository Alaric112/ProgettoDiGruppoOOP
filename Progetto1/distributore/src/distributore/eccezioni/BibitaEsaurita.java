/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package distributore.eccezioni;

/**
 *
 * @author patap
 */
public class BibitaEsaurita extends Exception {

    /**
     * Creates a new instance of <code>BibitaEsaurita</code> without detail
     * message.
     */
    public BibitaEsaurita() {
    }

    /**
     * Constructs an instance of <code>BibitaEsaurita</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public BibitaEsaurita(String msg) {
        super(msg);
    }
}
