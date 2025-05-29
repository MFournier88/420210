// package question1;

// import java.time.Duration;
// import java.time.LocalDateTime;
// import java.util.ArrayList;
// import java.util.Collections;


// public class Main3 {
//     public static void main(String[] args) {
//         //Faites vos tests ici et/ou utilisez les test que je vous fournis si ça vous aide

       
//         /*
//         System.out.println("\n\n\n###############################          Test sur Tache          ###############################n\n");
        
//         // Affichage

//         Tache t1 = new Tache("Préparer la présentation", "Créer les slides PowerPoint.", 10);
//         Tache t2 = new Tache("Installer l'environnement", "Configurer les outils de développement.",6);
        
//         System.out.println(t1);
//         System.out.println(t2);


//         System.out.println();
//         System.out.println();
//         t1.travailler(-1);
//         System.out.println();
//         System.out.println();
//         System.out.println();

//         t1.travailler(5);
//         t2.travailler(4);
        
//         System.out.println(t1);
//         System.out.println(t2);

//         t1.travailler(5);
//         t2.travailler(1);

//         System.out.println();

//         System.out.println(t1.toString() + "La tâche est : " + t1.getEtat());
//         System.out.println(t2.toString() + "La tâche est : " + t2.getEtat());
//         */


//                             // Sortie attendue
// // ###############################          Test sur Tache          ###############################


// // Préparer la présentation                                    Temps restant estimé : 10h
// //                 Créer les slides PowerPoint.

// // Installer l'environnement                                   Temps restant estimé : 6h
// //                 Configurer les outils de développement.



// // Erreur : le nombre d'heure travaillé ne peut être négatif ou égal à 0



// // Préparer la présentation                                    Temps restant estimé : 5h
// //                 Créer les slides PowerPoint.

// // Installer l'environnement                                   Temps restant estimé : 2h
// //                 Configurer les outils de développement.


// // Préparer la présentation                                    Temps restant estimé : 0h
// //                 Créer les slides PowerPoint.
// // La tâche est : FAIT
// // Installer l'environnement                                   Temps restant estimé : 1h
// //                 Configurer les outils de développement.
// // La tâche est : EN_ATTENTE
        
// /*        
//         System.out.println("\n\n\n###############################          Test sur TacheAvecDate          ###############################\n\n");
//         TacheAvecDate t3 = new TacheAvecDate("Soumettre la version bêta", "Envoyer la version à l'equipe QA.", 12, LocalDateTime.now().plusDays(2));
//         TacheAvecDate t4 = new TacheAvecDate("Faire la demo", "Presenter la demo au client.", 2, LocalDateTime.now().plusSeconds(80000));
//         TacheAvecDate t5 = new TacheAvecDate("Evaluer les risques", "Faire une analyse des risques projet.",4, LocalDateTime.now().plusDays(3));
        
//         System.out.println(t3);
//         System.out.println(t4);
//         System.out.println(t5);


//         System.out.println(t3.getDangerMeter());
//         System.out.println(t4.getDangerMeter());
//         System.out.println(t5.getDangerMeter());

//         System.out.println("-------------  MAJ  -------------");

//         t3.majDangerMeter();
//         t4.majDangerMeter();
//         t5.majDangerMeter();

//         System.out.println(t3.getDangerMeter());
//         System.out.println(t4.getDangerMeter());
//         System.out.println(t5.getDangerMeter());
// */
// // ###############################          Test sur TacheAvecDate          ###############################


// // Soumettre la version bêta                                   Temps restant estimé : 12h
// //                 Envoyer la version à l'equipe QA.
// //                 Jours restants : 2

// // Faire la demo                                               Temps restant estimé : 2h
// //                 Presenter la demo au client.
// //                 Jours restants : 1

// // Evaluer les risques                                         Temps restant estimé : 4h
// //                 Faire une analyse des risques projet.
// //                 Jours restants : 3

