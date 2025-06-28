package solution_exo.serie2;

public class Exo026 {
    public static void main(String[] args) {
        Chien chien = new Chien("Rex", 3, "Berger Allemand");
        Chat chat = new Chat("Matou", 12, "Sphinx");
        
        chien.sePresenter();
        System.out.println(chien.parler());

        chat.sePresenter();
        System.out.println(chat.parler());

    }
}
class Animal{
    protected String nom;
    protected int age;
    protected String race;

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
    public void setRace(String race){
        this.race = race;
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
class Chien extends Animal{

    public Chien(String nom, int age, String race){
        super(nom, age, race);
    }
    public String parler(){
        return "Woof!";
    }
    public void sePresenter(){
        System.out.printf("Je suis un %s, mon nom est %s, j'ai %d ans (%s).\n", this.getRace(), this.getNom(), this.getAge(), this.parler());
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
        System.out.printf("Je suis un %s, mon nom est %s, j'ai %d ans (%s).\n", this.getRace(), this.getNom(), this.getAge(), this.parler());
    }
}