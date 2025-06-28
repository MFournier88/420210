package cours.a.b;
import cours.a.b.Voiture;
import cours.c.Vehicule;

public class Main {
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
