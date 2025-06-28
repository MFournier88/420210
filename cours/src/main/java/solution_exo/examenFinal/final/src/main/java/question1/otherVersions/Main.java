package question1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        
        System.out.println("\n\n\n#####################################################          Test sur Tache          #####################################################\n\n");
        
        // Affichage

        Tache t1 = new Tache("Preparer la presentation", "Creer les slides PowerPoint.", (byte) 4, 10, 0f);
        Tache t2 = new Tache("Installer l'environnement", "Configurer les outils de developpement.", (byte) 3, 6, 0.3f);
        
        System.out.println(t1);
        System.out.println(t2);

        // setTaux
        t1.setTauxCompletion(1.8f);
        t1.setTauxCompletion(-2f);

        System.out.println();

        //setNiveau
        t1.setNiveauPriorite((byte)8);
        t1.setNiveauPriorite((byte)-1);
        t1.setNiveauPriorite((byte)0);


        System.out.println();
        t1.travailler(-1);
        System.out.println();

        t1.travailler(5);
        t2.travailler(4);
        
        System.out.println(t1);
        System.out.println(t2);

        t1.travailler(5);
        t2.travailler(1);

        System.out.println();

        System.out.println(t1);
        System.out.println(t2);
        

        System.out.println("\n\n\n#####################################################          Test sur TacheAvecDate          #####################################################\n\n");
        TacheAvecDate t3 = new TacheAvecDate("Soumettre la version bêta", "Envoyer la version à l'equipe QA.", (byte) 4, 9, 0.5f, LocalDateTime.now().plusDays(2));
        TacheAvecDate t4 = new TacheAvecDate("Faire la demo", "Presenter la demo au client.", (byte) 3, 2, 0f, LocalDateTime.now().plusSeconds(80000));
        TacheAvecDate t5 = new TacheAvecDate("Evaluer les risques", "Faire une analyse des risques projet.", (byte) 2,4, 0.8f, LocalDateTime.now().plusDays(3));
        
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);


        System.out.println("\n\n             -------------  MAJ  -------------\n\n");

        t3.mettreAJourEtatPriorite();
        t4.mettreAJourEtatPriorite();
        t5.mettreAJourEtatPriorite();

        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);


      

      
        
        System.out.println("\n\n\n#####################################################          Test Tableau         #####################################################\n\n");
        
        Tableau tableau = new Tableau();

        tableau.addTache("Soumettre la version bêta", "Envoyer la version à l'equipe QA.", (byte) 4, 9, 0.5f, LocalDateTime.now().plusDays(2).plusSeconds(10));
        tableau.addTache("Faire la demo", "Presenter la demo au client.", (byte) 3, 2, 0f, LocalDateTime.now().plusDays(5));
        
        System.out.println(tableau);
        
        System.out.println("Mise à jour!\n");

        tableau.mettreAJourEtatPriorite();

        System.out.println(tableau);


        System.out.println("--- getTacheParNom ---");

        tableau.getTacheParNom("Jean");
        System.out.println(tableau.getTacheParNom("Faire la demo"));


        System.out.println();
        tableau.retirerTache("Harry Potter");
        tableau.retirerTache("Faire la demo");

        System.out.println();
        System.out.println(tableau);




          
        System.out.println("\n\n\n#####################################################          Test Final         #####################################################\n\n");



        Tableau tableauFinal = new Tableau();



        // Taches
        tableauFinal.addTache("Analyser les besoins", "Recueillir les besoins des utilisateurs.", (byte) 2, 7, 0.54f);
        tableauFinal.addTache("Organiser la reunion", "Planifier une reunion de projet.", (byte) 5, 4, 0f);
        tableauFinal.addTache("Organiser la reunion", "Planifier une reunion de projet.", (byte) 5, 4, 0f);
        tableauFinal.addTache("Lire la documentation", "Etudier les guides d’implementation.", (byte) 1, 4, 0.95f);
        tableauFinal.addTache("Ecrire les tests", "Creer des tests unitaires.", (byte) 2, 2, 0.4f); 
        tableauFinal.addTache("Faire le diagramme UML", "Concevoir les diagrammes de classes.", (byte) 3, 4, 0.15f);
        tableauFinal.addTache("Lancer les tests", "Executer tous les tests automatises.", (byte) 4, 8, 0.25f);        
    
         // Taches avec limite
         tableauFinal.addTache("Soumettre la version bêta", "Envoyer la version à l'equipe QA.", (byte) 4, 9, 0.5f, LocalDateTime.now().minusHours(4));
         tableauFinal.addTache("Faire la demo", "Presenter la demo au client.", (byte) 3, 2, 0f, LocalDateTime.now().plusHours(20));
         tableauFinal.addTache("Evaluer les risques", "Faire une analyse des risques projet.", (byte) 2, 4, 0f, LocalDateTime.now().plusDays(2));
         tableauFinal.addTache("Tâche oubliee", "Ancienne tâche non faite.", (byte) 1, 4, 0f, LocalDateTime.now().minusYears(1).plusDays(1));
         tableauFinal.addTache("Corriger le bug critique", "Resoudre le problème en production.", (byte) 1, 4, 0.75f, LocalDateTime.now().minusDays(45));
         tableauFinal.addTache("Corriger le bug critique", "Resoudre le problème en production.", (byte) 1, 4, 0.75f, LocalDateTime.of(2024,6,28,12,0,0));
     
 
        
        // Affichage
        System.out.println("\n\n   #################################   Avant la maj  #############################\n\n");
        System.out.println(tableauFinal);

        // Actions
        tableauFinal.mettreAJourEtatPriorite();
        tableauFinal.travaillerSurUneTache("Evaluer les risques", 10000);
        tableauFinal.travaillerSurUneTache("Faire le diagramme UML", 3);
        tableauFinal.travaillerSurUneTache("Analyser les besoins", 7);

        // Affichage
        System.out.println("\n\n   #################################   Après la maj   #############################\n\n");
        System.out.println(tableauFinal);
        
    }
    
}
enum Etat {
    EXPIRE,
    EN_ATTENTE,
    FAIT
}
class Tache{
    private String nom;
    private String description;
    private int tempsRestant;
    private float tauxCompletion;
    private byte niveauPriorite;
    private Etat etat = Etat.EN_ATTENTE;
    
