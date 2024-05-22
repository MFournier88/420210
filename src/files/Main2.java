package files;
import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // File paths
        String filePath = "src/files/data.txt";
        somme(filePath);

    }
    public static void somme(String filePath){
        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("File does not exist.");
            return;
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un nombre ou somme : ");
        String choix ;
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("");
            writer.close();
            writer = new FileWriter(filePath,true);


            while (true) {
                choix = scan.nextLine();
                if (choix.equals("somme")) {
                    break;
                }
                // Writing to a file
                writer.write(choix + "\n");

                System.out.println("Successfully wrote to the file.");

            }
            writer.close();
        }catch (IOException e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        int somme = 0;
        int count = 0;
        // Reading from a file
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                somme += Integer.parseInt(line);
                count++;
            }


            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(String.valueOf((int)(somme/count)));

            writer.close();
        }catch (IOException e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

    }
    public static void connexion(String filePath){
        Scanner scan = new Scanner(System.in);
        String mdp = "";
        System.out.print("Entrez prenom nom ");
        String[] prenomNom = scan.nextLine().split("\\s+");
        System.out.print("Entrez votre mdp ");
        mdp = scan.next();

        // Reading from a file
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            String[] info;
            boolean connexionEtablie = false;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split("/");

                if(info[0].equals(prenomNom[0]) && info[1].equals(prenomNom[1]) && info[2].equals(mdp)){
                    System.out.println("Connexion établie bravo!");
                    connexionEtablie = true;
                    break;
                }
            }
            if(!connexionEtablie){
                System.out.println("Désolée mauvaise information");
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }

    }
    public static void ecrireMdp(String filePath){
        // Writing to a file
        try {
            FileWriter writer = new FileWriter(filePath,true);
            writer.write("\nHello, world!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}