package RevisionExam1.NBA;

public class Personne {
    private byte age;
    private boolean isMajeur = false;
    public byte getAge(){
        return this.age;
    }
    public void setAge(byte age){
        this.age = age;
        if(age > 17){
            this.isMajeur = true;
        }
    }
    public float taille;
    public float getTaille(){
        return this.taille;
    }
    public void setTaille(float taille){
        this.taille = taille;
    }
    public String nomComplet;

    public double banque;

    public Personne(byte age, float taille, String nomComplet, double banque){
        this.age = age;
        this.taille = taille;
        this.nomComplet = nomComplet;
        this.banque = banque;
    }

    public double calculInteret(){
        return 0.02 * banque;
    }
}