package vcs.lesson_05;

import java.util.Scanner;

public class string_ {
    public static void main(String[] args) {
//        // task 1
//        int nr1 = 15;
//        int nr2 = 4;
//        double nr3 = (double) nr1 / nr2;
//        System.out.println(nr3);
//
//        // task 2
//        task2();
//
//        // task 3
//        cm_to_inch();
//        System.out.println();
//        inch_to_cm();

        // task 4
        work_with_string();
    }

    static void task2() {
        System.out.print("Enter any number from 3 to 10: ");
        Scanner psr = new Scanner(System.in);
        int skaicius_n = psr.nextInt();
        int[] nr = new int[skaicius_n];

        if(skaicius_n >= 3 && skaicius_n <= 10) {
            for (int i = 0; i < skaicius_n; i++) {
                int eil = i + 1;
                System.out.println();
                System.out.print("Enter any number (" + eil + "/" + skaicius_n + "): ");
                nr[i] = psr.nextInt();
            }

            System.out.println("Sum = "+sk_sum(nr));
            System.out.println("Avr = "+sk_avr(nr));
            System.out.println("Mlt = "+sk_mlt(nr));
        }
        else {
            System.out.println("Number must be from 3 to 10!");
            task2();
        }
    }

    static int sk_sum(int[] nr) {
        int nr_sum = 0;
        for (int i = 0; i < nr.length; i++) {
            nr_sum += nr[i];
        }
        return nr_sum;
    }

    static double sk_avr(int[] nr) {
        double nr_avr = (double) sk_sum(nr) / nr.length;
        return nr_avr;
    }

    static int sk_mlt(int[] nr) {
        int nr_mlt = 1;
        for (int i = 0; i < nr.length; i++) {
            nr_mlt *= nr[i];
        }
        return nr_mlt;
    }

    static void cm_to_inch() {
        System.out.print("Enter cm: ");
        Scanner psr = new Scanner(System.in);
        int cm = psr.nextInt();

        double inch = (double) cm / 2.54;
        System.out.println(cm+" = "+inch);
    }

    static void inch_to_cm() {
        System.out.print("Enter inch: ");
        Scanner psr = new Scanner(System.in);
        int inch = psr.nextInt();

        double cm = (double) inch * 2.54;
        System.out.println(inch+" = "+cm);
    }

    static void work_with_string() {
        // SAMPLE TEXT: this string is a little longer than the first one
        System.out.print("Enter any text at least 20 characters: ");
        Scanner psr = new Scanner(System.in);
        String text = psr.nextLine();

        if(text.length() >= 20) {
            // task 1.1
            System.out.println("1) String length = "+text.length());

            // task 4.2
            String[] splt = text.split("a");
            if(splt.length == 1) System.out.println("2+3) There is no \"a\" in your text");
            else if(splt.length == 2) System.out.println("2+3) The only \"a\" index is: "+text.indexOf("a"));
            else {
                // task 4.2
                int a_len = 0;
                System.out.print("2) All \"a\" indexes are:");
                for (int i = 0; i < splt.length-1; i++) {
                    a_len += splt[i].length();
                    if(i > 0) ++a_len;
                    System.out.print(" "+a_len);
                }
                System.out.println();

                // task 4.3
                int last_a = 0;
                for (int i = 0; i < splt.length-1; i++) {
                    last_a += splt[i].length();
                    if(i > 0) ++last_a;
                }
                System.out.println("3) The last \"a\" index is: "+last_a);
            }
        }
        else {
            System.out.println("Text is too short!");
            work_with_string();
        }
    }
}
