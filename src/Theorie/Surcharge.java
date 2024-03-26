package Theorie;

import Heritage.Mammifère;

public class Surcharge {
    public static void main(String[] args) {
//        Voiture caravane = new Voiture();
//        caravane.marque = "Dodge";
//        caravane.annee = 2001;
//        caravane.nombreDePortes = 4;
//
//        caravane.afficherInfoVoiture();
//        caravane.afficherInfo();

        Mammifère humain = new Mammifère("Henri","Homosapienssapiens", (short) 26,(short)100);
        humain.afficheDureeVie();
        humain.afficheTruc();
//
//        heritage.Oiseau canari = new heritage.Oiseau();
//        canari.age = 1;
//        canari.espece = "Canari";
//        canari.nom = "tweety";
//        canari.vol();

        afficheSomme(2);
        afficheSomme(2,2);
        afficheSomme(2,2,2);
        afficheSomme(2,2,2,2);
        afficheSomme(2,2,2,2,2);
    }
    public static void afficheSomme(int a){
        System.out.println(a);
    }
    public static void afficheSomme(int a, int b){
        System.out.println(a + b);
    }
    public static void afficheSomme(int a, int b, int c){
        System.out.println(a +b +c);
    }
    public static void afficheSomme(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }
    public static void afficheSomme(int a, int b, int c, int d, int e){
        System.out.println(a + b + c + d + e);
    }
}
