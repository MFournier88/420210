package solution_exo.serie1;

public class Exo006 {
    public static void main(String args[]){
        //--------------------------------------------------------------------
        // Afficher le résulat de ces comparaisons sans l'écrire explicitement
        //--------------------------------------------------------------------
        boolean reponse;
        // Enregistre dans une variable si 44 est égal à 66
        reponse = 44 == 66;
        System.out.println(reponse);

        // Enregistre dans une varible si 44 n'est pas égal a 66
        reponse = 44 != 66;
        System.out.println(reponse);

        // Enregistre dans une variable si 44 est plus grand que 66
        reponse = 44 > 66;
        System.out.println(reponse);

        // Enregistre dans une varible si 44 est plus petit ou égal à 66
        reponse = 44 <= 66;
        System.out.println(reponse);

        boolean estSante = true;
        boolean estAbordable = false;

        // Affiche true si les variable estSante et estAbordable sont toutes les 2 true, false sinon
        System.out.println(estSante & estAbordable);

        // Affiche true si estSante est fausse et estAbordable est true, false sinon
        System.out.println(!estSante & estAbordable);



        // Affiche true si estSante ou estAbordable est true, false sinon
        System.out.println(estSante | estAbordable);

    }
}
