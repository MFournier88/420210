package PreExam1.R3;

public class Main {
    public static void main(String[] args){
        double cathete1 = 3.0;
        double cathete2 = 4.0;
        System.out.println("L'hypothénuse d'un triangle avec comme côté " + cathete1 + " et " + cathete2 + " est de : " + Rencontre3.getHypothenuse(cathete1,cathete2));
        Rencontre3.afficheResult();
        Rencontre3.exo3();
    }
}
