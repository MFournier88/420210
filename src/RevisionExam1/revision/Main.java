package RevisionExam1.revision;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] villes = {"Ottawa", "Paris", "Berne", "Washington", "Berlin", "Madrid", "Mexico"};
        Random rand = new Random(1);
        int choix1;
        int choix2;
        choix1 = rand.nextInt(villes.length);
        do{
            choix2 = rand.nextInt(villes.length);
        }while(choix1 == choix2);


        System.out.println(choix1);
        System.out.println(choix2);

        boolean c1Trouve = false;
        boolean c2Trouve = false;
        byte erreur = 2;
        while(erreur > 0){
            System.out.println("Tu as encore droit à " + erreur + " erreurs pour trouver les 2 villes");

            System.out.print("Sélectionne une ville : ");
            String choix = scan.next();
            if(choix1 == Integer.valueOf(choix) ){
                System.out.println("Bravo tu as trouvé une des villes");
                c1Trouve = true;
            }
            if(choix2 == Integer.valueOf(choix)){
                System.out.println("Bravo tu as trouvé une des villes");
                c2Trouve = true;
            }

            if(choix1 != Integer.valueOf(choix) && choix2 != Integer.valueOf(choix)){
                System.out.println("Échec");
                erreur--;
            }

            if(c1Trouve && c2Trouve){
                System.out.println("PArtie terminé tu as gagné");
                break;
            }
        }

    }
}
