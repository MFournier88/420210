package solution_exo.serie2;
// - Créez un tableau d'entiers de taille 5. Remplissez le de 5 nombres aléatoires entre 0 et 100. 
// - Affichez le
// - Inverser l'ordre des éléments du tableau.
// - Affichez le

// **Exemple de sortie attendue** :
// ```
// [45,30,56,77,34]
// [34,77,56,30,45]
// ```
public class Exo018 {
    public static void main(String[] args) {
        int[] tableau = new int[5];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
        }

        afficherTableau(tableau);
        
        int mem;
        for(int i = 0; i < tableau.length; i++){
            mem = tableau[i];
            tableau[i] = tableau[tableau.length - 1 - i];
            tableau[tableau.length - 1 - i] = mem;
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
