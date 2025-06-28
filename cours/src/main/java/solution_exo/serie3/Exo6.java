package solution_exo.serie3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Exo6 {
    public static void main(String[] args) {
        ArrayList<Forme> liste = new ArrayList<>();
        liste.add(new Cercle(new HashMap<Dimensions, Double>() {{ put(Dimensions.RAYON, 4.5);}}));
        liste.add(new Triangle(new HashMap<Dimensions, Double>() {{ put(Dimensions.BASE, 4.0);put(Dimensions.HAUTEUR, 5.0);}}));
        liste.add(new Rectangle(new HashMap<Dimensions, Double>() {{ put(Dimensions.BASE, 4.0);put(Dimensions.HAUTEUR, 5.0);}}));
        liste.add(new Cercle(new HashMap<Dimensions, Double>() {{ put(Dimensions.RAYON, 8.0);}}));

        afficherAire(liste);

        System.out.println();

        Collections.sort(liste, (forme1, forme2) -> Double.compare(forme1.getArea(), forme2.getArea()));
        
        afficherAire(liste);
    }
    public static void afficherAire(ArrayList<Forme> liste){
        for( Forme forme : liste){
            System.out.println(forme.getArea());
        }
    }
}


enum Dimensions {
    BASE,
    HAUTEUR,
    RAYON
}
class Forme {

    HashMap<Dimensions, Double> dimensions = new HashMap<>();


    public HashMap<Dimensions, Double> getDimensions() {
        return dimensions;
    }

    public void setDimensions(HashMap<Dimensions, Double> dimensions) {
        this.setDimensions(dimensions);
    }

    public Forme(HashMap<Dimensions, Double> dimensions) {
        this.dimensions = dimensions;
    }

    public double getArea(){
        return 0;
    };
}

class Triangle extends Forme{
    public Triangle(HashMap<Dimensions, Double> dimensions){
        super(dimensions);
    }

    @Override
    public double getArea(){
        return (getDimensions().get(Dimensions.BASE) * getDimensions().get(Dimensions.HAUTEUR)) / 2;
    }
}

class Rectangle extends Forme{
    public Rectangle(HashMap<Dimensions, Double> dimensions){
        super(dimensions);
    }

    @Override
    public double getArea(){
        return getDimensions().get(Dimensions.BASE) * getDimensions().get(Dimensions.HAUTEUR);
    }
}

class Cercle extends Forme{
    public Cercle(HashMap<Dimensions, Double> dimensions){
        super(dimensions);
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(getDimensions().get(Dimensions.RAYON),2);
    }
}

