package solution_exo.serie1;
// Niveau : 6 ⭐

// **Exercice** :  

// - Supprimer les doublons du tableau suivant en supposant que vous ne savez pas d'avance les valeur dans le tableau: `[5,1,2,2,1,4,5,6,6,7,8]`.
// - Affichez le nouveau tableau
// **Exemple de sortie attendue** :
// ```
// [5,1,2,4,6,7,8]
// ```
public class Exo013v3 {
    public static void main(String[] args) {
        int[] tableau = new int[10000];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 1000);
        }

        afficherTableau(tableau);
        
        quickSort(tableau, 0, tableau.length-1);

        afficherTableau(tableau);

        int nbDoublons = 0;
        for(int i = 1 ; i < tableau.length; i++){
            if(tableau[i] == tableau[i-1]){
                nbDoublons += 1;
            }
        }
        int[] tableauSansDoublon = new int[tableau.length - nbDoublons];

        tableauSansDoublon[0] = tableau[0];
        int k = 1;
        for(int i = 1; i < tableau.length; i++){
            if(tableau[i] != tableau[i-1]){
                tableauSansDoublon[k] = tableau[i];
                k += 1;
            }
        }
        tableau = tableauSansDoublon;
        afficherTableau(tableau);

    }
    public static void afficherTableau(int[] tableau){
        System.out.print("[");
        for(int i = 0; i < tableau.length-1; i++){
            System.out.print(tableau[i] + ",");
        }
        System.out.print(tableau[tableau.length-1]);

        System.out.println("]");
    }
    public static void quickSort(int[] tableau, int start, int end){
        int indicePivot = end;
        int mem = 0;
        for(int i = end - 1 ; i >= start ; i--){
            if(tableau[i] < tableau[indicePivot]){
                ;
            }
            else{
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
}
