package ca.mv.projet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationJeu extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // TODO: remplacer par le code approprié
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationJeu.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}