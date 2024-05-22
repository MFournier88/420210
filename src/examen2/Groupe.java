package examen2;

public class Groupe extends Evaluation{

    protected float notePairs = -1;

    public Groupe(String nom, float note, float notePairs) {
        super(nom,note);
        this.notePairs = notePairs;
        this.type = "Groupe";
    }

    @Override
    public float getNote() {
        return super.getNote() * 0.9F + this.notePairs * 0.1F;
    }


}
