package cours.c.d;
import cours.c.Vehicule;
import cours.a.b.Voiture;
public class Main {
    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule("Toyota", 2022);
        Voiture voiture = new Voiture("Toyota", 2022, 4);
        vehicule.afficherInfo();//protected
        vehicule.salutation(); //public
        vehicule.afficherPrix();//private
        
     
        voiture.afficherInfo();
        voiture.afficherInfoVoiture();
        voiture.salutation();
        voiture.afficherPrix();
        
    }
}
