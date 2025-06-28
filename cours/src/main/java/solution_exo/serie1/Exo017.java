package solution_exo.serie1;
// # Exo_17

// Niveau : 3 ⭐

// **Exercice** :

// Compter combien de voyelles (`a, e, i, o, u, y`) il y a dans un tableau de caractères.

// - Créez un tableau de caractères : `['a', 'b', 'e', 'f', 'i', 'o', 'u', 'p']`.
// - Utilisez une boucle pour compter combien de voyelles il y a dans le tableau et affichez le résultat.

// **Exemple de sortie attendue** :
// ```
// Il y a 5 voyelles dans le tableau.
// ```
public class Exo017 {
    public static void main(String[] args) {
        char[] tableau = {'a', 'b', 'e', 'f', 'i', 'o', 'u', 'p'};
        char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};

        int nbVoyelles = 0;
        for(int i = 0 ; i < tableau.length ; i++){
            for( int j = 0 ; j < voyelles.length ; j++){
                if(tableau[i] == voyelles[j]){
                    nbVoyelles += 1;
                    break;
                }
            }
        }

        System.out.printf("Il y a %d voyelles dans le tableau\n", nbVoyelles);
    }
}
