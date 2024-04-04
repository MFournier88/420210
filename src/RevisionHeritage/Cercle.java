package RevisionHeritage;

import java.util.Scanner;

public class Cercle extends Shape{
    public double getArea(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez le rayon : ");
        double rayon = scan.nextDouble();


        return Math.pow(rayon,2) * Math.PI;
    }
}
