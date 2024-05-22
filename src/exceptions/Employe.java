package exceptions;

public class Employe extends Person{
    protected String idEmploye;
    protected String titre;

    public Employe(String prenom, String nom, String idEmploye, String titre) {
        super(prenom, nom);
        this.idEmploye = idEmploye;
        this.titre = titre;
    }

    @Override
    public String toString() {
        return this.idEmploye + " : " + super.toString() + " (" + this.titre + ")";
    }
}
