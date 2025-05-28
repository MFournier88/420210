package solution_exo.serie1;
// Niveau : 1 ⭐

// **Exercice** :  

// Ajoutez à la classe calculatrice : une méthode pour calculer un rabais sur un prix qui seront tous les 2 donnés en paramètre. 

// **Exemple de sortie attendue** :
// ```
// Le rabais de 20% sur 100$ est de 20$
// ```
public class Exo021 {
    // Déclaration d'une constante pour le taux de taxe
    public static final double TAUX_DE_TAXE = 0.70;

    // Méthode principale qui sera exécutée lors du lancement du programme
    public static void main(String[] args) {
        // Déclaration de variables locales
        double prixInitial = 100.0; // Prix initial d'un produit
        double prixFinal = calculerPrixAvecTaxe(prixInitial); // Calcul du prix après taxe

        // Affichage du résultat
        System.out.println("Prix initial : " + prixInitial + "€");
        System.out.println("Prix final après application de la taxe : " + prixFinal + "€");

        System.out.printf("Le rabais est de %d%% sur %.2f$ est de %.2f$\n",20,prixInitial, calculerRabaisPrix(0.2, prixInitial));

    }

    // Méthode pour calculer le prix final avec taxe
    // Cette méthode prend le prix initial comme paramètre et retourne le prix après ajout de la taxe
    public static double calculerPrixAvecTaxe(double prix) {
        // Calcul du prix final en ajoutant la taxe
        double taxe = prix * TAUX_DE_TAXE; // Calcul de la taxe
        double prixAvecTaxe = prix + taxe; // Calcul du prix total avec taxe

        return prixAvecTaxe; // Retourne le prix final
    }
    public static double calculerRabaisPrix(double rabais, double prix){
        return rabais * prix;
    }
}
