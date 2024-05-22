package RevisionExamen2;

import java.util.ArrayList;

public class Vol {
    protected int idVol;
    protected String typeVol;

    protected Billet billets;
    public Vol(int idVol, String typeVol, Billet billet) {
        this.idVol = idVol;
        this.typeVol = typeVol;
        this.billets = billet;
    }
    public float prixReelBillet(){
        System.out.println("Non-implémenté");
        return 0;
    }
}
