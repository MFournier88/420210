package RevisionExam1.NBA;
public class Equipe {
    String nom;
    Joueur joueurs[];

    public Equipe(String nom, Joueur joueurs[]){
        this.nom = nom;
        this.joueurs = joueurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Joueur[] getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(Joueur[] joueurs) {
        this.joueurs = joueurs;
    }
    public void setJoueur(Joueur joueur, byte index){
        this.joueurs[index] = joueur;
    }

    public void addJoueur(Joueur joueur){
        Joueur newJoueurs[] = new Joueur[this.joueurs.length + 1];
        for(int i =0 ; i < this.joueurs.length; i++){
            newJoueurs[i] = this.joueurs[i];
        }
        newJoueurs[newJoueurs.length - 1] = joueur;
        setJoueurs(newJoueurs);
    }
    @Override
    public String toString() {
        String msg = "";
        msg += "        " + this.nom + "\n----------------------\n";
        for(Joueur val : joueurs){
            msg += val.toString() + "\n";
        }
        return  msg;
    }

    //retirer un joueur et s'assurer que seul la dernière case est vide dans joueur

    //ajouter un joueur en s'assurant que le tableau est assez grand
}
