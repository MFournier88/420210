package solution_exo.examen1;

import java.util.ArrayList;
import java.util.Scanner;

// Général      /6 
// Menu         /6
// c1           /6
// c2           /6
// c3           /6
public class Q2Examen2 {
    public static void main(String[] args) {
        ArrayList<String> noms = new ArrayList<String>();
        ArrayList<Integer> notes = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String choix;
        String nom;
        String note;
        String noteFormat;
        String moyenneFormat;
        while(true){
            System.out.println("Menu :");
            System.out.println("1. Ajouter le résultat d'un étudiant");
            System.out.println("2. Afficher la liste des résultats");
            System.out.println("3. Terminer le programme");
            System.out.println("------------------------------------");
            System.out.println("Moyenne du groupe : " + moyenne(notes));
            System.out.println("-------------------------------------------------------------------------------------------- ");
            System.out.println(); 

            System.out.print("Entrez votre choix : ");
            choix = scanner.nextLine();

            if(choix.equals("1")){
                System.out.print("Entrez le nom complet de l'étudiant : ");
                nom = scanner.nextLine();
                noms.add(nom);
                System.out.print("Entrez la note de cet étudiant : ");
                note = scanner.nextLine();
                notes.add(Integer.parseInt(note));

                System.out.println("Résultat pour " + nom + " : " + note + " ajouté\n");
            }
            else if(choix.equals("2")){
                System.out.println("Liste :");
                for(int i = 0 ; i < noms.size() ; i++){
                    noteFormat= String.format("%d",notes.get(i));
                    System.out.printf("%-30s %s",noms.get(i), noteFormat);
                    System.out.println(noms.get(i) + " ".repeat(35 - noms.get(i).length() - noteFormat.length()) + noteFormat);
                }
                System.out.println("------------------------------------");
                
                moyenneFormat = String.format("%s", moyenne(notes));
                // System.out.printf("%-30s %d", "Moyenne", moyenneFormat);
                System.out.println("Moyenne :" + " ".repeat(35 - 9 - moyenneFormat.length()) + moyenneFormat);
                System.out.println("--------------------------------------------------------------------------------------------\n");

            }
            else if(choix.equals("3")){
                System.out.println("\nAurevoir!");
                break;
            }
        }
    }
    public static int moyenne(ArrayList<Integer> notes){
        int somme = 0;
        for(int i = 0; i < notes.size() ; i++){
            somme += notes.get(i);
        }
        if(somme ==0){
            return 0;
        }
        return somme / notes.size();
    }
}
