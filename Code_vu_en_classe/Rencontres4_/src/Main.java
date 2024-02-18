import java.util.Scanner;

public class Main {
    final public static String INVIT_MSG = "Veuillez entrer le nombre de boites de chocolat que vous voulez acheter :";
    final public static String DIX_POUR_CENT_RABAIS_MSG = "Vous avez droit à un rabais de 10%";
    final public static String QUINZE_POUR_CENT_RABAIS_MSG = "Vous avez droit à un rabais de 15%";
    final public static String AUCUN_RABAIS_MSG = "Vous n'avez pas droit au rabais!";

    public static void main(String[] args) {

        //stringTypeConverter();
        //stringMethods();
        arraysExercice();
    }

    public static void scannerExercice() {
        int nbBoites;
        Scanner sc = new Scanner(System.in);

        System.out.println(INVIT_MSG);
        nbBoites = sc.nextInt();

        if (nbBoites >= 50) {
            System.out.println(QUINZE_POUR_CENT_RABAIS_MSG);
        } else if(nbBoites >= 5){
            System.out.println(DIX_POUR_CENT_RABAIS_MSG);
        } else {
            System.out.println(AUCUN_RABAIS_MSG);
        }

        sc.close();
    }

    public static void stringTypeConverter() {
        Byte myByte = 20;
        String byteToString = String.valueOf(myByte);

        System.out.println(byteToString);
    }

    public static void stringMethods(){
        String chaine1 = "Bonjour";
        String chaine2 = "bonjour";
        String chaine3 = "bonjour";

        System.out.println(AUCUN_RABAIS_MSG.length());
        System.out.println(AUCUN_RABAIS_MSG.substring(2,10));
        System.out.println(chaine1.equals(chaine2));
        System.out.println(chaine1.equalsIgnoreCase(chaine2));
        System.out.println("chaine2 == chaine3 " + (chaine2 == chaine3));
        System.out.println(chaine1.toLowerCase());
        System.out.println(chaine1.toUpperCase());
        System.out.println(chaine1.indexOf('o'));
        System.out.println(AUCUN_RABAIS_MSG.replace("n'avez pas", "avez"));
        System.out.println(String.format("%s, il fait %05d %s %7.2f.",
                 "Bonjour", -10, "aujourd'hui. La taxe fédérale est", 4.995));
        System.out.printf("%s, il fait %05d %s %7.2f.\n",
                "Bonjour", -10, "aujourd'hui. La taxe fédérale est", 4.995);
        System.out.println((int) 4.53f);
    }

    public static void arraysExercice() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
    }
}