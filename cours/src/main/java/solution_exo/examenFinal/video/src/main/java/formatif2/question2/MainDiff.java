package solution_exo.examenFinal.video.src.main.java.formatif2.question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDiff {
    public static void main(String[] args) {
        Employe hugo = new Employe("Hugo Chartrand", "Stagiaire", null);
        Employe alex = new Employe("Alex Gagnon", "Développeur frontend", new ArrayList<>(Arrays.asList(hugo)));
        Employe nadia = new Employe("Nadia Belhumeur", "Développeuse backend", null);
        Employe marc = new Employe("Marc Boivin", "Directeur TI", new ArrayList<>(Arrays.asList(nadia,alex)));
        Employe kevin = new Employe("Kevin Lemoine", "Designer graphique", null);
        Employe sarah = new Employe("Sarah Lefebvre", "Analyste marketing", null);
        Employe alice = new Employe("Alice Tremblay", "Directrice Marketing", new ArrayList<>(Arrays.asList(sarah,kevin)));
        Employe jean = new Employe("Jean Dupuis", "PDG", new ArrayList<>(Arrays.asList(alice, marc)));

        jean.afficheOrganigramme(0);
    }
}


class Employe{
    private String nom;
    private String poste;
    private ArrayList<Employe> employes;
    

    public Employe(String nom, String poste, ArrayList<Employe> employes) {
        this.nom = nom;
        this.poste = poste;
        this.employes = employes;
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

    public void afficheOrganigramme(int indent){
        System.out.println("    ".repeat(indent) + this.toString());
        if(this.employes ==null){
            return;
        }
        for (Employe employe : employes) {
            employe.afficheOrganigramme(indent + 1);
        }
    }

    @Override
    public String toString() {

        return String.format("%s - %s", this.getNom(), this.getPoste());
    }
    
}