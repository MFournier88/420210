package examen2;

public class Cours {
    protected Evaluation[] evaluations;
    protected String titreCours;

    public Cours(Evaluation[] evaluations, String titreCours) {
        this.evaluations = evaluations;
        this.titreCours = titreCours;
    }
    public boolean isInTrouble(){
        float noteG = 0;
        int compteurG = 0;
        float noteI = 0;
        int compteurI = 0;
        for(Evaluation eval : evaluations){
            if(eval.getNote() != -1) {
                if(eval.type.equals("Groupe")){
                    noteG += eval.getNote();
                    compteurG++;
                }
                else if(eval.type.equals("Individuelle")){
                    noteI += eval.getNote();
                    compteurI ++;
                }
            }
        }
        if(compteurG !=0 && noteG/compteurG < 60 ){
            return  true;
        } else if (compteurI !=0 && noteI/compteurI < 60) {
            return true;
        } else{
            return false;
        }
    }
}
