// package question1;

// import java.time.Duration;
// import java.time.LocalDateTime;
// import java.util.ArrayList;
// import java.util.Collections;


// public class Main1 {
//     public static void main(String[] args) {
//         //Faites vos tests ici et utiliser les test que je vous fournis si ça vous aide

//         /* 
        
//         System.out.println("\n\n\n#####################################################          Test sur Tache          #####################################################\n\n");
        
//         // Affichage

//         Tache t1 = new Tache("Preparer la presentation", "Creer les slides PowerPoint.", 10, 0f, (byte) 4);
//         Tache t2 = new Tache("Installer l'environnement", "Configurer les outils de developpement.", 6, 0.3f, (byte) 3);
        
//         System.out.println(t1);
//         System.out.println(t2);

//         // setTaux
//         t1.setTauxCompletion(1.8f);
//         t1.setTauxCompletion(-2f);

//         System.out.println();

//         //setNiveau
//         t1.setNiveauPriorite((byte)8);
//         t1.setNiveauPriorite((byte)-1);
//         t1.setNiveauPriorite((byte)0);


//         System.out.println();
//         t1.travailler(-1);
//         System.out.println();

//         t1.travailler(5);
//         t2.travailler(4);
        
//         System.out.println(t1);
//         System.out.println(t2);

//         t1.travailler(5);
//         t2.travailler(1);

//         System.out.println();

//         System.out.println(t1);
//         System.out.println(t2);


//                             // Sortie attendue
// // Preparer la presentation                                    Priorité : 4
// //                 Creer les slides PowerPoint.
// //                 Complétion : ▢ ▢ ▢ ▢ ▢ 

// // Installer l'environnement                                   Priorité : 3
// //                 Configurer les outils de developpement.
// //                 Complétion : ◼ ▢ ▢ ▢ ▢ 

// // Le taux de complétion doit être entre 0 et 100% [0,1]. Vous avez entré : 1.8
// // Le taux de complétion doit être entre 0 et 100% [0,1]. Vous avez entré : -2.0

// // Erreur : Le niveau de priorité doit être entre 1 et 5 inclusivement et vous essayez de mettre : 8
// // Erreur : Le niveau de priorité doit être entre 1 et 5 inclusivement et vous essayez de mettre : -1
// // Erreur : Le niveau de priorité doit être entre 1 et 5 inclusivement et vous essayez de mettre : 0

// // Erreur : le nombre d'heure travaillé ne peut être négatif ou égal à 0

// // Preparer la presentation                                    Priorité : 4
// //                 Creer les slides PowerPoint.
// //                 Complétion : ◼ ◼ ▢ ▢ ▢ 

// // Installer l'environnement                                   Priorité : 3
// //                 Configurer les outils de developpement.
// //                 Complétion : ◼ ◼ ◼ ▢ ▢ 


// // Preparer la presentation                                    Priorité : 4
// //                 Creer les slides PowerPoint.
// //                 Complétion : ◼ ◼ ◼ ◼ ◼ 

// // Installer l'environnement                                   Priorité : 3
// //                 Configurer les outils de developpement.
// //                 Complétion : ◼ ◼ ◼ ◼ ▢
//         */
//         /*
//         System.out.println("\n\n\n#####################################################          Test sur TacheAvecDate          #####################################################\n\n");
//         TacheAvecDate t3 = new TacheAvecDate("Soumettre la version bêta", "Envoyer la version à l'equipe QA.", 9, 0.5f, (byte) 4, LocalDateTime.now().plusDays(2));
//         TacheAvecDate t4 = new TacheAvecDate("Faire la demo", "Presenter la demo au client.", 2, 0f, (byte) 3, LocalDateTime.now().plusSeconds(80000));
//         TacheAvecDate t5 = new TacheAvecDate("Evaluer les risques", "Faire une analyse des risques projet.",4, 0.8f, (byte) 2, LocalDateTime.now().plusDays(3));
        
//         System.out.println(t3);
//         System.out.println(t4);
//         System.out.println(t5);


//         System.out.println("\n\n             -------------  MAJ  -------------\n\n");

