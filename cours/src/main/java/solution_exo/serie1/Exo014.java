package solution_exo.serie1;
// Niveau : 3 ⭐

// **Exercice** :  

// Fusionner deux tableaux dans un seul tableau.
 
// - Créez deux tableaux : un tableau d'entiers `[1, 2, 3]` et un autre `[4, 5, 6]`.
// - Fusionnez ces deux tableaux pour créer un tableau unique et affichez le résultat.

// **Exemple de sortie attendue** :
// ```
// Tableau fusionné : [1, 2, 3, 4, 5, 6]
// ```
public class Exo014 {
    public static void main(String[] args) {
        int[] tab1 = {1 , 2 , 3};
        int[] tab2 = {4 , 5 , 6};

        int[] tab3 = new int[tab1.length + tab2.length];

        for(int i = 0 ; i < tab1.length ; i++){
            tab3[i] = tab1[i];
        }
        for(int i = 0 ; i < tab1.length ; i++){
            tab3[i + tab1.length] = tab2[i];
        }
        
        afficherTableau(tab3);

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
