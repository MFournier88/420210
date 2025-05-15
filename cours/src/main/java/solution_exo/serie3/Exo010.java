package solution_exo.serie3;

public class Exo010 {
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

        for(Personne personne : tous){
            personne.afficheInfo();
        }      
    }
}

interface Personne{
    abstract public void afficheInfo();
}

interface Employer extends Personne{
    abstract public void paie();
    default public void showImplementation(){
        System.out.println("Je suis un employé");
    }


}

interface Etudiant extends Personne{
    abstract public  boolean presence();
    default public void showImplementation(){
        System.out.println("Je suis un Etudiant");
    }
}

class Prof implements Employer{
    String nom;
    int banque = 0;


    public Prof(String nom) {
        this.nom = nom;
    }

    public void paie(){
        this.banque += 2000;
    }
    public void afficheInfo(){
        System.out.println("Je suis le professeur " + this.nom + " : Banque -> " + this.banque);
    }
}

class Tuteur implements Employer, Etudiant, Personne{

    int banque = 0;

    String nom;


    public Tuteur(String nom) {
        this.nom = nom;
    }

    public boolean presence(){
        return (int)(Math.random() * 10 + 1) <= 9 ? true : false;
    };



    public void paie(){
        this.banque += 100;
    }

    public void showImplementation(){
        System.out.println("Je suis un étudiant et un employé");
    }

    public void afficheInfo(){
        System.out.println("Je suis l'étudiant " + this.nom + " : Banque -> " + this.banque);
    }
}



class EtudiantInformatique implements Etudiant, Personne{


    String nom;

    public void afficheInfo(){
        System.out.println("Je suis l'étudiant " + this.nom);
    }

    public EtudiantInformatique(String nom) {
        this.nom = nom;
    }

    public boolean presence(){
        return (int)(Math.random() * 10 + 1) <= 6 ? true : false;
    };
}