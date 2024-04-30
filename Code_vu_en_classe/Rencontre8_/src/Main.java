import java.util.Scanner;

public class Main {

    final String[] VILLES = {"Ottawa", "Paris", "Berne", "Washington", "Berlin", "Madrid", "Mexico"};

    public static void main(String[] args) {
        /**
         * Exercices de révision
         */

        // Les types primitifs et les opérateurs

        // Les envloppeurs (wrappers)
        Wrappers.convertir();

        // La classe String
        ClassString.comparaisonChaines();
        ClassString.methodesChaines();

        // Affichage
        Affichage.afficherAvecFormat();

        // Représentation graphique d’un objet
        // Les instructions de contrôle
        //InstructionControle.exo2();
        //InstructionControle.exo3();
        //InstructionControle.convertirNote(13);
        // Boucles
        //Boucles.boucleAvecObjets();
        // Conversion de types

        // Types énumérés (Enum)
        // Tableaux
        Tableaux.declarationInitialisation();
        // Introduction à la notion d’objet et classe
        // Les classes et les objets



        System.out.println(genererNombreAleatoire(7));
    }

    private static int genererNombreAleatoire(int maxRange) {
        double aleat_num = Math.random() * 10;

        return (int) aleat_num % maxRange;
    }

    private static int[] choisirDeuxVilles() {
        return new int[] {genererNombreAleatoire(7), genererNombreAleatoire(7)};
    }

    private static void devinerVilles() {
        int[] villesAdeviner = choisirDeuxVilles();
        Scanner sc = new Scanner(System.in);
        boolean estDevine = false;
        int countTentatives = 0;

        while (countTentatives < 0 && !estDevine) {
            int choix1 = sc.nextInt();

            countTentatives++;
        }
    }

    /**
     * Calcule la moyenne des trois notes de l'etudiant.
     * @param notesSur100 un tableau contenant les notes d’un étudiant
     * @return la moyenne des notes de l'etudiant.
     */
    private double calculerMoyenne(double[] notesSur100) {
        double somme = 0;
        for (double note : notesSur100) {
            somme = somme + note;
        }
        return (somme / 3);
    }
}