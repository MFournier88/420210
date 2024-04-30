package ca.mv.projet.models.pieces;

import ca.mv.projet.models.Echiquier;
import ca.mv.projet.models.cases.Position;

public class Pion extends Piece {
    private final Position positionInitiale;

    public Pion(boolean estBlanche, Position positionInitiale) {
        super(estBlanche);
        this.positionInitiale = positionInitiale;
    }

    @Override
    public boolean peutBouger(Position posCourante, Position posDestination, Echiquier echiquier) {
        // TODO: remplacer par le code approprié
        System.out.println("peutBouger pion");
        return true;
    }

    public Piece promouvoir(String type) {
        // TODO: remplacer par le code approprié
        // Retourne une nouvelle pièce (Reine, par exemple) en cas de promotion
        return new Reine(this.estBlanc);
    }
}
