import cafeteria.Cafe;
import cafeteria.Lait;
import cafeteria.Liquide;
import cafeteria.Tasse;
import geometry.Circle;
import ecole.Employe;
import ecole.Enseignant;

/**
 * Source : DEUGMIAS2` eme année 2004-2005 INFORMATIQUE TD5
 */

class A {
    public void affiche() {
        System.out.println("Je suis un A");
    }
}

class B extends A {
}

class C extends A {
    public void affiche() {
        System.out.println("Je suis un C");
    }
}

class D extends C {
    public void affiche() {
        System.out.println("Je suis un D");
    }
}

class E extends B {
}

class F extends C {
}

public class Main {
    public static void main(String[] args) {

//        testerHeritage();
//        afficherHeritageGeometry();
        afficherHeritageCafeteria();
//        afficherHeritageSurcharge();
    }

    public static void testerHeritage() {
        A a = new A();
        a.affiche();
        B b = new B();
        b.affiche();
        C c = new C();
        c.affiche();
        D d = new D();
        d.affiche();
        E e = new E();
        e.affiche();
        F f = new F();
        f.affiche();
    }

    public static void afficherHeritageGeometry() {

        Circle c1, c2;
        c1 = new Circle(1, 1, 3);
        c2 = new Circle();
        System.out.println(c1.toString() + "\n" + c2.toString());
    }

    public static void afficherHeritageCafeteria() {
        Tasse latasse;
        latasse = new Tasse();
        latasse.ajouterLiquide(new Liquide());
        latasse.imprimer();
        latasse = new Tasse();
        latasse.ajouterLiquide(new Cafe());
        latasse.imprimer();
        Tasse[] lestasses;
        lestasses = new Tasse[3];
        for (int i = 0; i < 3; i++) lestasses[i] = new Tasse();
        lestasses[0].ajouterLiquide(new Cafe());
        lestasses[1].ajouterLiquide(new Lait());
        lestasses[2].ajouterLiquide(new Liquide());
        for (int i = 0; i < 3; i++) lestasses[i].imprimer();
    }

    public static void afficherHeritageSurcharge() {
        Employe emp = new Employe();
        Enseignant ens = new Enseignant();
        ens.verifier(ens);
        ens.comparer(ens);
        ens.accompagner(emp);
    }
}