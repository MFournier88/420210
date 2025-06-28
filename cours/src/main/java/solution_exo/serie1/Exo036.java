package solution_exo.serie1;
public class Exo036 {

    // Méthode pour extraire une sous-chaîne d'une chaîne donnée
    public static String extraireSousChaine(String chaine, int debut, int fin) {
        // Utilisation de la méthode substring pour extraire la sous-chaîne
        return chaine.substring(debut, fin);
    }

    public static void main(String[] args) {
        // Chaîne donnée
        String chaine = "Hello World";
        
        // Indices de début et de fin
        int debut = 0;  // Indice de début (inclus)
        int fin = 5;    // Indice de fin (exclu)
        
        // Appeler la méthode pour extraire la sous-chaîne
        String sousChaine = extraireSousChaine(chaine, debut, fin);
        
        // Afficher la sous-chaîne extraite
        System.out.println("La sous-chaîne extraite est : " + sousChaine);
    }
}

