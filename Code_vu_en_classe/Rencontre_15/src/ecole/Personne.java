package ecole;
public class Personne {
    public void verifier() {
        System.out.println("Personne-verifier()");
    }
    public void comparer(Object o) {
        System.out.println("Personne-comparer(Object)");
    }
    public void accompagner(Personne pers) {
        System.out.println("Personne-accompagner(Personne)");
    }
}