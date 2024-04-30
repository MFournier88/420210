package PreExam1.R6;

public class Personne2 {
    private String nom;
    private int age;
    private String ville;

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age <= 127 && age >= 0){
            this.age = age;
        }
        else{
            System.out.println("Vous entrez une valeur invalide pour l'age");
        }

    }
    public String getVille(){
        return this.ville;
    }

    public Personne2(String nom, int age, String ville) {
        this.nom = nom;
        this.age = age;
        this.ville = ville;
    }
}
