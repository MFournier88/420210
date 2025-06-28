package solution_exo.examenFinal.formatif2.question2;

import java.util.ArrayList;

public class q2V2 {
    public static void main(String[] args) {
        
        // Dernier niveau
        Employe hugo = new Employe("Stagiaire", "Hugo Chartrand", new ArrayList<>(), 3);

        // Niveau 2
        ArrayList<Employe> alexSubordonnes = new ArrayList<>();
        alexSubordonnes.add(hugo);
        Employe alex = new Employe("Développeur frontend", "Alex Gagnon", alexSubordonnes, 2);

        Employe nadia = new Employe("Développeuse backend", "Nadia Belhumeur", new ArrayList<>(), 2);

        // Niveau 1 - Directeur TI
        ArrayList<Employe> marcSubordonnes = new ArrayList<>();
        marcSubordonnes.add(nadia);
        marcSubordonnes.add(alex);
        Employe marc = new Employe("Directeur TI", "Marc Boivin", marcSubordonnes, 1);

        // Niveau 2 Marketing
        Employe sarah = new Employe("Analyste marketing", "Sarah Lefebvre", new ArrayList<>(), 2);
        Employe kevin = new Employe("Designer graphique", "Kevin Lemoine", new ArrayList<>(), 2);

        // Niveau 1 - Directrice Marketing
        ArrayList<Employe> aliceSubordonnes = new ArrayList<>();
        aliceSubordonnes.add(sarah);
        aliceSubordonnes.add(kevin);
        Employe alice = new Employe("Directrice Marketing", "Alice Tremblay", aliceSubordonnes, 1);

        // PDG - Niveau 0
        ArrayList<Employe> jeanSubordonnes = new ArrayList<>();
        jeanSubordonnes.add(alice);
        jeanSubordonnes.add(marc);
        Employe jean = new Employe("PDG", "Jean Dupuis", jeanSubordonnes, 0);

        // Affichage récursif
        // afficherEmployes(jean);

        //Affichage Non-récursif

        System.out.print(jean);
        System.out.print(alice);
        System.out.print(sarah);
        System.out.print(kevin);
        System.out.print(marc);
        System.out.print(nadia);
        System.out.print(alex);
        System.out.print(hugo);

    }

    public static void afficherEmployes(Employe e) {
        System.out.print(e.toString());
        for (Employe sub : e.getEmployes()) {
            afficherEmployes(sub);
        }
    }
    
}


class Employe{
    private String titre;
    private String nom;
    private ArrayList<Employe> employes;
    private int nivIndent = 0;


    public Employe(String titre, String nom, ArrayList<Employe> employes, int nivIndent) {
        this.titre = titre;
        this.nom = nom;
        this.employes = employes;
        this.nivIndent = nivIndent;
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
    public int getNivIndent() {
        return nivIndent;
    }
    public void setNivIndent(int nivIndent) {
        this.nivIndent = nivIndent;
    }
    @Override
    public String toString() {
        String msg = "";
        msg += "\t".repeat(nivIndent);
        msg += String.format("%s - %s\n",this.nom, this.titre);
        return msg;
    }

    
    
    
}


