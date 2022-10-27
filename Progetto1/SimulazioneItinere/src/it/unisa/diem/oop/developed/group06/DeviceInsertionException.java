/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package it.unisa.diem.oop.developed.group06;

/**
 *
 * @author patap
 */
public class DeviceInsertionException extends Exception {

    /**
     * Creates a new instance of <code>DeviceInsertionException</code> without
     * detail message.
     */
    public DeviceInsertionException() {
    }

    /**
     * Constructs an instance of <code>DeviceInsertionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeviceInsertionException(String msg) {
        super(msg);
    }
}
