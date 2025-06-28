package solution_exo.serie1;
import java.util.ArrayList;
import java.util.Collections;

public class Exo051 {

    public static void main(String[] args) {
        // Créer un ArrayList d'entiers avec des valeurs non triées
        ArrayList<Integer> nombres = new ArrayList<>();
        nombres.add(50);
        nombres.add(30);
        nombres.add(20);
        nombres.add(40);
        nombres.add(10);
        
        // Afficher l'ArrayList avant le tri
        System.out.println("ArrayList avant le tri : " + nombres);
        
        // Trier l'ArrayList dans l'ordre croissant
        Collections.sort(nombres);
        
        // Afficher l'ArrayList après le tri
        System.out.println("ArrayList après le tri : " + nombres);
    }
}

