package solution_exo.serie1;
// - Créez un tableau d'entiers de taille 5. Remplissez le de 5 nombres aléatoires entre 0 et 100. 
// - Affichez le
// - Calculez la moyenne des éléments du tableau et affichez-la.

// **Exemple de sortie attendue** :

// ```
// [45,30,56,77,34]
// La moyenne des éléments du tableau est : 48.4
// ```
public class Exo012 {
    public static void main(String[] args) {
        int[] tableau = new int[5];
        double somme = 0;
        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
            somme += tableau[i];
        }
        
        afficherTableau(tableau);
        System.out.println("La moyenne est de : " + somme/tableau.length);
       
    
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
