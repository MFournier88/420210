package question2;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Document cv = new Document("CV.pdf", 300);
        Document budget = new Document("budget.xlsx", 150);
        Document montagne = new Document("montagne.pdf", 450000);
        Document plage = new Document("plage.png", 500000);
        Dossier photoVacances = new Dossier("PhotosVacances");
        photoVacances.ajouterFichier(plage);
        photoVacances.ajouterFichier(montagne);
        Dossier personnel = new Dossier("Personnel");
        personnel.ajouterFichier(photoVacances);
        personnel.ajouterFichier(budget);
        Document presentation = new Document("presentation.pptx",850);
        Document rapport = new Document("rapport.docs", 1200);
        Document readMe = new Document("README.md", 300);
        Dossier projetJava = new Dossier("ProjetJava");
        projetJava.ajouterFichier(readMe);
        projetJava.ajouterFichier(rapport);
        Dossier projets = new Dossier("Projets");
        projets.ajouterFichier(projetJava);
        projets.ajouterFichier(presentation);
        Dossier documents = new Dossier("Documents");
        documents.ajouterFichier(projets);
        documents.ajouterFichier(personnel);
        documents.ajouterFichier(cv);

        documents.affiche(0);
    }
}
abstract class Fichier{
    private String nom;

    
    public Fichier(String nom) {
        this.nom = nom;
    }

    public void affiche(int indent) {
        System.out.printf("%-60s%30d octets\n","          ".repeat(indent) + this.getNom(), this.getTaille());
    }

    abstract int getTaille();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}


class Document extends Fichier{
    private int taille;

    public Document(String nom, int taille) {
        super(nom);
        this.taille = taille;
    }

   

    @Override
    public int getTaille(){
        return taille;
    }
}
class Dossier extends Fichier{
    private ArrayList<Fichier> fichiers = new ArrayList<>();

    public Dossier(String nom) {
        super(nom);
    }
    @Override
    public void affiche(int indent) {
        super.affiche(indent);
        for (Fichier fichier : fichiers) {
            fichier.affiche(indent + 1);
        }
    }

    public void ajouterFichier(Fichier fichier){
        this.fichiers.add(fichier);
    }
    @Override
    public int getTaille(){
        int somme = 0;
        for (Fichier fichier : fichiers) {
            somme += fichier.getTaille();
        }
        return somme;
    }
    
}