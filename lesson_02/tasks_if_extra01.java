package vcs.lesson_02;

import java.util.Scanner;

public class tasks_if_extra01 {
    public static void main(String[] args) {
        int age = klauskAmziaus();

        if(age < 0) {
            System.out.println("Are you still not born?");
        }
        else if(age > 100) {
            System.out.println("You live too long :)");
        }
        else if(age >= 40 && age <= 60) {
            System.out.println("Middle age");
        }
        else {
            System.out.println("Young or old");
        }
    }

    public static int klauskAmziaus() {
        Scanner metai = new Scanner(System.in);
        System.out.print("What is your age? ");

        int age = metai.nextInt();

        return age;
    }

}
