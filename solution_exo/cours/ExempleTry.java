import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ExempleTry {
    public static void main(String[] args) {
        
        try {
            System.out.println("Prénom :" + args[0] + " Nom :" + args[1]);
    
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Vous deviez mettre votre prénom et nom en argument, mais vous pouvez encore le faire ici :");
            Scanner scan = new Scanner(System.in);
            System.out.println("Prénom :" + scan.next() + " Nom :" + scan.next());
            
        }
    }
}
    
