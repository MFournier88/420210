package solution_exo.serie1;
import java.util.ArrayList;
import java.util.Scanner;

public class Exo049 {

    public static void main(String[] args) {
        // Créer un ArrayList de fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        
        // Demander à l'utilisateur de saisir un fruit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un fruit : ");
        String fruitSaisi = scanner.nextLine();
        
        // Vérifier si le fruit saisi est dans l'ArrayList
        if (fruits.contains(fruitSaisi)) {
            System.out.println("Le fruit '" + fruitSaisi + "' a été trouvé dans l'ArrayList.");
        } else {
            System.out.println("Le fruit '" + fruitSaisi + "' n'a pas été trouvé dans l'ArrayList.");
        }
        
        // Fermer le scanner
        scanner.close();
    }
}

