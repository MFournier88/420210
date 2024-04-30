package PreExam1.R6;

public class Personne {
    private byte age;
    private float taille;
    private String nomComplet;

    public int getNeedGet() {
        return needGet;
    }

    public void setNeedGet(int needGet) {
        this.needGet = needGet;
    }

    private int needGet;
    private double banque;

    public Personne(byte age, float taille, String nomComplet, double banque){
        this.age = age;
        this.taille = taille;
        this.nomComplet = nomComplet;
        this.banque = banque;
    }

    public double calculInteret(){
        return 0.02 * banque;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public double getBanque() {
        return banque;
    }

    public void setBanque(double banque) {
        if(banque < 0){
            System.out.println("Tu n'as pas assez d'argent");
        }else{
            this.banque = banque;
        }
    }



}