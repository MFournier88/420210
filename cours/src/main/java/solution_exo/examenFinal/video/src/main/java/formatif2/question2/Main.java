package solution_exo.examenFinal.video.src.main.java.formatif2.question2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
        Employe jean = new Employe("Jean Dupuis", "PDG", 0);
        Employe alice = new Employe("Alice Tremblay", "Directrice Marketing", 1);
        Employe sarah = new Employe("Sarah Lefebvre", "Analyste marketing", 2);
        Employe kevin = new Employe("Kevin Lemoine", "Designer graphique", 2);
        Employe marc = new Employe("Marc Boivin", "Directeur TI", 1);
        Employe nadia = new Employe("Nadia Belhumeur", "Développeuse backend", 2);
        Employe alex = new Employe("Alex Gagnon", "Développeur frontend", 2);
        Employe hugo = new Employe("Hugo Chartrand", "Stagiaire", 3);

        Entreprise enterprise = new Entreprise();

        enterprise.ajouterEmployeALaFin(jean);
        enterprise.ajouterEmployeALaFin(alice);
        enterprise.ajouterEmployeALaFin(sarah);
        enterprise.ajouterEmployeALaFin(kevin);
        enterprise.ajouterEmployeALaFin(marc);
        enterprise.ajouterEmployeALaFin(nadia);
        enterprise.ajouterEmployeALaFin(alex);
        enterprise.ajouterEmployeALaFin(hugo);

        enterprise.afficheOrganigramme();
    }
}

class Entreprise{
    private ArrayList<Employe> employes = new ArrayList<>();

    public void ajouterEmployeALaFin(Employe emp){
        employes.add(emp);
    }

    public void afficheOrganigramme(){
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }
}

class Employe{
    private String nom;
    private String poste;
    private int nbIndent;
    
    public Employe(String nom, String poste, int nbIndent) {
        this.nom = nom;
        this.poste = poste;
        this.nbIndent = nbIndent;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPoste() {
        return poste;
    }
    public void setPoste(String poste) {
        this.poste = poste;
    }
    public int getNbIndent() {
        return nbIndent;
    }
    public void setNbIndent(int nbIndent) {
        this.nbIndent = nbIndent;
    }
    @Override
    public String toString() {
        return String.format("    ".repeat(nbIndent) + "%s - %s", this.getNom(), this.getPoste());
    }
    
}