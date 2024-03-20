import java.util.Date;

public class Affichage {

    static void afficherAvecFormat(){
        System.out.printf("%d \n" ,23);                 // affiche "23 "
        System.out.printf("%4d \n" ,23);                // affiche "  23"
        System.out.printf("%04d \n" ,23);               // affiche "0023"
        System.out.printf("%f \n" ,3.14116);            // affiche "3.141160"
        System.out.printf("%.2f \n" ,3.14116);          // affiche "3.14"

        System.out.printf("%s \n" ,"Bonjour");          // affiche "Bonjour"
        System.out.printf("%10s \n" ,"Bonjour");        // affiche "   Bonjour"
        System.out.printf("%-10s \n" ,"Bonjour");       // affiche "Bonjour   "

        System.out.printf("%tD \n" , new Date());       // affiche la date d'aujourd'hui "03/01/24"   (D: Date formatted as "%tm/%td/%ty")
        System.out.printf("%tF \n" , new Date());       // affiche la date d'aujourd'hui "2024-03-01" (F: ISO 8601  complete date formatted as "%tY-%tm-%td")
        System.out.printf("%1$te %1$tb %1$ty \n" , new Date());     // affiche la date d'aujourd'hui "1 mars 24"
        System.out.printf("%1$tA %1$te %1$tB %1$tY \n", new Date());// affiche la date  d'aujourd'hui "vendredi 1 mars 2024"
        System.out.printf("%1$tr \n" , new Date());                 // affiche l'heure actuelle, dans ce cas "12:29:07 A.M."
    }
}
