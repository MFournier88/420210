package ca.mv.javafxdemo.rencontre_20.se;

public class Fichier extends ElementSysteme {

    private String contenu;

    public Fichier(String nom, String contenu) {
        super(nom, "./");
        ecrire(contenu);
    }

    public String getContenu() {
        return contenu;
    }

    public void ecrire(String texte) {
        if(!super.isLectureSeule()) {
            this.contenu = texte;
            super.setTaille(texte.length());
        }
    }

    @Override
    public String toString() {
        String string = super.toString();
        return "\nFichier : " + string +
                "\n\t\tcontenu : '" + contenu + '\'';
    }
}
