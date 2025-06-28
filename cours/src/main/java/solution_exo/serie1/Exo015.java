package solution_exo.serie1;
// # Exo_15

// Niveau : 3 ⭐

// **Exercice** :  

// - Créez un tableau d'entiers de taille 10. Remplissez le de 10 nombres aléatoires entre 0 et 100. 
// - Affichez le
// - Affichez le nombre de nombres pairs dans le
// tableau.

// **Exemple de sortie attendue** :
// ```
// [5,1,2,2,1,4,5,6,6,7]
// Il y a 5 nombres pairs dans ce tableau
// ```

public class Exo015 {
    public static void main(String[] args) {
        int[] tableau = new int[10];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
        }

        afficherTableau(tableau);
        
        int nbPair = 0;
        for(int i = 0; i < tableau.length; i++){
            if(tableau[i] % 2 == 0){
                nbPair += 1;
            }
        }

        System.out.printf("Il y a %d nombres pairs dans ce tableau\n" , nbPair);

    
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
