import Ecole.Adresse;
import Ecole.Etudiant;
import Ecole.Professeur;
import Zoo.Dog;

import java.util.Date;

/**
 * Code vu en classe pour l'héritage des classes
 *
 * @Author: Sara Boumehraz
 */

public class Main {
    public static void main(String[] args) {
        Adresse adresse = new Adresse(24, "rue Marie-Vitorin", "QC");
        Etudiant etudiant = new Etudiant("Ali",
                "Abd El Malik",
                        new Date(104,3,20),
                        new Adresse(),
                 1234567);
        Professeur professeur = new Professeur("Boumehraz",
                "Sara",
                        new Date(71,11,11),
                        adresse,
             111111);
        System.out.println(etudiant);
        System.out.println(professeur);
        etudiant.afficherActivite();
        professeur.afficherActivite();

        Dog dog = new Dog("Wolf");
        dog.animalSound();
    }
}