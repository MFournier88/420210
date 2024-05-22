package RevisionExamen2;

public class exo0 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.parler(); // Affiche: Les animaux ne parlent pas.

        Chien chien = new Chien(); // Polymorphisme
        chien.parler(); // Affiche: Le chien aboie.
        chien.discute();
    }
}
// Classe parente
class Animal {
    public void parler() {
        System.out.println("Les animaux ne parlent pas.");
    }
}

// Classe enfant
class Chien extends Animal {
    public void discute(){
        this.parler();
        super.parler();
    }
    @Override // Annotation optionnelle, mais recommandée pour améliorer la lisibilité
    public void parler() {
        System.out.println("Le chien aboie.");
    }
}

