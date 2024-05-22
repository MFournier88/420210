package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EcrireUsage {
    public static void main(String[] args) {
        // File paths
        String filePath = "src/files/user.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("File does not exist.");
            return;
        }


        // Writing to a file
        try {
            FileWriter writer = new FileWriter(filePath,true);
            System.out.print("Entre prenom/nom/mdp : ");
            Scanner scan = new Scanner(System.in);
            writer.write(scan.next());
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

    }

}
