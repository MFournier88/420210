package question3;

public class Main {
    public static void main(String[] args) {
        // Création d'un vendeur en magasin
        Vendeur vendeur = new Vendeur("Jean Dupont", 1500, 0.05, 10000);
    
        System.out.println(vendeur);
    
        // Création d'un vendeur en ligne
        VendeurEnLigne vendeurEnLigne = new VendeurEnLigne("Marie Dubois", 1200, 0.008, 50000, 1500);
    
    
        System.out.println(vendeurEnLigne);
    } 
}

//2
class Vendeur{
    //4
    protected String nom;
    protected double salaireDeBase;
    protected double tauxCommission;
    protected double montantTotalDesVentes;

    //3
    public Vendeur(String nom, double salaireDeBase, double tauxCommission, double montantTotalDesVentes){
        this.nom = nom;
        this.salaireDeBase = salaireDeBase;
        this.tauxCommission = tauxCommission;
        this.montantTotalDesVentes = montantTotalDesVentes;
    }

    //3
    @Override
    public String toString(){
        String msg = "Nom : " + this.nom + "\n" + 
                     "Salaire de base : " + String.format("%.2f",this.salaireDeBase) + " €\n" +
                     "Total des commissions: " + String.format("%.2f",(this.montantTotalDesVentes * this.tauxCommission)) + " €\n" +
                     "Salaire total: " + String.format("%.2f",(this.montantTotalDesVentes * this.tauxCommission + this.salaireDeBase)) + " €\n";
        return msg;
    }
}

//3
class VendeurEnLigne extends Vendeur{
    //1
    private int nbClics;

    //4
    public VendeurEnLigne(String nom, double salaireDeBase, double tauxCommission, double montantTotalDesVentes, int nbClics){
        super(nom, salaireDeBase, tauxCommission, montantTotalDesVentes);
        this.nbClics = nbClics;
    
    }

    //5
    @Override
    public String toString(){
        String msg = "Nom : " + this.nom + "\n" + 
                     "Salaire de base : " + String.format("%.2f",this.salaireDeBase) + " €\n" +
                     "Total des commissions: " + String.format("%.2f",(this.montantTotalDesVentes * this.tauxCommission + this.nbClics * 0.5)) + " €\n" +
                     "Salaire total: " + String.format("%.2f",(this.montantTotalDesVentes * this.tauxCommission + this.nbClics * 0.5 + this.salaireDeBase)) + " €\n";
        return msg;
    }
}