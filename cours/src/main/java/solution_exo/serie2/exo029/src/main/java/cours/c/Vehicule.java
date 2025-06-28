package cours.c;

import cours.a.b.Voiture;

public class Vehicule {
    private String marque;
    private int annee;


    public Vehicule(String marque, int annee){
        this.setMarque(marque);
        this.setAnnee(annee);
    }

    public void setMarque(String marque){
        this.marque = marque;
    }

    public String getMarque(){
        return this.marque;
    }

    public void setAnnee(int annee){
        this.annee = annee;
    }

    public int getAnnee(){
        return this.annee;
    }

    protected void afficherInfo() {
        System.out.println("Marque: " + marque + ", Année: " + annee);
    }

    public void salutation(){
        System.out.println("Bonjour, je suis un véhicule.");
    } 

    private void afficherPrix(){
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
        voiture.afficherPrix();
       
    }
}