// // 0
// // 0
// // 0
// // -------------  MAJ  -------------
// // 6
// // 2
// // 1

      
//        /*/
//         System.out.println("\n\n\n###############################          Test Tableau         ###############################\n\n");
        
//         Tableau tableau = new Tableau();

//         tableau.addTache("Soumettre la version bêta", "Envoyer la version à l'equipe QA.", 9, LocalDateTime.now().plusDays(2).plusSeconds(10));
//         tableau.addTache("Faire la demo", "Presenter la demo au client.", 2, LocalDateTime.now().plusDays(5));
        
//         System.out.println(tableau);
        
//         System.out.println(tableau.getTacheParNom("Soumettre la version bêta").getDangerMeter());
//         System.out.println(tableau.getTacheParNom("Faire la demo").getDangerMeter());

//         System.out.println("Mise à jour!\n");

//         tableau.majDangerMeter();

//         System.out.println(tableau);
//         System.out.println(tableau.getTacheParNom("Soumettre la version bêta").getDangerMeter());
//         System.out.println(tableau.getTacheParNom("Faire la demo").getDangerMeter());

//         System.out.println("--- getTacheParNom ---");

//         System.out.println(tableau.getTacheParNom("Faire la demo"));


//         System.out.println();
//         tableau.retirerTache("Harry Potter");
//         tableau.retirerTache("Faire la demo");

//         System.out.println();
//         System.out.println(tableau);

// */
// // ###############################          Test Tableau         ###############################


// // ------------------- EN_ATTENTE --------------------
// // Faire la demo                                               Temps restant estimé : 2h
// //                 Presenter la demo au client.
// //                 Jours restants : 4

// // Soumettre la version bêta                                   Temps restant estimé : 9h
// //                 Envoyer la version à l'equipe QA.
// //                 Jours restants : 2


// // 0
// // 0
// // Mise à jour!

// // ------------------- EN_ATTENTE --------------------
// // Soumettre la version bêta                                   Temps restant estimé : 9h
// //                 Envoyer la version à l'equipe QA.
// //                 Jours restants : 2

// // Faire la demo                                               Temps restant estimé : 2h
// //                 Presenter la demo au client.
// //                 Jours restants : 4


// // 4
// // 0
// // --- getTacheParNom ---
// // Faire la demo                                               Temps restant estimé : 2h
// //                 Presenter la demo au client.
// //                 Jours restants : 4


// // Retrait impossible, car aucune tâche portant ce nom n'a été trouvée

// // ------------------- EN_ATTENTE --------------------
// // Soumettre la version bêta                                   Temps restant estimé : 9h
// //                 Envoyer la version à l'equipe QA.
// //                 Jours restants : 2



          
//         System.out.println("\n\n\n###############################          Test Final         ###############################\n\n");



//         Tableau tableauFinal = new Tableau();



//         // Taches
//         tableauFinal.addTache("Analyser les besoins", "Recueillir les besoins des utilisateurs.", 7);
//         tableauFinal.addTache("Organiser la reunion", "Planifier une reunion de projet.", 4);
//         tableauFinal.addTache("Organiser la reunion", "Planifier une reunion de projet.", 4);
//         tableauFinal.addTache("Ecrire les tests", "Creer des tests unitaires.", 2); 
//         tableauFinal.addTache("Faire le diagramme UML", "Concevoir les diagrammes de classes.", 4);
    
