package solution_exo.examenFinal.formatif2.question2;

import java.util.ArrayList;

public class q2V1 {
    public static void main(String[] args) {
        
        Employe alice = new Employe("Directrice Marketing", "Alice Tremblay", null);
        ArrayList<Employe> listeJean = new ArrayList<>();
        listeJean.add(alice);
        Employe jean = new Employe("PDG", "Jean Dupuis", listeJean);

      
        jean.affiche(0);
    }
}


class Employe{
    private String titre;
    private String nom;
    private ArrayList<Employe> employes;


    public Employe(String titre, String nom, ArrayList<Employe> employes) {
        this.titre = titre;
        this.nom = nom;
        this.employes = employes;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public ArrayList<Employe> getEmployes() {
        return employes;
    }
    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }
    
    public void affiche(int nivIndent){
        String msg = "";
        msg += "\t".repeat(nivIndent);
        msg += String.format("%s - %s\n",this.nom, this.titre);
        System.out.print(msg);
        if(this.employes != null){

            for (Employe employe : employes) {
                employe.affiche(nivIndent + 1);
            }
        }
    }
    
    
    
}


