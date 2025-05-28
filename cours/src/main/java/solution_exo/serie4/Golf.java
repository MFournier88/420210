package solution_exo.serie4;







/*Chantier */
















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
public class Golf{
    final static int ARENA_WIDTH = 128;
    final static int ARENA_HIGHT = 16;
    public static void main(String[] args) throws InterruptedException{
        System.out.print("\033[H\033[2J");
        System.out.flush();
        loadArena();
    }
    static void loadArena() throws InterruptedException{
        for(int i = 0 ; i < ARENA_HIGHT; i++){
            System.out.println("|");
            Thread.sleep(15);
        }
        for(int i = 0 ; i < ARENA_WIDTH; i++){
            System.out.print("-");
            Thread.sleep(5);
        }
        
        for(int i = 0 ; i < ARENA_HIGHT; i++){
            System.out.print("\u001B[1D\u001B[1A");
            System.out.print("|");
            Thread.sleep(15);
        }
        System.out.print("\u001B[1D\u001B[1A");

        for(int i = 0 ; i < ARENA_WIDTH; i++){
            System.out.print("-\u001B[2D");
            Thread.sleep(5);
        }


    }
}
