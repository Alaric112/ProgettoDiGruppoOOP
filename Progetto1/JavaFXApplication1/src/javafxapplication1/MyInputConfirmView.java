/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication1;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author patap
 */
public class MyInputConfirmView extends VBox {
    
    //VBox contenitore più esterno che contiene gli altri oggetti della scena 
    // questa stess classe è il Vbox!
    
        Label lbl1;
        Label lbl2;
        TextField tfd1;
        TextField tfd2;
        Button btn;

    public MyInputConfirmView() {
        
        lbl1 = new Label();
        lbl2 = new Label();
        tfd1 = new TextField();
        tfd2 = new TextField();
        btn = new Button();
        
        lbl1.setText("Input:");
        lbl2.setText("Confirm input:");
        
        btn.setText("OK");
        
        // raw 1
        
        HBox raw1 = new HBox();
        
        raw1.getChildren().addAll(lbl1, tfd1);
        raw1.setSpacing(10);
        
        // raw 2
        
        HBox raw2 = new HBox();
        
        raw1.getChildren().addAll(lbl2, tfd2);
        raw1.setSpacing(10);
        
        // Container
        //VBox root = new VBox();
        
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(raw1, raw2, btn);
        this.setSpacing(20);
    }
    // FINE COSTRUTTORE    
        
        
}
