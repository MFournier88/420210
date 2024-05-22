package examen2;

import java.util.ArrayList;
import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        String choix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez vos mots : ");
        String mots = "";
        int[] tableau = new int[26];
        String[] currentTest = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> nextTest = new ArrayList<>();
        while(true) {
            choix = scan.next();
            if (choix.equals("F10")) {
                break;
            }
            mots += choix;
        }
        System.out.print("Il manque : ");
        for(String lettre: currentTest){
            if(mots.contains(lettre)){
                continue;
            }
            nextTest.add(lettre);
        }
        for(int i =0 ; i < nextTest.size()-1;i++){
            System.out.print(nextTest.get(i) + ", ");
        }
        if(nextTest.size()>0){
            System.out.print(nextTest.get(nextTest.size()-1));

        }




    }


}
