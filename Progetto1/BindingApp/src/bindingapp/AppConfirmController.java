/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bindingapp;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;

import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;

/**
 *
 * @author patap
 */
public class AppConfirmController {
    
    AppConfirmView view;
//    private NumberBinding nb;
//    private NumberBinding nb4;
    private DoubleProperty ip = new SimpleDoubleProperty();
//    private DoubleProperty nb2 = new SimpleDoubleProperty();
//    private DoubleProperty nb3 = new SimpleDoubleProperty();    
//    private IntegerProperty ip = new SimpleIntegerProperty();
//    private IntegerProperty nb2 = new SimpleIntegerProperty();
//    private IntegerProperty nb3 = new SimpleIntegerProperty();

    
    
    public AppConfirmController(AppConfirmView view) {
        
        this.view = view;
    
        // Creo colleggamento tra la check box e il metodo da eseguire
        // il colleggamento viene fatto attraverso l'uso di una lambda expression
        // ESSENDO che è l'unica operazione da fare il formalismo della lamba expression può essere scritta
        // su una sola riga... NOTA: solo perché l'operazione è unica si può usare una lamba expression semplificata 
        
        // ATTENZIONE qui viene sempre eseguita un operazione, che il box sia attivo o meno, per questo è inutile associare un azione nel caso specifico del azione!!
        // non particolarmente utile per i checkBox!
        //view.check1.setOnAction(event -> CheckAction());
        
        
    }
    
    
    public void initBindings(){
        
        view.lbl2.textProperty().bind(Bindings.when(view.check1.selectedProperty()).then("Fahr to Celsius").otherwise("Celsius to Fahr"));

        StringProperty valore = view.tfd1.textProperty();
        StringProperty risultato = view.lbl4.textProperty();
        //risultato.bind(nb2.asString());
       
        // usiamo il bind directional per creare un legame tra il valore immesso  e il valore logico che modificheremo per il risultato
        // essendo che il valore immesso NON è un numero abbiamo bisogno del converter della bidirectional, difatti stiamo usando la bidirectional SOLO
        // per il facite utilizzo al converter!!
        
        StringConverter conv = new DoubleStringConverter();
        Bindings.bindBidirectional(valore, ip, conv);
        
//        Bindings.bindBidirectional(valore, ip, new StringConverter<Number>(){
//            @Override
//            public String toString(Number object) {
//
//                // se entra un Numero -> ritorna una stringa
//                return object.toString();
//            }
//
//            @Override
//            public Number fromString(String string) {
//
//                
//                // se entra una stringa, viene ritornato il suo valore "Intero", tramite il convertitore Ascii parseInt
//                // per come useremo noi il bind directional questa parte non dovrebbe mai entrare.
//                return Integer.parseInt(string);
//                
//            }
//                  
//        });
        
        NumberBinding fahrTo = (ip.subtract(32)).multiply(1.8);
        NumberBinding CelsiusTo = (ip.multiply(1.8)).add(32);
        
        // ATTENZIONE i number bindings possono richiamere asString MA se puntano null, questo fa crashare il programma se usato!!
        
        risultato.bind(Bindings.when(view.check1.selectedProperty()).then(fahrTo.asString()).otherwise(CelsiusTo.asString()));
       
        // In questo caso si può sempre attivare, che il TextField sia vuoto o meno, indifferente 
        
//        // se la checkbox è vuota, questo va a disattivare le sue proprietà, utile solo a livello visivo, ma in questo caso non ha nessuna utilità logica
//        BooleanBinding bb = Bindings.isEmpty(view.tfd1.textProperty());
//        // Lega la condizione alla disativazione del checkBox
//        view.check1.disableProperty().bind(bb);
        
        
    }
    
    
//    public void CheckAction(){
//        
//        
//        
//        
//        
//    }
    
    
}
