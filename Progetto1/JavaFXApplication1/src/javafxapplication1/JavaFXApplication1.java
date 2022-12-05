/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author patap
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        MyInputConfirmView view = new MyInputConfirmView();
        
//        Label lbl1;
//        Label lbl2;
//        
//        TextField tfd1;
//        TextField tfd2;
//        
//        Button btn;
//        
//        lbl1 = new Label();
//        lbl2 = new Label();
//        tfd1 = new TextField();
//        tfd2 = new TextField();
//        btn = new Button();
//        
//        lbl1.setText("Input:");
//        lbl2.setText("Confirm input:");
//        
//        btn.setText("OK");
//        
//        // raw 1
//        
//        HBox raw1 = new HBox();
//        
//        raw1.getChildren().addAll(lbl1, tfd1);
//        raw1.setSpacing(10);
//        
//        // raw 2
//        
//        HBox raw2 = new HBox();
//        
//        raw1.getChildren().addAll(lbl2, tfd2);
//        raw1.setSpacing(10);
//        
//        // Container
//        VBox root = new VBox();
//        
//        root.setAlignment(Pos.CENTER);
//        root.getChildren().addAll(raw1, raw2, btn);
//        root.setSpacing(20);
        
        // behaviour
        
//        BooleanBinding bb = Bindings.or(tfd1.textProperty().isEmpty(), tfd1.textProperty().isNotEqualTo(tfd2.textProperty()));
//        btn.disableProperty().bind(bb);
        
        MyInputConfirmController controller = new MyInputConfirmController(view);
        controller.initBindings();

        Scene scene = new Scene(view, 300, 250);                

        primaryStage.setTitle("My Input Confirm");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    launch(args);
                
    }
}
