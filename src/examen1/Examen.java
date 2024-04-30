package examen1;

public class Examen {
    private String nomEtudiant;
    private byte note;

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
        } else if (this.note > 70) {
            return 'D';

        } else
            return 'E';


    }
}
