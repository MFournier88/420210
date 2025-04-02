package solution_exo.examen2.formatif.question2;

public class Chat extends Animal{
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
