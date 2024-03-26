package RevisionExam1.NBA;

public class Joueur {
    private float taille;
    private byte age;
    private byte numeroChandail;
    String nom;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Joueur(float taille, byte age, byte numeroChandail, String nom) {
        this.taille = taille;
        this.age = age;
        this.numeroChandail = numeroChandail;
        this.nom = nom;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public short getNumeroChandail() {
        return numeroChandail;
    }

    public void setNumeroChandail(byte numeroChandail) {
        this.numeroChandail = numeroChandail;
    }

    @Override
    public String toString() {
        return this.nom + " : " + this.numeroChandail;
    }
}

