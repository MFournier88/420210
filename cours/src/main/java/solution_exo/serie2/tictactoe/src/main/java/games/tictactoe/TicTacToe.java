package solution_exo.serie2.tictactoe.src.main.java.games.tictactoe;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    private Box[][] grid = new Box[3][3];
    
    public TicTacToe(){
        byte count = 0;
        for(int i = 2; i >= 0 ; i--){
            for(int j = 0 ; j < 3 ; j++){
                count++;
                this.grid[i][j] = new Box(' ', (char)(count + 48));
            }
        }
    }
    public void play(){
        Scanner scan = new Scanner(System.in);
        byte countTurns = 0;
        char player = 'X';
        byte choix;
        while(true){

            if(countTurns % 2 == 0){
                player = 'X';
            }
            else{
                player = 'O';
            }
            this.afficherTicTacToe();
            System.out.print("C'est le tour des " + player + ":" );
            try{
                choix = scan.nextByte();
                choix -= 1;
                if(choix > 8 || choix < 0){
                    throw new Exception("Entrée invalide");
                }
                if(this.grid[2 - choix/3][choix%3].getValue() != 32){
                    throw new Exception("Entrée invalide");

                }

            }
            catch(Exception e){
                System.out.println(e);
                continue;
            }
            finally{
                scan.nextLine();

            }
            this.grid[2 - choix/3][choix%3].setValue(player);
            countTurns++;
            if(this.hasWon(player)){
                this.afficherTicTacToe();
                System.out.println("Player " + player + " WON!");
                break;
            }
        }
    }
    public void afficherTicTacToe(){
        System.out.printf("\n %s | %s | %s     %s | %s | %s\n",this.grid[0][0].afficherBox(true), this.grid[0][1].afficherBox(true), this.grid[0][2].afficherBox(true),this.grid[0][0].afficherBox(false), this.grid[0][1].afficherBox(false), this.grid[0][2].afficherBox(false));
        System.out.printf("-----------   -----------\n");
        System.out.printf(" %s | %s | %s     %s | %s | %s\n",this.grid[1][0].afficherBox(true), this.grid[1][1].afficherBox(true), this.grid[1][2].afficherBox(true),this.grid[1][0].afficherBox(false), this.grid[1][1].afficherBox(false), this.grid[1][2].afficherBox(false));
        System.out.printf("-----------   -----------\n");
        System.out.printf(" %s | %s | %s     %s | %s | %s\n\n",this.grid[2][0].afficherBox(true), this.grid[2][1].afficherBox(true), this.grid[2][2].afficherBox(true),this.grid[2][0].afficherBox(false), this.grid[2][1].afficherBox(false), this.grid[2][2].afficherBox(false));
    }
    

    //Probably a much more optimised way to do this
    public boolean hasWon(char val){
        for(int i = 0; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(this.grid[i][j].hasValue(val)){
                    if(j == 2){
                        return true;
                    }
                }
                else{
                    break;
                }
            }
        }
        for(int i = 0; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(this.grid[j][i].hasValue(val)){
                    if(j == 2){
                        return true;
                    }
                }
                else{
                    break;
                }
            }
        }

        if(this.grid[0][0].hasValue(val) && this.grid[1][1].hasValue(val) && this.grid[2][2].hasValue(val)){
            return true;
        }

        if(this.grid[0][2].hasValue(val) && this.grid[1][1].hasValue(val) && this.grid[2][0].hasValue(val)){
            return true;
        }
        return false;
    }
}
class Box{
    private char value = ' ';
    private char position;
    public Box(char value, char position) {
        this.value = value;
        this.position = position;
    }
    public char getValue() {
        return value;
    }
    public void setValue(char value) {
        this.value = value;
    }
    public char getPosition() {
        return position;
    }
    public void setPosition(char position) {
        this.position = position;
    }

    public char afficherBox(boolean option){
        if(option){
            return this.value;
        }
        else{
            return this.position;
        }
    }
    public boolean hasValue(char val){
        if(this.value == val){
            return true;
        }
        else{
            return false;
        }
    }
    
}