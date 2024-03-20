import java.util.Scanner;

public class InstructionControle {

    static void exo2() {
        String phrase;
        String mot;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez une phrase : ");
        phrase = sc.nextLine();
        System.out.println("Entrez un mot : ");
        mot = sc.nextLine();

        if(chercherMotDansPhrase(phrase, mot)){
            System.out.println("Le mot se trouve dans la phrase.");
        } else {
            System.out.println("Le mot ne se trouve pas dans la phrase!");
        }

        sc.close();
    }

    static void exo3(){
        int nombre1;
        int nombre2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un 1er nombre : ");
        if (sc.hasNextInt()) {
            nombre1 = sc.nextInt();
            System.out.print("Entrez un 2eme nombre : ");
            if (sc.hasNextInt()) {
                nombre2 = sc.nextInt();

                System.out.println("Le plus grand nombre est : " + (nombre1 > nombre2 ? nombre1 : nombre2));
                // ou en utilisant la classe Math
                System.out.println("Le plus grand nombre est : " + Math.max(nombre1, nombre2));
            }
        }
        sc.close();
    }

    public static void plusGrandNombre(){
        // exo3 version avec doubles
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisissez le premier nombre");
        double nombre1 = scan.nextDouble();

        System.out.println("Saisissez le deuxième nombre");
        double nombre2 = scan.nextDouble();

        double plusGrandNombre = Math.max(nombre1, nombre2);
        System.out.printf("Le plus grand nombre entre %.1f et %.1f est %.1f", nombre1, nombre2, plusGrandNombre);
    }

    /**
     * Rechercher si le mot est présent dans la phrase
     *
     * @param phrase la phrase à vérifier
     * @param mot    le mot à rechercher
     * @return true si le mot se trouve dans la phrase
     */
    static boolean chercherMotDansPhrase(String phrase, String mot){
        return phrase.contains(mot);
    }

    static void convertirNote(float note){
        // exo 8
        if (note < 0 || note > 20) {
            System.out.println("Note invalide!");
        } else if(note <= 9){
            System.out.println('F');
        } else if(note <= 12){
            System.out.println('D');
        } else if(note <= 15){
            System.out.println('C');
        } else if(note <= 18){
            System.out.println('B');
        } else {                    // if(note <= 20)
            System.out.println('A');
        }
    }

    ///////////////////////////////////

    public static long factorielle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier: ");

        int nombre = scanner.nextInt();
        long resultat = 1;

        for(int i = 1; i <= nombre; i++){
            resultat *= i;
        }

        /// 1 * 2* 3 * 4.....10
        return resultat;
    }

    public static void anneeBissextile(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez une année pour savoir si elle est bissextile ou pas: ");

        int annee = scanner.nextInt();
        System.out.printf(annee % 4 == 0 && annee % 100 != 0 ? "L'année %d est bissextile": "L'année %d n'est pas bissextile", annee);
    }

    public static int sommeDesNombres(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier: ");
        int nombre = scanner.nextInt();
        int somme = 0;

        for(int i = 1; i <= nombre; i++){
            somme += i;
        }
        return somme;
    }

    public static int sommeDesNombresBoucleWhile(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier: ");
        int nombre = scanner.nextInt();
        int somme = 0;

        int i = 1;

        while(i <= nombre){
            somme += i++;
        }

        return somme;
    }

    public static void tableau(){
        //déclaration de tableau sans valeur avec la longueur 5
        String [] tableau = new String[5];

        String [] fruits = {"tomate", "mangue", "pomme"};

        System.out.println(fruits[1]); // affiche mangue

        //remplace mangue par orange
        fruits[1] = "orange";

        System.out.println(fruits.length); // 3

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }

    public static void sommeNombreTableau(){
        int [] tableau = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < tableau.length; i++){
            System.out.printf("Saisissez le nombre %d %n", (i + 1) );
            int nombre = scanner.nextInt();
            tableau[i] = nombre;
        }

        //calculer la somme des éléments du tableau
        int somme = 0;
        /*for (int j = 0; j < tableau.length; j++){
            somme += tableau[j];
        }*/
        // [1, 2, 3, 4, 5]
        for(int nbr: tableau){
            somme += nbr;
        }

        System.out.println(somme);

    }

    //[1, 5, 6, 9, 4] 8
    public static int rechercherNombre(int [] tableau, int nombre){
        for(int position = 0; position < tableau.length; position++){
            if (tableau[position] == nombre){
                return position;
            }
        }

        return -1;
    }

}
