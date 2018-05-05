package vcs.lesson_08.Figures;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * Math.pow(Math.PI,2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
