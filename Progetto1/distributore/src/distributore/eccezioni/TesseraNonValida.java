/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package distributore.eccezioni;

/**
 *
 * @author patap
 */
public class TesseraNonValida extends Exception {

    /**
     * Creates a new instance of <code>TesseraNonValida</code> without detail
     * message.
     */
    public TesseraNonValida() {
    }

    /**
     * Constructs an instance of <code>TesseraNonValida</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TesseraNonValida(String msg) {
        super(msg);
    }
}
