public class ClassString {

    // creationChaines
    private static String uneChaine = "Bonjour";
    private static String autreChaine = new String("Bonjour");
    private static String chaine1 = new String("Bonjour");
    private static String chaine2 = new String("Bonjour");

    private String laChaine;

    public ClassString() {
    }

    public ClassString(String laChaine) {
        this.laChaine = laChaine;
    }

    public String getLaChaine() {
        return laChaine;
    }

    public void setLaChaine(String laChaine) {
        this.laChaine = laChaine;
    }

    final static char[] VOYELLES = {'a','e','i','o','u'};

    /**
     * Compte le nombre de voyelles dans la chaine
     *
     * @return
     */
    int compterNombreVoyelles() {
        int nbVoyelles = 0;

        for(char voyelle: VOYELLES){
            //nbVoyelles += this.compterNombreOccurenceLettre(voyelle);
            nbVoyelles += this.compterNombreOccurenceLettre2(voyelle);
        }

        return nbVoyelles;
    }

    /***
     * Compte le nombre d'occurence d'une lettre dans la chaine
     *
     * @param lettre la lettre pour laquelle on compte le nombre d'occurence
     */
    private int compterNombreOccurenceLettre(char lettre) {
        int nbrOccur = 0;

        for(int i = 0; i < laChaine.length(); i++) {
            if(laChaine.charAt(i) == lettre){
                nbrOccur++;
            }
        }
        return nbrOccur;
    }

    /***
     * Compte le nombre d'occurence d'une lettre dans la chaine
     *
     * @param lettre la lettre pour laquelle on compte le nombre d'occurence
     */
    private int compterNombreOccurenceLettre2(char lettre) {
        return laChaine.length() - laChaine.replace((lettre + ""), "").length();
    }
    String miseEnMajuscule(String chaine) {
        // toUpperCase() renvoie la chaîne en majuscule
        String laChaine = chaine.toUpperCase();
        // mise en majuscule puis enlever les espaces à droite et à gauche de la chaine
        // laChaine = chaine.toUpperCase().trim();

        return laChaine;
    }
    public static void comparaisonChaines(){
        String uneMemeChaine = "Bonjour";
        String uneDifferenteChaine = "bonjour";

        System.out.println(chaine1 == chaine2);                                 // affiche false
        // equals(String) : compare la chaîne avec une autre chaine
        System.out.println( chaine1.equals(chaine2));                           // affiche true
        // equalsIgnoreCase(String) : compare la chaîne sans tenir compte de la casse
        System.out.println(uneChaine.equalsIgnoreCase(uneDifferenteChaine));    // affiche true

        System.out.println(uneChaine == uneMemeChaine);                         // affiche true
        System.out.println(uneChaine == autreChaine);                           // affiche false

        // compareTo(String) : compare la chaîne avec l'argument
        System.out.println(uneChaine.compareTo(autreChaine));         // == 0 : les deux chaines sont equivalentes
        System.out.println(uneChaine.compareTo(uneDifferenteChaine));// < 0 : uneChaine vient avant uneDifferenteChaine car "B" < "b"
        System.out.println(uneChaine.compareTo("Allo"));             // > 0 : uneChaine vient après "Allo" car "B" > "A"
    }

    public static void methodesChaines(){
        /**
         * Méthodes la classe String Role
         */

        // charAt(int) : renvoie le nieme caractère de la chaine
        System.out.println(uneChaine.charAt(1));            // affiche 'o'
        System.out.println(uneChaine.isEmpty());
        System.out.println(uneChaine.isBlank());

        // concat(String) : ajoute l'argument à la chaîne et renvoie la nouvelle chaîne
        System.out.println(uneChaine.concat(" tout").concat(" le monde"));  // affiche "Bonjour tout le monde"

        // endsWith(String) vérifie si la chaîne se termine par l'argument
        System.out.println(uneChaine.endsWith("jour"));        // affiche true
        System.out.println(uneChaine.endsWith("soir"));        // affiche false

        // indexOf(String) renvoie la position de début à laquelle l'argument est contenu dans la chaine
        System.out.println(uneChaine.indexOf("jour"));        // affiche 3
        System.out.println(uneChaine.indexOf('o'));           // affiche 1

        // lastIndexOf(String) : renvoie la dernière position à laquelle l'argument est contenu dans la chaine
        System.out.println(uneChaine.lastIndexOf("ou"));        // affiche 4
        System.out.println(uneChaine.lastIndexOf('o'));        // affiche 4

        // lenght() : renvoie la longueur de la chaine
        System.out.println(uneChaine.length());                 // affiche 7

        // replace(char,char) : renvoie la chaîne dont les occurences d'un caractère sont remplacées
        System.out.println(uneChaine.replace('o', 'i'));                 // affiche Binjiur
        System.out.println(uneChaine.replace("jour", "soir"));          // affiche Bonsoir

        // startsWith(String int) : vérifie si la chaîne commence par la sous chaîne
        System.out.println(uneChaine.startsWith("Bon"));        // affiche true
        System.out.println(uneChaine.startsWith("bon"));        // affiche false

        // substring(int,int) : renvoie une partie de la chaine
        System.out.println(uneChaine.substring(1,3));           // affiche "on"
        System.out.println(uneChaine.substring(1));   // affiche "onjour"

        // toLowCase() : renvoie la chaîne en minuscule
        System.out.println(uneChaine.toLowerCase());           // affiche "bonjour"

        // trim() : enlève les caractères non significatifs de la chaine
        System.out.println("   une chaine avec des espaces à enlever     ".trim()); // affiche "une chaine avec des espaces à enlever"
    }
}
