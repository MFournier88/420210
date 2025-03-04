import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int n = scan.nextInt();
            int result = 10 / n;  // Division par zéro qui va lever une exception ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("0 n'est pas une entrée valide");
        } 
        catch(InputMismatchException e){
            System.out.println("Il faut entrer un entier");

        }finally {
            System.out.println("Bloc finally exécuté.");
        }
    }
}
