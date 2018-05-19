package vcs.lesson_02;

public class tasks_if_02 {
    public static void main(String[] args) {

        boolean task1 = numberIsNegative(-5);
        System.out.println("Number is negative: "+ task1);

        boolean task2 = numberIsThreeLong(600);
        System.out.println("Number long is 3: "+ task2);

        numbers(10,6,15);
    }

    public static boolean numberIsNegative(int number) {
        return number < 0;
    }

    public static boolean numberIsThreeLong(int number) {
        return number > 99 && number < 1000;
    }

    public static boolean numbers(int sk, int r1, int r2) {
        if(r1 < r2) {
            if(sk > r1 && sk < r2) {
                System.out.printf(sk+" is between %s & %s.",r1,r2);
            } else {
                System.out.printf(sk+" is not between %s & %s.",r1,r2);
            }
            return sk > r1 && sk < r2;
        } else {
            System.out.printf("%s is less than %s!",r2,r1);
            return false;
        }
    }
}
