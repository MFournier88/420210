package solution_exo.serie3;

public class Exo9 {

    public static void main(String[] args) {
       
        Etudiant etudiant = new Etudiant("Marie", 22, "15 rue de la Paix", "Informatique", "E123");
        Professeur professeur = new Professeur("Mr. Dupont", 45, "12 avenue des Champs", "Mathématiques", 2500.00);
    
        Personne[] personnes = {
            etudiant,
            professeur
        };
        etudiant.etudier();
        professeur.enseigner();

        for(Personne personne : personnes){
            personne.seDecrire();
        }
    }
}
abstract class Personne{
    protected String nom;
    protected int age;
    protected String adresse;

    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return this.nom;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public Personne(String nom, int age, String adresse){
        this.setNom(nom);
        this.setAge(age);
        this.setAdresse(adresse);
    }


    abstract void seDecrire();

    public void sePresenter(){
        System.out.println("Je suis " + this.nom + ", j'ai " + this.age + " ans et mon adresse est " + this.adresse);
    }
}
class Etudiant extends Personne{
    protected String filiere;
    protected String numEtudiant;

    public void setFiliere(String filiere){
        this.filiere = filiere;
    }
    public String getFiliere(){
        return this.filiere;
    }

    public void setNumEtudiant(String numEtudiant){
        this.numEtudiant = numEtudiant;
    }
    public String getNumEtudiant(){
        return this.numEtudiant;
    }
    public Etudiant(String nom, int age, String adresse, String filiere, String numEtudiant){
        super(nom, age, adresse);
        this.setFiliere(filiere);
        this.setNumEtudiant(numEtudiant);

    }

    public void etudier(){
        System.out.printf("L'étudiant %s étudie %s\n",this.nom, this.filiere);
    }
    @Override
    public void seDecrire(){
        super.sePresenter();
        System.out.printf("Je suis en filière %s, Numéro étudiant: %s\n", this.filiere, this.numEtudiant);
    }
}
class Professeur extends Personne{
    protected String matiere;
    protected double salaire;

    public void setMatiere(String matiere){
        this.matiere = matiere;
    }
    public String getMatiere(){
        return this.matiere;
    }
    public void setSalaire(double salaire){
        this.salaire = salaire;
    }
    public double getSalaire(){
        return this.salaire;
    }
    public Professeur(String nom, int age, String adresse, String matiere, double salaire){
        super(nom, age, adresse);
        this.setMatiere(matiere);
        this.setSalaire(salaire);
    }
    public void enseigner(){
        System.out.printf("L'enseignant %s enseigne %s\n",this.nom, this.matiere);
    }
    @Override
    public void seDecrire(){
        super.sePresenter();
        System.out.printf("J'enseigne la matière %s, salaire: %.02f€\n", this.matiere, this.salaire);
    }
}