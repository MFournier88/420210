package cours.a.b;
import cours.c.Vehicule;
public class Voiture extends Vehicule {
    
    private int nombreDePortes;

    public Voiture(String marque, int annee, int nombreDePortes){
        super(marque, annee);
        this.setNombreDePortes(nombreDePortes);
    }

    public void setNombreDePortes(int nombreDePortes){
        this.nombreDePortes = nombreDePortes;
    }

    public int getNombreDePortes(){
        return this.nombreDePortes;
    }


    protected void afficherInfoVoiture() {
        super.afficherInfo(); // Appel de la méthode de la superclasse
        
        System.out.println("Nombre de portes: " + nombreDePortes);
    }


   
    public void salutationVoiture(){
        System.out.println("Bonjour, je suis un véhicule.");
    } 

    private void afficherPrixVoiture(){
        System.out.println("1000000");
    }

    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule("Toyota", 2022);
        Voiture voiture = new Voiture("Toyota", 2022, 4);
        
        vehicule.afficherInfo();
        vehicule.salutation();
        vehicule.afficherPrix();
        
        voiture.afficherInfo();
        voiture.afficherInfoVoiture();
        voiture.salutation();
        voiture.afficherPrixVoiture();
       
      
    }
}
