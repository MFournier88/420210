public class Wrappers {

    static void convertir(){
        int valeur = Integer.valueOf("123").intValue();
        System.out.println(valeur);                     // affiche 123

        Float objetPi = Float.parseFloat("3.1415");
        System.out.println(3 * objetPi);                // affiche 9.4244995

        Integer unEntier = Integer.parseInt("10");
        int entier = unEntier.intValue();
    }
}

