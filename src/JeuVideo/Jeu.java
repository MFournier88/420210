package JeuVideo;

import java.util.Scanner;

public class Jeu {


    public static void main(String[] args) {
        PNJ[] boss = {new PNJ("Bowser",(short)40,new Dague((short)40),(short)400),
                new PNJ("Ganondorf",(short)500,new Epee((short)400),(short)5000),
                new PNJ("Malenia",(short)1000,new Arc((short)6000),(short)10000)
        };
        Arme[] armes = {
                new Arc((short)60),
                new Epee((short)80),
                new Masse((short)200),
                new Dague((short)20),
                new Arbalete((short)80)
        };
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
        System.out.println("Vous avez choisi l'arme : " + arme);

        //niveau 1 // pdv 200
        Hero perso = new Hero("Saitama",(short)1,arme,(short)200,0);

        battreBoss(perso,boss[0]);

        //50xp

    }
    public static void battreBoss(Hero perso,Personnage boss){
        while(true) {
            while (perso.getPdv() != 0 && boss.getPdv() != 0) {
                perso.attaquer(boss);
                if (boss.getPdv() != 0) {
                    boss.attaquer(perso);
                }
            }
            System.out.println(perso + " vs " + boss);

            if (perso.getPdv() == 0) {
                perso.setXp(perso.getXp() + boss.getNiveau() * 2);
//                System.out.println("Je gagne : " + boss.getNiveau() * 2);
//                System.out.println("J'ai maintenant : " + perso.getXp());
            } else {
                perso.setXp(boss.getNiveau() * 8);
                break;
            }
            boss.setPdv((short) (10 * boss.getNiveau()));
            perso.setPdv((short) (180 + 20 * perso.getNiveau()));
        }
    }

}

