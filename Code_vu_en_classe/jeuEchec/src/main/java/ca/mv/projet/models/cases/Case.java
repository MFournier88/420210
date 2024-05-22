package ca.mv.projet.models.cases;

import ca.mv.projet.models.pieces.Piece;

public abstract class Case {
    private final Position position;
    private Piece piece;
    private boolean estCaseBlanche;

    public Case(Position position) {
        this.position = position;
        setEstCaseBlanche();
    }

    public Case(Position position, Piece piece) {
        this(position);
        this.piece = piece;
    }

    private void setEstCaseBlanche() {
        this.estCaseBlanche = (position.getX() + position.getY()) % 2 == 0;
    }

    public boolean isEstCaseBlanche(){
        return estCaseBlanche;
    }

    public Position getPosition() {
        return position;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Case{" +
                "position=" + position +
                ", piece=" + piece +
                ", estCaseBlanche=" + estCaseBlanche +
                '}';
    }
}
