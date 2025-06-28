package solution_exo.examenFinal.formatif1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // -------- Compte ÉPARGNE --------
        System.out.println("=== TEST COMPTE ÉPARGNE ===");
        CompteEpargne compteEpargne = new CompteEpargne("CE001", 0.03f);

        compteEpargne.deposer(1000, LocalDateTime.of(2025, 1, 15, 10, 0));  // 1
        compteEpargne.deposer(500, LocalDateTime.of(2025, 2, 10, 9, 0));    // 2
        compteEpargne.deposer(300, LocalDateTime.of(2025, 3, 5, 16, 30));   // 3 + frais
        compteEpargne.retirer(200, LocalDateTime.of(2025, 4, 1, 11, 0));    // 4 + frais
        compteEpargne.retirer(100, LocalDateTime.of(2025, 5, 20, 15, 0));   // 5 + frais
        compteEpargne.retirer(50, LocalDateTime.of(2025, 6, 15, 17, 45));   // 6 + frais
        compteEpargne.retirer(5000, LocalDateTime.of(2025, 7, 1, 12, 0));   // Échec attendu
        compteEpargne.deposer(5000, LocalDateTime.of(2025, 12, 1, 10, 0));    // 7 + frais

        System.out.println("\n--- Historique Compte Épargne ---");
        compteEpargne.afficheHistoriqueDesTransactions();

        System.out.println("\n--- Fin d'année - Compte Épargne ---");
        compteEpargne.terminerAnnee();

        System.out.printf("\nSolde final Compte Épargne : %.2f$\n", compteEpargne.getEncaisse());

        // -------- Compte NORMAL --------
        System.out.println("\n=== TEST COMPTE NORMAL ===");
        Compte compteNormal = new Compte("CN001");

        compteNormal.deposer(800, LocalDateTime.of(2025, 1, 5, 9, 0));      // 1
        compteNormal.deposer(400, LocalDateTime.of(2025, 1, 20, 11, 0));    // 2
        compteNormal.retirer(100, LocalDateTime.of(2025, 2, 15, 14, 0));    // 3
        compteNormal.retirer(200, LocalDateTime.of(2025, 3, 10, 16, 30));   // 4
        compteNormal.retirer(150, LocalDateTime.of(2025, 4, 25, 10, 0));    // 5
        compteNormal.retirer(100, LocalDateTime.of(2025, 6, 1, 13, 0));     // 6 + frais
        compteNormal.deposer(5000, LocalDateTime.of(2025, 12, 10, 10, 0));    // 7 + frais

        System.out.println("\n--- Historique Compte Normal ---");
        compteNormal.afficheHistoriqueDesTransactions();

        System.out.println("\n--- Fin d'année - Compte Normal ---");
        compteNormal.terminerAnnee();  // Pas d’intérêts

        System.out.printf("\nSolde final Compte Normal : %.2f$\n", compteNormal.getEncaisse());
    }
}

enum TypeTransaction{
    FRAIS,
    DEPOT,
    RETRAIT,
    INTERET
}

class Transaction {
    private String idTransaction;
    private LocalDateTime dateTransaction;
    private double montant;
    private double soldeCourant;
    private TypeTransaction typeTransaction;

    public Transaction(String idTransaction, LocalDateTime dateTransaction, double montant, double soldeCourant, TypeTransaction typeTransaction) {
        this.idTransaction = idTransaction;
        this.dateTransaction = dateTransaction;
        this.montant = montant;
        this.soldeCourant = soldeCourant;
        this.typeTransaction = typeTransaction;
    }

    public String getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(String idTransaction) {
        this.idTransaction = idTransaction;
    }

