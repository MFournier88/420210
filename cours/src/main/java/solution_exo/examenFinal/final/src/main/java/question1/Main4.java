package question1;
//50min
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("\n\n\n###############################          Test Tableau         ###############################\n\n");
        
        Tableau tableau = new Tableau();
        
        tableau.addTache("Soumettre la version bêta", "Envoyer la version à l'equipe QA.", 9, LocalDateTime.now().plusDays(2).plusSeconds(10));
        tableau.addTache("Evaluer les risques", "Faire une analyse des risques projet.", 4, LocalDateTime.now().plusDays(2));
        tableau.addTache("Tâche oubliee", "Ancienne tâche non faite.", 4, LocalDateTime.now().minusYears(1).plusDays(1));
        tableau.addTache("Faire la demo", "Presenter la demo au client.", 2, LocalDateTime.now().plusDays(5));
        
        System.out.println(tableau);
        
        System.out.println(tableau.getTacheParNom("Soumettre la version bêta").getNiveauUrgence());
        System.out.println(tableau.getTacheParNom("Evaluer les risques").getNiveauUrgence());
        System.out.println(tableau.getTacheParNom("Tâche oubliee").getNiveauUrgence());
        System.out.println(tableau.getTacheParNom("Faire la demo").getNiveauUrgence());
        tableau.travaillerSurUneTache("Evaluer les risques",4);
        
        System.out.println("Mise à jour!\n");
        
        tableau.majNiveauUrgence();
        
        System.out.println(tableau);
        System.out.println(tableau.getTacheParNom("Soumettre la version bêta").getNiveauUrgence());
        System.out.println(tableau.getTacheParNom("Evaluer les risques").getNiveauUrgence());
        System.out.println(tableau.getTacheParNom("Tâche oubliee").getNiveauUrgence());
        System.out.println(tableau.getTacheParNom("Faire la demo").getNiveauUrgence());
        
        System.out.println("--- getTacheParNom ---");
        
        System.out.println(tableau.getTacheParNom("Faire la demo"));
        
        
        System.out.println();
        tableau.retirerTache("Harry Potter");
        tableau.retirerTache("Faire la demo");
        
        System.out.println();
        System.out.println(tableau);
    }
}
enum Etat{
    EXPIRE,
    EN_ATTENTE,
    FAIT
}

class Tache{
    private String nom;
    private String description;
    private int tempsRestantEstime;
    private int niveauUrgence = 0;
    private Etat etat = Etat.EN_ATTENTE;
    public Tache(String nom, String description, int tempsRestantEstime) {
        this.nom = nom;
        this.description = description;
        this.tempsRestantEstime = tempsRestantEstime;
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
    public int getTempsRestantEstime() {
        return tempsRestantEstime;
    }
    public void setTempsRestantEstime(int tempsRestantEstime) {
        this.tempsRestantEstime = tempsRestantEstime;
    }
    public int getNiveauUrgence() {
        return niveauUrgence;
    }
    public void setNiveauUrgence(int niveauUrgence) {
        this.niveauUrgence = niveauUrgence;
    }
    public Etat getEtat() {
        return etat;
    }
    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void majNiveauUrgence(){
        //Ne fait rien
    }

    public void travailler(int nbHeure){
        if(nbHeure <= 0){
            System.out.println("Erreur : le nombre d'heure travaillé ne peut être négatif ou égal à 0");
        }
        else if(nbHeure >= this.getTempsRestantEstime()){
            this.setEtat(Etat.FAIT);
            this.setTempsRestantEstime(0);
            this.setNiveauUrgence(0);
        }
        else{
            this.setTempsRestantEstime(this.getTempsRestantEstime() - nbHeure);
        }
    }

    @Override
    public String toString(){
        return String.format("""
                %-60sTemps restant estimé : %dh
                \t\t%s
                """, this.getNom(), this.getTempsRestantEstime(), this.getDescription());
    }
}

class TacheAvecDate extends Tache{
    private LocalDateTime dateExpiration;

    public TacheAvecDate(String nom, String description, int tempsRestantEstime, LocalDateTime dateExpiration) {
        super(nom, description, tempsRestantEstime);
        this.dateExpiration = dateExpiration;
    }

    public LocalDateTime getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDateTime dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public void majNiveauUrgence(){
        if(this.getEtat() == Etat.EXPIRE){
            return;
        }
        if(LocalDateTime.now().isAfter(dateExpiration)){
            this.setEtat(Etat.EXPIRE);
            return;
        }
        int nbHours = (int) Duration.between(LocalDateTime.now(), dateExpiration).toHours();
        this.setNiveauUrgence(24 * this.getTempsRestantEstime() / nbHours);
    
    }
    @Override
    public String toString(){
        return super.toString() + "\t\tJours restants : " + ((int) Duration.between(LocalDateTime.now(), dateExpiration).toDays()) + "\n";
    }
}

class Tableau{
    private ArrayList<Tache> taches = new ArrayList<>();

    public Tache getTacheParNom(String nom){
        for (Tache tache : taches) {
            if(tache.getNom().equals(nom)){
                return tache;
            }
        }
        return null;
    }

    public void addTache(String nom, String description, int tempsRestantEstime){
        if(getTacheParNom(nom) != null){
            System.out.println("Impossible d'ajouter cette tâche, car une autre tâche porte le même nom");
            return;
        }
        this.taches.add(new Tache(nom, description, tempsRestantEstime));
    }
    public void addTache(String nom, String description, int tempsRestantEstime, LocalDateTime dateExpiration){
        if(getTacheParNom(nom) != null){
            System.out.println("Impossible d'ajouter cette tâche, car une autre tâche porte le même nom");
            return;
        }
        this.taches.add(new TacheAvecDate(nom, description, tempsRestantEstime, dateExpiration));
    }
    public void majNiveauUrgence(){
        for (Tache tache : taches) {
            tache.majNiveauUrgence();
        }
    }
    public void retirerTache(String nom){
        Tache tache = getTacheParNom(nom);
        if(tache == null){
            System.out.println("Retrait impossible, car aucune tâche portant ce nom n'a été trouvée");
            return;
        }
        this.taches.remove(tache);
    }

    public void travaillerSurUneTache(String nom, int nbHeure){
        Tache tache = getTacheParNom(nom);
        if(tache == null){
            System.out.printf("Travailler sur la tâche %s est impossible, car aucune tâche portant ce nom n'a été trouvée\n", nom);
            return;
        }
        tache.travailler(nbHeure);
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

    private int compareTache(Tache t1, Tache t2){
        if(t1.getEtat() != t2.getEtat()){
            return convertEtat(t1.getEtat()) - convertEtat(t2.getEtat());
        }
        if(t1.getNiveauUrgence() != t2.getNiveauUrgence()){
            return -1 * (t1.getNiveauUrgence() - t2.getNiveauUrgence());
        }
        
        return t1.getNom().compareTo(t2.getNom());
    }

    @Override
    public String toString(){

        Collections.sort(taches, (t1,t2) -> compareTache(t1, t2));

        String msg = "";
        Etat cur = null;

        for (Tache tache : taches) {
            if(tache.getEtat() != cur){
                cur = tache.getEtat();
                msg += "-------------------- " + cur + " --------------------\n";
            }
            msg += tache.toString() + "\n";

        }
        return msg;
    }

}