package ca.mv.projet.composants;

import ca.mv.projet.models.Echiquier;
import ca.mv.projet.models.cases.Position;
import javafx.fxml.FXML;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public class Tuile extends StackPane {
    Echiquier echiquier;
    Position position;

    @FXML
    PieceImage image;

    public Tuile(boolean estCaseBlanche) {
        // TODO: Ajouter le code manquant
        // Créer un réctagle et
        // ajouter le comme enfant de l'objet courrant
        ajouterEvenementsTuile();
    }

    public Tuile(int ligne, int colonne, Echiquier echiquier) {
        // TODO: Compléter le code manquant
        // appeler le constructeur à un paramètre
        // initialiser la attributs d'instance
    }

    public Rectangle creerCaree(boolean estCaseBlanche) {
        // Todo: Ajouter le code approprié
        // créer le rectangle
        // ajuster les dimensions de la tuile
        // remplir la tuile avec la couleur de fond appropriée
        // retourner le bon objet
        return null;
    }

    public void ajouterEvenementsTuile() {
        this.setOnDragOver(event -> {
            ajouterEvenementsTuileFinDrag(event);
        });

        // TODO: ajouter la gestion des evènements manquants
        // en lien avec le drag-and-drop
    }

    public Tuile getTuileParPosition(Position destPos) {
        GridPane parent = (GridPane) (this.getParent());

        return (Tuile) parent.getChildren().get(destPos.convertirEnIndex());
    }

    public void ajouterEvenementsTuileFinDrag(DragEvent event) {
        if (event.getGestureSource() != this && event.getDragboard().hasImage()) {
            if (this.getChildren().size() == 2) {
                image = (PieceImage) this.getChildren().get(1);
            }

            // TODO: ajouter le code approprié si nécessaire
            event.acceptTransferModes(TransferMode.MOVE);
        }
        event.consume();

    }

    // TODO : Complétez le code si vous allez utiliser cet evenement sinon remplacer le par le bon
    public void ajouterEvenementsTuileDragDrop() {
        this.setOnDragDropped(event -> {
            Dragboard db = event.getDragboard();
            if (db.hasImage()) {
                // Logique pour vérifier le mouvement valide
                // Si valide, déplacez la pièce ici
                event.setDropCompleted(true);
            } else {
                event.setDropCompleted(false);
            }
            event.consume();
        });
    }

    @Override
    public String toString() {
        return "Tuile{" +
                ", children= " + getChildren() +
                "} " + super.toString();

    }
}

