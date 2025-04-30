package solution_exo.examen1.formatif;

import java.util.ArrayList;
import java.util.Collections;
public class TrieV2 {
    public static void main(String[] args) {
        // ArrayList<Integer> liste = new ArrayList<Integer>();
        // for(int i = 0 ; i < 10 ; i++){
        //     liste.add((int)(Math.random() * 101));
        // }
        // System.out.println(liste);
        // Collections.sort(liste);
        // System.out.println(liste);
        int[] tab = new int[10];
        for(int i = 0 ; i < tab.length ; i++){
            tab[i] = (int)(Math.random() * 101);
        }
        afficheTableau(tab);

        int indiceMin = 0;
        int mem;
        for(int i = 0 ; i < tab.length ; i++){
            indiceMin = i;
            for(int j = i; j < tab.length ; j++){
                if(tab[j] < tab[indiceMin]){
                    indiceMin = j;
                }
            }
            mem = tab[i];
            tab[i] = tab[indiceMin];
            tab[indiceMin] = mem;
        }
        afficheTableau(tab);

    }
    public static void afficheTableau(int[] tab){
        System.out.print("[");
        for(int i = 0 ; i < tab.length - 1 ; i++){
            System.out.print(tab[i] + ", ");
        }
        System.out.print(tab[tab.length - 1]);
        System.out.println("]");

    }
}
