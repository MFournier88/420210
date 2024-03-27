package geometry;

public class Circle extends Shape {
    final static double PI = 3.141592564;
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double x, double y, double r) {
        super(x, y);
        radius = r;
    }

    public String toString() {
        return super.toString() + " Rayon : " + radius;
    }
}
