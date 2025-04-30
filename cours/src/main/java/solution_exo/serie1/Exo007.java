package solution_exo.serie1;
// - Créez un tableau d'entiers de taille 5. Remplissez le de 5 nombres aléatoires entre 0 et 100.  (Voir [Math.random](1_basics/#mathrandom) dans les notes de cours)
// - Affichez chaque valeur du tableau.

public class Exo007 {
    public static void main(String[] args) {
        int[] tableau = new int[5];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() * 101);
        }

        for (int i : tableau) {
            System.out.println(i);
        }
    }
}
