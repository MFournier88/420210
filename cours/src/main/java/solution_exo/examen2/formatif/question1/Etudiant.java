package solution_exo.examen2.formatif.question1;

public class Etudiant {
    private int da;
    private String nomComplet;
    private Evaluation[] evaluations = {
                                        new Evaluation("Examen 1", 0.2f),
                                        new Evaluation("Examen 2", 0.3f),
                                        new Evaluation("Examen Final", 0.5f)
                                        };
    public void setDa(int da){
        this.da = da;
    }
    public int getDa(){
        return this.da;
    }
    public void setNomComplet(String nomComplet){
        this.nomComplet = nomComplet;
    }
    
    public String getNomComplet(){
        return this.nomComplet;
    }
    public Evaluation getEvaluation(int index){
        return this.evaluations[index];
    }

    public int getNbEvaluations(){
        return this.evaluations.length;
    }
    public Etudiant(int da, String nomComplet){
        this.setDa(da);
        this.setNomComplet(nomComplet);
    }

    public byte noteFinale(){
        byte somme = 0;
        for(int i = 0; i < this.evaluations.length; i++){
            somme += this.getEvaluation(i).notePonderee();
        }
        return somme;
    }


    public void afficheResultat(){
        System.out.printf("%d %-15s %2d %2d %2d | %2d\n", 
                                                                this.da, 
                                                                this.nomComplet, 
                                                                this.getEvaluation(0).notePonderee(), 
                                                                this.getEvaluation(1).notePonderee(), 
                                                                this.getEvaluation(2).notePonderee(),
                                                                this.noteFinale()
                                                            );
    }

    
    public static void main(String[] args) { 
        // Créer un étudiant 
        Etudiant etudiant = new Etudiant(1234567, "Jean Dupont"); 
    
        // Définir les notes obtenues pour chaque examen 
        etudiant.getEvaluation(0).setNoteSur100((byte)80);  // Examen 1 

        etudiant.getEvaluation(1).setNoteSur100((byte)90);  // Examen 2 

        etudiant.getEvaluation(2).setNoteSur100((byte)75);  // Examen Final 
            
    
        // Afficher les résultats 
        etudiant.afficheResultat(); 
    } 
    
}
