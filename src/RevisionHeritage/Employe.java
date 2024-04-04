package RevisionHeritage;

public class Employe {
    double salaire;

    public Employe(double salaire) {
        this.salaire = salaire;
    }
    public void augmentationSalaire(){
        this.salaire *= 1.05;
    }
}
