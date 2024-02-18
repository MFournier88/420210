package poo;

public class Compte {
    int numeroCompte;
    String nomClient;
    String prenomClient;
    double soldeCompte;

    public Compte(int numeroCompte, String nomClient, String prenomClient, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.soldeCompte = soldeCompte;
    }
}
