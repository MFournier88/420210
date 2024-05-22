package files;
import java.io.*;


public class Main {
        public static void main(String[] args) {
            // File paths

            String filePath = "src/files/example.txt";

            // Writing to a file
            try {
                FileWriter writer = new FileWriter(filePath,true);
                writer.write("Hello, world!");
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
            String str = "Bonjour, le monde ! Ceci est un exemple de division de chaîne en Java.";

            // Division de la chaîne en fonction des espaces
            String[] parties = str.split("\\s+"); // Division par un ou plusieurs caractères d'espace
            for (String partie : parties) {
                System.out.println(partie);
            }

            // Division de la chaîne en fonction de la virgule et de l'espace
            String[] parties2 = str.split(",\\s*"); // Division par une virgule suivie de zéro ou plusieurs caractères d'espace
            for (String partie : parties2) {
                System.out.println(partie);
            }
            // Division de la chaîne en fonction de e
            String[] parties3 = str.split("e"); // Division par une virgule suivie de zéro ou plusieurs caractères d'espace
            for (String partie : parties3) {
                System.out.println(partie);
            }

            String cheminFichier = "/src/files/example.txt";
            File file = new File(cheminFichier);
            if (!file.exists()) {
                System.err.println("File does not exist.");
                return;
            }
            try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))) {
                String ligne;
                while ((ligne = reader.readLine()) != null) {
                    System.out.println("Ligne lue : " + ligne);
                }
            } catch (FileNotFoundException e) {
                System.err.println("Le fichier spécifié est introuvable : " + cheminFichier);
                e.printStackTrace();
            } catch (IOException e) {
                System.err.println("Une erreur est survenue lors de la lecture du fichier : " + cheminFichier);
                e.printStackTrace();
            }

        }
}
