package solution_exo.serie1;
import java.util.ArrayList;
import java.util.Scanner;

public class Exo048 {

    public static void main(String[] args) {
        // Créer un ArrayList de type String et ajouter des valeurs
        ArrayList<String> langages = new ArrayList<>();
        langages.add("Java");
        langages.add("Python");
        langages.add("C++");
        langages.add("Ruby");
        
        // Afficher la taille de l'ArrayList
        System.out.println("La taille de l'ArrayList est : " + langages.size());
        
        // Demander à l'utilisateur de saisir un nouveau langage
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nouveau langage à ajouter : ");
        String nouveauLangage = scanner.nextLine();
        
        // Ajouter la nouvelle valeur à l'ArrayList
        langages.add(nouveauLangage);
        
        // Afficher tous les éléments de l'ArrayList
        System.out.println("Les langages de programmation dans l'ArrayList sont :");
        for (String langage : langages) {
            System.out.println(langage);
        }
        
        // Fermer le scanner
        scanner.close();
    }
}

