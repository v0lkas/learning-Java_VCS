package vcs.lesson_10.tasks;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        entry();
    }

    private static void entry() {
        Scanner listen = new Scanner(System.in);
        try {
            System.out.print("Enter any interger: ");
            int input = listen.nextInt();
            System.out.println("That is right!");
        } catch (Exception e) {
            System.out.println("Not integer!");
        }
    }
}
