package solution_exo.serie2;
import java.util.ArrayList;

class Personne {
    //Attributs
    private String nom;
    private int age;
    

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
   

    //Constructeur
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
   

    //Méthodes
    @Override
    public String toString(){
        return "Nom : " + this.nom + ", Âge : " + this.age;
    }    
}

//Main
public class Exo001 {
    public static void main(String[] args) {
        // Création d'un ArrayList de Personne
        ArrayList<Personne> personnes = new ArrayList<>();

        // Ajout de plusieurs objets Personne
        personnes.add(new Personne("John", 30));
        personnes.add(new Personne("Sarah", 25));
        personnes.add(new Personne("Marc", 35));

        // Parcours de l'ArrayList et affichage des informations
        for (int i = 0 ; i < personnes.size() ; i++) {
            System.out.println(personnes.get(i));
        }
    }
}