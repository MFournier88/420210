public class Exo002 {
    public static void main(String[] args) {
        // Création de plusieurs instances de la classe Examen
        Examen etudiant1 = new Examen("Jean Dupont", (byte) 95);
        Examen etudiant2 = new Examen("Marie Curie", (byte) 85);
        Examen etudiant3 = new Examen("Paul Martin", (byte) 72);
        Examen etudiant4 = new Examen("Sophie Lefevre", (byte) 65);
        Examen etudiant5 = new Examen("Lucie Durand", (byte) 55);

        // Affichage des résultats
        etudiant1.afficheResultat();
        etudiant2.afficheResultat();
        etudiant3.afficheResultat();
        etudiant4.afficheResultat();
        etudiant5.afficheResultat();
    }
}

class Examen{
 // Attributs
 private String nomEtudiant;
 private byte note;

 // Constructeur
 public Examen(String nomEtudiant, byte note) {
     this.nomEtudiant = nomEtudiant;
     this.note = note;
 }

 // Méthode pour afficher le résultat
 public void afficheResultat() {
     System.out.println(nomEtudiant + " : " + convertNote());
 }

 // Méthode pour convertir la note en lettre
 public String convertNote() {
     if (note > 90) {
         return "A";
     } else if (note > 80) {
         return "B";
     } else if (note > 70) {
         return "C";
     } else if (note > 60) {
         return "D";
     } else {
         return "E";
     }
 }
}