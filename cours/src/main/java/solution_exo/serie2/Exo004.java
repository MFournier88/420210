package solution_exo.serie2;

public class Exo004 {
    public static void main(String[] args) {
        Livre livre = new Livre("Eragon","Christopher Paolini", 20.99, true);
        livre.afficherDetails();
        livre.setDisponible(false);
        livre.afficherDetails();
    }
}
class Livre{
    //Attributs
    private String titre;
    private String auteur;
    private double prix;
    private boolean disponible;
    
    
    //Setter & Getter
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    //Constructeur
    public Livre(String titre, String auteur, double prix, boolean disponible) {
        this.setTitre(titre);
        this.setAuteur(auteur);
        this.setPrix(prix);
        this.setDisponible(disponible);
    }
    
    //Méthodes
    public void afficherDetails(){
        System.out.printf("%-40s%-25s%10.2f$            %s\n",this.titre, this.auteur,this.prix,this.disponible ? "Disponible" : "Déjà loué");
    }

    public void emprunter(){
        if(this.disponible){
            this.disponible = false;
        }
        else{
            System.out.println("Le livre n'est pas disponible");
        }
    }

    public void retourner(){
        this.disponible = true;
    }
   
    
}