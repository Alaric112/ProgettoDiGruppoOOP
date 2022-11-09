/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package group06;

/**
 *
 * @author patap
 */
public class BadSensorPartNumberException extends Exception {

    /**
     * Creates a new instance of <code>BadSensorPartNumberException</code>
     * without detail message.
     */
    public BadSensorPartNumberException() {
    }

    /**
     * Constructs an instance of <code>BadSensorPartNumberException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public BadSensorPartNumberException(String msg) {
        super(msg);
    }
}
