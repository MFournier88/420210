package solution_exo.serie1;
// Trouver la valeur maximale et minimale d'un tableau.
 
// - Créez un tableau d'entiers de taille 5. Remplissez le de 5 nombres aléatoires entre 0 et 100. 
// - Affichez le
// - Trouvez le maximum et le minimum du tableau, puis affichez-les.

// **Exemple de sortie attendue** :
// ```
// [45,30,56,77,34]
// Le maximum est : 77
// Le minimum est : 30
// ```

public class Exo010 {
    public static void main(String[] args) {
        int[] tableau = new int[5];
    
        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
        }
    
        int min = tableau[0];
        int max = tableau[0];
        
        System.out.print("[");
        for(int i = 0; i < tableau.length-1; i++){
            System.out.print(tableau[i] + ",");
            if(min > tableau[i]){
                min = tableau[i];
            }
            if(max < tableau[i]){
                max = tableau[i];
            }
        }
        System.out.print(tableau[tableau.length-1]);
        System.out.println("]");
        
        System.out.println("Le maximum est : " + max);
        System.out.println("Le minimum est : " + min);
    }
}
