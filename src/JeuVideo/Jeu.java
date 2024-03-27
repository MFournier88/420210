package JeuVideo;

import java.util.Scanner;

public class Jeu {
    PNJ[] Boss = {new PNJ("Bowser",(short)10,new Dague((short)40),(short)400),
                  new PNJ("Ganondorf",(short)500,new Epee((short)400),(short)5000),
                  new PNJ("Malenia",(short)4000,new Arc((short)6000),(short)10000)
                };
    Arme[] armes = {
            new Arc((short)60),
            new Epee((short)80),
            new Masse((short)200),
            new Dague((short)20),
            new Arbalete((short)80)
    };

    PNJ[] Accolyte = {
            new PNJ("Robin", (short)30, armes[0], (short)120),
            new PNJ("Hulk", (short)400,armes[2],(short)6000)
    };

    public static void main(String[] args) {
        System.out.println(" Sélectionner votre arme");
        System.out.println(" 1 - Arc");
        System.out.println(" 2 - Épée");
        System.out.println(" 3 - Masse");
        System.out.println(" 4 - Dague");
        System.out.println(" 5 - Arbalète");
        System.out.print("Votre choix : ");
        Scanner scan = new Scanner(System.in);
        String choix = scan.next();
        Arme arme = new Arme((short)0);
        if(choix.equals("1")){
            arme = new Arc((short)60);
        }
        else if(choix.equals("2")){
            arme = new Epee((short)80);
        }
        else if(choix.equals("3")){
            arme = new Masse((short)200);
        }
        else if(choix.equals("4")){
            arme = new Dague((short)20);
        }
        else if(choix.equals("5")){
            arme = new Arbalete((short)80);
        }
        else{
            System.out.println("Error stupido");
        }

        System.out.println(arme);
    }

}

