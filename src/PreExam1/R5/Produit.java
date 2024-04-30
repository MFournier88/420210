package PreExam1.R5;

public class Produit {
    public int numeroDeProduit;
    public String nomProduit;
    public String description;
    public double prix;
    public boolean hasPromotion;

    public Produit(int numeroDeProduit, String nomProduit, String description, double prix, boolean hasPromotion) {
        this.numeroDeProduit = numeroDeProduit;
        this.nomProduit = nomProduit;
        this.description = description;
        this.prix = prix;
        this.hasPromotion = hasPromotion;
    }
    public void affiche(){
        System.out.println(this.nomProduit + " est au prix " + this.prix + " $");
    }
    public void affichePrixPromotion(){
        System.out.println(this.nomProduit + " est au prix " + this.prix * (1-0.07) + " $");
    }
}
