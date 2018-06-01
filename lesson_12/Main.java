package vcs.lesson_12;

import vcs.lesson_12.pizza_machine.*;
import vcs.lesson_12.pizza_machine.Pizzas.Margarita;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Products products = new Products(3,0.5,1,1,1);

        System.out.println("[1] Margarita");
        System.out.println("[2] Mexicano");
        System.out.println("[3] Amerigo");

        Scanner listen = new Scanner(System.in);

        System.out.print("Choose your pizza: ");
        int pizza = listen.nextInt();

        System.out.print("Enter pizza size in cm (20 - 100): ");
        int size = listen.nextInt();

        if(pizza == 1) {
            // Pizza margarita = new Margarita(, size);
            System.out.println("Margarita");
        } else if (pizza == 2) {
            // Pizza Mexicano
            System.out.println("Mexicano");
        } else if(pizza == 3) {
            //Pizza Amerigo
            System.out.println("Amerigo");
        }
    }
}
