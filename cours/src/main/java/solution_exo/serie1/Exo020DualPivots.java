package solution_exo.serie1;
import java.util.Arrays;
import java.util.Random;
public class Exo020DualPivots{
    public static void main(String args[]){
        Random rand = new Random(1);
        int[] tableau = new int[10000];
        // int[] tableau = {110,100,0};
        for (int i = 0; i < tableau.length ; i++){
            tableau[i] = rand.nextInt(65536);
            // tableau[i] = (int)(Math.random()*65536) + 1;
            // tableau[i] = 2;

        }
        // tableau[0] = 3;
        // afficheTableau(tableau);
        int[] tableau2 = Arrays.copyOf(tableau, tableau.length);
        int[] tableau3 = Arrays.copyOf(tableau, tableau.length);


        // afficheTableau(tableau);
        long debut = System.nanoTime();
        quickSort(tableau, 0, tableau.length - 1);
        long fin = System.nanoTime();

        long debutV2 = System.nanoTime();
        quickSortV1(tableau2, 0, tableau.length - 1);
        long finV2 = System.nanoTime();
        // afficheTableau(tableau2);

        long debutV3 = System.nanoTime();
        GFG.dualPivotQuickSort(tableau3, 0, tableau.length - 1);
        long finV3 = System.nanoTime();
        
        System.out.println((fin - debut) + " nanoSecondes");
        System.out.println((finV2 - debutV2) + " nanoSecondes");
        System.out.println((finV3 - debutV3) + " nanoSecondes");

        if(checkIfSorted(tableau2)){
            System.out.println("Wouhou!");
        }
        else{
            System.err.println("Erreur");
        }
        // if(checkIfSorted(tableau3)){
        //     System.out.println("Wouhou!");
        // }

      

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
 
    public static void quickSortV1(int[] tableau, int start, int end){

        int nb = end - start;

        if (nb < 1) {
            return;
        }


        int mem = 0;
        if(end - start > 10){
            
            int togPivot = (end-start) / 2 + start;
            mem = tableau[togPivot];
            tableau[togPivot] = tableau[end];
            tableau[end] = mem;
            togPivot--;
            mem = tableau[togPivot];
            tableau[togPivot] = tableau[start];
            tableau[start] = mem;
        }
        
        if(tableau[start] > tableau[end]){
            mem = tableau[end];
            tableau[end] = tableau[start];
            tableau[start] = mem;
        }
        if(nb < 3){
            if(nb == 2){
                if(tableau[start + 1] > tableau[end]){
                    mem = tableau[end];
                    tableau[end] = tableau[start + 1];
                    tableau[start + 1] = mem;
                    return;
                }
                if(tableau[start + 1] < tableau[start]){
                    mem = tableau[start];
                    tableau[start] = tableau[start + 1];
                    tableau[start + 1] = mem;
                    return;
                }
            }
            return;
        }
    
        

        int nbDoublon1 = 0;
        int nbDoublon2 = 0;
        int indiceStart = start;
        int indiceMid = start+1;
        int indiceFin = end;
       
        while(indiceMid != indiceFin){
            if(tableau[indiceFin - 1] > tableau[indiceFin]){
                mem = tableau[indiceFin];
                tableau[indiceFin + nbDoublon2] = tableau[indiceFin - 1];
                tableau[indiceFin - 1] = mem;
                indiceFin--;
            }
            else if(tableau[indiceFin - 1] == tableau[indiceFin]){
                nbDoublon2++;
                indiceFin--;
            }
            else if(tableau[indiceFin - 1] > tableau[indiceStart]){
                mem = tableau[indiceFin - 1];
                tableau[indiceFin - 1] = tableau[indiceMid];
                tableau[indiceMid] = mem;
                indiceMid++;
            }
            else if(tableau[indiceFin - 1] == tableau[indiceStart]){
                mem = tableau[indiceFin - 1];
                tableau[indiceFin - 1] = tableau[indiceMid];
                tableau[indiceMid] = tableau[indiceStart + nbDoublon1 + 1];
                tableau[indiceStart + nbDoublon1 + 1] = mem;
                
                nbDoublon1++;
                indiceMid++;
            }
            else{
                mem = tableau[indiceFin - 1];
                tableau[indiceFin - 1] = tableau[indiceMid];
                tableau[indiceMid] = tableau[indiceStart + nbDoublon1 + 1];
                tableau[indiceStart + nbDoublon1 + 1] = tableau[indiceStart];
                tableau[indiceStart] = mem;
                indiceStart++;
                indiceMid++;
            }
        }
        
       
        quickSortV1(tableau, start, indiceStart-1);
        quickSortV1(tableau, indiceStart + nbDoublon1 + 1, indiceFin-1);
        quickSortV1(tableau, indiceFin + nbDoublon2 + 1, end);
        

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
    public static boolean checkIfSorted(int[] tableau){
        // int somme = 0;
        for(int i = 0; i < tableau.length - 1; i++){
            if(tableau[i] > tableau[i+1]){
                // System.out.println("Nooooo " + i);
                // somme++;
                return false;

            }
        }
        // System.out.println(somme);
        return true;
    }
}

// Solution de : https://www.geeksforgeeks.org/dual-pivot-quicksort/
class GFG{

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void dualPivotQuickSort(int[] arr, 
                                   int low, int high)
    {
        if (low < high)
        {
            
            // piv[] stores left pivot and right pivot.
            // piv[0] means left pivot and
            // piv[1] means right pivot
            int[] piv;
            piv = partition(arr, low, high);
            
            dualPivotQuickSort(arr, low, piv[0] - 1);
            dualPivotQuickSort(arr, piv[0] + 1, piv[1] - 1);
            dualPivotQuickSort(arr, piv[1] + 1, high);
        }
    }
    
    static int[] partition(int[] arr, int low, int high)
    {
        if (arr[low] > arr[high])
            swap(arr, low, high);
            
        // p is the left pivot, and q 
        // is the right pivot.
        int j = low + 1;
        int g = high - 1, k = low + 1,
            p = arr[low], q = arr[high];
            
        while (k <= g) 
        {
            
            // If elements are less than the left pivot
            if (arr[k] < p)
            {
                swap(arr, k, j);
                j++;
            }
            
            // If elements are greater than or equal
            // to the right pivot
            else if (arr[k] >= q) 
            {
                while (arr[g] > q && k < g)
                    g--;
                    
                swap(arr, k, g);
                g--;
                
                if (arr[k] < p)
                {
                    swap(arr, k, j);
                    j++;
                }
            }
            k++;
        }
        j--;
        g++;
        
        // Bring pivots to their appropriate positions.
        swap(arr, low, j);
        swap(arr, high, g);
    
        // Returning the indices of the pivots
        // because we cannot return two elements
        // from a function, we do that using an array.
        return new int[] { j, g };
    }
}
    