    public Tache(String nom, String description,
            byte niveauPriorite, int tempsRestant, float tauxCompletion) {
        this.nom = nom;
        this.description = description;
        this.tempsRestant = tempsRestant;
        this.tauxCompletion = tauxCompletion;
        this.niveauPriorite = niveauPriorite;
    }

   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTempsRestant() {
        return tempsRestant;
    }

    public void setTempsRestant(int tempsRestant) {
        this.tempsRestant = tempsRestant;
    }

    public float getTauxCompletion() {
        return tauxCompletion;
    }

    public void setTauxCompletion(float tauxCompletion) {
        if(tauxCompletion > 1 || tauxCompletion < 0){
            System.out.println("Le taux de complétion doit être entre 0 et 100% [0,1]. Vous avez entré : " + tauxCompletion);
        }
        else{
            this.tauxCompletion = tauxCompletion;
        }
    }

    public byte getNiveauPriorite() {
        return niveauPriorite;
    }

    public void setNiveauPriorite(byte niveauPriorite) {
        if(niveauPriorite > 5 || niveauPriorite <= 0){
            System.out.println("Erreur : Le niveau de priorité doit être entre 1 et 5 inclusivement et vous essayez de mettre : " + niveauPriorite);
            return;
        }
        this.niveauPriorite = niveauPriorite;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void mettreAJourEtatPriorite(){
        //Ne fait rien
    }
    private String completionToString(){
        int nbBlock = (int) Math.min(5, tauxCompletion * 5);
        return "\u25FC\u200A".repeat(nbBlock) + "\u25A2\u200A".repeat( 5 - nbBlock);
    }

    public void travailler(int nbHeure){
        if(nbHeure <= 0){
            System.out.println("Erreur : le nombre d'heure travaillé ne peut être négatif ou égal à 0");
            return;
        }
        if(nbHeure >= tempsRestant){
            this.setEtat(Etat.FAIT);
            this.setTempsRestant(0);
            this.setTauxCompletion(1);
        }
        else{
            this.setTauxCompletion(1 - (1-this.tauxCompletion)/ this.tempsRestant * (this.tempsRestant - nbHeure));
            this.setTempsRestant(this.getTempsRestant() - nbHeure);
        }
    }
    @Override
    public String toString() {
        return String.format("""
                %-60sPriorité : %d
                                %s
                                Complétion : %s
                """, this.nom, this.niveauPriorite, this.description, completionToString());
    }

    
}



class TacheAvecDate extends Tache{
    private LocalDateTime dateExpiration;   
    

    
    public TacheAvecDate(String nom, String description, byte niveauPriorite, int tempsRestant,
            float tauxCompletion, LocalDateTime dateExpiration) {
        super(nom, description, niveauPriorite, tempsRestant, tauxCompletion);
        this.dateExpiration = dateExpiration;
    }
    @Override
    public void mettreAJourEtatPriorite(){
        LocalDateTime auj = LocalDateTime.now();
        
        if(auj.isAfter(dateExpiration)){
            this.setEtat(Etat.EXPIRE);
        }
        else if( Math.ceil(Duration.between(auj, dateExpiration).toSeconds() / 86400.0) < this.getNiveauPriorite()){
            this.setNiveauPriorite((byte) Math.ceil(Duration.between(auj, dateExpiration).toSeconds() / 86400.0));

        }
    }
    @Override
    public String toString() {
        return super.toString() + String.format("                Jours restants : %d\n" , (int) Math.ceil(Duration.between(LocalDateTime.now(), dateExpiration).toSeconds() / 86400.0));
    }
    public LocalDateTime getDateExpiration() {
        return dateExpiration;
    }
    public void setDateExpiration(LocalDateTime dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}

class Tableau{
    private ArrayList<Tache> taches = new ArrayList<>();
    
    
    public void addTache(String nom, String description, byte niveauPriorite, int tempsRestant, float tauxCompletion){
        if(getTacheParNom(nom) != null){
            System.out.println("Impossible d'ajouter cette tâche, car une autre tâche porte le même nom");
            return;
        }
        this.taches.add(new Tache(nom, description, niveauPriorite, tempsRestant, tauxCompletion));
        
    }
    public void addTache(String nom, String description, byte niveauPriorite, int tempsRestant, float tauxCompletion, LocalDateTime dateExpiration){
        if(getTacheParNom(nom) != null){
            System.out.println("Impossible d'ajouter cette tâche, car une autre tâche porte le même nom");
            return;
        }
        this.taches.add(new TacheAvecDate(nom, description, niveauPriorite, tempsRestant, tauxCompletion, dateExpiration));
    }
    
