package vcs.lesson_06;

import java.util.Scanner;

public class Point_main {
    public static void main(String[] args) {
        Point line = new Point();
        Scanner coords = new Scanner(System.in);

        int x1 = line.getX();
        int y1 = line.getY();





        System.out.println("x1 = " + x1 + " & y1 = " + y1);

        System.out.print("Set x2: ");
        int x2 = coords.nextInt();

        System.out.print("Set y2: ");
        int y2 = coords.nextInt();

        double distance = line.distance(x2, y2);
        System.out.println("Distance between points: " + distance);





        int qrt = line.getQuarter(x1,y1);
        System.out.println("First point quarter: " + qrt);
    }
}
