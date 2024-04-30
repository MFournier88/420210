package PreExam1.R3;
import java.util.Scanner;
public class Rencontre3 {
    public static double getHypothenuse(double a, double b){
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
    public static void afficheResult(){
        System.out.println("#################             BOUCLES              ################");
        // Affiche les chiffres de 20 à 50 avec un while, avec un do while et avec un for

        int i = 20;
        while(i < 51){
            System.out.println(i);
            i++;
        }

        System.out.println("DoWhile");
        i = 20;
        do{
            System.out.println(i);
            i++;
        }while(i < 51);

        for(i=20;i<51;i++){
            System.out.println(i);
        }


        // Affiche tous les chiffres entre 20 et 50 qui ne sont pas des mutiples de 3

        for(i=20;i<51;i++){
            if( (i % 3 == 0)){
                continue;
            }
            System.out.println(i);
        }

        // Demande à un utilisateur d'entrer un chiffre entre 1 et 10. Si ce chiffre est 7 écrit bravo, sinon il redemande la question.
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.print("Entrez un chiffre de 1 à 10 : ");
            if(scanner.nextInt() == 7){
                System.out.println("Bravo");
                break;
            }
        }

    }
    public static void exo3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le nombre de boites de chocolat que vous voulez acheter:");

        int nbBoites = scanner.nextInt();

        if(nbBoites >= 5){
            System.out.println("Vous avez droit à un rabais de 10%");
        }
        else if(nbBoites >=50){
            System.out.println("Vous avez droit à un rabais de 15%");
        }
        else{
            System.out.println("Vous n'avez pas droit au rabais! Sorry not sorry :)");
        }

    }
}
