package exceptions;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        byte a = scan.nextByte();
        System.out.println(5/a);
        
        byte age;
        float taille;
        boolean estEtudiantMV;

        boolean formulaireIncomplet = true;
        while (formulaireIncomplet){
            try {
                System.out.print("Entrez votre age : ");
                age = scan.nextByte();
                if (age < 0) {
                    throw new Exception();
                }
                System.out.print("Entrez votre taille avec une virgue : ");
                taille = scan.nextFloat();
                if (taille < 0 || taille > 4) {
                    throw new Exception();
                }
                System.out.print("Entrez si oui ou non vous êtes étudiant à MV (true/false): ");
                estEtudiantMV = scan.nextBoolean();

            } catch (Exception e) {
                System.out.println("Valeur entré invalide");
                scan.nextLine();
                continue;
            }
            System.out.println("Les valeurs saisies sont : ");
            System.out.println("Age : " + age);
            System.out.println("Taille : " + taille);
            System.out.println("Étudiants : " + estEtudiantMV);
            System.out.println("Ces valeurs sont-elles correctes? (o/n)");
            String choix = scan.next();
            if(choix.compareTo("o") != 0){
                continue;
            }
            formulaireIncomplet = false;
        }
        System.out.println("Fin");

    }


}



























//
//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    int chiffre = Integer.MIN_VALUE;
//    while (chiffre == Integer.MIN_VALUE) {
//        try {
//            System.out.print("Entrez un chiffre : ");
//            chiffre = scan.nextInt();
//        } catch (Exception e) {
//            System.out.println("Vous devez entrer un chiffre!");
//            System.out.println("Essayez à nouveau");
//            // Consume the invalid input to prevent an infinite loop
//            scan.nextLine(); // Clear the buffer
//
//        } finally {
//            System.out.println("Finally");
//        }
//        System.out.println("After finally");
//    }
//}