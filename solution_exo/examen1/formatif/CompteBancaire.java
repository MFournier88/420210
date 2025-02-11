public class CompteBancaire{
    String titulaire;
    double solde;
    public CompteBancaire(String titulaire, double solde){
        this.titulaire = titulaire;
        this.solde = solde;
    }
    public void deposer(double montant){
        if(montant > 0){
            this.solde += montant;
            System.out.printf("%.02f$ déposé. Nouveau solde : %.02f$\n",montant,this.solde);
        }
        else{
            System.out.println("Montant invalide");
        }
    }
    public void retirer(double montant){
        if(montant > 0){
            if(montant <= this.solde){
                this.solde -= montant;
                System.out.printf("%.02f$ retiré. Nouveau solde : %.02f$\n",montant,this.solde);

            }
            else{
                System.out.println("Solde insuffisant");
            }
        }
        else{
            System.out.println("Montant invalide");
        }
    }
    public void afficherInfo(){
        System.out.printf("Titulaire : %s | Solde : %.02f$\n", this.titulaire, this.solde);
    }
    public static void main(String[] args) {
        CompteBancaire Alice = new CompteBancaire("Alice Dupont", 500.75);
        Alice.afficherInfo();
        Alice.deposer(150);
        Alice.retirer(200);
        Alice.retirer(500);

    }
}