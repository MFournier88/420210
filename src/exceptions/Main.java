package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chiffre = Integer.MIN_VALUE;
        while (chiffre == Integer.MIN_VALUE) {
            try {
                System.out.print("Entrez un chiffre : ");
                chiffre = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Vous devez entrer un chiffre!");
                System.out.println("Essayez à nouveau");
                // Consume the invalid input to prevent an infinite loop
                scan.nextLine(); // Clear the buffer

            } finally {
                System.out.println("Finally");
            }
            System.out.println("After finally");
        }
    }
}