    public LocalDateTime getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(LocalDateTime dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getSoldeCourant() {
        return soldeCourant;
    }

    public void setSoldeCourant(double soldeCourant) {
        this.soldeCourant = soldeCourant;
    }
    
    public TypeTransaction getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(TypeTransaction typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public String toString() {
        return String.format("%s - %12s %10.2f$ -> Solde : %10.2f$",dateTransaction.toString(), typeTransaction, this.montant, this.soldeCourant) ;
    }

}

class Compte {
    private String idCompte;
    private double encaisse;
    protected ArrayList<Transaction> transactions;
    private int compteurTransaction;
    private int nbTransactionGratuite = 5;
    public final float COUT_TRANSACTION = 5;

    public Compte(String idCompte) {
        this.idCompte = idCompte;
        this.encaisse = 0;
        this.transactions = new ArrayList<>();
        this.compteurTransaction = 0;
    }

    public int getCompteurTransaction() {
        return compteurTransaction;
    }

    public void setCompteurTransaction(int compteurTransaction) {
        this.compteurTransaction = compteurTransaction;
    }

    public int getNbTransactionGratuite() {
        return nbTransactionGratuite;
    }

    public void setNbTransactionGratuite(int nbTransactionGratuite) {
        this.nbTransactionGratuite = nbTransactionGratuite;
    }

    public String getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(String idCompte) {
        this.idCompte = idCompte;
    }


    public double getEncaisse() {
        return encaisse;
    }

    public void setEncaisse(double encaisse) {
        this.encaisse = encaisse;
    }

    public void deposer(double montant, LocalDateTime date) {
        if(montant > 0){
            encaisse += montant;
            transactions.add(new Transaction( "T" + (++compteurTransaction), date, montant, this.encaisse, TypeTransaction.DEPOT));
            if(compteurTransaction > nbTransactionGratuite){
                this.setEncaisse(this.getEncaisse() - this.COUT_TRANSACTION);
                transactions.add(new Transaction("T" + (++compteurTransaction), date, -1 * this.COUT_TRANSACTION, this.encaisse,TypeTransaction.FRAIS));
            }
        }
        else{
            System.out.println("Montant invalide");
        }

    }
    
    public void retirer(double montant, LocalDateTime date) {
        if (montant <= encaisse) {
            encaisse -= montant;
            transactions.add(new Transaction( "T" + (++compteurTransaction), date,-1 * montant, this.encaisse, TypeTransaction.RETRAIT));
            if(compteurTransaction > nbTransactionGratuite){
                this.setEncaisse(this.getEncaisse() - this.COUT_TRANSACTION);
                transactions.add(new Transaction("T" + (++compteurTransaction), date, -1 * this.COUT_TRANSACTION, this.encaisse, TypeTransaction.FRAIS));
            }
        } else {
            System.out.println("Fonds insuffisants !");
        }
    }
    
    public void afficheHistoriqueDesTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
    protected void modifGestion(double montant,TypeTransaction typeTransaction , LocalDateTime date){
        this.encaisse += montant;
        transactions.add(new Transaction(String.valueOf(++compteurTransaction), date, montant, encaisse, typeTransaction));
    }
    
    public void terminerAnnee() {
        System.out.println("Aucune opération spécifique pour ce type de compte.");
    }
}

class CompteEpargne extends Compte {
    private float tauxInteret;
    
    public CompteEpargne(String idCompte, float tauxInteret) {
        super(idCompte);
        this.tauxInteret = tauxInteret;
        this.setNbTransactionGratuite(2);
    }

    @Override
    public void terminerAnnee() {
        double interet = 0;
        for (Transaction transaction : this.transactions) {
            interet += calculInteretTransaction(transaction);
        }
        this.modifGestion(interet, TypeTransaction.INTERET, LocalDateTime.of(LocalDate.of(this.transactions.get(0).getDateTransaction().getYear(),12,31),LocalTime.of(23, 59)));
        System.out.printf("Intérêts de %.2f$ ajoutés.\n", interet);
    }
    public float calculInteretTransaction(Transaction transaction){
        LocalDateTime finAnnee = LocalDateTime.of(LocalDate.of(transaction.getDateTransaction().getYear(),12,31),LocalTime.of(23, 59));
        int nbJour = finAnnee.getDayOfYear() - transaction.getDateTransaction().getDayOfYear();

        int nbJourTotal = finAnnee.getDayOfYear();

        return (float) (transaction.getMontant() * this.tauxInteret * nbJour / nbJourTotal);
    }
}

