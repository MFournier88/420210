package solution_exo.serie3;

public class Cursor {
    public static void main(String[] args) throws InterruptedException  {
        System.out.print("Hi my dear, I would like to buy a cofe");
        // Wait a little for the output to be visible
        Thread.sleep(1000);

        // Move the cursor 12 positions to the left
        System.out.print("\033[12D"); // Moves cursor 12 positions left

        // Overwrite the last 12 characters with spaces
        System.out.print("            "); 

        System.out.print("\033[20C"); // Moves cursor 10 positions to the right
        System.out.println("bouh!");
        // Print some initial lines to simulate output
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3--------------------------------------------");

        // Wait a little for the output to be visible
        Thread.sleep(1000);

        // Move the cursor up one line
        System.out.print("\033[A"); // Moves cursor up one line

        // Print a new line after moving the cursor
        System.out.print("This is a new line after moving up.");
        System.out.print("\033[B\r"); // Moves cursor down one line


        // Print some initial lines to simulate output
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");

        // Wait a little to let the user see the output
        Thread.sleep(1000);

        // Save the cursor position
        System.out.print("\033[s");

        // Move the cursor to another position and print something
        System.out.print("\033[10;10H"); // Move the cursor to line 10, column 10
        System.out.println("This is at (10, 10)");

        // Wait a moment to let the new text be visible
        Thread.sleep(1000);

        // Restore the cursor position to where it was saved
        System.out.print("\033[u");

        // Print some more lines to show the cursor is back in its original position
        System.out.println("Back to the original position.");
        }
}
