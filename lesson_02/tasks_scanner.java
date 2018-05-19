package vcs.lesson_02;

import java.util.Calendar;
import java.util.Scanner;

public class tasks_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);

        // Task 1
        System.out.print("Enter any number: ");
        int numb = sc.nextInt();
        System.out.println("Number entered: "+ numb);

        // Task 2
        System.out.println();
        System.out.print("Enter second number: ");
        int numb2 = sc.nextInt();
        int sum = numb + numb2;
        System.out.println("Sum of numbers: "+ sum);

        // Task 3
        System.out.println();
        System.out.print("Enter some text: ");
        String text1 = txt.nextLine();
        System.out.println("Your text: "+ text1);

        // Task 4
        System.out.println();
        System.out.print("Enter more text: ");
        String text2 = txt.nextLine();
        System.out.println("Combined text: "+ text1 +" "+ text2);

        // Task 5 (numbers are taken from task 1 & 2)
        System.out.println();
        showNumbersSum(numb,numb2);

        // Task 6
        System.out.println();
        System.out.print("Birth year? ");
        int user_year = sc.nextInt();
        int this_year = Calendar.getInstance().get(Calendar.YEAR);

        int age = -1;
        if(user_year <= this_year) {
            System.out.print("Birth month? ");
            int user_month = sc.nextInt();
            int this_month = Calendar.getInstance().get(Calendar.MONTH);
            int months_tmp = this_month - user_month;

            if(this_month <= 12 && (user_year < this_year || (user_year == this_year && months_tmp >= -1))) {
                age = this_year - user_year;

                if(months_tmp < -1) {
                    --age;
                }

                if (age > 0) {
                    System.out.println("Persons age is "+age+".");
                } else {
                    System.out.println("This is a newborn!");
                }
            } else {
                System.out.println("You have entered wrong month!");
            }
        } else {
            System.out.println("You have entered wrong year");
        }

        // Task 7 (number is taken from task 1)
        System.out.println();
        System.out.print("Number is ");
        if(numb >= 0) {
            System.out.print("positive");
        } else {
            System.out.print("negative");
        }

        // Task 8 (takes age from task 6)
        System.out.println();
        System.out.println();
        if(age >= 18) {
            System.out.println("Person can vote!");
        } else if (age > 100) {
            System.out.println("Person is too old to vote :)");
        } else if(age >= 0) {
            System.out.println("Person can not vote.");
        } else {
            System.out.println("Entered age is wrong.");
        }

        // Task 9 (takes age from task 6)
        System.out.println();
        if(age < 0) {
            System.out.println("Age is negative.");
        } else if (age > 100) {
            System.out.println("Age is over 100.");
        } else if (age > 40 && age < 60) {
            System.out.println("Age is between 40 & 60.");
        } else {
            System.out.println("Age is up to 40 or over 60 & less than 100.");
        }
    }

    public static void showNumbersSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of numbers: "+ sum);
    }
}