//         t3.mettreAJourEtatPriorite();
//         t4.mettreAJourEtatPriorite();
//         t5.mettreAJourEtatPriorite();

//         System.out.println(t3);
//         System.out.println(t4);
//         System.out.println(t5);
// // Soumettre la version bêta                                   Priorité : 4
// //                 Envoyer la version à l'equipe QA.
// //                 Complétion : ◼ ◼ ▢ ▢ ▢ 
// //                 Jours restants : 2

// // Faire la demo                                               Priorité : 3
// //                 Presenter la demo au client.
// //                 Complétion : ▢ ▢ ▢ ▢ ▢ 
// //                 Jours restants : 1

// // Evaluer les risques                                         Priorité : 2
// //                 Faire une analyse des risques projet.
// //                 Complétion : ◼ ◼ ◼ ◼ ▢ 
// //                 Jours restants : 3



// //      -------------  MAJ  -------------


// // Soumettre la version bêta                                   Priorité : 2
// //         Envoyer la version à l'equipe QA.
// //         Complétion : ◼ ◼ ▢ ▢ ▢ 
// //         Jours restants : 2

// // Faire la demo                                               Priorité : 1
// //         Presenter la demo au client.
// //         Complétion : ▢ ▢ ▢ ▢ ▢ 
// //         Jours restants : 1

// // Evaluer les risques                                         Priorité : 2
// //         Faire une analyse des risques projet.
// //         Complétion : ◼ ◼ ◼ ◼ ▢ 
// //         Jours restants : 3


// */
      
//        /* 
//         System.out.println("\n\n\n#####################################################          Test Tableau         #####################################################\n\n");
        
//         Tableau tableau = new Tableau();

//         tableau.addTache("Soumettre la version bêta", "Envoyer la version à l'equipe QA.", 9, 0.5f, (byte) 4, LocalDateTime.now().plusDays(2).plusSeconds(10));
//         tableau.addTache("Faire la demo", "Presenter la demo au client.", 2, 0f, (byte) 3, LocalDateTime.now().plusDays(5));
        
//         System.out.println(tableau);
        
//         System.out.println("Mise à jour!\n");

//         tableau.mettreAJourEtatPriorite();

//         System.out.println(tableau);


//         System.out.println("--- getTacheParNom ---");

//         tableau.getTacheParNom("Jean");
//         System.out.println(tableau.getTacheParNom("Faire la demo"));


//         System.out.println();
//         tableau.retirerTache("Harry Potter");
//         tableau.retirerTache("Faire la demo");

//         System.out.println();
//         System.out.println(tableau);


// //     ------------------------------   EN_ATTENTE   ------------------------------
    
// //    Faire la demo                                               Priorité : 3
// //                    Presenter la demo au client.
// //                    Complétion : ▢ ▢ ▢ ▢ ▢ 
// //                    Jours restants : 5
    
    
// //    Soumettre la version bêta                                   Priorité : 4
// //                    Envoyer la version à l'equipe QA.
// //                    Complétion : ◼ ◼ ▢ ▢ ▢ 
// //                    Jours restants : 3
    
    
    
// //    Mise à jour!
    
// //     ------------------------------   EN_ATTENTE   ------------------------------
    
// //    Faire la demo                                               Priorité : 3
// //                    Presenter la demo au client.
// //                    Complétion : ▢ ▢ ▢ ▢ ▢ 
// //                    Jours restants : 5
    
    
// //    Soumettre la version bêta                                   Priorité : 3
// //                    Envoyer la version à l'equipe QA.
// //                    Complétion : ◼ ◼ ▢ ▢ ▢ 
// //                    Jours restants : 3
    
    
    
// //    --- getTacheParNom ---
// //    Faire la demo                                               Priorité : 3
// //                    Presenter la demo au client.
// //                    Complétion : ▢ ▢ ▢ ▢ ▢ 
// //                    Jours restants : 5
    
    
// //    Retrait impossible, car aucune tâche portant ce nom n'a été trouvée
    
// //     ------------------------------   EN_ATTENTE   ------------------------------
    
