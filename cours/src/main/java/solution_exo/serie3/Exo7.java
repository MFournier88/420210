package solution_exo.serie3;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Exo7 {
    static final int NUM_FOOD = 100;
    static final int NUM_PLAYER = 4;
    static final int NUM_BOSS = 4;
    static final int OBJECT_WIDTH = 15;
    static final int NB_OBJ_PER_LINE = 10;
    public static String highLight(String msg, String color){
        switch (color) {
            case "red":
                return String.format("\u001B[41m%-" + OBJECT_WIDTH + "s\u001B[0m", msg);
                
        
            default:
                return msg;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        
        Random rand = new Random(213);
        ArrayList<Objet> game = new ArrayList<>(1000);
        for(int i = 0; i < NUM_FOOD; i++){
            game.add(new Food(rand.nextInt(1000) + 1));
        }
        for(int i = NUM_FOOD; i < NUM_FOOD + NUM_PLAYER; i++){
            game.add(new Player(rand.nextInt(10000) + 1001, String.valueOf(i - NUM_FOOD)));
        }
        for(int i = NUM_FOOD + NUM_PLAYER; i < NUM_FOOD + NUM_PLAYER + NUM_BOSS; i++){
            game.add(new Boss(rand.nextInt(10000) + 10001));
        }

        Collections.shuffle(game,rand);

        
        afficheListe(game);

        

        Thread.sleep(1000);

        while(game.size() > 0){
            if(turn(game, rand)){
                break;
            }
           
        }

    }

    static void afficheListe( ArrayList<Objet> game){
        System.out.print("\033[H\033[2J"); 
        int index = 0;

        for(Objet obj : game){
            if(index % NB_OBJ_PER_LINE == 0){
                System.out.println();
            }
            System.out.printf("%-" + OBJECT_WIDTH + "s", obj);
            index++;
        }
        if(game.size() == 1){
            System.out.println();
            return;
        }
        //Moving the cursor back to the beginning of the game
    
        System.out.print("\033[" + (game.size() / NB_OBJ_PER_LINE - (game.size() % NB_OBJ_PER_LINE == 0 ? 1 : 0)) + "A"); // Moves cursor up one line)
        
        System.out.print("\r"); // Place it at the beginning
    }
    static boolean turn(ArrayList<Objet> game, Random rand) throws InterruptedException{
        

        int nbRemoved = 0;

        
        boolean hasActed = false;

        int total = game.size();
        for(int i = 0; i + nbRemoved < total - 1; i++){
            if((i + nbRemoved) % NB_OBJ_PER_LINE == 0 && i != 0 ){
                System.out.print("\033[B\r"); // Moves cursor down one line
            }

            //hightlight before action
            // System.out.print(highLight(game.get(i).toString(), "red"));
            // System.out.print(game.get(i));
            
            //go back left
            // System.out.print("\u001B[" + OBJECT_WIDTH + "D");

            game.get(i).action(game.get(i+1));
            if(game.get(i).getXp() == 0){
                nbRemoved++;
                Thread.sleep(1000);
                System.out.print(highLight(game.get(i).toString(), "red"));
                
                // System.out.printf("%" + OBJECT_WIDTH + "s", "");
                i--;
                hasActed = true;
                game.remove(i);
                Thread.sleep(1000);
            }
            else if(game.get(i+1).getXp() == 0){
                nbRemoved++;
                Thread.sleep(1000);
                System.out.print(game.get(i));
                if((i + nbRemoved) % NB_OBJ_PER_LINE == 0 && i != 0 ){
                    System.out.print("\033[B\r"); // Moves cursor down one line
                    
                    // System.out.printf("%" + OBJECT_WIDTH + "s", "");
                    
                }
                
                System.out.print(highLight(game.get(i + 1).toString(), "red"));
                hasActed = true;
                Thread.sleep(1000);
                game.remove(i + 1);

            }
            else{
                System.out.print("\033[" + OBJECT_WIDTH + "C"); // Moves cursor to the right
            }

        }
        if(total % NB_OBJ_PER_LINE == 0 || (total - 1) % NB_OBJ_PER_LINE == 0 || total < NB_OBJ_PER_LINE){
            System.out.print("\033[B\r");
        }
        if(!hasActed){
            boolean hasPlayer = false;
            for(int i = 0; i < game.size(); i++){
                if(game.get(i) instanceof Player){
                    hasPlayer = true;
                    break;
                }
            }
            if(!hasPlayer || game.size() == 1){
                return true;
            }
            else{
                Collections.shuffle(game,rand);
                
                
            }
        }

        System.out.println("\033[" + OBJECT_WIDTH + "C" + "\n-----------------------------------");
        afficheListe(game);
        
        

        return false;
    }
}
enum Temperament{
    HOSTILE,
    PACIFIC
}
abstract class Objet{

    private int xp;
    private Temperament attitude;

    public void setAttitude(Temperament attitude) {
        this.attitude = attitude;
    }
    public Temperament getAttitude() {
        return attitude;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getXp() {
        return xp;
    }
    
    
    
    public int power() {
        if(attitude == Temperament.HOSTILE){
            return (int)(this.xp / 1000);
            
        }
        return 0;
    }


    public Objet(int xp, Temperament attitude){
        this.setAttitude(attitude);
        this.setXp(xp);
        
    }

    
    abstract void action(Objet next);

    public boolean shouldRemove(){
        if(xp == 0){
            return true;
        }
        return false;
    }

    abstract void takeXp(Objet obj);

    @Override
    public String toString() {
        return String.format("%d",this.xp);
    }
    
}

class Food extends Objet{
    public Food(int xp){
        super(xp,Temperament.PACIFIC);
     
    }

    @Override
    public void action(Objet next) {
        //Food does nothing   
    }
    
    @Override
    public void takeXp(Objet obj) {
        //Food does nothing 
    }  
    
}

class Boss extends Objet{
    public Boss(int hp){
        super(hp, Temperament.HOSTILE);
    }
    @Override
    public void action(Objet next) {
        //Boss only defends its self   
    }

    @Override 
    public void takeXp(Objet obj){
        obj.setXp(0);
    }
    @Override
    public String toString() {
        return String.format("B[%d:%d]",this.power(), this.getXp());
    }
}

class Player extends Objet{
    String nom;
    public Player(int hp, String nom){
        super(hp,Temperament.HOSTILE);
        this.nom = nom;
    }

    @Override
    public void action(Objet next) {
        if(next.getAttitude() == Temperament.HOSTILE){
            if(next.power() <= power()){
                takeXp(next);
            }
            else{
                next.takeXp(this);
            }
        }
        else{
            takeXp(next);
        }
    }

    @Override 
    public void takeXp(Objet obj){
        this.setXp(this.getXp() + obj.getXp());
        obj.setXp(0);
    }

    @Override
    public String toString() {
        return String.format("P(%s)[%d:%d]",this.nom, this.power(), this.getXp());
    }
}


/* HighLights
Noir	\u001B[40m
Rouge	\u001B[41m
Vert	\u001B[42m
Jaune	\u001B[43m
Bleu	\u001B[44m
Magenta	\u001B[45m
Cyan	\u001B[46m
Blanc	\u001B[47m

end \u001B[0m
 */

 /*
 Aller à la ligne X, colonne Y	\u001B[<X>;<Y>H ou f
Déplacer le curseur vers le haut N	\u001B[<N>A
Vers le bas	\u001B[<N>B
À droite	\u001B[<N>C
À gauche	\u001B[<N>D
Effacer l’écran	\u001B[2J
Effacer la ligne	\u001B[2K
Revenir au début de la ligne	\r 
*/