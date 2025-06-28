package solution_exo.serie1;

// Ajouter la somme des élément du tableau après l'affichage de celui-ci à l'exo 8.

// **Exemple de sortie attendue** :
// ```
// [45,30,56,77,34]
// La somme des éléments du tableau : 242
// ```

public class Exo009 {
    public static void main(String[] args) {
        int[] tableau = new int[5];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
        }

        int somme = 0;

        System.out.print("[");
        for(int i = 0; i < tableau.length-1; i++){
            System.out.print(tableau[i] + ",");
            somme += tableau[i];
        }
        System.out.print(tableau[tableau.length-1]);
        
        somme += tableau[tableau.length-1];

        System.out.println("]");
        System.out.println("La somme des éléments du tableau : " + somme);
    }
}
