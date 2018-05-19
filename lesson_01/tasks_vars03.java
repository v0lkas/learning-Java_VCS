package vcs.lesson_01;

public class tasks_vars03 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        boolean same = a == b;
        boolean a_bg = a > b;
        boolean b_bg = a < b;
        boolean diff = a != b;

        System.out.println("Same: "+ same);
        System.out.println("A bigger: "+ a_bg);
        System.out.println("B bigger: "+ b_bg);
        System.out.println("Different: "+ diff);
    }
}
