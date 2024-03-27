package ecole;

public class Employe extends Personne {
    public void verifier(Object o) {
        System.out.println("Employe-verifier(Object)");
    }
    public void comparer(Employe emp) {
        System.out.println("Employe-comparer(Employe)");
    }
    public void accompagner(Object o) {
        System.out.println("Employe - demenager(Object)");
    }
}