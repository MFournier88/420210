package poo;

import java.util.Arrays;

public class ExercicesRencontre4 {
    public static void afficheResult(){
        System.out.println("#############               ARRAYS             ###############");
        System.out.println("## ASSIGNATIONS ##");

        // Créez un array nommé noms qui contient les noms de 5 personnes
        String[] noms = {"Sara", "Alex", "Marc", "Olivier", "Imane"};

        // Créez un array contenant les tailles de ces 5 personnes en ordre
        float[] tailles = {175, 182.5f, 190, 188.5f, 165};

        System.out.println("## UTILISATIONS ##");

        // Afficher le nom et la taille de la 3e entrée du tableau
        System.out.println(noms[2] + " : " + tailles[2] + " cm");
        // Afficher la longueur du tableau noms

        System.out.println("## BOUCLES ##");
        // Afficher le nom et la taille de toutes les personnes dans le tableau noms.
        for(int i = 0; i < noms.length; i++) {
            System.out.println(noms[i] + " : " + tailles[i] + " cm");
        }
    }
    // Déclarer une fontion qui prend en argument un tableau de int et renvoi l'avant dernier le plus grand.
    /**
     * Renvoi le deuxieme chiffre le plus grand
     * @param tableau Tableau de chiffre dans lequel on cherche l'avant dernier plus grand
     * @return
     */
    public static int avantDernierPlusGrand(int[] tableau) {
        Arrays.sort(tableau);

        return tableau[tableau.length - 2];
    }


}