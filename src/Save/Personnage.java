package Save;

public class Personnage {
    private String nom;
    private short niveau;
    private Arme arme;
    private int pdv;

    public Personnage(String nom, short niveau, Arme arme, int pdv) {
        this.nom = nom;
        this.niveau = niveau;
        this.arme = arme;
        this.pdv = pdv;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }
    public void setPdv(int pdv){
        if(pdv < 0){
            pdv = 0;
        }
        this.pdv = pdv;
    }

    public int getPdv() {
        return pdv;
    }

    public short getNiveau() {
        return niveau;
    }

    public void setNiveau(short niveau) {
        this.niveau = niveau;
        this.setPdv((short)(180 + this.getNiveau()*20));
    }

    public void attaquer(Personnage victime){
        victime.setPdv((short)(victime.getPdv() - this.arme.getDpc() * Math.pow(1.1,this.niveau)));
    }

    @Override
    public String toString() {
        return this.nom + "("+ this.niveau + ") avec " + this.arme + " : " + this.getPdv() + " pdv restants";
    }
}
