package ca.mv.projet;

import ca.mv.projet.composants.PieceImage;
import ca.mv.projet.composants.Tuile;
import ca.mv.projet.models.Echiquier;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

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

    public void dessinerTuiles() {
        // TODO: remplir la grille (grid) avec des tuiles (Tuile)
        //  en bouclant sur les lignes et les colonnes
        // voici le code de la céation d'une tuile
                // Tuile tuile = new Tuile(i, j, echiquier);
        // TODO : ajouter la tuile à la grille (grid)
        // attention : quand on ajoute un enfant dans un grid on commence par la colonne puis la ligne
        // les lignes et les colonnes dans une grille lors de l'ajout d'enfant commencent par 1
        // TODO : avant de créer la PieceImage et l'ajouter à la tuile il faut vérifier que
        //  quel type de case on a. On rajoute l'image uniquement dans une case occupée
        // on peut aussi vérifer si l'image n'est pas null en utilisant le getter dans la classe Case
        // Pour chercher la case utilisez le getter par position dans l'echiquier
        // Pour créer la PieceImage vous pouvez utiliser la methode creerPieceImage fournie plus bas
    }

    public Tuile creerPieceImage(int colonne, int ligne, Tuile tuile) {
        try{
            String imgUrl = getClass().getResource(Utilities.PIECES_IMG_URL +
                    echiquier.getCaseParPosition(ligne, colonne).getPiece()
                            .getImage()).toExternalForm();
            PieceImage imgPieces = new PieceImage(imgUrl, tuile.widthProperty().subtract(Utilities.IMAGE_MARGIN));
            tuile.getChildren().add(imgPieces);
        } catch (NullPointerException e){
            System.err.println(e.getMessage());
        }

        return tuile;
    }

    // TODO: ajouter les méthodes manquantes
}
