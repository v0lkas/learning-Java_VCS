package vcs.lesson_08.Figures;

public class Figure_run {
    public static void main(String[] args) {
        Shape sp = new Shape();

        System.out.println();

        Circle ck = new Circle(5);
        System.out.println("Name: "+ck.getClass().getSimpleName());
        System.out.println("Area: "+ck.getArea());
        System.out.println("Perimeter: "+ck.getPerimeter());

        System.out.println();

        Cylinder cl = new Cylinder(10, 10);
        System.out.println("Name: "+cl.getClass().getSimpleName());
        System.out.println("Area: "+cl.getCilArea());
        System.out.println("Volume: "+cl.getCilVolume());

        System.out.println();

        System.out.println("Total figures: "+sp.getQntt());
    }
}
