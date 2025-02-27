package Sudoku;
public class Case {
    /*
     * Voici les attributs
     */

    // Les coordonnées dans le sudoku qui correspondent au (x,y) le coin en haut à gauche est (0,0) et en bas à droite (8,8)
    Coordonne coord;

    //La valeur de cette case. Elle sera 0 si la case est non-assignée et entre 1 et 9 sinon.
    int value;

    //Tableau qui mémorise les valeurs possibles. Si à un moment, nous déterminons que le chiffre 5 ne peux pas être dans cette
    //case, alors valeurPossible[4] sera false. IMPORTANT: lorsqu'une valeur différente de 0 est assignée à la case, il n'y a plus de 
    //valeur possibles, donc toutes les possibilitées doivent être à false.
    Boolean[] valeurPossible = {true,true,true,true,true,true,true,true,true};

   /*
    * Le constructeur va prendre en paramètre les positions x et y et la valeur initiale de la case [0,9].
    */
    public Case(int x, int y){
        this.coord = new Coordonne(x, y);
        

    }

    public boolean setValue(int val){
        this.value = val;
        if(val != 0){
            this.valeurPossible = new Boolean[]{false, false, false, false, false, false, false, false, false};
            return true;
        }
        return false;
    }
    public boolean isLastPossible(int val){
        int somme = 0;
        for( int i = 0; i < 9 ; i++){
            if(this.valeurPossible[i]){
                somme+=1;
            }
        }
        if(somme == 1 && this.valeurPossible[val - 1]){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "(" + this.coord.x + "," + this.coord.y + ") : " + this.value + " 1:" + valeurPossible[0] + " 2:" + valeurPossible[1]+ " 3:" + valeurPossible[2]+ " 4:" + valeurPossible[3]+ " 5:" + valeurPossible[4]+ " 6:" + valeurPossible[5]+ " 7:" + valeurPossible[6]+ " 8:" + valeurPossible[7]+ " 9:" + valeurPossible[8];
    }

        
    public static void main(String[] args) {
        // Créer une case à la position (2,3)
        Case case1 = new Case(2, 3);
        
        // Afficher les informations de la case
        System.out.println(case1);

        // Retirer une valeur possible
        case1.valeurPossible[3] = false;

        // Afficher les informations de la case
        System.out.println(case1);

        // Affecter une valeur à la case
        case1.setValue(5);

        // Afficher les informations de la case
        System.out.println(case1);

        // Vérifier si une valeur est la dernière possibilité
        if(case1.isLastPossible(7)){
            System.out.println("Erreur isLastPossible-1");
        }
        case1.valeurPossible = new Boolean[]{false,false,true,false,false,false,false,false,false};
        if(!case1.isLastPossible(3) || case1.isLastPossible(1)){
            System.out.println("Erreur isLastPossible-2");

        }
    }
}
