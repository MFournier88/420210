package solution_exo.serie2;

// Classe parent Vendeur
class Vendeur {
    protected String nom;
    protected double salaireDeBase;
    protected double tauxCommission;
    protected double ventes;

    // Constructeur de la classe Vendeur
    public Vendeur(String nom, double salaireDeBase, double tauxCommission, double ventes) {
        this.nom = nom;
        this.salaireDeBase = salaireDeBase;
        this.tauxCommission = tauxCommission;
        this.ventes = ventes;
    }

   

    // Méthode d'affichage des détails d'un vendeur
    @Override
    public String toString() {
        return String.format("Nom : %s\nSalaire de base : %.2f €\nTotal des commissions : %.2f\nSalaire total : %.2f\n",
         this.nom, this.salaireDeBase, (this.ventes * tauxCommission),(this.ventes * this.tauxCommission + this.salaireDeBase));
    }
}

// Classe enfant VendeurMagasin qui hérite de Vendeur
class VendeurMagasin extends Vendeur {
    private int nombreVentes;

    // Constructeur de la classe VendeurMagasin
    public VendeurMagasin(String nom, double salaireDeBase, double tauxCommission, double ventes, int nombreVentes) {
        super(nom, salaireDeBase, tauxCommission, ventes);
        this.nombreVentes = nombreVentes;
    }

}

// Classe enfant VendeurEnLigne qui hérite de Vendeur
class VendeurEnLigne extends Vendeur {
    private int nombreClics;

    // Constructeur de la classe VendeurEnLigne
    public VendeurEnLigne(String nom, double salaireDeBase, double tauxCommission, double ventes, int nombreClics) {
        super(nom, salaireDeBase, tauxCommission, ventes);
        this.nombreClics = nombreClics;
    }

    // Méthode d'affichage des détails d'un vendeur
    @Override
    public String toString() {
        return String.format("Nom : %s\nSalaire de base : %.2f €\nTotal des commissions : %.2f\nSalaire total : %.2f\n",
         this.nom, this.salaireDeBase, (this.ventes * tauxCommission) + this.nombreClics *0.5,(this.ventes * this.tauxCommission + this.nombreClics *0.5 + this.salaireDeBase));
    }
}

// Classe principale
public class Exo033 {
    public static void main(String[] args) {
        // Création d'un vendeur en magasin
        VendeurMagasin vendeurMagasin = new VendeurMagasin("Jean Dupont", 1500, 0.05, 10000 ,200);
       
        System.out.println(vendeurMagasin);

        // Création d'un vendeur en ligne
        VendeurEnLigne vendeurEnLigne = new VendeurEnLigne("Marie Dubois", 1200, 0.008, 50000, 1500);
    
       
        System.out.println(vendeurEnLigne);
    }
}
