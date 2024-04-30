package ca.mv.projet;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppController {
    // TODO: remplacer par le code approprié
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}