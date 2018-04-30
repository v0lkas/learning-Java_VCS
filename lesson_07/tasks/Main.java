package vcs.lesson_07.tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point_3D p3 = new Point_3D();

        String p3s = p3.toString();
        System.out.println(p3s);

        Scanner coords = new Scanner(System.in);

        System.out.print("Set x2: ");
        int x2 = coords.nextInt();

        System.out.print("Set y2: ");
        int y2 = coords.nextInt();

        System.out.print("Set z2: ");
        int z2 = coords.nextInt();

        double distance = p3.distance(x2, y2, z2);
        System.out.println("Distance between points: " + distance);

        int qrt = p3.getLocation(x2,y2,z2);
        System.out.println("First point quarter: " + qrt);
    }
}
