/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package group06.developed;

/**
 *
 * @author patap
 */
public class BadArgumentsForSensorTypeException extends RuntimeException {

    /**
     * Creates a new instance of <code>BadArgumentsForSensorTypeException</code>
     * without detail message.
     */
    public BadArgumentsForSensorTypeException() {
    }

    /**
     * Constructs an instance of <code>BadArgumentsForSensorTypeException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public BadArgumentsForSensorTypeException(String msg) {
        super(msg);
    }
}
