package RevisionExam1.NBA;

public class Main {
    public static void main(String[] args) {
        Equipe gamers = new Equipe("gamer",new Joueur[]{
                new Joueur(1.80F,(byte) 26,(byte)23,"Max"),
                new Joueur(1.00F,(byte) 66,(byte)20,"Bob")
        });
        System.out.println(gamers);
        gamers.setJoueur(new Joueur(1.80F,(byte) 26,(byte)26,"Fares"),(byte)2);

    }
}
