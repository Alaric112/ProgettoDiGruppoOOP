/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication1;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;

/**
 *
 * @author patap
 */
public class MyInputConfirmController {
    
    MyInputConfirmView view;

    // Costruttore per avere un riferimento grafico per accedere ai contenuti
    
    // La parte di controller gestisce la parte di interazione, ha un riferimento alla view e al modello
    // in questo caso abbiamo solo una view

    public MyInputConfirmController(MyInputConfirmView view) {
        
        this.view = view;
    
        // Creo colleggamento tra il bottone e il metodo da eseguire
        // il colleggamento viene fatto attraverso l'uso di una lamba expression
        // ESSENDO che è l'unica operazione da fare il formalismo della lamba expression può essere scritta
        // su una sola riga... NOTA: solo perché l'operazione è unica si può usare una lamba expression semplificata 
        view.btn.setOnAction(event -> buttonAction());
        
        
    }
    
    public void initBindings(){
        
        BooleanBinding bb = Bindings.or(view.tfd1.textProperty().isEmpty(), view.tfd1.textProperty().isNotEqualTo(view.tfd2.textProperty()));
        view.btn.disableProperty().bind(bb);
    }
    
    public void buttonAction(){
     
        System.out.println("Povero Lorenzo!");
        
                
        
    }
    
    
}
