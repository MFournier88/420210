package exceptions;

public class Person {
    protected String prenom;
    protected String nom;

    public Person(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return this.prenom + " " + this.nom;
    }
}
