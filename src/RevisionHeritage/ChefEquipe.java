package RevisionHeritage;

public class ChefEquipe extends Person{
    String titre;
    int idEmploye;

    public ChefEquipe(String nom, String prenom, String titre, int idEmploye) {
        super(nom, prenom);
        this.titre = titre;
        this.idEmploye = idEmploye;
    }

    public String getNom(){
        return this.nom + " (" + this.titre + ")";
    }
    public int getIdEmploye(){
        return idEmploye;
    }



    @Override
    public String toString() {
        return idEmploye + " : " + this.prenom + this.getNom();
    }
}
