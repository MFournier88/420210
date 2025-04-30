package solution_exo.serie1;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Exo053 {

    public static void main(String[] args) {
        // Créer un ArrayList d'entiers avec les valeurs des notes
        ArrayList<Integer> notes = new ArrayList<>();
        notes.add(80);
        notes.add(90);
        notes.add(70);
        notes.add(85);
        notes.add(100);

        // Calculer la somme des notes
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }

        // Calculer la moyenne
        double moyenne = (double) somme / notes.size();

        // Utiliser DecimalFormat pour afficher la moyenne avec deux décimales
        DecimalFormat df = new DecimalFormat("#.00");
        
        // Afficher la moyenne
        System.out.println("La moyenne des notes est : " + df.format(moyenne));
    }
}
