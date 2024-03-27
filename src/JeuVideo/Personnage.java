package JeuVideo;

public class Personnage {
    private String nom;
    private short niveau;
    private Arme arme;
    private short pdv;

    public Personnage(String nom, short niveau, Arme arme, short pdv) {
        this.nom = nom;
        this.niveau = niveau;
        this.arme = arme;
        this.pdv = pdv;
    }
}
