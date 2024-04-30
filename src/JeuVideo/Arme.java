package JeuVideo;

public class Arme {
    protected String nom;
    private short dpc;

    public Arme(short dpc) {
        this.dpc = dpc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public short getDpc() {
        return dpc;
    }

    public void setDpc(short dpc) {
        this.dpc = dpc;
    }

    @Override
    public String toString() {
        return this.nom;
    }
}
