package solution_exo.serie1;
// # Exo_25

// Niveau : 2 ⭐ 

// **Exercice** :

// ```java
// // Enregistre l'alphabet en minuscule dans une variable


// // Affiche la longeur de la varibale alphabet


// // Affiche l'alphabet en majuscule



// // Trouve la position du f dans l'alphabet


// ```

// **Exemple de sortie attendue** :

// ```
// L'alphabet a 26 lettres
// ABCDEFGHIJKLMNOPQRSTUVWXYZ
// Le f est à la 6e position dans l'alphabet
// ```

public class Exo025 {
    public static void main(String[] args) {
        // Enregistre l'alphabet en minuscule dans une variable
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // Affiche la longueur de la variable alphabet
        System.out.println("L'alphabet a " + alphabet.length() + " lettres");
        
        // Affiche l'alphabet en majuscule
        System.out.println(alphabet.toUpperCase());
        
        // Trouve la position du 'f' dans l'alphabet
        // L'indice de 'f' dans l'alphabet est 5 (en partant de 0)
        int positionF = alphabet.indexOf('f') + 1; // +1 pour obtenir la position en commençant à 1
        System.out.println("Le f est à la " + positionF + "e position dans l'alphabet");
    }
}

