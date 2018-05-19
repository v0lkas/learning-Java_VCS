package vcs.lesson_01;

public class tasks_vars02 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int sum  = a + b;
        int mult = a * b;
        int subt = a - b;
        double div = (double) a / b;
        ++a;
        --a;

        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("sum: "+ sum);
        System.out.println("mult: "+ mult);
        System.out.println("subt: "+ subt);
        System.out.println("div: "+ div);
    }
}
