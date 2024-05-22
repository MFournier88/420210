package ca.mv.projet.models.pieces;

import ca.mv.projet.models.Echiquier;
import ca.mv.projet.models.cases.Position;

public class Pion extends Piece {
    private final Position positionInitiale;

    public Pion(boolean estBlanche, Position positionInitiale) {
        super(estBlanche);
        this.positionInitiale = positionInitiale;
    }

    public boolean peutBouger(Position posCourante, Position posDestination, Echiquier echiquier) {
        int direction = estBlanc ? -1 : 1; // La couleur détermine la direction du mouvement
        int pasX = (posDestination.getX() - posCourante.getX()) * direction; // le pion bouge
        int pasY = (posDestination.getY() - posCourante.getY());
        Piece pieceDest = echiquier.getCaseParPosition(posDestination).getPiece();
        Piece pieceProchain = echiquier.getCaseParPosition(posCourante.getX() + direction, posCourante.getY())
                .getPiece();
        // Logique simplifiée : Pion se déplace d'une case vers l'avant, capture en diagonale
        return estDeplacLegal(pasX,
                pasY,
                posCourante.equals(positionInitiale),
                pieceDest == null,
                pieceProchain == null,
                this.estBlanc != (pieceDest != null && pieceDest.estBlanc));
    }

    public static boolean estDeplacLegal(int pasX, int pasY, boolean estPremierMouve,
                                         boolean destEstCaseVides, boolean estProchainePiecevide,
                                         boolean estPieceAdversaire) {
        boolean estDeplacLegalSurY = false;
        boolean estDeplacLegalSurX = false;

        if(destEstCaseVides) {
            estDeplacLegalSurY = pasY == 0;
            // Premier mouvement
            if (estPremierMouve) {
                estDeplacLegalSurX = pasX == 1 || pasX == 2;
                // le cas ou les deux cases contiennent des pieces
                if(pasX == 2) {
                    estDeplacLegalSurX = estDeplacLegalSurX
                            && estProchainePiecevide;
                }
                // Mouvement simple
            } else {
                estDeplacLegalSurX = pasX == 1;
            }
            // Capture en diagonale
        } else {
            if(estPieceAdversaire) {
                estDeplacLegalSurX = pasX == 1;
                estDeplacLegalSurY = Math.abs(pasY) == 1;
            }
        }

        return estDeplacLegalSurX && estDeplacLegalSurY;
    }

    public Piece promouvoir(String type) {
        // TODO: remplacer par le code approprié
        // Retourne une nouvelle pièce (Reine, par exemple) en cas de promotion
        return new Reine(this.estBlanc);
    }
}
