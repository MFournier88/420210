package solution_exo.examen2.formatif.question1;

class Evaluation{
    private String nom;
    private float ponderation;
    private byte noteSur100 = 0;
    
    public Evaluation(String nom,float ponderation){
        this.nom = nom;
        this.ponderation = ponderation;
    }
    public byte notePonderee(){
        return (byte) (this.ponderation * this.noteSur100);
    }
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
}
