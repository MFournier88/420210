package solution_exo.serie1;
// # Exo_18

// Niveau : 4 ⭐

// Compter combien de fois un élément apparaît dans un tableau.

// **Exercice** :  
// - Créez un tableau de 10000 nombre aléatoire.
// - Sachant que les chiffres sont entre 0 et 10 inclusivement, comptez le nombre d'occurence de chaque chiffre.

// **Exemple de sortie attendue** :
// ```
// [5,1,2,2,1,4,5,6,6,7,8]
// 1 : 2
// 2 : 2
// 3 : 0
// 4 : 1
// 5 : 2
// 6 : 2
// 7 : 1
// 8 : 1
// 9 : 0
// 10 : 0
// ```
// ---

public class Exo018 {
    public static void main(String[] args) {

        int[] tableau = new int[10000];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 11);
        }

        int[] occurence = new int[11];
        
        for(int i = 0; i < tableau.length; i++){
            occurence[tableau[i]] += 1;
        }

        for(int i = 0; i < occurence.length; i++){

            System.out.printf("%d : %d\n", i , occurence[i]);
            
        }

    }
}