// //    Soumettre la version bêta                                   Priorité : 3
// //                    Envoyer la version à l'equipe QA.
// //                    Complétion : ◼ ◼ ▢ ▢ ▢ 
// //                    Jours restants : 3
// */


          
//         System.out.println("\n\n\n#####################################################          Test Final         #####################################################\n\n");



//         Tableau tableauFinal = new Tableau();



//         // Taches
//         tableauFinal.addTache("Analyser les besoins", "Recueillir les besoins des utilisateurs.", 7, 0.54f, (byte) 2);
//         tableauFinal.addTache("Organiser la reunion", "Planifier une reunion de projet.", 4, 0f, (byte) 5);
//         tableauFinal.addTache("Organiser la reunion", "Planifier une reunion de projet.", 4, 0f, (byte) 5);
//         tableauFinal.addTache("Lire la documentation", "Etudier les guides d’implementation.", 4, 0.95f, (byte) 1);
//         tableauFinal.addTache("Ecrire les tests", "Creer des tests unitaires.", 2, 0.4f, (byte) 2); 
//         tableauFinal.addTache("Faire le diagramme UML", "Concevoir les diagrammes de classes.", 4, 0.15f, (byte) 3);
//         tableauFinal.addTache("Lancer les tests", "Executer tous les tests automatises.", 8, 0.25f, (byte) 4);        
    
//         // Taches avec limite
//         tableauFinal.addTache("Soumettre la version bêta", "Envoyer la version à l'equipe QA.", 9, 0.5f, (byte) 4, LocalDateTime.now().minusHours(4));
//         tableauFinal.addTache("Faire la demo", "Presenter la demo au client.", 2, 0f, (byte) 3, LocalDateTime.now().plusHours(20));
//         tableauFinal.addTache("Evaluer les risques", "Faire une analyse des risques projet.", 4, 0f, (byte) 2, LocalDateTime.now().plusDays(2));
//         tableauFinal.addTache("Tâche oubliee", "Ancienne tâche non faite.", 4, 0f, (byte) 1, LocalDateTime.now().minusYears(1).plusDays(1));
//         tableauFinal.addTache("Corriger le bug critique", "Resoudre le problème en production.", 4, 0.75f, (byte) 1, LocalDateTime.now().minusDays(45));
//         tableauFinal.addTache("Corriger le bug critique", "Resoudre le problème en production.", 4, 0.75f, (byte) 1, LocalDateTime.of(2024,6,28,12,0,0));
    


        
//         // Affichage
//         System.out.println("\n\n   #################################   Avant la maj  #############################\n\n");
//         System.out.println(tableauFinal);

//         // Actions
//         tableauFinal.mettreAJourEtatPriorite();
//         tableauFinal.travaillerSurUneTache("Evaluer les risques", 10000);
//         tableauFinal.travaillerSurUneTache("Faire le diagramme UML", 3);
//         tableauFinal.travaillerSurUneTache("Analyser les besoins", 7);

//         // Affichage
//         System.out.println("\n\n   #################################   Après la maj   #############################\n\n");
//         System.out.println(tableauFinal);
//         // Impossible d'ajouter cette tâche, car une autre tâche porte le même nom
//         // Impossible d'ajouter cette tâche, car une autre tâche porte le même nom
        
        
//         //    #################################   Avant la maj  #############################
        
        
//         //  ------------------------------   EN_ATTENTE   ------------------------------
        
