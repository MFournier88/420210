package Heritage;

public class Oiseau extends Animal{
    public Oiseau(String nom, String espece, short age) {
        super(nom, espece, age);
    }

    public void vol(){
        System.out.println("Je vol");
    }
}
