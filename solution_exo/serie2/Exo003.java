public class Exo003 {
    public static void main(String[] args) {
        Examen examen1 = new Examen("Maxime",(byte) 34);
        examen1.afficheResultat();
    }
}
class Examen{
    String nomEtudiant;
    byte note;

    public Examen(String nomEtudiant, byte note){
        this.nomEtudiant = nomEtudiant;
        this.note = note;
    }
    public void afficheResultat(){
        System.out.println(this.nomEtudiant + " : " + this.convertNote());
    }
    public char convertNote(){
        char lettre = 'N';

        if(this.note <=100 && this.note >90){
            lettre ='A';
        }
        else if(this.note <=90 && this.note >80){
            lettre ='B';
        }
        else if(this.note <=80 && this.note >70){
            lettre ='C';
        }
        else if(this.note <=70 && this.note >60){
            lettre ='D';
        }
        else if(this.note <=60 && this.note >=0){
            lettre = 'E';
        }
        return lettre;
    }
}