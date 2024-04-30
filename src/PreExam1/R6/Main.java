package PreExam1.R6;

public class Main {
    public static void main(String[] args){
        Personne maxime = new Personne((byte)26,1.80F,"Maxime Fournier", 124.00);
        // Maxime dépense 20$ chez mcDo ce mois-ci
        maxime.setBanque(maxime.getBanque() - 20);
        // Calcul de son intérêt ce mois ci
        System.out.println(maxime.calculInteret());
        // Maxime dépense 400$ pour une switch
        maxime.setBanque(maxime.getBanque() - 400);
        System.out.println(maxime.calculInteret());
    }
}
