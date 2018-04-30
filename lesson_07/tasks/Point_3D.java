package vcs.lesson_07.tasks;

import vcs.lesson_06.Point;

public class Point_3D extends Point {
    private int z1;
    public Point_3D() {
        z1 = 5;
    }

    public int getZ() {
        return this.z1;
    }

    @Override
    public String toString(){
        return super.getX() +" * "+ super.getY() +" * "+ this.getZ();
    }

    public double distance(int x2, int y2, int z2){
        double dist;
        int dist_x;
        int dist_y;
        int dist_z;

        if(super.getX() > x2) {
            dist_x = super.getX() - x2;
        }
        else {
            dist_x = x2 - super.getX();
        }
        if(dist_x < 0) {
            dist_x *= -1;
        }

        if(super.getY() > y2) {
            dist_y = super.getY() - y2;
        }
        else {
            dist_y = y2 - super.getY();
        }
        if(dist_y < 0) {
            dist_y *= -1;
        }

        if(z1 > z2) {
            dist_z = z1 - z2;
        }
        else {
            dist_z = z2 - z1;
        }
        if(dist_z < 0) {
            dist_z *= -1;
        }

        dist = Math.sqrt(Math.pow(dist_x,2) + Math.pow(dist_y,2) + Math.pow(dist_z,2));

        return dist;
    }

    public int getLocation(int x,int y,int z) {
        int loc;

        if(x == 0 && y == 0 && y == 0) {
            loc = 0;
        }
        else if(x > 0 && y > 0 && z >= 0) {
            loc = 1;
        }
        else if(x > 0 && y > 0 && z <= 0) {
            loc = 2;
        }
        else if(x < 0 && y > 0 && z >= 0) {
            loc = 3;
        }
        else if(x < 0 && y > 0 && z <= 0) {
            loc = 4;
        }
        else if(x < 0 && y < 0 && z >= 0) {
            loc = 5;
        }
        else if(x < 0 && y < 0 && z <= 0) {
            loc = 6;
        }
        else if(x > 0 && y < 0 && z >= 0) {
            loc = 7;
        }
        else {
            loc = 8;
        }

        return loc;
    }
}
