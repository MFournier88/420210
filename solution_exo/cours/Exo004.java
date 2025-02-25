package cours;

public class Exo004 {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Le livre de la jungle", "Disney", 10.65, true);
        livre1.afficherDetail();
    }
}
class Livre{
    String titre;
    String auteur;
    double prix;
    boolean disponible;
    public Livre(String titre, String auteur, double prix, boolean disponible){
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.disponible = disponible;
    }

    public void afficherDetails(){
        System.out.println("Titre : " + this.titre + ", " + "Auteur : " + this.auteur
                            + " Prix : " + String.format("%.02f",this.prix) + (disponible ? " True" : " False"));
    }
    public void afficherDetail(){
        System.out.printf("Titre : %s, Auteur : %s Prix : %.02f %b",this.titre, this.auteur, this.prix, this.disponible);
    }
}