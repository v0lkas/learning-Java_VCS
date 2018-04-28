package vcs.lesson_06;

public class Point {
    private int x1;
    private int y1;
    private String color;


    public Point() {
        x1 = 10;
        y1 = 15;
    }

    public int getX() {
        return this.x1;
    }

    public int getY() {
        return this.y1;
    }

    public double distance(int x2, int y2) {
        double dist;
        int dist_x;
        int dist_y;

        if(x1 > x2) {
            dist_x = x1 - x2;
        }
        else {
            dist_x = x2 - x1;
        }
        if(dist_x < 0) {
            dist_x *= -1;
        }

        if(y1 > y2) {
            dist_y = y1 - y2;
        }
        else {
            dist_y = y2 - y1;
        }
        if(dist_y < 0) {
            dist_y *= -1;
        }

        if(dist_x == 0 && dist_y == 0) {
            dist = 0;
        }
        else if(dist_x == 0) {
            dist = dist_y;
        }
        else if(dist_y == 0) {
            dist = dist_x;
        }
        else {
            dist = Math.sqrt(Math.pow(dist_x,2) + Math.pow(dist_y,2));
        }

        return dist;
    }

    public int getQuarter(int x,int y) {
        int qrt;

        if(x == 0 && y == 0) {
            qrt = 0;
        }
        else if(x > 0 && y > 0) {
            qrt = 1;
        }
        else if(x < 0 && y > 0) {
            qrt = 2;
        }
        else if(x > 0 && y < 0) {
            qrt = 3;
        }
        else {
            qrt = 4;
        }

        return qrt;
    }
}
