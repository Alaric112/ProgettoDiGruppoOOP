/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bindingapp;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;

/**
 *
 * @author patap
 */
public class AppConfirmController {
    
    AppConfirmView view;
    
    public AppConfirmController(AppConfirmView view) {
        
        this.view = view;
    
        // Creo colleggamento tra il bottone e il metodo da eseguire
        // il colleggamento viene fatto attraverso l'uso di una lamba expression
        // ESSENDO che è l'unica operazione da fare il formalismo della lamba expression può essere scritta
        // su una sola riga... NOTA: solo perché l'operazione è unica si può usare una lamba expression semplificata 
        view.check1.setOnAction(event -> CheckAction());
        
        
    }
    
    
    public void initBindings(){
        
        BooleanBinding bb = Bindings.isEmpty(view.tfd1.textProperty());
        view.check1.disableProperty().bind(bb);
        
    }
    
    
    public void CheckAction(){
        
        
        
        
        
    }
    
    
}
