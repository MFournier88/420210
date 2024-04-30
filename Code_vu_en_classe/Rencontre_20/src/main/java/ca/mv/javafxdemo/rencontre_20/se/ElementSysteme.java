package ca.mv.javafxdemo.rencontre_20.se;

public class ElementSysteme {
    private String nom;
    private String chemin;
    private long taille;
    private boolean lectureSeule;

    public ElementSysteme(String nom, String chemin) {
        this.nom = nom;
        this.chemin = chemin;
        taille = 0;
    }

    public void renommer(String nom) {
        this.nom = nom;
    }

    public long getTaille() {
        return taille;
    }

    public boolean isLectureSeule() {
        return lectureSeule;
    }

    public void setLectureSeule(boolean lectureSeule) {
        this.lectureSeule = lectureSeule;
    }

    public void setTaille(long taille) {
        this.taille = taille;
    }

    @Override
    public String toString() {
        return "\n\t\tnom : '" + nom + '\'' +
                "\n\t\tchemin : '" + chemin + '\'' +
                "\n\t\ttaille : " + taille +
                "\n\t\tlectureSeule : " + lectureSeule;
    }
}