//         // Corriger le bug critique                                    Priorité : 1
//         //                 Resoudre le problème en production.
//         //                 Complétion : ◼ ◼ ◼ ▢ ▢ 
//         //                 Jours restants : -45
        
        
//         // Lire la documentation                                       Priorité : 1
//         //                 Etudier les guides d’implementation.
//         //                 Complétion : ◼ ◼ ◼ ◼ ▢ 
        
        
//         // Tâche oubliee                                               Priorité : 1
//         //                 Ancienne tâche non faite.
//         //                 Complétion : ▢ ▢ ▢ ▢ ▢ 
//         //                 Jours restants : -364
        
        
//         // Analyser les besoins                                        Priorité : 2
//         //                 Recueillir les besoins des utilisateurs.
//         //                 Complétion : ◼ ◼ ▢ ▢ ▢ 
        
        
//         // Ecrire les tests                                            Priorité : 2
//         //                 Creer des tests unitaires.
//         //                 Complétion : ◼ ◼ ▢ ▢ ▢ 
        
        
//         // Evaluer les risques                                         Priorité : 2
//         //                 Faire une analyse des risques projet.
//         //                 Complétion : ▢ ▢ ▢ ▢ ▢ 
//         //                 Jours restants : 2
        
        
//         // Faire la demo                                               Priorité : 3
//         //                 Presenter la demo au client.
//         //                 Complétion : ▢ ▢ ▢ ▢ ▢ 
//         //                 Jours restants : 1
        
        
//         // Faire le diagramme UML                                      Priorité : 3
//         //                 Concevoir les diagrammes de classes.
//         //                 Complétion : ▢ ▢ ▢ ▢ ▢ 
        
        
//         // Lancer les tests                                            Priorité : 4
//         //                 Executer tous les tests automatises.
//         //                 Complétion : ◼ ▢ ▢ ▢ ▢ 
        
        
//         // Soumettre la version bêta                                   Priorité : 4
//         //                 Envoyer la version à l'equipe QA.
//         //                 Complétion : ◼ ◼ ▢ ▢ ▢ 
//         //                 Jours restants : 0
        
        
//         // Organiser la reunion                                        Priorité : 5
//         //                 Planifier une reunion de projet.
//         //                 Complétion : ▢ ▢ ▢ ▢ ▢ 
        
        
        
        
        
//         //    #################################   Après la maj   #############################
        
        
//         //  ------------------------------   EXPIRE   ------------------------------
        
//         // Corriger le bug critique                                    Priorité : 1
//         //                 Resoudre le problème en production.
//         //                 Complétion : ◼ ◼ ◼ ▢ ▢ 
//         //                 Jours restants : -45
        
        
//         // Tâche oubliee                                               Priorité : 1
//         //                 Ancienne tâche non faite.
//         //                 Complétion : ▢ ▢ ▢ ▢ ▢ 
//         //                 Jours restants : -364
        
        
//         // Soumettre la version bêta                                   Priorité : 4
//         //                 Envoyer la version à l'equipe QA.
//         //                 Complétion : ◼ ◼ ▢ ▢ ▢ 
//         //                 Jours restants : 0
        
        
//         // ------------------------------   EN_ATTENTE   ------------------------------
        
//         // Faire la demo                                               Priorité : 1
//         //                 Presenter la demo au client.
//         //                 Complétion : ▢ ▢ ▢ ▢ ▢ 
//         //                 Jours restants : 1
        
        
//         // Lire la documentation                                       Priorité : 1
//         //                 Etudier les guides d’implementation.
//         //                 Complétion : ◼ ◼ ◼ ◼ ▢ 
        
        
//         // Ecrire les tests                                            Priorité : 2
//         //                 Creer des tests unitaires.
//         //                 Complétion : ◼ ◼ ▢ ▢ ▢ 
        
        
//         // Faire le diagramme UML                                      Priorité : 3
//         //                 Concevoir les diagrammes de classes.
//         //                 Complétion : ◼ ◼ ◼ ▢ ▢ 
        
        
//         // Lancer les tests                                            Priorité : 4
//         //                 Executer tous les tests automatises.
//         //                 Complétion : ◼ ▢ ▢ ▢ ▢ 
        
        
//         // Organiser la reunion                                        Priorité : 5
//         //                 Planifier une reunion de projet.
//         //                 Complétion : ▢ ▢ ▢ ▢ ▢ 
        
        
//         // ------------------------------   FAIT   ------------------------------
        
//         // Analyser les besoins                                        Priorité : 2
//         //                 Recueillir les besoins des utilisateurs.
//         //                 Complétion : ◼ ◼ ◼ ◼ ◼ 
        
        
//         // Evaluer les risques                                         Priorité : 2
//         //                 Faire une analyse des risques projet.
//         //                 Complétion : ◼ ◼ ◼ ◼ ◼ 
//         //                 Jours restants : 2
//     }
    
