package exceptions;

public class Emp {
    protected int anciennete = 0;
    protected double salaire;

    public Emp(double salaire) {
        this.salaire = salaire;
    }
    public double paye(){
        anciennete++;
        if(anciennete % 26 == 0){
            salaire *= 1.05;
        }
        return salaire;
    }
}
