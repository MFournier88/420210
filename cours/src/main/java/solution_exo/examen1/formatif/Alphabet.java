package solution_exo.examen1.formatif;

public class Alphabet {
    
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        n %= 26;
        char lettre = 'a';
        for(int i = 0 ; i < n ; i++){
            System.out.print((char)(lettre + i));
        }
        System.out.println();
    }
}
