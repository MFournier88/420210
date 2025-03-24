package vendeur;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    
}
class Produit{
    private String nom;
    private double prix;
    private boolean taxable;
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public boolean isTaxable() {
        return taxable;
    }
    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }
    public Produit(String nom, double prix, boolean taxable) {
        this.nom = nom;
        this.prix = prix;
        this.taxable = taxable;
    }

    
}   
class Maison extends Produit{
    private String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Maison(String nom, double prix, boolean taxable, String adresse) {
        super(nom, prix, taxable);
        this.adresse = adresse;
    }
    
}
class Nourriture extends Produit{
    private boolean isInStock;
    private LocalDate datePeremption;
    public boolean isInStock() {
        return this.isInStock;
    }
    public void setisInStock(boolean isInStock) {
        this.isInStock = isInStock;
    }
    public LocalDate getDatePeremption() {
        return datePeremption;
    }
    public void setDatePeremption(LocalDate datePeremption) {
        this.datePeremption = datePeremption;
    }
    public Nourriture(String nom, double prix, boolean taxable, boolean isInStock, LocalDate datePeremption) {
        super(nom, prix, taxable);
        this.isInStock = isInStock;
        this.datePeremption = datePeremption;
    }
}
class Vendeur{
    private ArrayList<Maison> ventesMaisons = new ArrayList<>();
    private ArrayList<Nourriture> ventesNourritures = new ArrayList<>();
    private ArrayList<Produit> ventesProduits = new ArrayList<>();
    
    public void ajouterVente(Maison maison){
        this.ventesMaisons.add(maison);
    }
    public void ajouterVente(Nourriture nourriture){
        this.ventesNourritures.add(nourriture);
    }
    public void ajouterVente(Produit produit){
        this.ventesProduits.add(produit);
    }
    
    
    
}

enum TypeVente{
    Maison,
    Nourriture,
    Produit
}