package question2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Création de l’arborescence
        Repertoire root = new Repertoire("Documents");

        Repertoire projets = new Repertoire("Projets");
        Repertoire perso = new Repertoire("Personnel");

        Repertoire projetJava = new Repertoire("ProjetJava");
        projetJava.ajouterFichier(new Document("README.md", 300));
        projetJava.ajouterFichier(new Document("rapport.docs", 1200));

        Repertoire photos = new Repertoire("PhotosVacances");
        photos.ajouterFichier(new Document("plage.png", 500000));
        photos.ajouterFichier(new Document("montagne.pdf", 450000));

        perso.ajouterFichier(photos);
        perso.ajouterFichier(new Document("budget.xlsx", 150));

        projets.ajouterFichier(projetJava);
        projets.ajouterFichier(new Document("presentation.pptx", 850));

        root.ajouterFichier(projets);
        root.ajouterFichier(perso);
        root.ajouterFichier(new Document("CV.pdf", 300));

        // Affichage complet
        System.out.println("Arborescence complète :");
        root.afficheAvecProfondeur(0);

    }
}

abstract class Fichier{
    public static final int INDENT = 10;
    private String nom;

    public Fichier(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    

    abstract long getTaille();
    
    abstract void afficheAvecProfondeur(int depth);
}


class Document extends Fichier{
    private long taille;
    public Document(String nom, long taille) {
        super(nom);
        this.taille = taille;
    }
    
    @Override
    public long getTaille() {
        return taille;
    }
    public void setTaille(long taille) {
        this.taille = taille;
    }

    @Override
    public void afficheAvecProfondeur(int depth){
        System.out.printf("%" + INDENT * depth + "s%-" + (80 - INDENT * depth) + "s%16d octets\n","" ,this.getNom(), this.getTaille());
    }
    
}

class Repertoire extends Fichier{
    private ArrayList<Fichier> listeFichier = new ArrayList<>();

    public Repertoire(String nom) {
        super(nom);
    }
    
    public void ajouterFichier(Fichier fichier){
        this.listeFichier.add(fichier);
    }

    public void listerFichier(){
        for (Fichier fichier : listeFichier) {
            System.out.println(fichier);
        }
    }

    @Override
    public long getTaille(){
        long somme = 0;
        for (Fichier fichier : listeFichier) {
            somme += fichier.getTaille();
        }
        return somme;
    }
    @Override
    public void afficheAvecProfondeur(int depth){
        System.out.printf("%" + ((depth > 0) ? INDENT * depth : "") + "s%-" + (80 - depth*INDENT) + "s%16d octets\n","", this.getNom(), this.getTaille());
        for (Fichier fichier : listeFichier) {
            fichier.afficheAvecProfondeur(depth + 1);
        }
        
    }
}
