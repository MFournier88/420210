package examen2;

public class Evaluation {
    protected float note;
    protected String type = "Individuelle";
    protected String nom;

    public Evaluation(String nom,float note) {
        this.nom = nom;
        this.note = note;
    }
    public float getNote(){
        return this.note;
    }
    public String getNom(){
        return nom;
    }
}
