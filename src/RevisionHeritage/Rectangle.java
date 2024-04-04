package RevisionHeritage;

import java.util.Scanner;

public class Rectangle extends Shape{
    public double getArea(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez la hauteur : ");
        double hauteur = scan.nextDouble();
        System.out.print("Entrez la largeur : ");
        double largeur = scan.nextDouble();

        return hauteur * largeur;
    }
}
