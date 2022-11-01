/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package distributore.eccezioni;

/**
 *
 * @author patap
 */
public class CreditoInsufficiente extends Exception {

    /**
     * Creates a new instance of <code>CreditoInsufficiente</code> without
     * detail message.
     */
    public CreditoInsufficiente() {
    }

    /**
     * Constructs an instance of <code>CreditoInsufficiente</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CreditoInsufficiente(String msg) {
        super(msg);
    }
}
