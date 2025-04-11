package solution_exo.examen2.formatif.question2;

public class Animal { 
    private String nom;
    private int age;
    private String race;

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRace(String race){
        this.race = race;
    } 

    public String getNom(){
        return this.nom;
    }
    public int getAge(){
        return this.age;
    }
    public String getRace(){
        return this.race;
    }

    public Animal(String nom, int age, String race){
        this.setNom(nom);
        this.setAge(age);
        this.setRace(race);
    }
}

class Chat extends Animal{
    public Chat(String nom, int age, String race){
        super(nom, age, race);

    }
    public String parler(){
        return "Meow!";
    }
    public void sePresenter(){
        System.out.println("Je suis un " + this.getRace() + ", mon nom est " + this.getNom() + ", j'ai " + this.getAge() +  " ans (" + this.parler() + ")" );
    }
}

class Chien extends Animal{
    public Chien(String nom, int age, String race){
        super(nom, age, race);

    }
    public String parler(){
        return "Wouf!";
    }
    public void sePresenter(){
        System.out.println("Je suis un " + this.getRace() + ", mon nom est " + this.getNom() + ", j'ai " + this.getAge() +  " ans (" + this.parler() + ")" );
    }
}
 