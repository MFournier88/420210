package Save;

import java.util.Scanner;

public class Jeu {

    public static void main(String[] args) {
        PNJ[] boss = {new PNJ("Bowser", (short) 40, new Dague((short) 40), (short) 400),
                new PNJ("Ganondorf", (short) 500, new Epee((short) 400), (short) 5000),
                new PNJ("Malenia", (short) 4000, new Arc((short) 6000),  40000)
        };
        Arme[] armes = {
                new Arc((short) 60),
                new Epee((short) 80),
                new Masse((short) 200),
                new Dague((short) 20),
                new Arbalete((short) 80)
        };

        PNJ[] accolytes = {
                new PNJ("Robin", (short) 30, armes[0], (short) 120),
                new PNJ("Hulk", (short) 400, armes[2], (short) 6000)
        };
        Hero perso = new Hero("Saitama", (short) 1, new Arme((short) 0), (short) 200);

        System.out.println(" Sélectionner votre arme");
        System.out.println(" 1 - Arc");
        System.out.println(" 2 - Épée");
        System.out.println(" 3 - Masse");
        System.out.println(" 4 - Dague");
        System.out.println(" 5 - Arbalète");
        System.out.print("Votre choix : ");
        Scanner scan = new Scanner(System.in);
        String choix = scan.next();
        Arme arme = new Arme((short) 0);
        if (choix.equals("1")) {
            arme = new Arc((short) 60);
        } else if (choix.equals("2")) {
            arme = new Epee((short) 80);
        } else if (choix.equals("3")) {
            arme = new Masse((short) 200);
        } else if (choix.equals("4")) {
            arme = new Dague((short) 20);
        } else if (choix.equals("5")) {
            arme = new Arbalete((short) 80);
        } else {
            System.out.println("Error stupido");
        }

        System.out.println("Vous avez choisi : " + arme);
        perso.setArme(arme);

        System.out.println("############ Les combats commencent ###############");
        combattreBoss(perso,boss[0]);
        combattreBoss(perso,boss[1]);
        combattreBoss(perso,boss[2]);


    }
    public static void combattreBoss(Hero perso, PNJ boss){
        boolean losing = true;
        int compteur = 1;
        while (losing){
            while (perso.getPdv() > 0 && boss.getPdv() > 0) {
                perso.attaquer(boss);
                if (boss.getPdv() > 0) {
                    boss.attaquer(perso);
                }
            }
            System.out.println("Combat #" + compteur);
            System.out.print(perso);
            System.out.print(" vs ");
            System.out.println(boss);
            if (perso.getPdv() == 0) {
                System.out.println("Combat perdu vous avez fait " + boss.getNiveau() * 2 + " points d'expériences");
                perso.setXp(perso.getXp() + boss.getNiveau() * 2);
            } else {
                System.out.println("Combat gagné vous avez fait " + boss.getNiveau() * 8 + " points d'expériences");
                perso.setXp(perso.getXp() + boss.getNiveau() * 8);
                losing = false;

            }
            compteur++;

            perso.setPdv((short) (180 + perso.getNiveau() * 20));
            boss.setPdv((short) (boss.getNiveau() * 10));
        }
    }
}

