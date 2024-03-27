package PreExam1.R5;

public class Compte {
    private int numeroDeCompte;
    private String nomClient;
    private String prenomClient;
    private double soldeCompte;

    public int getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public void setNumeroDeCompte(int numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public Compte(int numeroDeCompte, String nomClient, String prenomClient, double soldeCompte) {
        this.numeroDeCompte = numeroDeCompte;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.soldeCompte = soldeCompte;
    }
    public void afficheCompte(){
        System.out.println("NC : " + this.numeroDeCompte + " " + this.prenomClient + " " + this.nomClient + " solde : " + this.soldeCompte);
    }
}