//         // Taches avec limite
//         tableauFinal.addTache("Soumettre la version bêta", "Envoyer la version à l'equipe QA.", 9, LocalDateTime.now().plusHours(400));
//         tableauFinal.addTache("Faire la demo", "Presenter la demo au client.", 2, LocalDateTime.now().plusHours(4));
//         tableauFinal.addTache("Evaluer les risques", "Faire une analyse des risques projet.", 4, LocalDateTime.now().plusDays(2));
//         tableauFinal.addTache("Tâche oubliee", "Ancienne tâche non faite.", 4, LocalDateTime.now().minusYears(1).plusDays(1));
//         tableauFinal.addTache("Corriger le bug critique", "Resoudre le problème en production.", 4, LocalDateTime.now().minusDays(45));
//         tableauFinal.addTache("Corriger le bug critique", "Resoudre le problème en production.", 4, LocalDateTime.of(2024,6,28,12,0,0));
    


        
//         // Affichage
//         System.out.println("\n\n   #################################   Avant la maj  #############################\n\n");
//         System.out.println(tableauFinal);

//         // Actions
//         tableauFinal.majDangerMeter();
//         tableauFinal.travaillerSurUneTache("Evaluer les risques", 10000);
//         tableauFinal.travaillerSurUneTache("Faire le diagramme UML", 3);
//         tableauFinal.travaillerSurUneTache("Analyser les besoins", 7);

//         System.out.println("\n\n   #################################   Après la maj  #############################\n\n");
//         System.out.println(tableauFinal);
// // ###############################          Test Final         ###############################


// // Impossible d'ajouter cette tâche, car une autre tâche porte le même nom
// // Impossible d'ajouter cette tâche, car une autre tâche porte le même nom


// //    #################################   Avant la maj  #############################


// // ------------------- EN_ATTENTE --------------------
// // Analyser les besoins                                        Temps restant estimé : 7h
// //                 Recueillir les besoins des utilisateurs.

// // Corriger le bug critique                                    Temps restant estimé : 4h
// //                 Resoudre le problème en production.
// //                 Jours restants : -45

// // Ecrire les tests                                            Temps restant estimé : 2h
// //                 Creer des tests unitaires.

// // Evaluer les risques                                         Temps restant estimé : 4h
// //                 Faire une analyse des risques projet.
// //                 Jours restants : 1

// // Faire la demo                                               Temps restant estimé : 2h
// //                 Presenter la demo au client.
// //                 Jours restants : 0

// // Faire le diagramme UML                                      Temps restant estimé : 4h
// //                 Concevoir les diagrammes de classes.

// // Organiser la reunion                                        Temps restant estimé : 4h
// //                 Planifier une reunion de projet.

// // Soumettre la version bêta                                   Temps restant estimé : 9h
// //                 Envoyer la version à l'equipe QA.
// //                 Jours restants : 16

// // Tâche oubliee                                               Temps restant estimé : 4h
// //                 Ancienne tâche non faite.
// //                 Jours restants : -364




// //    #################################   Après la maj  #############################


// // ------------------- EXPIRE --------------------
// // Corriger le bug critique                                    Temps restant estimé : 4h
// //                 Resoudre le problème en production.
// //                 Jours restants : -45

// // Tâche oubliee                                               Temps restant estimé : 4h
// //                 Ancienne tâche non faite.
// //                 Jours restants : -364

// // ------------------- EN_ATTENTE --------------------
// // Faire la demo                                               Temps restant estimé : 2h
// //                 Presenter la demo au client.
// //                 Jours restants : 0

// // Ecrire les tests                                            Temps restant estimé : 2h
// //                 Creer des tests unitaires.

// // Faire le diagramme UML                                      Temps restant estimé : 1h
// //                 Concevoir les diagrammes de classes.

// // Organiser la reunion                                        Temps restant estimé : 4h
// //                 Planifier une reunion de projet.

// // Soumettre la version bêta                                   Temps restant estimé : 9h
// //                 Envoyer la version à l'equipe QA.
// //                 Jours restants : 16

// // ------------------- FAIT --------------------
// // Evaluer les risques                                         Temps restant estimé : 0h
// //                 Faire une analyse des risques projet.
// //                 Jours restants : 1

// // Analyser les besoins                                        Temps restant estimé : 0h
// //                 Recueillir les besoins des utilisateurs.    
    
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
//     private int tempsRestantEstime;
//     private int dangerMeter = 0;
    
