package Ecole;

import java.util.Date;

public class Etudiant extends Personne {

    private long numDa;
    public Etudiant(String nom, String prenom, Date dateNaissance, Adresse adresse, long numDa) {
        super(nom, prenom, dateNaissance, adresse);
        this.numDa = numDa;
    }

    public void afficherActivite(){
        super.afficherActivite();
        System.out.println("Je viens pour étudier!");
    }

    @Override
    public String toString() {
        return super.toString() + "\n| Numero de la demande d'admission: " + numDa
                + "\n----------------------------------------------------------\n";
    }
}
