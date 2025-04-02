package solution_exo.serie2;

public class Exo005 {
    public static void main(String[] args) {
        
        Etudiant etudiant1 = new Etudiant("Jean Dupont", 10, 10);
        Etudiant etudiant2 = new Etudiant("Jean Gauthier", 30, 0);
        
        etudiant1.afficherResultat();
        etudiant2.afficherResultat();
    }
}
class Etudiant{
    //Attributs
    private String nom;
    private int age;
    private double moyenne;

    //Setter & Getter
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    
    
    //Constructeur
    public Etudiant(String nom, int age, double moyenne) {
        this.setNom(nom);
        this.setAge(age);
        this.setMoyenne(moyenne);
    }
    
    
    //Méthodes
    public boolean estAdmis(){
        return this.moyenne >= 10 ? true : false;
    }

    public void afficherResultat(){
        
        System.out.println(this.getNom() + (this.estAdmis() ? " est " : " n'est pas ") + "admis");

    }
}