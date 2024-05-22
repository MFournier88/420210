package RevisionExamen2;

public class International extends Vol{
    private int idAeroport;
    private float tps;
    private String pays;
    private float tvq;

    public International(int idVol, String typeVol, int idAeroport, float tps, String pays, float tvq, Billet billet) {
        super(idVol, typeVol,billet);
        this.idAeroport = idAeroport;
        this.tps = tps;
        this.pays = pays;
        this.tvq = tvq;
    }
    @Override
    public float prixReelBillet() {

        if(billets.electronique && !(this.pays).equals("France")) {
            return (float) (billets.prix + billets.prix * this.tps);
        }
        else if(billets.electronique && (this.pays).equals("France")) {
            return (float) (billets.prix + billets.prix * (this.tvq+this.tps));

        }
        return (float) billets.prix;

    }
}
