/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package oop2019.prova1.gruppoXX;

/**
 *
 * @author patap
 */
public class NetworkException extends RuntimeException {

    /**
     * Creates a new instance of <code>NetworkException</code> without detail
     * message.
     */
    public NetworkException() {
    }

    /**
     * Constructs an instance of <code>NetworkException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NetworkException(String errorMessage) {
        super(errorMessage);
    }
}
