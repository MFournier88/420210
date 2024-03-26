package Theorie;

import java.util.ArrayList;
import java.util.Collections;

public class Liste {
    public static void main(String[] args) {
        ArrayList<AnimalArray> savane = new ArrayList<AnimalArray>();
        ArrayList<String> jungle = new ArrayList<String>();

        jungle.add("lion");
        jungle.add("tigre");
        jungle.add("mouton");


        savane.add(new AnimalArray("Bob l'éponge"));
        //Afficher tous les animaux de la liste jungle


        for(String animal :  jungle){
            System.out.println(animal);
        }
        jungle.set(1,"tigresse");
        jungle.remove(1);

        jungle.add("morse");
        jungle.add("jaguar");
        jungle.add("elephant");
        jungle.add("chameau");

        jungle.remove(1);
        jungle.set(3,"giraffe");
        System.out.print("[");
        for(int i = 0; i < jungle.size();i++){

            System.out.print(jungle.get(i));
            if(i != (jungle.size())-1){
                System.out.print(", ");
            }

        }
        System.out.println("]");

        rechercheAnimal("Bob le bricoleur", jungle);
        rechercheAnimal("giraffe", jungle);

        ArrayList<String> desert = new ArrayList<String>();
        desert.add("sable");
        desert.add("pasDeau");
        desert.add("ypleutPas");

        ArrayList<String> list3 = concatListe(jungle,desert);
        for(int i = 0; i < list3.size();i++){

            System.out.print(list3.get(i));
            if(i != (list3.size())-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        Collections.sort(list3);
        for(int i = 0; i < list3.size();i++){
            System.out.print(list3.get(i));
            if(i != (list3.size())-1){
                System.out.print(", ");
            }
        }

        ArrayList<Integer> doublons = new ArrayList<Integer>();
        doublons.add(1);
        doublons.add(2);
        doublons.add(3);
        doublons.add(2);
        doublons.add(1);
        doublons.add(8);
        doublons.add(1);
        retirerDoublons(doublons);
        System.out.println();
        for(int i = 0; i < doublons.size();i++){
            System.out.print(doublons.get(i));
            if(i != (doublons.size())-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        int a =4;
        modifInt(a);
        System.out.println(a);

        int[] b = {4};
        modifInt(b);
        System.out.println(b[0]);
    }
    public static void modifInt(int a){
        a =8;
    }
    public static void modifInt(int[] b){
        b[0] =8;
    }

    public static void retirerDoublons(ArrayList<Integer> liste){
        for(int i = 0; i < liste.size(); i ++){
            for(int j = 0; j < liste.size(); j ++) {
                if (liste.get(i) == liste.get(j) && i != j) {
                    liste.remove(j);
                }
            }
        }
    }
    public static ArrayList<String> concatListe (ArrayList<String> list1, ArrayList<String> list2){
        for(String val : list2){
            list1.add(val);
        }
        return list1;
    }
    public static void rechercheAnimal(String animal, ArrayList<String> jungle){
        boolean isPresent = false;
        for(int i = 0; i < jungle.size();i++){
            if(jungle.get(i) == animal){
                System.out.println("Présent");
                isPresent = true;
                break;
            }
        }
        if(!isPresent) {
            System.out.println("Absent");
        }
    }
}