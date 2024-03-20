import java.util.Scanner;

public class Boucles {

    static void boucleAvecObjets(){
        String chaine;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaine : ");
        chaine = sc.nextLine();

        ClassString objetChaine = new ClassString(chaine);
        // exo 1
        System.out.println("Le nombre de voyelle dans la phrase : " + chaine + " est : " + objetChaine.compterNombreVoyelles());

        sc.close();
    }

}
