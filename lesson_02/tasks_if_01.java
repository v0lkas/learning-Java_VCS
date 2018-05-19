package vcs.lesson_02;

public class tasks_if_01 {
    public static void main(String[] args) {

        // Task 1
        boolean bool = true;
        if(bool == true) {
            System.out.println("Tiesa");
        } else {
            System.out.println("Netiesa");
        }

        // Task 2 & 3
        int number = 105;
        if(number > 100) {
            System.out.println("Number is more than 100!");
        } else {
            System.out.println("Number is less or equal to 100.");
        }

        // Task 4
        if(number >= 0 && number <= 100) {
            System.out.println("Number is in interval from 0 & 100");
        } else {
            System.out.println("Number is less than 0 or more than 100");
        }
    }
}
