package Heritage;

public class Mammifère extends Animal{
    short dureeVie;

    public Mammifère(String nom, String espece, short age, short dureeVie){
        super(nom, espece,age);
        this.dureeVie = dureeVie;
    }
    public void afficheDureeVie(){
        System.out.println(this.dureeVie);

    }
    public void afficheTruc(){
        age = 5;
        System.out.println(age);
        age = 7;
        System.out.println(age);
    }
}
