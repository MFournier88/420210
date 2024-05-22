package ca.mv.projet.composants;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;


public class PieceImage extends ImageView {

    public PieceImage(String imgUrl, DoubleBinding imageMargin) {
        creerImageView(imgUrl, imageMargin);

        setOnDragDetected(event -> {
            // Todo: remplacer par le code approprié
            Dragboard db = startDragAndDrop(TransferMode.MOVE);
            ClipboardContent content = new ClipboardContent();
            content.putImage(getImage());
            db.setContent(content);
            event.consume();
        });
    }

    public void creerImageView(String imgUrl, DoubleExpression imageMargin) {
        this.setImage(new Image(imgUrl));
        // redimentionner l'image
        this.fitWidthProperty().bind(imageMargin);
        this.fitHeightProperty().bind(imageMargin);
    }

    @Override
    public String toString() {
        return "PieceImage{" +
                "image=" + getImage().getUrl().toString() +
                super.toString() +
                "}";
    }
}
