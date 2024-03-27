package JeuVideo;

public class Hero extends Personnage{
    private int xp;

    public Hero(String nom, short niveau, Arme arme, short pdv, int xp) {
        super(nom, niveau, arme, pdv);
        this.xp = xp;
    }


}
