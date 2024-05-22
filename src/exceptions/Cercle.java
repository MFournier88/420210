package exceptions;

import java.util.Scanner;

public class Cercle extends Shape{
    @Override
    public double getArea() {
        Scanner scan = new Scanner(System.in);
        double rayon;
        while(true) {
            System.out.print("Entrez la rayon : ");
            try {
                rayon = scan.nextDouble();
            }catch(Exception e){
                System.out.println("Entre une valeur possible");
                continue;
            }
            break;
        }

        return Math.pow(rayon,2) * Math.PI;
    }
}
