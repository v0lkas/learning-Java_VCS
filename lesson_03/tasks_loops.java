package vcs.lesson_03;

import java.util.Scanner;

public class tasks_loops {
    public static void main(String[] args) {
        // Task 1
        hw(5);

        // Task 2
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number greater than 0: ");
        int ttl = sc.nextInt();
        if(ttl > 0) {
            hw(ttl);
        } else {
            System.out.println("Wrong number!");
        }

        // Task 3
        System.out.println();
        System.out.print("Numbers:");
        for(int i=1; i<=50; ++i) {
            System.out.print(" "+i);
        }
        System.out.println();

        // Task 4
        System.out.println();
        int for_sum = 0;
        for(int i=1; i<=100; ++i) {
            for_sum += i;
        }
        System.out.println("Sum of 1-100 in for() is: "+for_sum);

        // Task 5
        System.out.println();
        int while_sum = 0;
        int nr = 0;
        while(nr < 100) {
            ++nr;
            while_sum += nr;
        }
        System.out.println("Sum of 1-100 in while() is: "+while_sum);

        // Task 6
        System.out.println();
        int do_sum = 0;
        int nr2 = 0;
        do {
            ++nr2;
            do_sum  += nr2;
        } while(nr2 < 100);
        System.out.println("Sum of 1-100 in do_while() is: "+do_sum );

        // Task 7
        /*
        for(int i=0;i<2;++i) {
            --i;
            System.out.println(i);
        }

        int any_num = 0;
        while(true) {
            ++any_num;
            System.out.println(any_num);
        }

        int any_num2 = 0;
        do {
            ++any_num2;
            System.out.println(any_num2);
        } while(true);
        */

        // Task 8
        System.out.println();
        for(int i=1;i<=9;++i) {
            System.out.print(i);
            ++i;
        }
    }

    static void hw(int ttl) {
        for(int i=0; i<ttl; ++i) {
            System.out.println("Hello world!");
        }
    }
}
