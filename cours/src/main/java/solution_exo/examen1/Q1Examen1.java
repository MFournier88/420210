package solution_exo.examen1;
//2 
public class Q1Examen1 { 
    public static void main(String[] args) {
//4
        int n = Integer.parseInt(args[0]);
//4
        int[] tab = new int[n];

//Affichage /5
//Assignation /5
        System.out.print("[");
        for(int i = 0 ; i < tab.length - 1; i++){
            tab[i] = (int)(Math.random() * 101);
            System.out.print(tab[i] + ",");
        }
        System.out.println(tab[tab.length - 1] + "]");

    } 
}
