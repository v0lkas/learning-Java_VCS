package vcs.lesson_08.Figures;

public class Cylinder extends Circle {
    public double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getCilArea() {
        return getArea() * 2 + getPerimeter() * height;
    }

    public double getCilVolume() {
        return getArea() * height;
    }
}
