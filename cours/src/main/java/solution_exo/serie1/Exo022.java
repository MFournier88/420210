package solution_exo.serie1;
// Niveau : 5 ⭐ si vous respectez le format de la réponse
// Niveau : 3 ⭐ sinon

// Ajoutez à la classe calculatrice : Ajouter un méthode pour afficher un reçu en prenant en paramètre le nom de l'item, le prix, le rabais, le taux de taxation.

// **Exemple de sortie attendue** :
// ```
// xbox                   500.00$
// rabais(20%)           -100.00$
// prix avant taxes       400.00$
// taxe(16%)               64.00$   
// ------------------------------
// Total                  464.00$


public class Exo022 {
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
        recu("xbox", 500, 0.2, 0.16);
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
    public static void recu(String nom, double prix, double rabais, double tauxTaxe){

        afficheLigneRecu(nom, false, prix);
        afficheLigneRecu(String.format("rabais(%.0f%%)",rabais*100), true, prix * rabais);
        afficheLigneRecu("Prix avant taxes", false, prix * (1 - rabais));
        afficheLigneRecu(String.format("taxes(%.0f%%)",tauxTaxe * 100), false, prix * (1 - rabais) * tauxTaxe);
        System.out.println("-".repeat(30));
        afficheLigneRecu("Total", false, prix * (1 - rabais) * (1 + tauxTaxe));
        System.out.println();
    }
    public static void afficheLigneRecu(String nom, boolean isNeg, double prix){
        String prixFormat = String.format("%.2f$",prix);
        System.out.println(nom + " ".repeat(30 - nom.length() - prixFormat.length()) + prixFormat);

    }
}
