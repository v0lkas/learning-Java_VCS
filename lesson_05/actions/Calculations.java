package vcs.lesson_05.actions;

import vcs.lesson_05.numbers.methods;

public class Calculations {
    public static void main(String[] args) {

        // task 1
        String task1 = methods.lyginis(100);
        System.out.println(task1);

        // task 2
        int task2 = methods.paskutinis(16);
        System.out.println(task2);

        // task 3
        int task3 = methods.pirmas(589);
        System.out.println(task3);

        // task 4
        int task4 = methods.nlength(14589);
        System.out.println(task4);

        // task 6
        int task6 = methods.exchange(1234);
        System.out.println(task6);
    }
}
