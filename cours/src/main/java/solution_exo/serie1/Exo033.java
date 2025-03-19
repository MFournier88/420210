package solution_exo.serie1;
import java.util.Scanner;

public class Exo033 {

    // Méthode pour afficher toutes les positions d'un caractère dans une chaîne
    public static void afficherPositions(String mot, char lettre) {
        // Parcours du mot pour trouver la lettre et afficher ses indices
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == lettre) {
                System.out.println("Le caractère '" + lettre + "' se trouve à l'indice : " + i);
            }
        }
    }

    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir un mot
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine();
        
        // Demander à l'utilisateur de saisir une lettre
        System.out.print("Entrez une lettre : ");
        char lettre = scanner.nextLine().charAt(0); // Prendre le premier caractère de la chaîne
        
        // Appeler la méthode pour afficher les positions
        afficherPositions(mot, lettre);
        
        // Fermer le scanner
        scanner.close();
    }
}

