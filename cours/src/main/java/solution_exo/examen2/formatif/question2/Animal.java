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
