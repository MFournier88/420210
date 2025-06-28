package solution_exo.serie1;
public class Exo030 {

    // Méthode pour supprimer tous les espaces d'une chaîne
    public static String supprimerEspaces(String chaine) {
        // Utilisation de la méthode replaceAll pour supprimer tous les espaces
        return chaine.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        String chaine = "Hello World";
        
        // Appel de la méthode pour supprimer les espaces
        String chaineSansEspaces = supprimerEspaces(chaine);
        System.out.println("La chaîne sans espaces est : " + chaineSansEspaces);
    }
}
