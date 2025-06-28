package solution_exo.serie1;
// # Exo_16

// Niveau : 3 ⭐

// **Exercice** :

// Écrivez un programme qui initialise 2 tableaux d’entiers. Il affiche les 2 tableaux. Il affiche ensuite identique si les 2 tableaux ont le même nombre d’éléments et que tous
// les éléments au même index sont égaux, sinon il affiche différent.

// ```
// [5,1,2,2,1,4,5,6,6,7]
// [5,1,2,2,1,4,5,6,6,7]
// Identique
// ```
// ```
// [5,1,2,2,1,4,5,6,6,7]
// [5,1,2,2,0,4,5,6,6,7]
// Différent
// ```
public class Exo016 {
    public static void main(String[] args) {
        int[] tab1 = {5,1,2,2,1,4,5,6,6,7};
        int[] tab2 = {5,1,2,2,0,4,5,6,6,7};
        boolean isEqual = true;
        for(int i = 0 ; i < tab1.length; i++){
            if(tab1[i] != tab2[i]){
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.println("Identique");
        }else{
            System.out.println("Différent");
        }
    }
}
