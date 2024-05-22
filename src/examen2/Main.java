package examen2;

public class Main {
    public static void main(String[] args) {
        Evaluation tp1C1 = new Groupe("tp1C1",100,100);
        Evaluation tp2C1 = new Evaluation("tp2C1",100);
        Evaluation exam1C1 = new Evaluation("exam1C1",0);

        Evaluation tp1C2 = new Groupe("tp1C2",100,100);
        Evaluation exam1C2 = new Evaluation("exam1C2",100);
        Evaluation exam2C2 = new Groupe("exam2C2",100,100);

        Cours C1 = new Cours(new Evaluation[]{tp1C1,tp2C1,exam1C1},"C1");
        Cours C2 = new Cours(new Evaluation[]{tp1C2, exam1C2,exam2C2},"C2");

        Etudiant maxime = new Etudiant(new Cours[]{C1,C2},"Maxime Fournier");

        maxime.afficheCoursEnVoieEchec();
    }
}
