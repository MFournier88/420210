package solution_exo.serie1;
// Exo_1.1
// Faites un programme qui prend prénom et nom de famille en argument et affiche bonjour <<Le_nom_complet_de_la_personne>>.
public class Exo001 {
    public static void main(String[] args){
        if( args.length != 2){
            System.err.println("Entrez le prénom et le nom en argument");
            System.exit(0);
        }
        System.out.println("bonjour " + args[0] + " " + args[1]);
    }
}
