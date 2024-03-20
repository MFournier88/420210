package Ecole;

import java.util.Date;

public class Professeur extends Personne {
    private long codeEmploye;

    public Professeur(String nom, String prenom, Date dateNaissance, Adresse adresse, long codeEmploye){
        super(nom, prenom, dateNaissance, adresse);
        this.codeEmploye = codeEmploye;
    }

    public void afficherActivite(){
        super.afficherActivite();
        System.out.println("Je viens pour enseigner!");
    }

    @Override
    public String toString() {
        return super.toString() + "\n| Code d'employé : " + codeEmploye
                + "\n----------------------------------------------------------\n";
    }
}
