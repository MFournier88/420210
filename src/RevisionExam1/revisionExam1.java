package RevisionExam1;

import java.util.Scanner;

public class revisionExam1 {
    public static void main(String[] args) {
        //exo1();
        //exo2();
        //exo3();
        //exo4();
        //exo5();
        //exo6();
        //exo7();
        //exo8();
        //exo9();
        //exo10();
        //exo11();
        //exo12(new int[]{4,3,7,8,3});
        //exo13(new int[]{4,3,7,8,3});
        //exo14(new int[]{4,3,7,8,3},3);
//        for(int val : exo15(new int[]{4,3,7,8,3})){
//            System.out.print(val + " ");
//        }
        //exo16(new int[]{4,3,7,8,3},new int[]{4,3,7,8,3});
        //exo17();

    }

    /**
     * Calcul du nombre de voyelles : Écrivez un programme qui demande à
     * l'utilisateur de saisir une phrase, puis compte et affiche le nombre de voyelles dans cette phrase.
     */
    public static void exo1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Écrire une phrase : ");
        String phrase = scan.nextLine();
        String voyelles = "aeiouy";
        int count = 0;
        for(int i = 0; i < phrase.length();i++){
            if(voyelles.contains(String.valueOf(phrase.charAt(i)))){
                count++;
            }
        }
        System.out.println(count);

    }

    /**
     * Écrivez un programme qui demande à l'utilisateur de saisir une phrase, puis demande également à l'utilisateur de saisir un mot.
     * Le programme doit rechercher si le mot saisi par l'utilisateur est présent dans la phrase. Affichez ensuite un message indiquant si le mot est trouvé ou non.
     */
    public static void exo2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Écrire une phrase : ");
        String phrase = scan.nextLine();
        System.out.print("Écrire un mot : ");
        String mot = scan.nextLine();
        if(phrase.contains(mot)){
            System.out.println("Le mot est dans la phrase");
        }
        else{
            System.out.println("Le mot n'a pas été trouvé");
        }
    }

    /**
     * Comparaison de nombres : Écrivez un programme qui demande à l'utilisateur de saisir deux nombres et affiche le plus grand des deux.
     */
    public static void exo3(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Écrire deux chiffres séparé d'un espace : ");
        int chiffre1 = scan.nextInt();
        int chiffre2 = scan.nextInt();

        if(chiffre1 > chiffre2){
            System.out.println("Le chiffre le plus grand est " + chiffre1);
        }
        else{
            System.out.println("Le chiffre le plus grand est " + chiffre2);

        }
    }

    /**
     * Calcul de la note : Écrivez un programme qui demande à l'utilisateur de saisir sa note sur 20, puis affiche "Brav- !" si la note est supérieure ou égale à 10, sinon affiche "Essaie encore !".
     */
    public static void exo4(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Écrire votre note sur 20 : ");
        int note = scan.nextInt();
        String message = (note >= 10) ? "Bravo":"Réessayer";
        System.out.println(message);
    }

    /**
     * Écrivez un programme qui demande à l'utilisateur de saisir son poids, puis affiche sa catégorie de poids selon les critères suivants :
     *
     * Moins de 50 kg : "Poids plume"
     * Entre 50 kg et 70 kg : "Poids moyen"
     * Plus de 70 kg : "Poids lourd"
     */
    public static void exo5(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Écrire votre poids : ");
        int poids = scan.nextInt();
        if(poids < 50){
            System.out.println("Poids plume");
        }
        else if(poids <= 70){
            System.out.println("Poids moyen");
        }
        else{
            System.out.println("Poids lourd");
        }
    }

    /**
     * Calcul du jour de la semaine : Écrivez un programme qui demande à l'utilisateur de saisir un nombre entre 1 et 7, puis affiche le jour de la semaine correspondant (1 = Lundi, 2 = Mardi, etc.).
     * Si le nombre est en dehors de cette plage, affiche "Nombre invalide".
     */
    public static void exo6(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Saisir un nombre entre 1 et 7 inclusivement : ");
        int jour = scan.nextInt();
        switch(jour){
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;


        }
    }

    /**
     * Vérification de l'année bissextile : Écrivez un programme qui demande à l'utilisateur de saisir une année, puis affiche "Année bissextile" si l'année est divisible par 4 et non divisible par 100, ou si elle est divisible par 400. Sinon, affiche "Année non bissextile".
     */
    public static void exo7(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Saisir une année : ");
        int annee = scan.nextInt();
        if((annee%4 == 0 && !(annee%100 == 0)) || annee%400 == 0 ){
            System.out.println("C'est une année bissextile");
        }
        else{
            System.out.println("Ce n'est pas une année bissextile");
        }
    }

    /**
     * Conversion de notes : Écrivez un programme qui demande à l'utilisateur de saisir sa note sur 20, puis affiche l'équivalent en lettres selon les critères suivants :
     *
     * Note entre 0 et 9 : "F"
     * Note entre 10 et 12 : "D"
     * Note entre 13 et 15 : "C"
     * Note entre 16 et 18 : "B"
     * Note entre 19 et 20 : "A"
     */
    public static void exo8(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Saisir une note : ");
        int note = scan.nextInt();
        if(note < 0 || note > 20){
            System.out.println("Réponse impossible");
        }
        else if(note < 10){
            System.out.println("F");
        } else if (note <= 12)
        {
            System.out.println("D");
        } else if (note <= 15) {
            System.out.println("C");
        } else if (note <= 18) {
            System.out.println("B");
        }else{
            System.out.println("A");
        }
    }


    /**
     * Écrivez une fonction qui demande à l'utilisateur de saisir un nombre entier positif, puis calcule la somme de tous les nombres de 1 jusqu'à ce nombre. Affichez ensuite la somme calculée.
     * Si le nombre saisi est inférieur ou égal à 0, affichez que le nombre saisi n’est pas positif et demande à l’utilisateur de saisir un autre nombre jusqu’à ce que l’utilisateur saisisse un nombre entier positif.
     */
    public static void exo9(){
        Scanner scan = new Scanner(System.in);
        int nombre =0;
        while(nombre <= 0){
            System.out.print("Saisir un nombre : ");
            nombre = scan.nextInt();
            if(nombre <=0){
                System.out.println("Entrez un chiffre plus grand que 0");
            }
        }

        int somme = 0;
        for(int i = 0; i <= nombre; i++ ){
            somme+=i;
        }
        System.out.println(somme);
        //Pour les pros des maths il y a aussi
        System.out.println((nombre * (nombre+1))/2);
    }

    /**
     * Calcul de la puissance : Écrivez un programme qui demande à l'utilisateur de saisir deux entiers, base et exposant, et utilise une boucle pour calculer la valeur de base élevée à la puissance de l’exposant.
     */
    public static void exo10(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Saisir deux nombre : ");
        int base = scan.nextInt();
        int exposant = scan.nextInt();
        int puissance = base;
        if(exposant == 0){
            System.out.println("1");
        }
        else if(exposant < 0){
            float quotient = (float)1.0/base;
            for(int i =1; i < -1*exposant; i++){
                quotient /= base;
            }
            System.out.println(quotient);
        }else{
            for(int i =1; i < exposant; i++){
                puissance *= base;
            }
            System.out.println(puissance);
        }

    }

    /**
     * Conversion de notes en lettres : Écrivez un programme qui demande à l'utilisateur de saisir une série de notes (valeurs numériques entre 0 et 100). Dans une boucle while, vous devez continuer de demander à l’utilisateur de rentrer un nombre. À chaque fois que l’utilisateur rentre un nombre de 0 à 100, vous lui indiquer la lettre correspondante et vous affichez le message, rentrer une note de 0 à 100 ou taper « fin » pour terminer le programme. Quand l’utilisateur rentre « fin », vous devez sortir de la boucle pour terminer le programme. Si l’utilisateur rentre un chiffre qui est inférieur à 0 ou supérieur à 100, indiquer à l’utilisateur qu’il doit rentrer un chiffre compris en 0 et 100 inclusivement. Si l’utilisateur rentre un chiffre entre 0 et 100, voici les lettres correspondantes que vous devez afficher.
     *
     * Note supérieure ou égale à 90 jusqu’à 100 : A
     * Note entre 80 et 89 : B
     * Note entre 70 et 79 : C
     * Note entre 60 et 69 : D
     * Note inférieure à 60 : F
     */
    public static void exo11(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Rentrer une note de 0 à 100 ou taper « fin » pour terminer le programme");
            String mot = scan.next();
            if(mot.compareToIgnoreCase("fin")==0){
                break;
            }
            int note = Integer.parseInt(mot);
            if(note < 0 || note > 100){
                continue;
            }
            else if(note < 60){
                System.out.println("F");
            } else if (note < 70) {
                System.out.println("D");
            }else if(note < 80){
                System.out.println("C");
            } else if (note < 90) {
                System.out.println("B");
            } else if (note <= 100) {
                System.out.println("A");
            }

        }
    }

    /**
     *Écrivez une fonction qui prend un tableau en paramètre et qui retourne la somme des éléments du tableau.
     */
    public static void exo12(int[] tableau){
        int somme=0;
        for(int val : tableau){
            somme += val;
        }
        System.out.println(somme);
    }

    /**
     * Comptage des nombres pairs : Écrivez une fonction prend un tableau d’entiers en paramètre et qui retourne le nombre de nombres pairs dans le tableau.
     */
    public static void exo13(int[] tableau){
        int nb=0;
        for(int val : tableau){
            if(val%2 == 0)
                nb++;
        }
        System.out.println(nb);
    }

    /**
     * Écrivez une fonction qui prend un tableau et un entier en paramètre. La fonction retourne le nombre d’occurrence de cet entier dans le tableau
     */
    public static void exo14(int[] tableau, int entier){
        int nb=0;
        for(int val : tableau){
            if(val == entier)
                nb++;
        }
        System.out.println(nb);
    }

    /**
     * Écrivez une fonction qui prend un tableau en paramètre et qui retourne un autre tableau avec les éléments inversés dans le tableau
     *
     * Ex : [1, 4, 7, 3, 8] => [8, 3, 7, 4, 1]
     */
    public static int[] exo15(int[] tableau){
        int[] tableau2 = new int[tableau.length];
        for(int i = 0; i < tableau.length; i++){
            tableau2[i] = tableau[tableau.length - 1 - i];
        }
        return tableau2;
    }

    /**
     * Écrivez une fonction qui prend 2 tableaux d’entier en paramètre et qui retourne true si les 2 tableaux ont le même nombre d’éléments et que tous les éléments au même index sont égaux.
     */
    public static boolean exo16(int[] tab1, int[] tab2){
        if(tab1.length == tab2.length){
            for(int i = 0; i < tab1.length;i++){
                if(tab1[i] != tab2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Écrivez une fonction qui prend plusieurs nombres entiers dans une boucle while jusqu’à ce que l’utilisateur tape « fin ». Tous ces nombres entiers sont stockés dans un tableau dont la taille originale est de 10. La fonction affiche dans la console la somme de tous ces nombres entiers, la moyenne de tous ces nombres, le plus grand nombre de la liste, le plus petit nombre de la liste.
     */
    public static void exo17(){
        Scanner scan = new Scanner(System.in);
        String prochain ;
        int next;
        int[] tableau = new int[10];
        int[] plusGrandTableau;
        int index=0;
        while(true){
            System.out.println("Entrez un nombre ou entrez fin");
            prochain = scan.next();
            if(prochain.compareToIgnoreCase("fin") ==0){
                break;
            }
            else{
                next = Integer.parseInt(prochain);
                if(index == tableau.length){
                    plusGrandTableau = new int[tableau.length*2];
                    for(int i = 0; i < tableau.length;i++){
                        plusGrandTableau[i] = tableau[i];
                    }
                    tableau = plusGrandTableau;
                }
                tableau[index] = next;
                index++;
            }
        }
        for(int i = 0; i < index;i++){
            System.out.print(tableau[i] + " ");
        }
    }



}
