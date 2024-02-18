import poo.ExercicesRencontre4;
import poo.Compte;

public class Main {
    public static void main(String[] args) {
        //arraysExamples();
        //forEachArrayAccess();
        ExercicesRencontre4.afficheResult();
        int res = ExercicesRencontre4.avantDernierPlusGrand(new int[]{20,2,34,6,10});
        //System.out.println(res);
        Compte[] comptes = new Compte[3];
        Compte compte1 = new Compte (300, "Gosling", "James", 300.00);
        Compte compte2 = new Compte (100, "Sang", "Shin", 3000.00);
        Compte compte3 = new Compte (200, "Dalton", "Henry", 5000.00);
        comptes[0] = compte1;
        comptes[1] = compte2;
        comptes[2] =compte3;
    }

    public static void arraysExamples() {
        String[] listeNom = {"Geatan", "Maurice","Jean", "Bernadette"};

        int[][] chiffre = {{5,3,6},{3,4,2},{8,4}};

        System.out.println(listeNom[2]);
        System.out.println(chiffre[1][2]);
        System.out.println(listeNom.length);
        System.out.println(chiffre[0].length);
        System.out.println(chiffre[2].length);

        //Jean
        //2
        //4
    }

    public static void forEachArrayAccess() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car : cars) {
            System.out.println(car);
        }
    }
}