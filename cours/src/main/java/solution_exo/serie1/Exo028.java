package solution_exo.serie1;
public class Exo028 {

    // Méthode pour inverser une chaîne de caractères
    public static String inverserChaine(String chaine) {
        String inverse = "";
        
        // Boucle qui parcourt la chaîne de la fin vers le début
        for (int i = chaine.length() - 1; i >= 0; i--) {
            inverse += chaine.charAt(i);  // Ajoute chaque caractère au début de la chaîne inversée
        }
        
        return inverse;
    }

    public static void main(String[] args) {
        String chaine = "Java";
        String resultat = inverserChaine(chaine);
        System.out.println(chaine + " inversée donne : " + resultat);
    }
}
