package solution_exo.serie1;
// # Exo_19

// Niveau : 7 ⭐

// **Exercice** :  

// - Créez un tableau d'entiers de taille 10. Remplissez le de nombres aléatoires entre 0 et 100. 

// - Affichez le

// - Trier le
//     - Le principe est de parcourir le tableau et, pour chaque position i, trouver l'élément minimum parmi les éléments restants (à partir de l'indice i jusqu'à la fin du tableau).

//     - Pour ce faire, une boucle interne compare les éléments du tableau et conserve l'indice de l'élément minimum trouvé.

//     - Ensuite, l'élément minimum est échangé avec l'élément à la position i. Cette opération est répétée pour chaque élément du tableau.
    
// - Afficher le tableau trié

// **Exemple de sortie attendue** :
// ```
// [54,23,78,4,73,88,43,22,75,77]
// [4,22,23,43,54,73,75,77,78,88]

// ```
public class Exo019 {
    public static void main(String[] args) {
        int[] tableau = new int[10];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
        }

        afficherTableau(tableau);



        int minimum;
        int indiceMin = 0;
        for(int i = 0 ; i < tableau.length ; i++){
            minimum = Integer.MAX_VALUE;
            for(int j = i ; j < tableau.length ; j++){
                if(tableau[j] < minimum){
                    minimum = tableau[j];
                    indiceMin = j;
                }
            }
            tableau[indiceMin] = tableau[i];
            tableau[i] = minimum;
        }
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
}
