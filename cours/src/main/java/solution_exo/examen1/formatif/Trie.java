package solution_exo.examen1.formatif;

public class Trie {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for( int i = 0; i < tab.length ; i++){
            tab[i] = (int)(Math.random() * 101);
        }

        System.out.print("[");
        afficheTableau(tab);
        int indiceMin;
        int mem;
        for( int i = 0; i < tab.length ; i++){
            indiceMin = i;
            for(int j = i + 1; j < tab.length; j++){
                if(tab[j] < tab[indiceMin]){
                    indiceMin = j;
                }
            }
            mem = tab[indiceMin];
            tab[indiceMin] = tab[i];
            tab[i] = mem;
            
        }
        afficheTableau(tab);
    }
    public static void afficheTableau(int[] tab){
        for( int i = 0; i < tab.length - 1 ; i++){
            System.out.print(tab[i] + ", ");
        }
        System.out.println( tab[tab.length - 1] + "]");
    }
}
