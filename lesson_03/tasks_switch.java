package vcs.lesson_03;

import java.util.Scanner;

public class tasks_switch {
    public static void main(String[] args) {
        String[] meniu = {
                "1. Summing",
                "2. Multiplication",
                "3. Power"
        };

        for (String item : meniu) {
            System.out.println(item);
        }

        boolean continue_loop;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Choose your option from 1 to " + meniu.length + ": ");
            int choice = sc.nextInt();

            // Task 3 & 3.5
            switch (choice) {
                case 1:
                    continue_loop = summing();
                    break;
                case 2:
                    continue_loop = multip();
                    break;
                case 3:
                    continue_loop = power();
                    break;
                case 0:
                    System.out.println("Exiting loop");
                    continue_loop = false;
                    break;
                default:
                    System.out.println("Wrong choice!");
                    continue_loop = true;
                    break;
            }
        } while(continue_loop);
    }

    // Task 3.1.
    static boolean summing() {
        Scanner scalc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int sk1 = scalc.nextInt();
        System.out.print("Enter second number: ");
        int sk2 = scalc.nextInt();
        int new_number = sk1 + sk2;

        System.out.println("RESULT: "+new_number);

        return sk1 > 0 && sk2 > 0 && new_number > 0;
    }

    // Task 3.2.
    static boolean multip() {
        Scanner scalc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int sk1 = scalc.nextInt();
        System.out.print("Enter second number: ");
        int sk2 = scalc.nextInt();
        int new_number = sk1 * sk2;

        System.out.println("RESULT: "+new_number);

        return sk1 > 0 && sk2 > 0 && new_number > 0;
    }

    // Task 3.3. updated (not 256, but console question)
    static boolean power() {
        Scanner scalc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int sk = scalc.nextInt();
        double new_number = Math.pow(sk,2);

        System.out.println("RESULT: "+new_number);

        return sk > 0 && new_number > 0;
    }
}
