/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package gruppo06;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author gruppo06
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane pagina1;
    @FXML
    private TextField txdNome1;
    @FXML
    private TextField txdCognome1;
    @FXML
    private Button btnIniziaQuiz;
    @FXML
    private ProgressIndicator pgIndicator1;
    @FXML
    private AnchorPane page2;
    @FXML
    private Label lblDomandapage2;
    @FXML
    private RadioButton radioTrue;
    @FXML
    private RadioButton radioFalse;
    @FXML
    private Label lblCounterpage2;
    @FXML
    private Button btnAvanti;
    @FXML
    private AnchorPane page3;
    @FXML
    private TableView<?> quizTable;
    @FXML
    private TableColumn<?, ?> domandaClm;
    @FXML
    private TableColumn<?, ?> rispostaClm;
    @FXML
    private Label lblCongratulazioni3;
    @FXML
    private Button btnExport;
    @FXML
    private Button btnFine;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        System.out.println("povero lorenzo");
    }    

    @FXML
    private void IniziaQuizAction(ActionEvent event) {
    }

    @FXML
    private void radioTrueAction(ActionEvent event) {
    }

    @FXML
    private void radioFalseAction(ActionEvent event) {
    }

    @FXML
    private void avantiAction(ActionEvent event) {
    }

    @FXML
    private void exportAction(ActionEvent event) {
    }

    @FXML
    private void fineAction(ActionEvent event) {
    }
    
}
