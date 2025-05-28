package solution_exo.examen1;

import java.util.ArrayList;
import java.util.Collections;
public class Q3Examen1 {  
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i = 0; i < tab.length; i++){
            tab[i] = (int) (Math.random() * 101);
        }
        afficheTableau(tab);

        int indiceMin;
        int mem;
        for(int i = 0; i < tab.length; i++){
            indiceMin = i;
            for(int j = i; j < tab.length; j++){
                if(tab[j] < tab[indiceMin]){
                    indiceMin = j;
                }
            }
            mem = tab[indiceMin];
            tab[indiceMin] = tab[i];
            tab[i] = mem;
        }
        afficheTableau(tab);
        // ArrayList<Integer> tab = new ArrayList<Integer>();
        // for(int i = 0; i < 10; i++){
        //     tab.add((int) (Math.random() * 11));
        // }
        // System.out.println(tab);
        // Collections.sort(tab);
        // System.out.println(tab);
    }   
    public static void afficheTableau(int[] tab){
        System.out.print("[");
        for(int i = 0 ; i < tab.length - 1; i++){
            System.out.print(tab[i] + ",");
        }
        System.out.println(tab[tab.length - 1] + "]");
    }
}   
