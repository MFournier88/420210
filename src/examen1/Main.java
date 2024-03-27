package examen1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Examen[] gr1 = {new Examen("Mathieu", (byte)99), new Examen("Mathias", (byte)49)};
        for(Examen val : gr1){
            val.afficheResultat();
        }
        exo1();

    }
    public static void exo1(){
        Random rand = new Random();
        //Demande à l'utilisateur d'entrer un niveau de difficulté entre 1 et 10 000. Utilisez les plus petites variables possibles.
        Scanner scan = new Scanner(System.in);
        System.out.print("Choisissez un niveau de difficulté entre 1 et 10 000 : ");
        short diff = scan.nextShort();
        // Le niveau de difficulté est arrondi à la centaine supérieure => si utilisateur
        // u: 4 diff = 100
        //u: 56 diff = 100
        //u : 560 diff = 600

        short nivDiff = (short) (((diff - 1) / 100 * 100) + 100);
        short choix;
        short goodAnswer = (short) (rand.nextInt(nivDiff) + 1);
        boolean trouve = false;
        String msg;
        System.out.println(goodAnswer);
        System.out.println("Vous devrez trouver un nombre entre 1 et " + nivDiff);
        //10 essaie maximum
        for(int i = 0; i < 10; i++){
            System.out.print("Entrez un nombre entre 1 et " + nivDiff + " : ");
            choix = scan.nextShort();
            if(choix == goodAnswer){
                trouve = true;
                System.out.println("Bravo vous avez trouvé la réponse qui était " + goodAnswer + " en " + (i+1) + " essaies");
                break;
            }
            msg = (choix > goodAnswer) ? "plus petite que " + choix : "plus grande que " + choix;
            System.out.println("Mauvaise réponse.\nLa bonne réponse est " + msg + "\n");
        }
        if(!trouve){
            System.out.println("Meilleure chance la prochaine fois vous avez épuisé vos 10 essaies. La bonne réponse était : " + goodAnswer);
        }

    }
}
