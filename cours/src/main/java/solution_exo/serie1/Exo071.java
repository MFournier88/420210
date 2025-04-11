package solution_exo.serie1;
// # Exo_71

// Niveau : 4 ⭐

// Créer un menu pour gérer un reçu avec des options pour ajouter ou retirer des items.

// **Exercice** :
// - Créez un tableau de `String` pour les noms des plats : `["Crevette", "Salade", "Frite", "Hamburger", "Gâteau"]`.
// - Créez un tableau de `float` pour les prix des plats correspondants : `[8.99, 5.60, 6.40, 10.99, 7.99]`.
// - Implémentez un menu interactif avec les options suivantes :
//   1. Ajouter un item.
//   2. Retirer un item.
//   3. Afficher le reçu (afficher les plats ajoutés et le total).
//   4. Terminer la transaction (Afficher le reçu, écrire un message d'adieu et arrête le programme).
// - À chaque ajout d'item, le prix du plat sera ajouté au total de la facture.
// - À chaque retrait d'item, le prix du plat sera soustrait du total de la facture.

// **Exemple de sortie attendue** :

// ```
// Menu :
// 1. Ajouter un item
// 2. Retirer un item
// 3. Afficher le reçu
// 4. Terminer la transaction
// Total de la facture actuelle : 0.00$

// Entrez votre choix : 1
// Choisissez un item à ajouter :
// 1. Crevette           8.99$
// 2. Salade             5.60$
// 3. Frite              6.40$
// 4. Hamburger         10.99$
// 5. Gâteau             7.99$


// Entrez le numéro de l'item : 1
// Plat ajouté : Crevette
// Total de la facture actuelle : 8.99$

// Menu :
// 1. Ajouter un item
// 2. Retirer un item
// 3. Afficher le reçu
// 4. Terminer la transaction
// Total de la facture actuelle : 8.99$

// Entrez votre choix : 3
// Reçu :

// Crevette              8.99$
// ---------------------------
// Total                 8.99$


// Menu :
// 1. Ajouter un item
// 2. Retirer un item
// 3. Afficher le reçu
// 4. Terminer la transaction
// Total de la facture actuelle : 8.99$

// Entrez votre choix : 4

// Crevette              8.99$
// ---------------------------
// Total                 8.99$

// Merci pour votre visite!

// ```

// ---
import java.util.Scanner;
import java.util.ArrayList;
public class Exo071{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> facture = new ArrayList<>();


        String[] plats = {"Crevette", "Salade", "Frite", "Hamburger", "Gâteau"};
        float[] prix = {8.99f, 5.60f, 6.40f, 10.99f, 7.99f};
        while(true){
            System.out.println("");

            System.out.println("1. Ajouter un item");
            System.out.println("2. Retirer un item");
            System.out.println("3. Afficher le reçu");
            System.out.println("4. Terminer la transaction");
            String choix = scanner.nextLine();
            System.out.println("Vous avez choisi : " + choix);
            System.out.println("Appuyer sur enter pour continuer");
            System.out.println("");
            if(choix.equals("1")){
                for(int i = 0 ; i < plats.length ; i++){
                    System.out.printf("%d. %-14s%10.02f$\n",(i+1) , plats[i], prix[i]);
                }

                System.out.print("Entrez le numéro de l'item : ");
                choix = scanner.nextLine();
                facture.add(plats[Integer.parseInt(choix) - 1]);
            }
            else if(choix.equals("2")){
                
                afficherReçu(facture, prix);

                System.out.print("Quel item voulez-vous retirer : ");
                choix = scanner.nextLine();
                facture.remove(Integer.parseInt(choix) - 1);
            }
            else if(choix.equals("3")){
                afficherReçu(facture, prix);
            }
            else if(choix.equals("4")){
                afficherReçu(facture, prix);
                System.out.println();
                System.out.println("Merci pour votre visite!");
                break;
            }
            scanner.nextLine();
      

        }
    }
    public static void afficherReçu(ArrayList<String> facture, float[] prix){
        double total = 0;
        for(int i = 0 ; i <  facture.size() ; i++){
            total += prix[i];
            String prixFormatter = String.format("%.02f$", prix[i]);
            System.out.printf("%d. %-13s%10.02f$\n",(i+1) , facture.get(i), prix[i]);


        }
        System.out.println("---------------------------");
        System.out.printf("%-16s%10.2f$\n","Total", total);
        
    }
}