package solution_exo.serie2;
class CompteBancaire {
    //Attributs
    private String titulaire;  
    private double solde;   

    //Getter & Setter
    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    // Constructeur
    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    // Méthodes
    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
            System.out.println("Montant déposé : " + montant + "€");
        } else {
            System.out.println("Le montant à déposer doit être positif.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= this.solde) {
            this.solde -= montant;
            System.out.println("Montant retiré : " + montant + "€");
        } else if (montant > this.solde) {
            System.out.println("Solde insuffisant. Retrait impossible.");
        } else {
            System.out.println("Le montant à retirer doit être positif.");
        }
    }

    public void afficherSolde() {
        System.out.println("Solde actuel : " + this.solde + "€");
    }

    public void afficherInfo() {
        System.out.println("Titulaire : " + this.titulaire + ", Solde : " + this.solde + "€");
    }
    //
}

public class Exo003 {
    public static void main(String[] args) {
        // Création de plusieurs instances de la classe CompteBancaire
        CompteBancaire compte1 = new CompteBancaire("Alice", 1000);
        CompteBancaire compte2 = new CompteBancaire("Bob", 500);

        // Effectuer des dépôts
        compte1.deposer(200);  // Déposer 200€ sur le compte d'Alice
        compte2.deposer(50);   // Déposer 50€ sur le compte de Bob

        // Effectuer des retraits
        compte1.retirer(300);  // Retirer 300€ du compte d'Alice
        compte2.retirer(600);  // Essayer de retirer 600€, mais solde insuffisant

        // Afficher les résultats
        compte1.afficherInfo();  // Afficher les informations du compte d'Alice
        compte2.afficherInfo();  // Afficher les informations du compte de Bob
    }
}

