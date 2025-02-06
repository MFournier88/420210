// # Exo_7

// Niveau : 2 ⭐

// **Exercice** : 

// - Créez un tableau d'entiers de taille 5. Remplissez le de 5 nombres aléatoires entre 0 et 100.  (Voir [Math.random](1_basics/#mathrandom) dans les notes de cours)
// - Affichez chaque valeur du tableau.

// **Exemple de sortie attendue** :
// ```
// 45
// 30
// 56
// 77
// 34
// ```

// ---

public class Examen {
    public String nomEtudiant;
    public byte note;

    public Examen(String nomEtudiant, byte note) {
        this.nomEtudiant = nomEtudiant;
        this.note = note;
    }
    public void afficheResultat(){
        System.out.println(this.nomEtudiant + " : " + convertNote());
    }
    public char convertNote() {
        if (this.note > 90) {
            return 'A';
        } else if (this.note > 80) {
            return 'B';
        } else if (this.note > 70) {
            return 'C';
        } else if (this.note > 60) {
            return 'D';

        } else
            return 'E';


    }
    public static void main(String[] args) {
        Examen examen1 = new Examen("Maxime", (byte)80);
        examen1.afficheResultat();
    }
}