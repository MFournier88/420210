package ClassesObjects;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Date {

    final int[] MOIS_31 = new int[]{1, 3, 5, 7, 8, 10, 12};
    final int[] MOIS_30 = new int[]{4, 6, 9, 11};
    final int JOUR_MAX = 31;
    final int MOIS_MIN = 1;
    final int MOIS_MAX = 12;

    private int jour;
    private int mois;
    private int annee = 0;

    public Date() {
    }

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String toString() {
        String chaineJour = "" + jour;
        String chaineMois = "" + mois;
        //s'assurer que le jour est ecrit sur deux espaces : 5 --> 05
        if (jour / 10 == 0) {
            chaineJour = "0" + jour;
        }
        //s'assurer que le mois est ecrit sur deux espaces
        if (mois / 10 == 0) {
            chaineMois = "0" + mois;
        }
        //on suppose que la date a 4 chiffres (pas a tester)
        return chaineJour + "/" + chaineMois + "/" + annee;
    }

    public boolean isValide() {

        if(mois < MOIS_MIN || mois > MOIS_MAX) {
            return false;
        }

        if(jour < 1) {
            return false;
        } else if(tableauContienNombre(MOIS_31, mois) && jour > JOUR_MAX) {
            return false;
        } else if(tableauContienNombre(MOIS_30, mois) && jour > JOUR_MAX - 1) {
            return false;
        } else if(mois == 2) {
            return (isBissextile() && jour <= JOUR_MAX - 2)  // 29 jours
                    || (jour <= JOUR_MAX - 3);               // 28 jours
        } else {
            return true;
        }
    }

    /**
     *
     * @return
     */
    private boolean isBissextile() {
        return annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0);
    }

    private boolean tableauContienNombre(int[] tab, int nombre) {
        for(int i = 0; i < tab.length; i++) {
            if(tab[i] == nombre) {
                return true;
            }
        }
        return false;
    }

    public int comparer(Date datePublication) {
        if(annee < datePublication.annee) {
            return -1;
        } else if(annee > datePublication.annee) {
            return 1;
        } else {
            if(mois < datePublication.mois) {
                return -1;
            } else if(mois > datePublication.mois) {
                return 1;
            } else {
                if(jour < datePublication.jour) {
                    return -1;
                } else if(jour > datePublication.jour) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
