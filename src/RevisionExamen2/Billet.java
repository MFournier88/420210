package RevisionExamen2;

public class Billet {
    private int idBillet;
    protected String nomPassager;
    protected double prix;
    protected boolean electronique;

    public Billet(int idBillet, String nomPassager, double prix, boolean electronique) {
        this.idBillet = idBillet;
        this.nomPassager = nomPassager;
        this.prix = prix;
        this.electronique = electronique;
    }
}
