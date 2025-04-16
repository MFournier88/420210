package snake;
import java.io.*;

public class KeystrokeExample {
    public static void main(String[] args) throws IOException {
        // Read a single byte (keystroke) at a time
        InputStream in = System.in;

        // Disable buffering to capture keystrokes immediately
        System.out.println("Press any key (Press 'q' to quit):");

        while (true) {
            int key = in.read(); // Reads a single byte of input (blocking)
            char ch = (char) key;

            System.out.println("You pressed: " + ch);

            if (ch == 'q') {
                break;  // Exit on pressing 'q'
            }
        }
    }
}
