package Save;

public class Hero extends Personnage {
    private int xp = 0;

    public Hero(String nom, short niveau, Arme arme, short pdv) {
        super(nom, niveau, arme, pdv);
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
        if(xp > 1000){
            this.setNiveau((short)(this.getNiveau() + 1));
            this.setXp(this.getXp() - 1000);
        }
    }
}
