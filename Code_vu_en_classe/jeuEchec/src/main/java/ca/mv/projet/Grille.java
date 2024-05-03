package ca.mv.projet;

import ca.mv.projet.composants.PieceImage;
import ca.mv.projet.models.Echiquier;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Grille {

    private final Echiquier echiquier;
    @FXML
    GridPane grid;
    // TODO: ajouter les attributs manquants

    public Grille(Echiquier echiquier) {
        creerGrille();
        this.echiquier = echiquier;
    }

    private void creerGrille() {
        // TODO: ajouter le code approprié
    }

    public ImageView creerPieceImage(int colonne, int ligne, StackPane stackPane) {
        PieceImage imgPieces = new PieceImage((getClass().getResource("images/pieces/" +
                echiquier.getCaseParPosition(ligne, colonne).getPiece()
                        .getImage()).toExternalForm()), stackPane.widthProperty().subtract(8));
        stackPane.getChildren().add(imgPieces);

        return imgPieces;
    }

    // TODO: ajouter les méthodes manquantes
}
