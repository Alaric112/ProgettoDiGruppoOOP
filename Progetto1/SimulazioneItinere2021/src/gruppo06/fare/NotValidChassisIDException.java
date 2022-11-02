/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package gruppo06.fare;

/**
 *
 * @author patap
 */
public class NotValidChassisIDException extends RuntimeException {

    /**
     * Creates a new instance of <code>NotValidChassisIDException</code> without
     * detail message.
     */
    public NotValidChassisIDException() {
    }

    /**
     * Constructs an instance of <code>NotValidChassisIDException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public NotValidChassisIDException(String msg) {
        super(msg);
    }
}
