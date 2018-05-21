package vcs.lesson_04;

import java.util.stream.IntStream;

public class tasks_1_5_double_array {
    public static void main(String[] args) {
        task_1(2,10);

        int[][] tsk_2 = {
            {1,8,6,8},
            {65,55,677,22},
            {0,3,55,1}
        };

        System.out.println();
        task_2_a(tsk_2,0);

        System.out.println();
        task_2_b(tsk_2);

        System.out.println();
        task_2_c(tsk_2);

        System.out.println();
        task_2_d(tsk_2);

        System.out.println();
        task_2_e(tsk_2);

        System.out.println();
        task_2_f(tsk_2);

        System.out.println();
        task_2_g(tsk_2);

        System.out.println();
        task_5(tsk_2);
    }

    static void task_1(int a, int b) {
        System.out.println("Task 1:");
        for(int i = 1; i <= a; ++i) {
            for(int i2 = 1; i2 <= b; ++i2)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        return;
    }

    // Task 2a & 4
    static void task_2_a(int[][] arr,int row) {
        System.out.println("Task 2.a. & 4:");
        System.out.println(arr[row][0]+" "+arr[row][1]+" "+arr[row][2]+" "+arr[row][3]);
    }

    static void task_2_b(int[][] arr) {
        System.out.println("Task 2.b.:");
        System.out.println(arr[0][0]+" "+arr[1][0]+" "+arr[2][0]);
    }

    static void task_2_c(int[][] arr) {
        System.out.println("Task 2.c.:");
        for(int i1 = 0; i1 < arr[0].length; ++i1) {
            System.out.print(arr[0][i1]+" ");
        }
        System.out.println();
    }

    static void task_2_d(int[][] arr) {
        System.out.println("Task 2.d.:");
        for(int i0 = 0; i0 < arr.length; ++i0) {
            System.out.print(arr[i0][0]+" ");
        }
        System.out.println();
    }

    // Task 2e & 3
    static void task_2_e(int[][] arr) {
        System.out.println("Task 2.e. & 3:");
        for(int i0 = 0; i0 < arr.length; ++i0) {
            for(int i1 = 0; i1 < arr[i0].length; ++i1) {
                System.out.print(arr[i0][i1]+" ");
            }
            System.out.println();
        }
    }

    static void task_2_f(int[][] arr) {
        System.out.println("Task 2.f.:");
        int suma = 0;
        for(int i0 = 0; i0 < arr.length; ++i0) {
            suma += IntStream.of(arr[i0]).sum();
        }
        System.out.println(suma);
    }

    static void task_2_g(int[][] arr) {
        System.out.println("Task 2.g.:");
        int suma = 0;
        int min = 0;
        int max = 0;
        int total = 0;

        for(int i0 = 0; i0 < arr.length; ++i0) {
            suma += IntStream.of(arr[i0]).sum();
            total += arr[i0].length;
            for(int i1 = 0; i1 < arr[i0].length; ++i1) {
                if (min > arr[i0][i1]) min = arr[i0][i1];
                if (max < arr[i0][i1]) max = arr[i0][i1];
            }
        }

        double avrg = 1d * suma / total;
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Avr: "+avrg);
    }

    static void task_5(int[][] arr) {
        System.out.println("Task 5:");
        int odd = 0;
        for(int i0 = 0; i0 < arr.length; ++i0) {
            for(int i1 = 0; i1 < arr[i0].length; ++i1) {
                if(arr[i0][i1] % 2 != 0) {
                    ++odd;
                }
            }
        }
        System.out.println("Odd numbers in array: "+odd);
    }
}
