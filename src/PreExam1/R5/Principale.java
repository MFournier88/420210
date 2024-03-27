package PreExam1.R5;
import java.util.Arrays;
import java.util.Comparator;
public class Principale {
    private static class SoldeComparator implements Comparator<Compte> {
        @Override
        public int compare(Compte compte1, Compte compte2) {
            return Double.compare(compte1.getSoldeCompte(), compte2.getSoldeCompte());
        }
    }
    public static  void main(String[] args){
        Compte compte1 = new Compte (300, "Gosling", "James", 300.00);
        Compte compte2 = new Compte (100, "Sang", "Shin", 3000.00);
        Compte compte3 = new Compte (200, "Dalton", "Henry", 50.00);
        Compte[] listeCompte = {compte1,compte2,compte3};
        for(Compte compte : listeCompte){
            compte.afficheCompte();
        }
        Arrays.sort(listeCompte, new SoldeComparator());
        for(Compte compte : listeCompte){
            compte.afficheCompte();
        }


    }
}
