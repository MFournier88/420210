package ca.mv.projet.composants;

import ca.mv.projet.Jeu;
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
    static Position posSource;

    @FXML
    static PieceImage image;

    public Tuile(boolean estCaseBlanche) {
        // TODO: Ajouter le code manquant
        // Créer un réctagle et ajouter le comme enfant de l'objet courrant (this)
        ajouterEvenementsTuile();
    }

    public Tuile(int ligne, int colonne, Jeu jeu) {
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
        // Gestion évènement au drag
        this.setOnMouseDragged(mouseEvent -> ajouterEvenementsTuileSourisDragged());

        this.setOnDragOver(event -> ajouterEvenementsTuileFinDrag(event));

        // Gestion évènement au drop
        this.setOnDragDropped(event -> ajouterEvenementsTuileDragDrop(event));
    }

    private void ajouterEvenementsTuileSourisDragged() {
        if(this.getChildren().size() == 2){
            image = (PieceImage) this.getChildren().get(1);
        }
        posSource = this.position;
    }

    public Tuile getTuileParPosition(Position destPos) {
        GridPane parent = (GridPane) (this.getParent());

        return (Tuile) parent.getChildren().get(destPos.convertirEnIndex());
    }

    public void ajouterEvenementsTuileFinDrag(DragEvent event) {
        if (event.getGestureSource() != this && event.getDragboard().hasImage()) {
            // TODO: ajouter le code approprié si nécessaire
            event.acceptTransferModes(TransferMode.MOVE);
        }
        event.consume();
    }

    // TODO : Complétez le code manquant
    public void ajouterEvenementsTuileDragDrop(DragEvent event) {
        Dragboard db = event.getDragboard();
        if (db.hasImage()) {
            // TODO: modifier le code et ajouter la gestion des cases et
            //  le cas de case destination contenant une piece (manger la piece)
            // Logique pour vérifier le mouvement valide
            // Si valide, déplacez la pièce ici


            // TODO : Rajoutez la condition : si la tuile courante (this) a 2 enfants donc on enleve le 2eme (pos 1)
            // Remarque : la methode remove par position retourne l'objet enlevé
                    PieceImage imageMangee = (PieceImage) this.getChildren().remove(1);

            this.getChildren().add(image);
            // TODO : appeler setCaseParPosition qui remplace le contenu de la case destination par celui de la case source
            // et met la case source a une case vide
            event.setDropCompleted(true);
        } else {
            event.setDropCompleted(false);
        }
        event.consume();
    }

    @Override
    public String toString() {
        return "Tuile{" +
                ", children= " + getChildren() +
                "} " + super.toString();

    }
}

