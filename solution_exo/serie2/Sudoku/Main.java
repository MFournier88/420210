package Sudoku;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        /* 
         * 
         *                       ÉTAPE 1 : DÉCLARATION DES VARIABLES
         * 
         */
        //1.1 J'importe le Sudoku à résoudre sous forme de tableau 2 dimensions d'entiers nommé problème
        int[][] probleme = Problemes.probleme1();

        //1.2 J'instancie un tableau de Case 9x9 qui va traduire mon probleme en un objet plus utile nommé sudoku
        Case[][] sudoku = new Case[9][9];

        //1.3 J'instancie un tableau de 27 groupes, il me servira à différencier les 27 groupes avec
        //   des règles dans un Sudoku : 9 lignes, 9 colonnes, 9 boites (3 x 3)
        Groupes[] groupes = new Groupes[27];

        //1.4 J'instancie un tableau de 9 Coordonne, il me servira pour mettre les coordonnées respectives de chaque groupe, je le nomme coords
        Coordonne[] coords = new Coordonne[9];


        test1(probleme, sudoku, groupes, coords);
       
       
       
        

        /*
         * 
         *                        ÉTAPE 2 : ASSIGNATION DES VARIABLES
         * 
         */
        //2.1 J'assigne à toutes les Cases de sudoku l'objet Case avec les bons paramètres initials
        for(int i = 0; i < 9 ; i++){
            for(int j = 0; j < 9 ; j++){
                sudoku[i][j] = new Case(new Coordonne(i, j));
            }
        }
        



        /*                      Coordonnées
         * (0,0) (0,1) (0,2)  (0,3) (0,4) (0,5)  (0,6) (0,7) (0,8)
         * (1,0) (1,1) (1,2)  (1,3) (1,4) (1,5)  (1,6) (1,7) (1,8)
         * (2,0) (2,1) (2,2)  (2,3) (2,4) (2,5)  (2,6) (2,7) (2,8)
         *
         * (3,0) (3,1) (3,2)  (3,3) (3,4) (3,5)  (3,6) (3,7) (3,8)
         * (4,0) (4,1) (4,2)  (4,3) (4,4) (4,5)  (4,6) (4,7) (4,8)
         * (5,0) (5,1) (5,2)  (5,3) (5,4) (5,5)  (5,6) (5,7) (5,8)
         *
         * (6,0) (6,1) (6,2)  (6,3) (6,4) (6,5)  (6,6) (6,7) (6,8)
         * (7,0) (7,1) (7,2)  (7,3) (7,4) (7,5)  (7,6) (7,7) (7,8)
         * (8,0) (8,1) (8,2)  (8,3) (8,4) (8,5)  (8,6) (8,7) (8,8)
         *
         * 
         * 
         */
        // 2.2 Les indices [0,8] correspondent aux lignes du sudoku. Pour chaque ligne, je crée d'abord un tableau de 9 objets Coordonne,
        // puis je les initialises avec les coordonnées correspondantes à chaque colonne de la ligne. Ensuite, je crée un objet Groupes
        // en utilisant le tableau de Coordonne, et je l'assigne à la ligne correspondante du tableau 'groupes'.
        // Ce processus est répété pour chaque ligne.
        for(int ligne = 0 ; ligne < 9 ; ligne++){
            coords = new Coordonne[9];
            for(int j = 0; j < 9 ; j++){
                coords[j] = new Coordonne(ligne, j);
            }
            groupes[ligne] = new Groupes(sudoku, coords);
        }

        // Les indices [9, 17] correspondent aux colonnes du sudoku. Pour chaque colonne, je crée d'abord un tableau de 9 objets Coordonne,
        // puis je les initialises avec les coordonnées correspondantes à chaque ligne de la colonne. Ensuite, je crée un objet Groupes
        // en utilisant ce tableau de Coordonne et je l'assigne à la position correspondante du tableau 'groupes' (indices [9, 17]).
        // Ce processus est répété pour chaque colonne.
        for(int col = 0 ; col < 9 ; col++){
            coords = new Coordonne[9];
            for(int i = 0; i < 9 ; i++){
                coords[i] = new Coordonne(i, col);
            }
            groupes[9 + col] = new Groupes(sudoku, coords);
        }
               
        // Les indices [18, 26] correspondent aux boites du sudoku. Pour chaque boite, je crée d'abord un tableau de 9 objets Coordonne,
        // puis je les initialises avec les coordonnées correspondantes à chaqu'une des neuf cases correspondante. Ensuite, je crée un objet Groupes
        // en utilisant ce tableau de Coordonne et je l'assigne à la position correspondante du tableau 'groupes' (indices [18, 26]).
        // Ce processus est répété pour chaque colonne.
        /*
         * 0 0 0  1 1 1  2 2 2
         * 0 0 0  1 1 1  2 2 2
         * 0 0 0  1 1 1  2 2 2
         * 
         * 3 3 3  4 4 4  5 5 5
         * 3 3 3  4 4 4  5 5 5
         * 3 3 3  4 4 4  5 5 5
         * 
         * 6 6 6  7 7 7  8 8 8
         * 6 6 6  7 7 7  8 8 8
         * 6 6 6  7 7 7  8 8 8
         */

        for(int boite = 0 ; boite < 9 ; boite++){
            coords = new Coordonne[9];
            for(int i = 0; i < 3 ; i++){
                for(int j = 0 ; j < 3 ; j++){
                    coords[i * 3 + j] = new Coordonne(boite / 3 * 3 + i, (boite % 3) * 3 + j);
                }
            }
            groupes[18 + boite] = new Groupes(sudoku, coords);
        }

       
        for(int i = 0; i < 9 ; i++){
            for(int j = 0; j < 9 ; j++){
                if(sudoku[i][j].setValue(probleme[i][j])){
                    //Maj Ligne
                    groupes[i].retirerValeurPossible(probleme[i][j]);
                    //Maj Colonne
                    groupes[j + 9].retirerValeurPossible(probleme[i][j]);
                    //Maj Boite
                    groupes[i / 3 * 3 + j / 3 + 18].retirerValeurPossible(probleme[i][j]);

                }
            }
        }
        test2_1(sudoku);
        test2_2(groupes);
        test2_3(groupes);
        test2_4(groupes);
        test2_5(groupes);


        
        /*
         * 
         *                        ÉTAPE 3 : Afficher le sudoku
         * 
         */
        afficheSudoku(sudoku);

        //Le test ici est visuel XD


        /*
         * 
         *                        ÉTAPE 4 : Résoudre le sudoku
         * 
         * 
        */
        /*
        * Cette boucle est infinie et s'arrête lorsque tous les groupes sont complétés.
        * À chaque itération, elle affiche "Loop #", suivi du numéro de la boucle.
        * Ensuite, elle parcourt chaque groupe pour vérifier s'il est terminé.
        * Si un groupe n'est pas terminé, la méthode `findAndSetPlaceableCase()` tente de lui assigner une valeur.
        * Si une valeur est assignée, les lignes, colonnes et boîtes correspondantes sont mises à jour.
        * Après chaque itération, le code vérifie de nouveau si le groupe est terminé.
        * 
        * À chaque itération de la boucle, l'état actuel du Sudoku est affiché.
        */

        int i = 1;
        Boolean allDone = false;
        while(!allDone){
            allDone = true;
            System.out.println("Loop #" + i);
            System.out.println();
            int idx = -2;
            for(int groupe = 0 ; groupe < groupes.length - 9 ; groupe++){
                idx = -2;
                if(groupes[groupe].nbLeft != 0){
                    while(idx != -1){
                        idx = groupes[groupe].findAndSetPlaceableCase();
                        if(idx!=-1){
                             //Maj Ligne
                            groupes[groupes[groupe].cases[idx].coord.x].retirerValeurPossible(groupes[groupe].cases[idx].value );
                            //Maj Colonne
                            groupes[groupes[groupe].cases[idx].coord.y + 9].retirerValeurPossible(groupes[groupe].cases[idx].value );
                            //Maj Boite
                            groupes[groupes[groupe].cases[idx].coord.x / 3 * 3 + groupes[groupe].cases[idx].coord.y / 3 + 18].retirerValeurPossible(groupes[groupe].cases[idx].value );

                        }
                    }

                    if(groupes[groupe].nbLeft != 0){
                        allDone = false;
                    }
                }
                
            }    
            afficheSudoku(sudoku);   
            // System.exit(0);     
            i++;
        }
        /*
            8     |   1   |      
            4     | 7   2 | 9    
              9 2 | 3     |      
            ---------------------
                  |   4   | 8    
              4 1 | 8     | 7 9  
                8 |       |   6 3
            ---------------------
            2 3   |   7   |      
                  |       |   7 5
                  | 1 9   |   4  

            Loop #0


            8   3 |   1   |   2  
            4     | 7   2 | 9 3  
              9 2 | 3     |      
            ---------------------
            3     |   4   | 8   1
              4 1 | 8 3   | 7 9 2
                8 |       | 4 6 3
            ---------------------
            2 3   |   7   |     9
                  |       |   7 5
                  | 1 9 3 | 2 4  

            Loop #1


            8   3 |   1 9 |   2  
            4 1   | 7   2 | 9 3  
              9 2 | 3     |      
            ---------------------
            3 2 6 |   4 7 | 8 5 1
            5 4 1 | 8 3   | 7 9 2
            9 7 8 |     1 | 4 6 3
            ---------------------
            2 3 4 |   7   |     9
            1   9 |       | 3 7 5
                  | 1 9 3 | 2 4  

            Loop #2


            8 6 3 |   1 9 | 5 2 7
            4 1 5 | 7   2 | 9 3 6
            7 9 2 | 3     |   8 4
            ---------------------
            3 2 6 | 9 4 7 | 8 5 1
            5 4 1 | 8 3 6 | 7 9 2
            9 7 8 |     1 | 4 6 3
            ---------------------
            2 3 4 |   7   |   1 9
            1 8 9 |     4 | 3 7 5
            6 5 7 | 1 9 3 | 2 4 8

            Loop #3


            8 6 3 | 4 1 9 | 5 2 7
            4 1 5 | 7 8 2 | 9 3 6
            7 9 2 | 3 6 5 | 1 8 4
            ---------------------
            3 2 6 | 9 4 7 | 8 5 1
            5 4 1 | 8 3 6 | 7 9 2
            9 7 8 | 2 5 1 | 4 6 3
            ---------------------
            2 3 4 | 5 7 8 | 6 1 9
            1 8 9 | 6 2 4 | 3 7 5
            6 5 7 | 1 9 3 | 2 4 8

            Loop #4


            8 6 3 | 4 1 9 | 5 2 7
            4 1 5 | 7 8 2 | 9 3 6
            7 9 2 | 3 6 5 | 1 8 4
            ---------------------
            3 2 6 | 9 4 7 | 8 5 1
            5 4 1 | 8 3 6 | 7 9 2
            9 7 8 | 2 5 1 | 4 6 3
            ---------------------
            2 3 4 | 5 7 8 | 6 1 9
            1 8 9 | 6 2 4 | 3 7 5
            6 5 7 | 1 9 3 | 2 4 8
        */
       
    }
    
    public static void afficheSudoku(Case[][] sudoku){
        /* Résultat attendu :
            8     |   1   |      
            4     | 7   2 | 9    
              9 2 | 3     |      
            ---------------------
                  |   4   | 8    
              4 1 | 8     | 7 9  
                8 |       |   6 3
            ---------------------
            2 3   |   7   |      
                  |       |   7 5
                  | 1 9   |   4  
         */
        System.out.println();

        for(int i = 0; i < 9 ; i++){
            System.out.printf("%c %c %c | %c %c %c | %c %c %c\n",cvrtChiffre(sudoku[i][0].value), cvrtChiffre(sudoku[i][1].value), cvrtChiffre(sudoku[i][2].value), cvrtChiffre(sudoku[i][3].value), cvrtChiffre(sudoku[i][4].value), cvrtChiffre(sudoku[i][5].value), cvrtChiffre(sudoku[i][6].value), cvrtChiffre(sudoku[i][7].value), cvrtChiffre(sudoku[i][8].value));
            if(i == 2 || i == 5){
                System.out.println("---------------------");
            }
        }
        System.out.println();

    }
    public static char cvrtChiffre(int x){
        if(x == 0){
            return ' ';
        }
        else{
            return (char)(x + 48);
        }

    }

    /*
     *              TESTS
     */
    public static void test1(int[][] probleme, Case[][] sudoku, Groupes[] groupes, Coordonne[] coords){
        
        String msg = "La suite de test 1 est réussie";
        String mem = msg;
        try {
            if(!Arrays.deepEquals(probleme, Problemes.probleme1())){
                msg = "Test 1.1 : Échoué";
            }
            else if(!(sudoku[8][8] == null) || sudoku[0].length != 9){
                msg = "Test 1.2 : Échoué";
            }
            else if(!(groupes[6] == null) || groupes.length != 27){
                msg = "Test 1.3 : Échoué";
            }
            else if(!(coords[5] == null) || coords.length != 9){
                msg = "Test 1.3 : Échoué";
            }
           
        } catch (Exception e) {
            
            msg = "Test 1 : Échec";
        }
        
        System.out.println(msg);
        if(!msg.equals(mem)){
            System.exit(0);
        }
    }
    public static void test2_1(Case[][] sudoku){
        if(sudoku[4][6].value == 7 && sudoku[4][6].coord.x == 4 && sudoku[4][6].coord.y == 6){
            System.out.println("Le test 2.1 est réussi");
            return;
        }
        System.out.println("Test 2.1 : Échec");

    }
    public static void test2_2(Groupes[] groupes){
        if(groupes[2].cases[2].value != 2){
            System.out.println("Test 2.2 Failed");
            System.exit(0);
        }
        System.out.println("Le test 2.2 est réussi");

    }
    public static void test2_3(Groupes[] groupes){
        if(groupes[12].cases[1].value != 7){
            System.out.println("Test 2.3 Failed");
            System.exit(0);
        }
        System.out.println("Le test 2.3 est réussi");

    }
    public static void test2_4(Groupes[] groupes){
        if(groupes[21].cases[4].value != 4){
            System.out.println("Test 2.4 Failed");
            System.exit(0);
        }
        System.out.println("Le test 2.4 est réussi");

    }
    public static void test2_5(Groupes[] groupes){
        if(!Arrays.deepEquals(groupes[8].cases[6].valeurPossibles,new Boolean[]{false,true,true,false,false,true,false,false,false})){
            System.out.println("Test 2.5 Failed");
            System.exit(0);
        }
        System.out.println("Le test 2.5 est réussi");

    }
   
}
