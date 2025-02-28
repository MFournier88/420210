package Sudoku;

public class Groupes {
    Case[] cases = new Case[9];
    int nbLeft = 9;

    Boolean[] valeurPossibles = {true,true,true,true,true,true,true,true,true};

    public Groupes(Case[][] sudoku, Coordonne[] coords){
        for(int idx = 0 ; idx < cases.length ; idx++){
            this.cases[idx] = sudoku[coords[idx].x][coords[idx].y];
        }
    }
    public void afficheValeurPossibles(){
        String msg = "";
        for(int i = 0; i < 9; i++){
            msg += (i + 1) + ":" + this.valeurPossibles[i] + " ";
        }
        System.out.println(msg);
    }
    public void retirerValeurPossible(int val){
        for(int i = 0; i < 9 ; i++){
                cases[i].valeurPossibles[ val - 1 ] = false;
               
        }
        this.valeurPossibles[val - 1] = false;
        nbLeft--;

    }
    
    public int findAndSetPlaceableCase(){
        int idx = 0;
        int nbPoss;
        for(int i = 0 ; i < 9 ; i++){
            nbPoss = 0;
            if(this.valeurPossibles[i]){
                for(int j = 0 ; j < 9 ; j++){
                    if(cases[j].valeurPossibles[i]){
                        if(cases[j].isLastPossible(i+1)){
                            cases[j].setValue(i+1);
                            return j;
                        }
                        idx = j;
                        nbPoss++;
                    }
                }
                if(nbPoss==0){
                    System.out.println("Sudoku impossible ou erreur dans le code : findAndSetPlaceableCase");
                    System.exit(0);
                }

                if(nbPoss==1){
                    cases[idx].setValue(i+1);
                    return idx;
                }
            }
        }
        return -1;
    }

    

    public static void main(String[] args) {
        // Création d'un sudoku (exemple simplifié, avec quelques cases déjà remplies)
        Case[][] sudoku = new Case[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = new Case(new Coordonne(i, j));  // Crée un sudoku avec des cases vides
            }
        }
    
        // Définir des coordonnées pour un groupe (par exemple, une ligne, une colonne ou une sous-grille)
        Coordonne[] coords = new Coordonne[9];

        // Remplir coords avec les coordonnées des cases dans le groupe (par exemple, une ligne)
        for(int j = 0 ; j < 9 ; j++){
            coords[j] = new Coordonne(0, j);
        }
        // Créer un groupe
        Groupes groupe = new Groupes(sudoku, coords);
    
        //Afficher les valeurs possibles
        groupe.afficheValeurPossibles();

        // Retirer une valeur possible (par exemple, la valeur 5) du groupe
        groupe.retirerValeurPossible(5);

        //5 devrait être retiré
        groupe.afficheValeurPossibles();
    
        testFindPlaceable(groupe, "Ne devrait pas placer : ");


        groupe.retirerValeurPossible(1);
        groupe.retirerValeurPossible(2);
        groupe.retirerValeurPossible(3);
        groupe.retirerValeurPossible(4);
        groupe.retirerValeurPossible(6);
        groupe.retirerValeurPossible(8);


        testFindPlaceable(groupe, "Ne devrait pas placer : ");

      
        groupe.retirerValeurPossible(9);
        testFindPlaceable(groupe, "Devrait placer à l'index 0 : ");
        groupe.afficheValeurPossibles();

       
        groupe.retirerValeurPossible(7);
        groupe.afficheValeurPossibles();
        testFindPlaceable(groupe, "Ne devrait pas placer : ");


        //Cas 2
        groupe = new Groupes(sudoku, coords);


        testFindPlaceable(groupe, "Ne devrait pas placer : ");



        //Mettre une case mûre
        groupe.cases[3].valeurPossibles = new Boolean[]{false,true,false,false,false,false,false,false,false};
        
        //Should place at index 3
        testFindPlaceable(groupe,"Devrait placer à l'index 3 : ");
        
    }
    public static void testFindPlaceable(Groupes groupe, String should){
        int index = groupe.findAndSetPlaceableCase();
        System.out.print(should);
        if(index == -1){
            System.out.println("Aucune case à remplir");
        }
        else{
            System.out.println("Case remplie à l'index : " + index);
        }
    }
}   
