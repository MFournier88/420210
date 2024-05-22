package examen2;

public class Etudiant {
    Cours[] cours;
    String nomComplet;

    public Etudiant(Cours[] cours, String nomComplet) {
        this.cours = cours;
        this.nomComplet = nomComplet;
    }
    public void afficheCoursEnVoieEchec(){
        System.out.println("Les cours en voie d'échec sont:");
        for(Cours val : cours){
            if(val.isInTrouble()){
                System.out.println(val.titreCours);
            }
        }
    }
    public Cours getCours(int index){
        return cours[index];
    }
}
