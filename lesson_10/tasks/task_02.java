package vcs.lesson_10.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        System.out.println(work_with_array());
    }

    private static boolean work_with_array() {
        int[] array_data = {1,2,3,10,15,0,-2};

        try {
            Scanner listen = new Scanner(System.in);
            System.out.print("Enter any integer: ");
            int input = listen.nextInt();

            //Arrays.contains(array_data,input);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
