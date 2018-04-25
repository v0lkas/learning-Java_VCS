package vcs.lesson_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vardas?");
        String vardas = sc.next();

        if(vardas.equals("Jonas")) {
            System.out.println("Pavardė?");
            String pavarde = sc.next();

            System.out.println("Vardas ir pavardė: " + vardas + " " + pavarde);
        }
        else {
            System.out.println("Tu ne Jonas, tu "+vardas);
        }
    }
}