// }

// // Écrivez votre code ici

// enum Etat{
//     EXPIRE,
//     EN_ATTENTE,
//     FAIT
// }

// class Tache{
//     private String nom;
//     private String description;
//     private int tempsRestant;
//     private float tauxCompletion;
//     private byte niveauPriorite;
//     private Etat etat = Etat.EN_ATTENTE;
    
//     public Tache(String nom, String description, int tempsRestant, float tauxCompletion, byte niveauPriorite) {
//         this.nom = nom;
//         this.description = description;
//         this.tempsRestant = tempsRestant;
//         this.tauxCompletion = tauxCompletion;
//         this.niveauPriorite = niveauPriorite;
//     }

//     public String getNom() {
//         return nom;
//     }

//     public void setNom(String nom) {
//         this.nom = nom;
//     }

//     public String getDescription() {
//         return description;
//     }

//     public void setDescription(String description) {
//         this.description = description;
//     }

//     public int getTempsRestant() {
//         return tempsRestant;
//     }

//     public void setTempsRestant(int tempsRestant) {
//         this.tempsRestant = tempsRestant;
//     }

//     public float getTauxCompletion() {
//         return tauxCompletion;
//     }

//     public void setTauxCompletion(float tauxCompletion) {
//         if(tauxCompletion < 0 || tauxCompletion > 1){
//             System.out.println("Le taux de complétion doit être entre 0 et 100% [0,1]. Vous avez entré : " + tauxCompletion);
//             return;
//         }
//         this.tauxCompletion = tauxCompletion;
//     }

//     public byte getNiveauPriorite() {
//         return niveauPriorite;
//     }

//     public void setNiveauPriorite(byte niveauPriorite) {
//         if(niveauPriorite <= 0 || niveauPriorite > 5){
//             System.out.println("Erreur : Le niveau de priorité doit être entre 1 et 5 inclusivement et vous essayez de mettre : " + niveauPriorite);
//             return;
//         }
//         this.niveauPriorite = niveauPriorite;
//     }

//     public Etat getEtat() {
//         return etat;
//     }

//     public void setEtat(Etat etat) {
//         this.etat = etat;
//     }

//     public void mettreAJourEtatPriorite(){
//         //Ne fait rien
//     }

//     private String completionToString(){
//         String carrePlein = "\u25FC\u200A";
//         String carreVide = "\u25A2\u200A";
//         int nbCarrePlein = (int) (5 * this.tauxCompletion);
//         return carrePlein.repeat(nbCarrePlein) + carreVide.repeat(5 - nbCarrePlein);
//     }

//     public void travailler(int nbHeure){
//         if(nbHeure <= 0){
//            System.out.println("Erreur : le nombre d'heure travaillé ne peut être négatif ou égal à 0");
//            return; 
//         }
//         else if(nbHeure >= this.tempsRestant){
//             this.setEtat(Etat.FAIT);
//             this.setTempsRestant(0);
//             this.setTauxCompletion(1);
//         }
//         else{
//             this.setTauxCompletion(1 - (1 - tauxCompletion) / tempsRestant * (tempsRestant - nbHeure));
//             this.setTempsRestant(this.getTempsRestant() - nbHeure);
//         }
//     }

//     @Override
//     public String toString(){
//         return String.format("""
//                 %-60sPriorité : %d
//                 \t\t%s
//                 \t\tComplétion : %s
//                 """, this.getNom(), this.getNiveauPriorite(), this.getDescription(), this.completionToString());
//     }

// }

// class TacheAvecDate extends Tache{
//     private LocalDateTime dateExpiration;

//     public TacheAvecDate(String nom, String description, int tempsRestant, float tauxCompletion, byte niveauPriorite,
//             LocalDateTime dateExpiration) {
//         super(nom, description, tempsRestant, tauxCompletion, niveauPriorite);
//         this.dateExpiration = dateExpiration;
//     }

