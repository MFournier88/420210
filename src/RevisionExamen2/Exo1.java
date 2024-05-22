package RevisionExamen2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Exo1 {
    public static void main(String[] args) {
        String[] possibilites = {"A", "a", "C", "c", "E", "e", "G", "g", "H", "h", "K", "k", "M", "m"};
        String[] choix = new String[6];
        Random rand = new Random();
        for(int i = 0; i < 6; i++){
            choix[i] = possibilites[rand.nextInt(possibilites.length)];
        }
        Arrays.sort(choix,Collections.reverseOrder());

        for(String c : choix){
            System.out.print(c + " ");
        }
        National volNat = new National(14,"Charteur",45,0.05F, new Billet(12,"Marc",1000D,true));
        International volInter = new International(14,"Charteur",45,0.05F,"Papouasie",0.08F, new Billet(12,"Marc",1000D,true));
        System.out.println(volNat.prixReelBillet());
        System.out.println(volInter.prixReelBillet());
    }
}
