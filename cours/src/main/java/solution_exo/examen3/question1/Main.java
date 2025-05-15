package question1;
import java.util.Arrays;
import java.util.Comparator;


interface Employer{
    abstract void paie();
    default void showImplementation(){
        System.out.println("Je suis un employé");
    }
}

interface Etudiant{
    abstract boolean presence();
    default void showImplementation(){
        System.out.println("Je suis un étudiant");
    }
}

abstract class Personne{

    private String nom;
    
    
    public Personne(String nom) {
        this.nom = nom;
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    abstract void afficheInfo();
}


class Prof extends Personne implements Employer{
    
    private int banque = 0;
    
    public Prof(String nom){
        super(nom);
    }
    
    @Override
    public void paie(){
        this.banque += 2000;
    }

    @Override
    public void afficheInfo(){
        System.out.println( "Je suis le professeur " + this.getNom() + " : Banque -> " + this.banque);
    }
}



class Tuteur extends Personne implements Employer, Etudiant{
    
    private int banque = 0;
    
    public Tuteur(String nom){
        super(nom);
    }
    
    @Override
    public void paie(){
        this.banque += 200;
    }
    
    @Override
    public void afficheInfo(){
        System.out.println( "Je suis " + this.getNom() + "(Étudiant) : Banque -> " + this.banque);
    }
    
    @Override
    public boolean presence(){
        return Math.random() < 0.9;
    }
    
    @Override
    public void showImplementation(){
        System.out.println("Je suis un employé et un étudiant.");
    }
}


class EtudiantInformatique extends Personne implements Etudiant{
    public EtudiantInformatique(String nom){
        super(nom);
    }
    
    @Override
    public void afficheInfo(){
        System.out.println( "Je suis " + this.getNom() + "(Étudiant)");
    }
    
    @Override
    public boolean presence(){
        return Math.random() < 0.6;
    }
}




public class Main {
    public static void main(String[] args) {
        
        Prof maxime = new Prof("Maxime");
    
        Tuteur tuteur1 = new Tuteur("Léa");
        Tuteur tuteur2 = new Tuteur("Julien");
        Tuteur tuteur3 = new Tuteur("Sophie");
        
        EtudiantInformatique etudiant1 = new EtudiantInformatique("Lucas");
        EtudiantInformatique etudiant2 = new EtudiantInformatique("Emma");
        EtudiantInformatique etudiant3 = new EtudiantInformatique("Hugo");
        EtudiantInformatique etudiant4 = new EtudiantInformatique("Chloé");
        EtudiantInformatique etudiant5 = new EtudiantInformatique("Nathan");
        EtudiantInformatique etudiant6 = new EtudiantInformatique("Jade");
        EtudiantInformatique etudiant7 = new EtudiantInformatique("Noah");
        EtudiantInformatique etudiant8 = new EtudiantInformatique("Inès");
        
        
        Personne[] tous = {
            maxime,
            tuteur1,
            tuteur2,
            tuteur3,
            etudiant1,
            etudiant2,
            etudiant3,
            etudiant4,
            etudiant5,
            etudiant6,
            etudiant7,
            etudiant8,
        };
        Employer[] listeEmployer = {
            maxime,
            tuteur1,
            tuteur2,
            tuteur3
        };
        
        
        Etudiant[] listeEtudiant = {
            etudiant1,
            etudiant2,
            etudiant3,
            etudiant4,
            etudiant5,
            etudiant6,
            etudiant7,
            etudiant8,
            tuteur1,
            tuteur2,
            tuteur3
        };
        for(Personne personne : tous){
            personne.afficheInfo();
        }
    
        System.out.println("---------------------------");
        for(Employer employe : listeEmployer){
            employe.showImplementation();
        }
        System.out.println("---------------------------");
        for(Etudiant etudiant : listeEtudiant){
            etudiant.showImplementation();
        } 
        System.out.println("---------------------------");        
        
        for(Employer employe : listeEmployer){
            employe.paie();
        }
        
        System.out.println("---------------------------");
    
    
    
        //-----trier ici-----
    
        Arrays.sort(tous, new Comparator<Personne>() {
            @Override
            public int compare(Personne p1, Personne p2) {
                return p1.getNom().compareTo(p2.getNom()); 
            }
        });
        //-------------------
    
    
        for(Personne personne : tous){
            personne.afficheInfo();
        }      
    }
}