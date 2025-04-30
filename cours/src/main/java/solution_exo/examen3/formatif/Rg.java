package solution_exo.examen3.formatif;

public class Rg {
    public static void main(String[] args) {
        Jeu test = new Jeu("null", 0, false);

    }
}


abstract class Article{
    String nom;
    float prix;
    boolean enStock;
    public Article(String nom, float prix, boolean enStock){
        this.nom = nom;
        this.prix = prix;
        this.enStock = enStock;
    }

    abstract void imprimerEtiquette();

    abstract void imprimerEtiquette(float rabais);

    public float calculPrixEnGroupe(int nb){
        return prix * nb;
    }
    public float calculPrixEnGroupe(int nb, float rabaisDeGroupe){
        return prix * nb * (1- rabaisDeGroupe);
    }
}

class Jeu extends Article{
    public Jeu(String nom, float prix, boolean enStock){
        super(nom, prix, enStock);
    }
    public void imprimerEtiquette() {
        System.out.println("Jeu: " + nom + ", Prix: " + prix + "€" + (enStock ? " (En stock)" : " (Rupture)"));
    }

    public void imprimerEtiquette(float rabais) {
        float prixAvecRabais = prix * (1 - rabais);
        System.out.println("Jeu: " + nom + ", Prix après rabais: " + prixAvecRabais + "€" + (enStock ? " (En stock)" : " (Rupture)"));
    }


    public float calculPrixEnGroupe(int nb, float rabaisDeGroupe, float rabaisPromotionnel){
        return prix * nb * (1 - rabaisDeGroupe) * (1 - rabaisPromotionnel);
    }
}