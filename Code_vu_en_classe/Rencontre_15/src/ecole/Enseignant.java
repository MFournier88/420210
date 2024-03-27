package ecole;

public class Enseignant extends Employe {
    public void verifier(Employe emp) {
        System.out.println("Enseignant - verifier(Employe)");
    }
    public void comparer(Object o) {
        System.out.println("Enseignant - comparer(Object)");
    }
    public void accompagner(Enseignant ens) {
        System.out.println("Enseignant-demenager(Enseignant)");
    }
}
