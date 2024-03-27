package PreExam1.R6;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre une phrase : ");

        String phrase = scan.nextLine();

        int compteur = 0;
        char lettre;
        String voyelles = "aeiouy";
        for(int i = 0 ; i < phrase.length(); i++){
            lettre = phrase.toLowerCase().charAt(i);
            if(voyelles.indexOf(lettre) != -1){
                compteur++;
            }
        }
        System.out.println("Contient " + compteur + " voyelles");
    }
}
