package solution_exo.serie1;
// Niveau : 6 ⭐

// **Exercice** :  

// - Supprimer les doublons du tableau suivant en supposant que vous ne savez pas d'avance les valeur dans le tableau: `[5,1,2,2,1,4,5,6,6,7,8]`.
// - Affichez le nouveau tableau
// **Exemple de sortie attendue** :
// ```
// [5,1,2,4,6,7,8]
// ```
public class Exo013v2 {
    public static void main(String[] args) {
        int[] tableau = new int[100000];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 100000);
        }

        afficherTableau(tableau);
        
        int[] tableauSansDoublon = new int[tableau.length];
        int nbDoublons = 0;
        boolean isUnique = true;
        int k = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < i; j++) {
                if(tableau[i] == tableau[j]){
                    nbDoublons += 1;
                    isUnique = false;
                    break;
                }
            }

            if(!isUnique){
                isUnique = true;
                continue;
            }
            tableauSansDoublon[k] = tableau[i];
            k++;
        }
        int[] goodSize = new int[tableau.length - nbDoublons];
        for (int i = 0; i < goodSize.length; i++) {
            goodSize[i] = tableauSansDoublon[i];
        }

        afficherTableau(goodSize);
    }
    public static void afficherTableau(int[] tableau){
        System.out.print("[");
        for(int i = 0; i < tableau.length-1; i++){
            System.out.print(tableau[i] + ",");
        }
        System.out.print(tableau[tableau.length-1]);

        System.out.println("]");
    } 
}
