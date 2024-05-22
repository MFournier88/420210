package RevisionExamen2;

public class National extends Vol{
    private int idAeroport;
    private float tva;

    public National(int idVol, String typeVol, int idAeroport, float tva, Billet billet) {
        super(idVol, typeVol,billet);
        this.idAeroport = idAeroport;
        this.tva = tva;
    }

    @Override
    public float prixReelBillet() {

        if(billets.electronique) {
            return (float) (billets.prix + billets.prix * this.tva);
        }
        else{
            return (float) billets.prix;
        }
    }
}