/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package oop2018.itinere1.gruppo06.dispositivi;

/**
 *
 * @author patap
 */
public class LivelloNonValidoException extends Exception {

    /**
     * Creates a new instance of <code>LivelloNonValidoException</code> without
     * detail message.
     */
    public LivelloNonValidoException() {
    }

    /**
     * Constructs an instance of <code>LivelloNonValidoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LivelloNonValidoException(String msg) {
        super(msg);
    }
}
