/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo06.azioni;

import oop2018.itinere1.gruppo06.dispositivi.LivelloNonValidoException;

/**
 *
 * @author Gennaro
 */
public interface Azione {
    public void esegui() throws LivelloNonValidoException;
}
