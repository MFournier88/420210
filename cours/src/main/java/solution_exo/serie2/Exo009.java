package solution_exo.serie2;

public class Exo009 {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(12345, "Bob");
        etudiant1.getEvaluations()[0].setNoteSur100((byte)50);
        etudiant1.getEvaluations()[1].setNoteSur100((byte)67);
        etudiant1.getEvaluations()[2].setNoteSur100((byte)100);

        etudiant1.afficheResultat();
    }
}

class Etudiant{
    //Attributs
    private int da;
    private String nomComplet;
    private Evaluation[] evaluations = {
        new Evaluation("Examen 1", 0.2f),
        new Evaluation("Examen 2", 0.3f),
        new Evaluation("Examen Final", 0.5f)
    };
    
    //Getter & Setter
    public int getDa() {
        return da;
    }

    public void setDa(int da) {
        this.da = da;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public Evaluation[] getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(Evaluation[] evaluations) {
        this.evaluations = evaluations;
    }
    
    //Constructeur
    public Etudiant(int da, String nomComplet){
        this.da = da;
        this.nomComplet = nomComplet;
    }

    //Méthodes
    public byte noteFinal(){
        byte noteFinale = 0;
        for(int i = 0 ; i < this.evaluations.length ; i++){
            noteFinale += this.evaluations[i].notePonderee();
        }
        return noteFinale;
    }

    public void afficheResultat(){
        System.out.print(this.da + " " + this.nomComplet + " ");
        for(int i = 0 ; i < this.evaluations.length ; i++){
            System.out.print(this.evaluations[i].notePonderee() + " ");
        }
        System.out.println("| " + this.noteFinal());
    }

}

class Evaluation{
    //Attributs
    private String nom;
    private float ponderation;
    private byte noteSur100;

    //Stter & Getter
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