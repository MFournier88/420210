import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] plats = {"Crevette", "Salade", "Frite", "Hamburger", "Gâteau"};
        float[] prix = {8.99f, 5.60f, 6.40f, 10.99f, 7.99f};
        Scanner scanner = new Scanner(System.in);
        int[] facture = new int[plats.length];
        String choix;
        while(true){
            System.out.println("Menu:");
            System.out.println("1. Ajouter un item");
            System.out.println("2. Retirer un item");
            System.out.println("3. Afficher le reçu");
            System.out.println("4. Terminer la transaction");
            System.out.printf("Total de la facture actuelle : %.02f$\n\n", sommeTab(facture, prix));
            
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextLine();

            if(choix.equals("1")){
                System.out.println("Choisissez un item à ajouter : ");
                for(int i = 0 ; i < plats.length; i++){
                    System.out.printf("%d. %s %.02f$\n",i, plats[i], prix[i]);
                }

                System.out.print("\n\nEntrez le numéro de l'item : ");
                choix = scanner.nextLine();
                facture[Integer.parseInt(choix)] += 1;
                System.out.println("Plat ajouté : " + (plats[Integer.parseInt(choix)]));
                System.out.printf("Total de la facture actuelle : %.02f$\n", sommeTab(facture, prix));
            }
            else if(choix.equals("3")){
                System.out.println("Reçu:\n");
                float total = 0;
                for(int i = 0; i < plats.length; i++){
                    if(facture[i] > 0){
                        String nomFormatter = String.format("%s (x%d)", plats[i], facture[i]);
                        String prixFormatter = String.format("%.02f$", facture[i] * prix[i]);
                        System.out.println(nomFormatter + " ".repeat(27 - prixFormatter.length() - nomFormatter.length()) + prixFormatter );
                        total += facture[i] * prix[i];
                    }
                    
                }
                System.out.println("---------------------------");
                System.out.printf("Total %.02f$\n\n",total);
            }


            scanner.nextLine();


            
        }


    }
    public static float sommeTab(int[] facture, float[] prix){
        float somme = 0;
        for(int i = 0; i < facture.length; i++){
            somme += facture[i] * prix[i];
        }
        return somme;
    }
}
