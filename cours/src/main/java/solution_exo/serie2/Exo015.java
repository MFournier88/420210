package solution_exo.serie2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo015 {
    public static void main(String[] args) {
        try{
            System.out.println("Prénom :" + args[0] + " Nom :" + args[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Vous deviez mettre votre prénom et nom en argument, mais vous pouvez encore le faire ici : ");
            Scanner scan = new Scanner(System.in);
            String prenom = scan.next();
            String nom = scan.next();
            System.out.println("Prénom :" + prenom + " Nom :" + nom);

            
            
        }
    }
}
