package solution_exo.examen1.formatif;

import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListV2 {
    public static void main(String[] args) {
        ArrayList<String> taches = new ArrayList<>();
        ArrayList<Boolean> isDone = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String choix;
        while(true){
            System.out.println();
            System.out.println("-".repeat(60));
            System.out.println("\nMenu : ");
            System.out.println("1.Ajouter une tâche");
            System.out.println("2.Marquer une tâche comme terminée");
            System.out.println("3.Afficher les tâches");
            System.out.println("4.Terminer le programme");
            System.out.println(repeat("-",40));
            System.out.println("Nombre de tâche : " + taches.size());
            System.out.println("-".repeat(60) + "\n");
            
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextLine();

            if(choix.equals("1")){
                System.out.print("Entrez la tâche à ajouter : ");
                choix = scanner.nextLine();
                taches.add(choix);
                isDone.add(false);
                System.out.printf("Tâche ajoutée : %s\n", choix);
            }
            else if(choix.equals("2")){
                System.out.print("Entrez le numéro de la tâche à marquer comme terminée : ");
                choix = scanner.nextLine();
                isDone.set(Integer.parseInt(choix) - 1 , true);
                System.out.printf("Tâche terminée : %s\n", taches.get(Integer.parseInt(choix) - 1));
            }   
            else if(choix.equals("3")){
                afficheTableau(taches, isDone);
            }
            else if(choix.equals("4")){
                afficheTableau(taches, isDone);
                
                System.out.println("Merci d'avoir utilisé le gestionnaire de tâches! ");
                break;
            }
            scanner.nextLine();


        }
    }
    public static void afficheTableau(ArrayList<String> taches, ArrayList<Boolean> isDone){
        String statut;
        for(int i = 0 ; i < taches.size() ; i++){
            statut = isDone.get(i) ? "Terminée" : "Non Terminée";
            System.out.printf("%d.%s (%s)\n",i+1 , taches.get(i), statut);
        }
    }
    public static String repeat(String mot, int nombreRepetition){
        String somme = "";
        for(int i = 0 ; i < nombreRepetition ; i++){
            somme = somme.concat(mot);
        }
        return somme;
    }
}
