package solution_exo.serie1;
import java.util.Scanner;

public class Exo055 {

    public static void main(String[] args) {
        // Créer un objet Scanner pour saisir une année
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur d'entrer une année
        System.out.print("Entrez une année : ");
        int annee = scanner.nextInt();
        
        // Vérification de l'année bissextile
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            System.out.println("Année bissextile");
        } else {
            System.out.println("Année non bissextile");
        }

        // Fermer le scanner
        scanner.close();
    }
}
