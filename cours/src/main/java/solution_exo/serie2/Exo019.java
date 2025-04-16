// package solution_exo.serie2;
// class CompteBancaire {
//     String titulaire;  // 
//     double solde      // 1

//     // Constructeur pour initialiser le titulaire et le solde
//     public CompteBancaire(Byte titulaire, double solde) { //2
//         this.titulaire = titulaire;
//         this.solde; //3
//     }

//     // Méthode pour déposer un montant sur le compte
//     public void deposer(double montant) {
//         if (montant > 0) {
//             solde = montant; //4
//             System.out.println("Montant déposé : " + montant + "€");
//         } else {
//             System.println("Le montant à déposer doit être positif."); //5
//         }
//     }

//     // Méthode pour retirer un montant du compte
//     public static void retirer(double montant) {//6
//         if (montant > 0 && montant <= solde) {
//             solde -= montant;
//             System.out.println("Montant retiré : " + montant + "€");
//         } else if (montant < solde) { //7
//             System.out.println("Solde insuffisant. Retrait impossible.");
//         } else {
//             System.out.println("Le montant à retirer doit être positif.");
//         }
//     }

//     // Méthode pour afficher le solde du compte
//     public void afficherSolde() {
//         System.out.println("Solde actuel : "  solde  "€");//7
//     }

//     // Méthode pour afficher les informations du titulaire et son solde
//     public void afficherInfo() {
//         System.out.println("Titulaire : " + titulaire + ", Solde : " + solde + "€");
//     }
// }
// //8 this.


// /*
//  * Il n'y a pas d'erreur dans la partie ci-dessous
//  * 
//  */
// public class Exo019 {
//     public static void main(String[] args) {
//         // Création de plusieurs instances de la classe CompteBancaire
//         CompteBancaire compte1 = new CompteBancaire("Alice", 1000);
//         CompteBancaire compte2 = new CompteBancaire("Bob", 500);

//         // Effectuer des dépôts
//         compte1.deposer(200);  // Déposer 200€ sur le compte d'Alice
//         compte2.deposer(50);   // Déposer 50€ sur le compte de Bob

//         // Effectuer des retraits
//         compte1.retirer(300);  // Retirer 300€ du compte d'Alice
//         compte2.retirer(600);  // Essayer de retirer 600€, mais solde insuffisant

//         // Afficher les résultats
//         compte1.afficherInfo();  // Afficher les informations du compte d'Alice
//         compte2.afficherInfo();  // Afficher les informations du compte de Bob
//     }
// }

