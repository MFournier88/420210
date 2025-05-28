package solution_exo.examen1.formatif;

import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    public static String repetition(String mot, int nombre){
        String somme = "";
        for( int i = 0; i < nombre; i++){
            somme += mot;
        }
        return somme;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> taches = new ArrayList<String>();
        ArrayList<Boolean> isDone = new  ArrayList<Boolean>();
        String choix;
        while(true){
            System.out.println("1.Ajouter une tâche");
            System.out.println("2.Marquer une tâche comme terminée");
            System.out.println("3.Afficher les tâches");
            System.out.println("4.Terminer le programme");
            System.out.println("-".repeat(40));
            System.out.println("Nombre de tâche : " + taches.size());
            System.out.println("-".repeat(60) + "\n");


            System.out.print("Entrez votre choix : ");
            choix = scanner.nextLine();

            if(choix.equals("1")){
                System.out.print("Entrez la tâche à ajouter : ");
                choix = scanner.nextLine();
    
                taches.add(choix);
                isDone.add(false);
                System.out.println("Tâche ajoutée : " + choix);
            }
            else if(choix.equals("2")){
                System.out.print("Entrez le numéro de la tâche à marquer comme terminée : ");
                choix = scanner.nextLine();
                isDone.set(Integer.parseInt(choix),true);
                System.out.println("Tâche terminée : " + taches.get(Integer.parseInt(choix)));
            }
            else if(choix.equals("3")){
               afficherTaches(taches, isDone);
            }
            else if(choix.equals("4")){
                afficherTaches(taches, isDone);
                System.out.println("\nMerci d'avoir utilisé le gestionnaire de tâches!");
                break;
             }
            scanner.nextLine();


            System.out.println("\n" + "-".repeat(60) + "\n");

        }
    }
    public static void afficherTaches(ArrayList<String> taches, ArrayList<Boolean> isDone){
        System.out.println("\n\nTâches : \n");
        for(int i = 0; i < taches.size(); i++){
            System.out.printf("%d.%s %s\n",i ,taches.get(i) , isDone.get(i) ? " (Complété)" : " (Non complété)");
        }
    }
}
