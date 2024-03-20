package Ecole;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Personne {

    protected String nom;
    protected String prenom;
    protected Date dateNaissance;
    protected Adresse adresse;

    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CANADA);

    public Personne(String nom, String prenom, Date dateNaissance, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
    }

    public void afficherActivite() {
        System.out.println("Je viens chaque jour à l'école.");
    }

    @Override
    public String toString() {
        return "----------------------------------------------------------"
                + "\n| Nom:\t\t\t\t" + nom
                + "\n| Prenom :\t\t\t" + prenom
                + "\n| Date de naissance :\t" + dateFormat.format(dateNaissance)
                + "\n| Adresse :\t\t\t" + adresse;
    }
}
