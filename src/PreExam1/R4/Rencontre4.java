package PreExam1.R4;

import java.util.Arrays;

public class Rencontre4 {
    public static void main(String[] args) {
        exo2();
    }
    public static void exo2(){
        int[] tableau = new int[14];
        for(int i = 0 ; i < tableau.length; i+=2){
            tableau[i] = (int) (Math.random()*365);
            tableau[i + 1] = 365 - tableau[i];
        }
        System.out.print("[ ");
        for(int i = 0 ; i < tableau.length ; i++){
            System.out.print(tableau[i] + " ");
        }
        System.out.print(" ]");
    }
    public static void exo3(){

    }
    public static void exo4(){
        Integer [ ] tableau = {20, 39, 68, 109, 153, 178, 1810, 184, 187, 212, 256, 297, 326, 345};
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i < tableau.length ; i++){
            if(tableau[i] > maxi){
                maxi = tableau[i];
            }

            if(tableau[i] < mini){
                mini = tableau[i];
            }

        }
        System.out.println("Le plus petit est : " + mini);
        System.out.println("Le plus grand est : " + maxi);
    }
    public static void exo5(){

    }
    public static void exo6(){

    }
    public static int avantDernier(int[] tableau){
        int D = Integer.MIN_VALUE;
        int aD = Integer.MIN_VALUE;

        for(int i = 0 ; i < tableau.length; i++){
            if(tableau[i] > D){
                aD = D;
                D = tableau[i];
            }
            else if(tableau[i] > aD){
                aD = tableau[i];
            }
        }

        return aD;
    }
    public static void exercicesRencontre4(){
        // Créez un array nommé noms qui contient les noms de 5 personnes
        String[] noms = {"bob", "bob1","bob2","bobfdhgdfh3","bob4"};
        float[] tailles = {1.55F,1.65F,1.75F,1.44F,1.36F};
        System.out.println(noms[2] + " " + tailles[2]);
        System.out.println("La longueur du tableau noms est de : " + noms.length);
        for(int i = 0 ; i < noms.length; i++){
            System.out.println(noms[i] + " ".repeat(20 - noms[i].length() ) + tailles[i]);
        }
    }
    public static void exercicesArray(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars[1]);
//        cars[1] = "Toyota";
//        System.out.println(cars[1]);
//        cars = Arrays.copyOf(cars,cars.length * 2 );
//        cars[4] = "Honda";
        System.out.println("Étape 1");
        for(String voiture : cars){
            System.out.println(voiture);
            voiture = "Ferrari";
        }
        System.out.println("Étape 2");
        for(int i = 0 ; i < cars.length ;i++ ){
            System.out.println(cars[i]);
            cars[i] = "Ferrari";
        }
        System.out.println("Étape 3");

        for(String voiture : cars){
            System.out.println(voiture);
            voiture = "Ferrari";
        }

        int[][] chiffre = {{5,3,6},{3,4,2},{8,4,1}};
        System.out.println(chiffre[2][1]);

    }
    public static void exercices2R2(){
        //Comparez de 2 Strings. Par exemple la comparaison de « Toto » et « TOTO ».
        // Doit vérifier si les 2 strings sont identique sans tenir compte de la casse.
        String mot1 = "toto";
        String mot2 = "Toto";
        System.out.println(mot1.equalsIgnoreCase(mot2));

        String chiffre = "45";

        System.out.println(chiffre);
    }
    public static void exemple1(){
        String[] listeNom = {"Geatan", "Maurice","Jean", "Bernadette"};

        int[][] chiffre = {{5,3,6},{3,4,2},{8,4,1}};

        System.out.println(listeNom[2]);
        System.out.println(chiffre[1][2]);
        System.out.println(listeNom.length);

        //Jean
        //2
        //4
        for(int[] nombre : chiffre){
            for(int nombre2 : nombre){
                System.out.println(nombre2);
            }
            break;
        }
    }

    public static void exemple2(){
        System.out.println(Math.random());
        int i=0;
        while(i < 20000000) {
            if(Math.random() * 1 > 0.999999){
                System.out.println();
            }
            i++;
        }

    }
    public static void exemple3(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars = Arrays.copyOf(cars,cars.length + 1);
        cars[4] = " babouin";
        System.out.println(cars[4]);
    }
}
