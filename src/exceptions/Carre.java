package exceptions;

import java.util.Scanner;

public class Carre extends Shape{
    @Override
    public double getArea() {
        Scanner scan = new Scanner(System.in);
        double cote;
        while(true) {
            System.out.print("Entrez la cote : ");
            try {
                cote = scan.nextDouble();
            }catch(Exception e){
                System.out.println("Entre une valeur possible");
                continue;
            }
            break;
        }

        return Math.pow(cote,2);
    }
}
