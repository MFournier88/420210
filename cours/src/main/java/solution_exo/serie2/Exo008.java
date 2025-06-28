package solution_exo.serie2;

public class Exo008 {
    public static void main(String[] args) {
        Evaluation eval1 = new Evaluation("Examen 1", 0.3f);
        eval1.setNoteSur100((byte)50);
        eval1.afficheEvaluation();
        eval1.setNoteSur100((byte)75);
        eval1.afficheEvaluation();
    }
}
class Evaluation{
    //Attributs
    private String nom;
    private float ponderation;
    private byte noteSur100;
    
    //Getter & Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPonderation() {
        return ponderation;
    }

    public void setPonderation(float ponderation) {
        this.ponderation = ponderation;
    }

    public byte getNoteSur100() {
        return noteSur100;
    }

    public void setNoteSur100(byte noteSur100) {
        this.noteSur100 = noteSur100;
    }

    //Constructeur
    public Evaluation(String nom,float ponderation){
        this.nom = nom;
        this.ponderation = ponderation;
    }

    //Méthodes
    public byte notePonderee(){
        return (byte) (this.noteSur100 * this.ponderation);
    }
    public void afficheEvaluation(){
        System.out.println(this.nom + " " + this.ponderation + " " + this.notePonderee());
    }
}