package solution_exo.examen2.formatif.question2;

public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal("a",2,"ss");
        System.out.println(ani.nom);
        Chien chien = new Chien("Rex", 3, "Berger Allemand");
        Chat chat = new Chat("Matou", 12, "Sphinx");
        
    
        chien.sePresenter();
        chien.parler();
    
        chat.sePresenter();
        chat.parler();
    }
}