//     private Etat etat = Etat.EN_ATTENTE;
    
//     public Tache(String nom, String description, int tempsRestantEstime) {
//         this.nom = nom;
//         this.description = description;
//         this.tempsRestantEstime = tempsRestantEstime;
        
//     }
    
//     public int getDangerMeter() {
//         return dangerMeter;
//     }

//     public void setDangerMeter(int dangerMeter) {
//         this.dangerMeter = dangerMeter;
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

//     public int getTempsRestantEstime() {
//         return tempsRestantEstime;
//     }

//     public void setTempsRestantEstime(int tempsRestantEstime) {
//         this.tempsRestantEstime = tempsRestantEstime;
//     }

//     public Etat getEtat() {
//         return etat;
//     }

//     public void setEtat(Etat etat) {
//         this.etat = etat;
//     }

//     public void majDangerMeter(){
//         // ne fait rien
//     }


//     public void travailler(int nbHeure){
//         if(nbHeure <= 0){
//            System.out.println("Erreur : le nombre d'heure travaillé ne peut être négatif ou égal à 0");
//            return; 
//         }
//         else if(nbHeure >= this.tempsRestantEstime){
//             this.setEtat(Etat.FAIT);
//             this.setTempsRestantEstime(0);
//         }
//         else{
//             this.setTempsRestantEstime(this.getTempsRestantEstime() - nbHeure);
//         }
//     }

//     @Override
//     public String toString(){
//         return String.format("""
//                 %-60sTemps restant estimé : %dh
//                 \t\t%s
//                 """, this.getNom(), this.getTempsRestantEstime(), this.getDescription());
//     }

// }

// class TacheAvecDate extends Tache{
//     private LocalDateTime dateExpiration;

//     public TacheAvecDate(String nom, String description, int tempsRestantEstime, LocalDateTime dateExpiration) {
//         super(nom, description, tempsRestantEstime);
//         this.dateExpiration = dateExpiration;
//     }

//     public LocalDateTime getDateExpiration() {
//         return dateExpiration;
//     }

//     public void setDateExpiration(LocalDateTime dateExpiration) {
//         this.dateExpiration = dateExpiration;
//     }
//     @Override
//     public void majDangerMeter(){
        
//         if(this.getEtat() == Etat.EXPIRE || LocalDateTime.now().isAfter(dateExpiration)){
//             this.setEtat(Etat.EXPIRE);
//             return;
//         }
//         int nbHeureToLimite = (int) Duration.between(LocalDateTime.now(), dateExpiration).toHours();
//         this.setDangerMeter(24 * this.getTempsRestantEstime() / nbHeureToLimite);
//     }
//     @Override
//     public String toString(){
//         return super.toString() + "\t\tJours restants : " + Duration.between(LocalDateTime.now(), dateExpiration).toDays() + "\n";
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
//     public void addTache(String nom, String description, int tempsRestantEstime){
//         if(this.getTacheParNom(nom) != null){
//             System.out.println("Impossible d'ajouter cette tâche, car une autre tâche porte le même nom");
//             return;
//         }
//         this.taches.add(new Tache(nom, description, tempsRestantEstime));
//     }
//     public void addTache(String nom, String description, int tempsRestantEstime, LocalDateTime dateExpiration){
//         if(this.getTacheParNom(nom) != null){
//             System.out.println("Impossible d'ajouter cette tâche, car une autre tâche porte le même nom");
//             return;
//         }
//         this.taches.add(new TacheAvecDate(nom, description, tempsRestantEstime, dateExpiration));
//     }
//     public void majDangerMeter(){
//         for (Tache tache : taches) {
//             tache.majDangerMeter();
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
//         if(t1.getDangerMeter() != t2.getDangerMeter()){
//             return -1 * (t1.getDangerMeter() - t2.getDangerMeter());
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