    public Tache getTacheParNom(String nom){
        for (Tache tache : taches) {
            if(tache.getNom().equals(nom)){
                return tache;
            }
        }
        return null;
    }
    public void mettreAJourEtatPriorite(){
        for (Tache t : taches) {
            t.mettreAJourEtatPriorite();
        }
    }
    public void retirerTache(String nom){
        Tache tache = getTacheParNom(nom);
        if(tache != null){
            taches.remove(tache);
        }
        else{
            System.out.println("Retrait impossible, car aucune tâche portant ce nom n'a été trouvée");
        }
    }

    public void travaillerSurUneTache(String nom, int nbHeure){
        Tache tache = getTacheParNom(nom);
        if(tache != null){
            this.getTacheParNom(nom).travailler(nbHeure);
        }
        else{
            System.out.printf("Travailler sur la tâche <<%s>> est impossible, car aucune tâche portant ce nom n'a été trouvée\n", nom);
        }
    }
    

    private int compareTache(Tache t1, Tache t2){
        if(t1.getEtat() != t2.getEtat()){
            return convertEtat(t1.getEtat()) -  convertEtat(t2.getEtat());
        }
        int diff = t1.getNiveauPriorite() - t2.getNiveauPriorite();

        if(diff == 0){

            return t1.getNom().compareTo(t2.getNom());
        }
        return diff;
    }
    private int convertEtat(Etat etat){
        switch (etat) {
            case EXPIRE:
                return 1;
            case EN_ATTENTE:
                return 2;
            case FAIT:
                return 3;
            default:
                return 4;
                
        }
    }

    @Override
    public String toString() {  

        Collections.sort(taches, (t1,t2) -> compareTache(t1,t2));

        String rep = " ";
        Etat curEtat = null;
        for (Tache tache : taches) {
            if(curEtat != tache.getEtat()){
                curEtat = tache.getEtat();
                rep += String.format("------------------------------" + "   %s   " + "------------------------------\n\n",curEtat);
            }
            rep += tache.toString() + "\n\n";
        }

        return rep;
    }

    
}
