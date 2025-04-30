package solution_exo.serie2;
import java.util.Scanner;
import java.util.ArrayList;
public class Exo016V2{
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
                    String prixFormatter = String.format("%.02f$", prix[i]);

                    System.out.printf("%-20s%7s\n",(i+1) + ". " + plats[i], prixFormatter);
                }
                for(int k = 0 ; k < 3 ; k++){
                    System.out.print("Entrez le numéro de l'item : ");

                    choix = scanner.nextLine();
                    try{
                        facture.add(plats[Integer.parseInt(choix) - 1]);
                        break;
                    }catch(NumberFormatException e){
                        System.out.println("Votre choix est invalide");
                    }
                }
            }
            else if(choix.equals("2")){
                
                afficherReçu(facture, prix);
                for(int k = 0 ; k < 3 ; k++){
                    System.out.print("Quel item voulez-vous retirer : ");
                    choix = scanner.nextLine();
                    try{
                        facture.remove(Integer.parseInt(choix)-1);
                        break;
                    }catch(NumberFormatException e){
                        System.out.println("Votre choix est invalide");
                    }
                }
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
            else{
                System.out.println("Votre choix est invalide");
            }
            scanner.nextLine();
      

        }
    }
    public static void afficherReçu(ArrayList<String> facture, float[] prix){
        double total = 0;
        for(int i = 0 ; i <  facture.size() ; i++){
            total += prix[i];
            String prixFormatter = String.format("%.02f$", prix[i]);
            System.out.printf("%-20s%7s\n",(i+1) + ". " + facture.get(i), prixFormatter);


        }
        System.out.println("----------------------------");
        String totalFormatter = String.format("%.02f$",total);

        System.out.printf("%-20s%7s\n","Total", totalFormatter);

    }
}