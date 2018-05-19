package vcs.lesson_01;

public class tasks_methods {
    public static void main(String[] args) {
        task1(10);
        task2(15);
        task3(20, 25);
        task4(30);
        task5("This is text");
        task6();
    }

    public static int task1(int a) {
        return a;
    }

    public static int task2(int a) {
        System.out.println(a);
        return a;
    }

    public static int task3(int a, int b) {
        return a + b;
    }

    public static double task4(int a) {
        return a * 0.621371;
    }

    public static void task5(String a) {
        System.out.println(a);
    }

    public static boolean task6() {
        return true;
    }
}
