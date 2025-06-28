package solution_exo.examenFinal.video.src.main.java.formatif2.question1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {



        Cuisine cuisine = new Cuisine();
    
        cuisine.ajouterCommande("Préparer la salade", "Laver et couper les légumes.", (byte) 3, null);
        cuisine.ajouterCommande("Cuire le steak", "Cuisson du steak à point.", (byte) 4, null);
        cuisine.ajouterCommande("Préparer la sauce", "Mélanger les ingrédients.", (byte) 2, null);
        cuisine.ajouterCommande("Toaster le pain", "Toaster le pain pour le burger.", (byte) 1, null);
    
        // Commande avec prérequis
        cuisine.ajouterCommande("Assembler le burger", "Assembler tous les éléments.", (byte) 5, 1); // steak requis
    
        // Commandes avec délai
        cuisine.ajouterCommande("Servir la soupe", "Doit être servie chaude.", (byte) 3, null, LocalDateTime.now().plusSeconds(10));
        cuisine.ajouterCommande("Servir les frites", "Chaudes et croustillantes.", (byte) 2, null, LocalDateTime.now().plusSeconds(5));
        
        // Commande expirée
        cuisine.ajouterCommande("Livrer la commande #123", "Client pressé.", (byte) 1, null, LocalDateTime.now().minusSeconds(5));
    
        cuisine.mettreAJourEtatPriorite();
    
        System.out.println(cuisine);
    
    
        System.out.println("################################################################");
    
    
        cuisine.marquerServie(0);
        cuisine.marquerServie(4);
    
        System.out.println(cuisine);
    
    
        System.out.println("################################################################");
    
        try {
            Thread.sleep(10000);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        cuisine.marquerServie(5);
        cuisine.marquerServie(3);
        System.out.println(cuisine);
    
    }
}
enum EtatCommande{
    Expiree,
    EN_COURS,
    SERVIE    
}

class Commande{
    private int id;
    private String nom;
    private String description;
    private byte priorite;
    private Commande preRequis;
    private EtatCommande etat;
    
    public Commande(int id, String nom, String description, byte priorite, Commande preRequis, EtatCommande etat) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.priorite = priorite;
        this.preRequis = preRequis;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getPriorite() {
        return priorite;
    }

    public void setPriorite(byte priorite) {
        this.priorite = priorite;
    }

    public Commande getPreRequis() {
        return preRequis;
    }

    public void setPreRequis(Commande preRequis) {
        this.preRequis = preRequis;
    }

    public EtatCommande getEtat() {
        return etat;
    }

    public void setEtat(EtatCommande etat) {
        this.etat = etat;
    }

    public void mettreAJourEtatPriorite(){
        //Ne fait rien
    }

    public void marquerServie(){
        if(this.getPreRequis() != null && !this.preRequis.getEtat().equals(EtatCommande.SERVIE)){
            System.out.printf("Impossible de servir #%d : dépendance non terminée → %s\n", this.id, this.preRequis.getNom());
        }
        else{
            this.setEtat(EtatCommande.SERVIE);
        }
    }

    @Override
    public String toString() {
        return String.format("""
                #%-5d %-50s Priorité: %d
                \t\t  %s
                """, this.id, this.nom, this.priorite, this.description);
         
    }
    
}

class CommandeAvecLimite extends Commande{
    LocalDateTime limite;

    public CommandeAvecLimite(int id, String nom, String description, byte priorite, Commande preRequis,
            EtatCommande etat, LocalDateTime limite) {
        super(id, nom, description, priorite, preRequis, etat);
        this.limite = limite;
    }

    public LocalDateTime getLimite() {
        return limite;
    }

    public void setLimite(LocalDateTime limite) {
        this.limite = limite;
    }

    @Override
    public void mettreAJourEtatPriorite(){
        if(LocalDateTime.now().isAfter(limite)){
            this.setEtat(EtatCommande.Expiree);
        }
        else{
            double duree = Duration.between(LocalDateTime.now(), limite).toNanos() / 60000000000.0;
            
            if(Math.ceil(duree) < this.getPriorite()){
                this.setPriorite((byte) Math.ceil(duree));
            }

        }
    }

    @Override
    public void marquerServie(){
        if(LocalDateTime.now().isAfter(limite)){
            this.setEtat(EtatCommande.Expiree);
            System.out.printf("Impossible, car la commande #%d est expirée\n", this.getId());
        }
        else{
            super.marquerServie();
        }
    }

    @Override
    public String toString() {
        return String.format("""
                #%-5d %-50s Priorité: %d
                \t\t  %s
                \t\t  À servir avant:%s
                """, this.getId(), this.getNom(), this.getPriorite(), this.getDescription(), this.getLimite().toString());
         
    }

}

class Cuisine{
    private ArrayList<Commande> commandes = new ArrayList<>();
    private int prochainId = 0;
    private boolean doitTrier = false;

    public void ajouterCommande(String nom, String desc, byte priorite, Integer idPreRequis){
        
        commandes.add(new Commande(prochainId++, nom, desc, priorite, rechercherCommandeParId(idPreRequis), EtatCommande.EN_COURS));
        doitTrier = true;
    }

    public void ajouterCommande(String nom, String desc, byte priorite, Integer idPreRequis, LocalDateTime limite){
        commandes.add(new CommandeAvecLimite(prochainId++, nom, desc, priorite, rechercherCommandeParId(idPreRequis), EtatCommande.EN_COURS, limite));
        doitTrier = true;

    }

    public Commande rechercherCommandeParId(Integer id){
        if(id == null){
            return null; 
        }

        for (Commande commande : commandes) {
            if(commande.getId() == id){
                return commande;
            }
        }
        return null;
    }

    public void mettreAJourEtatPriorite(){
        for (Commande commande : commandes) {
            commande.mettreAJourEtatPriorite();
        }
        doitTrier = true;
    }

    public void marquerServie(int id){
        rechercherCommandeParId(id).marquerServie();
        doitTrier = true;
    }

    private int comparer(Commande a, Commande b){
        if(a.getEtat().ordinal() != b.getEtat().ordinal()){
            return a.getEtat().ordinal() - b.getEtat().ordinal();
        }
        if(a.getPriorite() != b.getPriorite()){
            return a.getPriorite() - b.getPriorite();
        }

        return a.getNom().compareTo(b.getNom());
    }
    @Override
    public String toString() {
        if(doitTrier){
            Collections.sort(commandes, (a,b) -> comparer(a,b));
        }

        String msg = "";
        EtatCommande cur = null;
        for (Commande commande : commandes) {
           if(commande.getEtat() != cur){
                cur = commande.getEtat();
                System.out.println("-----------------------------  " + cur + " -----------------------------");
           }
            System.out.println(commande);
        }

        return msg;
    }
}