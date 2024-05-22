package exceptions;

import java.util.Scanner;

public class Rectangle extends Shape{
    @Override
    public double getArea() {
        Scanner scan = new Scanner(System.in);
        double base;
        while(true) {
            System.out.print("Entrez la base : ");
            try {
                base = scan.nextDouble();
            }catch(Exception e){
                System.out.println("Entre une valeur possible");
                continue;
            }
            break;
        }
        double hauteur;
        while(true) {
            System.out.print("Entrez la hauteur : ");
            try {
                hauteur = scan.nextDouble();
            }catch(Exception e){
                System.out.println("Entre une valeur possible");
                continue;
            }
            break;
        }
        return base * hauteur;
    }
}
