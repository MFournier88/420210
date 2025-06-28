package solution_exo.serie1;

// Afficher le tableau généré à la question précédente sous un format plus esthétique

// **Exemple de sortie attendue** :
// ```
// [45,30,56,77,34]
// ```
public class Exo008 {
    public static void main(String[] args) {
        int[] tableau = new int[5];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
        }

        System.out.print("[");
        for(int i = 0; i < tableau.length-1; i++){
            System.out.print(tableau[i] + ",");
        }
        System.out.print(tableau[tableau.length - 1]);

        System.out.println("]");
        
    }
}
