package solution_exo.serie1;
import java.util.ArrayList;
import java.util.Scanner;
// Exo_50
// Niveau : 3 ⭐

// Exercice :

// Supprimer un élément d'un ArrayList

// Créez un ArrayList d'entiers avec les valeurs suivantes : [1, 2, 3, 4, 5].
// Demandez à l'utilisateur de saisir un nombre à supprimer.
// Supprimez ce nombre de l'ArrayList et affichez l'ArrayList après suppression.
// Exemple de sortie attendue :

// Entrez un nombre à supprimer : 3
// ArrayList après suppression : [1, 2, 4, 5]
public class Exo050 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre à supprimer : ");
        String nombre = scanner.next();
  
        liste.remove(Integer.parseInt(nombre));
        for(int i = 0 ; i < liste.size() ; i++){
            if(liste.get(i) == Integer.parseInt(nombre)){
                liste.remove(i);
            }
        }
        System.out.println(liste);
    }
    
}
