package solution_exo.serie3;

import java.util.Arrays;
import java.util.Comparator;

public class Exo0 {
    public static void main(String[] args) {
        Animal[] ferme = { 
                            new Chien("Rex", 3),
                            new Chat("Lily", 5), 
                            new Poule("Bernadette", 1),
                            new Vache("Jacqueline", 10),
                            new Mouton("Sam", 4)
        };

        Arrays.sort(ferme, new Comparator<Animal>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getAge() - animal2.getAge(); 
            }
        });

        for( Animal animal : ferme){
            System.out.println(animal.parole());
        }

    }

}
class Animal{
    String nom;
    int age;


    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }    
    public String parole(){
        return "";
    }
}

class Chien extends Animal{

    public Chien(String nom, int age) {
        super(nom, age);
    }

    @Override
    public String parole(){
        return "Woof";
    }

}

class Chat extends Animal{

    public Chat(String nom, int age) {
        super(nom, age);
    }

    @Override
    public String parole(){
        return "Meow!";
    }

}
class Poule extends Animal{

    public Poule(String nom, int age) {
        super(nom, age);
    }

    @Override
    public String parole(){
        return "Bekayyy";
    }

}

class Vache extends Animal{

    public Vache(String nom, int age) {
        super(nom, age);
    }

    @Override
    public String parole(){
        return "Meeuuuuuu";
    }

}

class Mouton extends Animal{

    public Mouton(String nom, int age) {
        super(nom, age);
    }

    @Override
    public String parole(){
        return "Behehehehehe";
    }

}

