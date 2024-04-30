package ca.mv.javafxdemo.rencontre_20;

import ca.mv.javafxdemo.rencontre_20.se.Dossier;
import ca.mv.javafxdemo.rencontre_20.se.Fichier;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        creerElements();
        GridPane gridPane = new GridPane(600,800);
        gridPane.setVgap(5);
        gridPane.setHgap(10);
        Scene scene = new Scene(gridPane);
        // Nom du dossier
        Label nomDossier = new Label("Nom : ");
        nomDossier.setMinWidth(250);
        GridPane.setConstraints(nomDossier, 1,1);
        // taille du dossier
        Label taille = new Label("Taille : ");
        taille.setMinWidth(100);
        GridPane.setConstraints(taille, 2, 1);
        // Nombre de fichiers dans le dossier
        Label nbrFichiers = new Label("Nombre de fichiers : ");
        GridPane.setConstraints(nbrFichiers, 3, 1);
        // Table affichant les fichiers dans le dossier
        TableView tableView = new TableView<>();
        tableView.setMinHeight(300);
        tableView.setMinWidth(600);
        // Créer les colonnes de la table
        TableColumn<String, String> nomCln = new TableColumn<>("nom");
        TableColumn<String, String> cheminCln = new TableColumn<>("chemin");
        TableColumn<String, Long> tailleCln = new TableColumn<>("taille");
        TableColumn<String, Boolean> lectureSeuleCln = new TableColumn<>("lecture seule");
        tableView.getColumns().addAll(nomCln, cheminCln, tailleCln, lectureSeuleCln);
        GridPane.setConstraints(tableView, 1, 2, 3,1);
        // // Section ajout d'un nouveau fichier
        HBox fichierCreationSection = new HBox();
        fichierCreationSection.setSpacing(20);
        fichierCreationSection.setAlignment(Pos.CENTER);
        // partie 1 : informations du fichier
        VBox informationsFichierSection = new VBox();
        informationsFichierSection.setSpacing(20);
        informationsFichierSection.setAlignment(Pos.CENTER);
        // Créer un textField pour le nom du fichier
        TextField nomFichier = new TextField();
        nomFichier.setPromptText("Entrez le nom du fichier");
        nomFichier.setMinWidth(300);
        // Créer un textField pour le nom du contenu du fichier
        TextArea contenuFichier = new TextArea();
        contenuFichier.setMinWidth(450);
        contenuFichier.setPromptText("Entrez le contenu du fichier");
        // Ajouter les champs de la partie 1 dans le Hbox de la section
        informationsFichierSection.getChildren().addAll(nomFichier, contenuFichier);
        // partie 2 : bouton pour ajout de fichier
        Button ajoutFichierBtn = new Button("Ajouter");
        fichierCreationSection.getChildren().addAll(informationsFichierSection, ajoutFichierBtn);
        GridPane.setConstraints(fichierCreationSection, 1, 3, 3, 1);
        // Ajouter tous les éléments dans la gridPane
        gridPane.getChildren().addAll(nomDossier, taille, nbrFichiers, tableView, fichierCreationSection);
        //gridPane.setGridLinesVisible(true);
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void creerElements() {
        Fichier fichier1 = new Fichier("Test1.docx", "Bonjour tout le monde! Le nom de ce fichier est Test1.docx");
        Fichier fichier2 = new Fichier("Test2.txt", "Bonjour tout le monde! Le nom de ce fichier est Test2.txt");
        Fichier fichier3 = new Fichier("Test3.pdf", "Bonjour tout le monde! Le nom de ce fichier est Test3.pdf");
        Fichier fichier4 = new Fichier("Test4.xlsx", "Bonjour tout le monde! Le nom de ce fichier est Test4.xlsx");
        Fichier fichier5 = new Fichier("Test5.csv", "Bonjour tout le monde! Le nom de ce fichier est Test5.csv");
        Fichier fichier6 = new Fichier("Test6.docx", "Bonjour tout le monde! Le nom de ce fichier est Test6.docx");
        Dossier dossier = new Dossier("Dossier tests", "Bonjour tout le monde! Le nom de ce dossier est Dossier tests");
        dossier.ajouterFichier(fichier1);
        dossier.ajouterFichier(fichier2);
        dossier.ajouterFichier(fichier3);
        dossier.ajouterFichier(fichier4);
        dossier.ajouterFichier(fichier5);
        dossier.ajouterFichier(fichier6);
        dossier.listerFichier();
        System.out.println("La taille du dossier est : " + dossier.getTaille());
    }
}