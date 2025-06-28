package solution_exo.serie2;

public class Exo006 {
    public static void main(String[] args) {   
        Cercle cercle = new Cercle(10);
        cercle.afficherInfos();
    }
}
class Cercle{
    //Attributs
    private double rayon;

    //Setter & Getter
    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    //Constructeur
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    
    //Méthodes
    public double calculerAire(){
        return Math.PI * this.rayon * this.rayon;
    }
    public double calculerPerimetre(){
        return 2 * Math.PI * this.rayon;
    }
    public void afficherInfos(){
        System.out.println("Je suis un cercle avec les caractéristiques suivantes :");
        System.out.printf("%-10s:%10.2f\n","Rayon ", this.rayon);
        System.out.printf("%-10s:%10.2f\n","Périmètre ", this.calculerPerimetre());
        System.out.printf("%-10s:%10.2f\n","Aire ", this.calculerAire());
    }
}