//     public LocalDateTime getDateExpiration() {
//         return dateExpiration;
//     }

//     public void setDateExpiration(LocalDateTime dateExpiration) {
//         this.dateExpiration = dateExpiration;
//     }

//     public void mettreAJourEtatPriorite(){
//         if(LocalDateTime.now().isAfter(dateExpiration)){
//             this.setEtat(Etat.EXPIRE);
//             return;
//         }
//         int nbJours = (int) Math.ceil(Duration.between(LocalDateTime.now(), dateExpiration).toSeconds() / 86400.0);
//         if(nbJours < this.getNiveauPriorite()){
//             this.setNiveauPriorite((byte) nbJours);
//         }
//     }
//     @Override
//     public String toString(){
//         return super.toString() + "\t\tJours restants : " + (int) Math.ceil(Duration.between(LocalDateTime.now(), dateExpiration).toSeconds() / 86400.0) + "\n";
//     }
// }

// class Tableau{
//     private ArrayList<Tache> taches = new ArrayList<>();

//     public Tache getTacheParNom(String nom){
//         for (Tache tache : taches) {
//             if(tache.getNom().equals(nom)){
//                 return tache;
//             }
//         }
//         return null;
//     }
//     public void addTache(String nom, String description, int tempsRestant, float tauxCompletion, byte niveauPriorite){
//         if(this.getTacheParNom(nom) != null){
//             System.out.println("Impossible d'ajouter cette tâche, car une autre tâche porte le même nom");
//             return;
//         }
//         this.taches.add(new Tache(nom, description, tempsRestant, tauxCompletion, niveauPriorite));
//     }
//     public void addTache(String nom, String description, int tempsRestant, float tauxCompletion, byte niveauPriorite, LocalDateTime dateExpiration){
//         if(this.getTacheParNom(nom) != null){
//             System.out.println("Impossible d'ajouter cette tâche, car une autre tâche porte le même nom");
//             return;
//         }
//         this.taches.add(new TacheAvecDate(nom, description, tempsRestant, tauxCompletion, niveauPriorite, dateExpiration));
//     }
//     public void mettreAJourEtatPriorite(){
//         for (Tache tache : taches) {
//             tache.mettreAJourEtatPriorite();
//         }
//     }

//     public void retirerTache(String nom){
//         Tache tache = getTacheParNom(nom);
//         if(tache == null){
//             System.out.println("Retrait impossible, car aucune tâche portant ce nom n'a été trouvée");
//             return;
//         }
//         this.taches.remove(tache);
//     }

//     public void travaillerSurUneTache(String nom, int nbHeure){
//         Tache tache = getTacheParNom(nom);
//         if(tache == null){
//             System.out.printf("Travailler sur la tâche %s est impossible, car aucune tâche portant ce nom n'a été trouvée\n", nom);
//             return;
//         }
//         tache.travailler(nbHeure);
//     }
//     private int convertEtat(Etat etat){
//         switch (etat) {
//             case EXPIRE:
//                 return 1;
//             case EN_ATTENTE:
//                 return 2;
//             case FAIT:
//                 return 3;
//             default:
//                 return 4;
//         }
//     }
//     private int compareTache(Tache t1, Tache t2){
//         if(!t1.getEtat().equals(t2.getEtat())){
//             return convertEtat(t1.getEtat()) - convertEtat(t2.getEtat());
//         }
//         if(t1.getNiveauPriorite() != t2.getNiveauPriorite()){
//             return t1.getNiveauPriorite() - t2.getNiveauPriorite();
//         }
//         return t1.getNom().compareTo(t2.getNom());
//     }

//     @Override
//     public String toString() {
//         Collections.sort(taches, (t1,t2) -> compareTache(t1, t2));

//         String msg = "";
//         Etat cur = null;

//         for (Tache tache : taches) {
//             if(tache.getEtat() != cur){
//                 cur = tache.getEtat();
//                 msg += "------------------- " + cur + " --------------------\n";
//             }
//             msg += tache.toString() + "\n";
//         }

//         return msg;
//     }

    
// }