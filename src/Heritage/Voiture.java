package Heritage;

class Voiture extends Vehicule {
    int nombreDePortes;

    void afficherInfoVoiture() {
        afficherInfo(); // Appel de la méthode de la superclasse
        System.out.println("Nombre de portes: " + nombreDePortes);
    }
}
