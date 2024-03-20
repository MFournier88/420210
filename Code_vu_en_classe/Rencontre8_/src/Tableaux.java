public class Tableaux {

    public static void declarationInitialisation() {
        // Déclaration
        int [] tabEntiers;      //déclaration d'un tableau d'entiers (int)
        String tabChaines [];   //déclaration d'un tableau de chaînes de car.
        boolean [] tabBool;     //déclaration d'un tableau de booléens (boolean)
        double [] tabReels;     //déclaration d'un tableau de réels (double)

        // Intitialisation
        tabEntiers = new int [5];       //tab de int de longueur 5
        tabChaines = new String [3];    //tab de String de longueur 3
        tabBool = new boolean [7];      //tab de boolean de longueur 7
        tabReels = new double [4];      //tab de double de longueur 4
        char [] tabChars = new char [1]; //tab de char de longeur 1
        int [] tab = new int [0];       //tab de int de longeur 0

        // Initialisation explicite avec un initialisateur
        // tableau d'entiers de longueur 10
        int [] t1 = {-2, 3, 18, -23, 45, 12, 9, 6, -9, 0};
        //tableau d'entiers de longueur 5
        int n1 = 4;
        int n2 = 2;
        int [] t2 = {-2 * 6, (int)Math.PI, n1, n1 + n2, 45};
        // tableau de caractères de longueur 0 (tableau vide)
        char [] t3 = {};
        // tableau de booléens de longueur 4
        boolean b = false;
        boolean [] t4 = {b, !b, true, 3 > 4};
        // tableau de String (type objet) de longueur 6
        String [] t5 = {"", null, "lune", "soleil", "1", "pigeon"};
        // tableau de réels (float) de longueur 4
        float [] t6 = {1, 0.9f, -4.55f, 0};

        // Initialisation explicite d’une case d’un tableau
        char[] tabChar = new char[3];
        tabChar[0] = 'a';
        tabChar[1] = 'b';
        tabChar[2] = 'c';

        // Accès aux éléments d'un tableau
        char a = tabChar[0];

        // utilisation des éléments d'un tableau
        t1[3]++;
        int n = t1[1] + t1[3];
        n = (int) Math.pow (t1[0], t1[1]);

        // Longueur d'un tableau : l’attribut length
        char [] tab1 = new char [1];
        int [] tab2 = new int [120];
        String [] tab3 = new String [0];
        double [] tab4 = null;
        int taille1 = tab1.length;  //= 1
        int taille2 = tab2.length; //= 120
        int taille3 = tab3.length; //= 0
        // tab4.length //ERREUR à l'exécution : NullPointerException
    }
}
