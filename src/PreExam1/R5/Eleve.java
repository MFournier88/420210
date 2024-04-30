package PreExam1.R5;

public class Eleve {
    //Attributs
    String nomComplet;
    int id;
    protected byte age;

    //Constructeur
    public Eleve(String nomComplet, int id, byte age){
        this.nomComplet = nomComplet;
        this.id = id;
        this.age = age;
    }
    public void afficheAge(){
        System.out.println("L'age de " + this.nomComplet + " est de " + this.age);
    }

    public static void status(){
        System.out.println("Je suis un élève");
    }
}
