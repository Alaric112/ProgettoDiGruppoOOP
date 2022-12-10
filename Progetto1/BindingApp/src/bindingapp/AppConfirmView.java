/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bindingapp;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author patap
 */
public class AppConfirmView extends VBox {
    
        Label lbl1;        
        Label lbl2;
        Label lbl3;
        Label lbl4;
        
        TextField tfd1;
        TextField tfd2;
        TextField tfd3;
        TextField tfd4;
        CheckBox check1;

    public AppConfirmView() {

        lbl1 = new Label();
        lbl2 = new Label();
        lbl3 = new Label();
        lbl4 = new Label();

        tfd1 = new TextField();
//        tfd2 = new TextField();
//        tfd3 = new TextField();
//        tfd4 = new TextField();
        check1 = new CheckBox();
        
        lbl1.setText("Input:");
        lbl2.setText("Fahr To Celsius");
        lbl3.setText("Result:");
        lbl4.setText("0");
        
        check1.setText("<-->");
        
        // raw 1
        
        HBox raw1 = new HBox();
        
        raw1.getChildren().add(lbl2);
        raw1.setSpacing(10);        
        raw1.setAlignment(Pos.CENTER);
        
        
        // raw 2
        
        HBox raw2 = new HBox();
        
        raw2.getChildren().addAll(lbl1, tfd1);
        raw2.setSpacing(10);        
        raw2.setAlignment(Pos.CENTER);

        
        // raw 3
        
        HBox raw3 = new HBox();
        
        raw3.getChildren().addAll(lbl3, lbl4);
        raw3.setSpacing(10); 
        raw3.setAlignment(Pos.CENTER);

        
        // Container
        //VBox root = new VBox();
        
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(raw1, raw2, raw3, check1);
        this.setSpacing(20);
        
    }
 
        
        
}
