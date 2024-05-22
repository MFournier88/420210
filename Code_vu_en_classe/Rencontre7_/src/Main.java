import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exercice1();
        //exercice2();
        System.out.println((5/2) * 3 + 5 / 2);
        shape7a(5);
    }

    public static void exercice1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la taille");
        int size = sc.nextInt();
        straightLine(size);
        afficherTabDeuxDim(straightLineTab(size));
    }
    /**
     * Affiche un carré plein avec des étoiles "*" selon la taille passée en paramètre
     *
     * @param size int    la taille du carré
     */
    public static void straightLine(int size) {

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
    public static String[][] straightLineTab(int size) {
        String[][] carre = new String[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                carre[i][j] = "* ";
                //System.out.print("*");
            }

            System.out.println();
        }
        return  carre;
    }

    public static void afficherTabDeuxDim(String[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println();
            for (int j = 0; j < tableau.length; j++) {
                System.out.print(tableau[i][j]);

            }
        }
    }

    /**
     * void methode demande à l’utilisateur de rentrer un nombre entier x (avec Scanner),
     * et affiche une boite avec des étoiles "*" (asterisks)
     */
    public static void exercice2() {
        int x;
        Scanner input = new Scanner(System.in);

        System.out.println("Please inter the x value :");
        x = input.nextInt();

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < x; j++) {
                if(i == 0 || i == (x - 1) || j == 0 || j == (x - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

    }

    /**
     *  void mathod to print a shape that is a triangular pattern with sides of 6 asterisks
     *  refer to detailed instructions in lab description part 7a
     *
     *  @param number int
     */
    public static void shape7a(int number) {

        for(int i = 0; i < number; i++) {
            for(int j = 0; j < number; j++) {
                if(j < i) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();

        }

    }

}