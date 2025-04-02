package solution_exo.serie1;
//--------------------------------------------------------------------
// Créer et afficher les variables avec le meilleur type possible
//--------------------------------------------------------------------
        
// Variable contenant l'âge d'une personne

// Population du cégep Marie-Victorin

// Variable comptant la population au Qc

// Variable pour calculer le revenu d'un individu

// Nombre de gouttes d'eau dans une piscine.

// Une variable qui se rappelle si le prof était bon ou pas

// Note en lettre qu'un étudiant obtient au cours
    
// Les mois de l'année sous format texte 
public class Exo003 {
    public static void main(String[] args) {
        byte age = 42;
        System.out.println("L'âge est une valeur < 128, donc j'utilise un byte : " + age);

        short populationMV = 5000;
        System.out.println("La population de Marie-Victorin est plus de 127 individus et moins de 32 768, donc j'utilise un short : " + populationMV);

        float salaire = 1000000.01f;
        System.out.println("Un float suffi largement pour le revenu d'un individu : " + salaire);

        int nbGoutteEau = 960_000_000;
        System.out.println("Le nombre de goutte d'eau serait dans les alentour de 1_000_000, alors j'utilise un int, si vous voulez être certain d'avoir assez d'espace, un long pourrait être plus adéquat. :" + nbGoutteEau);

        boolean isProfBon = true;
        System.out.println("Puisque c'est une variable dichotomique, j'utilise le boolean : " + isProfBon);

        char noteLettre = 'A';
        System.out.println("J'utilise le char pour des lettres seules : " + noteLettre);

        enum mois{
            JANVIER,
            FEVRIER,
            MARS,
            AVRIL,
            MAI,
            JUIN,
            JUILLET,
            AOUT,
            SEPTEMBRE,
            OCTOBRE,
            NOVEMBRE,
            DECEMBRE
        }

        System.out.println("Nous sommes en " + mois.JANVIER);
    }
}
