package solution_exo.serie1;
public class Exo037 {

    // Méthode pour comparer deux chaînes sans tenir compte de la casse
    public static void comparerChaines(String chaine1, String chaine2) {
        // Utilisation de la méthode equalsIgnoreCase pour comparer les chaînes
        if (chaine1.equalsIgnoreCase(chaine2)) {
            System.out.println("Les chaînes sont égales (en ignorant la casse).");
        } else {
            System.out.println("Les chaînes ne sont pas égales.");
        }
    }

    public static void main(String[] args) {
        // Chaînes de caractères à comparer
        String chaine1 = "Hello";
        String chaine2 = "hello";
        
        // Appeler la méthode pour comparer les chaînes
        comparerChaines(chaine1, chaine2);
    }
}
