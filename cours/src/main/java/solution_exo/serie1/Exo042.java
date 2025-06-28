package solution_exo.serie1;
public class Exo042 {

    // Méthode pour calculer la somme des valeurs ASCII des caractères dans un tableau
    public static int sommeASCII(char[] tableau) {
        int somme = 0;

        // Parcours du tableau pour additionner les valeurs ASCII de chaque caractère
        for (char c : tableau) {
            somme += (int) c;  // Convertir chaque caractère en valeur ASCII et l'ajouter à la somme
        }

        return somme;
    }

    public static void main(String[] args) {
        // Déclaration du tableau de caractères
        char[] tableau = {'A', 'B', 'C', 'D'};
        
        // Calcul de la somme des valeurs ASCII
        int resultat = sommeASCII(tableau);
        
        // Affichage du résultat
        System.out.println("La somme des valeurs ASCII est : " + resultat);
    }
}

