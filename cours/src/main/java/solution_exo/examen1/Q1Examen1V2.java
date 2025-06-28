package solution_exo.examen1;

//2 
public class Q1Examen1V2 { 
    public static void main(String[] args) {
//4
        int n = Integer.parseInt(args[0]);
//4
        int[] tab = new int[n];

        //Assignation /4
        //Calcul somme /3
        int somme = 0;
        for(int i = 0 ; i < tab.length - 1; i++){
            tab[i] = (int)(Math.random() * (72 - 51 + 1) + 51);
            somme += tab[i];
        }
        //Affichage /3
        System.out.println(somme);

    } 
}
