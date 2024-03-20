package ClassesObjects;

public class Livre {

    private static Date datePubPlusRecente;
    private static Date datePubPlusAncienne;
    private String ISBN;
    private String titre;
    private String nomAuteur;
    private String prenomAuteur;
    private int nbrPages;
    private Dimension dimension;
    private Date datePublication;

    public Livre() {
    }

    public Livre(String ISBN, String titre, String nomAuteur, String prenomAuteur, int nbrPages, Dimension dimension, Date datePublication) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.nbrPages = nbrPages;
        this.dimension = dimension;
        this.setDatePublication(datePublication);
        if(datePubPlusAncienne != null && this.datePublication != null && datePubPlusAncienne.comparer(this.datePublication) > 0) {
            datePubPlusAncienne = this.datePublication ;
        }

        if(datePubPlusRecente != null && this.datePublication != null && datePubPlusRecente.comparer(this.datePublication) > 0) {
            datePubPlusRecente = this.datePublication ;
        }
    }

    public static Date getDatePubPlusRecente() {
        return datePubPlusRecente;
    }

    public static Date getDatePubPlusAncienne() {
        return datePubPlusAncienne;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public String getPrenomAuteur() {
        return prenomAuteur;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public static void setDatePubPlusRecente(Date datePubPlusRecente) {
        Livre.datePubPlusRecente = datePubPlusRecente;
    }

    public static void setDatePubPlusAncienne(Date datePubPlusAncienne) {
        Livre.datePubPlusAncienne = datePubPlusAncienne;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public void setDatePublication(Date datePublication) {
        if(datePublication != null && datePublication.isValide()) {
            this.datePublication = datePublication;
        }
    }

    public String toString() {
        return "ISBN:\t\t" + ISBN
                + "\nTitre:\t\t" + titre
                + "\nAuteur:\t\t" + prenomAuteur + " " + nomAuteur
                + "\nPages:\t\t" + nbrPages
                + "\nDimension:\t" + dimension
                + "\nDate:\t\t" + datePublication;
    }

    public String reference() {
        return nomAuteur + ", " + prenomAuteur.charAt(0) + ". ("
                + datePublication.getAnnee() + "), " + titre + ", "
                + nbrPages + " pages.";
    }
}

