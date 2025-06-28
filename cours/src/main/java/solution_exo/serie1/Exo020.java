package solution_exo.serie1;
public class Exo020{
    public static void main(String args[]){
        int[] tableau = new int[10000];
        for (int i = 0; i < tableau.length ; i++){
            tableau[i] = (int)(Math.random()*65536) + 1;
        }
        // afficheTableau(tableau);
        quickSort(tableau, 0, tableau.length - 1);
        afficheTableau(tableau);

    }
    public static void quickSort(int[] tableau, int start, int end){
        int indicePivot = end;
        int mem = 0;
        for(int i = end - 1 ; i >= start ; i--){
            if(tableau[i] > tableau[indicePivot]){
                mem = tableau[i];
                tableau[i] = tableau[indicePivot - 1];
                tableau[indicePivot - 1] = tableau[indicePivot];
                tableau[indicePivot] = mem;
                indicePivot--;
            }
        }
        if(indicePivot > 1){
            quickSort(tableau, start, indicePivot-1);
        }
        if(indicePivot + 1<end){
            quickSort(tableau, indicePivot+1, end);
        }

    }
    public static void afficheTableau(int[] tableau){
        System.out.print("[");

        for (int i = 0; i < tableau.length - 1; i++){
            System.out.print(tableau[i] + ",");
        }
        if(tableau.length > 0){
            System.out.print(tableau[tableau.length-1]);
        }
        System.out.print("]\n");
    }
}