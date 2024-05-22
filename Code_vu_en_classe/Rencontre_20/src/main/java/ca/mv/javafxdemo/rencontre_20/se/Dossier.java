package ca.mv.javafxdemo.rencontre_20.se;

import java.io.File;

public class Dossier extends ElementSysteme {

    private final static int NBR_FICHIERS_MAX = 5;
    private static int nbrFichiers = 0;
    private Fichier[] fichiers = new Fichier[NBR_FICHIERS_MAX];

    public Dossier(String nom, String chemin) {
        super(nom, chemin);
    }

    public void ajouterFichier(Fichier fichier) {
        if(nbrFichiers < NBR_FICHIERS_MAX){
            this.fichiers[nbrFichiers] = fichier;
            nbrFichiers++;
        }
    }

    public void listerFichier(){
        for(Fichier fichier: fichiers){
            System.out.println(fichier);
        }
    }

    @Override
    public long getTaille(){
        long taille = 0;
        for(Fichier fichier: fichiers){
            taille += fichier.getTaille();
        }

        return taille;
    }
}
