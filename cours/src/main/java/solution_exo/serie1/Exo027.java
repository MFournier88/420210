package solution_exo.serie1;
public class Exo027 {

    // Méthode pour compter le nombre de voyelles dans une chaîne
    public static int compterVoyelles(String chaine) {
        // Initialisation du compteur de voyelles
        int compteur = 0;
        
        // Convertir la chaîne en minuscule pour ne pas faire de distinction entre majuscules et minuscules
        chaine = chaine.toLowerCase();
        
        // Parcours de chaque caractère de la chaîne
        for (int i = 0; i < chaine.length(); i++) {
            char c = chaine.charAt(i);
            // Vérification si le caractère est une voyelle
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                compteur++;
            }
        }
        
        // Retourner le nombre de voyelles
        return compteur;
    }

    public static void main(String[] args) {
        String chaine = "Hello World";
        
        // Appeler la méthode et afficher le résultat
        int nombreVoyelles = compterVoyelles(chaine);
        System.out.println(chaine);
        System.out.println("Le nombre de voyelles dans la chaîne est : " + nombreVoyelles);
    }
}

