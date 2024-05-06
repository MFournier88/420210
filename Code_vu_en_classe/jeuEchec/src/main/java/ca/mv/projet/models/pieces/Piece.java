package ca.mv.projet.models.pieces;

import ca.mv.projet.models.Echiquier;
import ca.mv.projet.models.cases.Position;

public abstract class Piece {
    protected final boolean estBlanc;
    protected boolean estCapturee = false;

    protected String image;

    public Piece(boolean estBlanc) {
        this.estCapturee = false;
        this.estBlanc = estBlanc;
        this.image = this.getClass().getSimpleName() + "_" + (estBlanc ? "blanc" : "noir") + ".gif";
    }

    public abstract boolean peutBouger(Position position, Position posDestination, Echiquier echiquier);

    public boolean isEstBlanc() {
        return estBlanc;
    }

    public boolean isEstCapturee() {
        return estCapturee;
    }

    public String getImage() {
        return image;
    }


    protected static boolean bougerSurDiagonal(Position posCourante, Position posDestination, Echiquier echiquier) {
        int decalSurX = Integer.compare(posDestination.getX(), posCourante.getX());
        int decalSurY = Integer.compare(posDestination.getY(), posCourante.getY());
        int posProchaineX = posCourante.getX() + decalSurX;
        int posProchaineY = posCourante.getY() + decalSurY;

        while (posProchaineX != posDestination.getX() && posProchaineY != posDestination.getY()){
            if(echiquier.getCaseParPosition(posProchaineX, posProchaineY).getPiece() != null) {
                return false;
            }
            posProchaineX += decalSurX;
            posProchaineY += decalSurY;
        }

        return true;
    }

    public boolean estMemeCouleur(Piece piece) {
        return estBlanc == piece.estBlanc;
    }

    public boolean peutCapturer(Piece pieceDestination) {
        if(pieceDestination != null) {
            return !estMemeCouleur(pieceDestination);
        }
        return true;
    }

    public boolean bougerSurOrthogonal(Position posCourante, Position posDestination, Echiquier echiquier) {
        int decalSurX = posDestination.getX() - posCourante.getX();
        int decalSurY = posDestination.getY() - posCourante.getY();
        int direction = echiquier.getCaseParPosition(posCourante).getPiece().estBlanc ? -1 : 1;
        if(decalSurX == 0) { // Pour arriver à la destination on bouge la piece sur la ligne
            direction = decalSurY > 0 ? 1 : -1;
            int posProchaineY = posCourante.getY();
            posProchaineY += direction;
            while (posProchaineY != posDestination.getY()){
                if(echiquier.getCaseParPosition(posDestination.getX(), posProchaineY).getPiece() != null) {
                    return false;
                }
                posProchaineY += direction;
            }
        } else { // Pour arriver à la destination on bouge la piece sur la colonne
            int posProchaineX = posCourante.getX();
            posProchaineX += direction;
            while (posProchaineX != posDestination.getX()){
                if(echiquier.getCaseParPosition(posProchaineX, posDestination.getY()).getPiece() != null) {
                    return false;
                }
                posProchaineX += direction;
            }
        }
        return true;
    }

    public boolean estSurDiagonal(Position posCourante, Position posDestination){
        int diffSurX = posDestination.getX() - posCourante.getX();
        int diffSurY = posDestination.getY() - posCourante.getY();

        return Math.abs(diffSurX) == Math.abs(diffSurY);
    }

    @Override
    public String toString() {
        return "Piece{" +
                "estBlanc=" + estBlanc +
                ", estCapturee=" + estCapturee +
                ", image='" + image + '\'' +
                '}';
    }
}

