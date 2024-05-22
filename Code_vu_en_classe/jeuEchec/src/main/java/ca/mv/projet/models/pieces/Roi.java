package ca.mv.projet.models.pieces;

import ca.mv.projet.models.Echiquier;
import ca.mv.projet.models.cases.Position;

public class Roi extends Piece {
    public Roi(boolean estBlanche) {
        super(estBlanche);
    }

    @Override
    public boolean peutBouger(Position posCourante, Position posDestination, Echiquier echiquier) {
        // TODO: remplacer par le code approprié
        // Implémenter la logique spécifique du déplacement du Roi
        System.out.println("peutBouger roi");
        return true;
    }
}

