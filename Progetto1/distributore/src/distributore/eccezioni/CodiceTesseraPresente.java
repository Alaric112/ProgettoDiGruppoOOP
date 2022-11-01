/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package distributore.eccezioni;

/**
 *
 * @author patap
 */
public class CodiceTesseraPresente extends Exception{

    /**
     * Creates a new instance of <code>CodiceTesseraPresente</code> without
     * detail message.
     */
    public CodiceTesseraPresente() {
    }

    /**
     * Constructs an instance of <code>CodiceTesseraPresente</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CodiceTesseraPresente(String msg) {
        super(msg);
    }
}
