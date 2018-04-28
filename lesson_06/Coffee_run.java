package vcs.lesson_06;

import java.util.Scanner;

public class Coffee_run {
    public static void main(String[] args) {
        makeCoffee();
    }

    static void makeCoffee() {
        Scanner nmbrs = new Scanner(System.in);

        String[] products = {
                "Americano",
                "Espresso",
                "Latte",
                "Capuchino"
        };

        double[][] usages = {
                {0.05, 0.05, 0.2, 0.0},
                {0.1, 0.1, 0.025, 0.0},
                {0.05, 0.05, 0.2, 0.1},
                {0.025, 0.05, 0.2, 0.05}
        };

        Coffee order = new Coffee();

        if(order.isReady()) {
            for (int i = 0; i < products.length; i++) {
                System.out.println("["+i+"] "+products[i]);
            }
        }
        else {
            System.out.println("[-1] Papildyti dukraus.");
            System.out.println("[-2] Papildyti pupelių.");
            System.out.println("[-3] Įpilti vandens.");
            System.out.println("[-4] Papildyti pieno.");
            System.out.println("[-5] Išvalyti apratą.");
        }

        System.out.println("--");
        System.out.println("[9] Rodyti aparato būseną.");
        System.out.println();

        System.out.print("Įrašykite pasirinkimo numerį: ");
        int nr = nmbrs.nextInt();

        if(nr >= 0 && nr < products.length) {
            order.makeCoffe(products[nr],usages[nr][0],usages[nr][1],usages[nr][2],usages[nr][3]);
            makeCoffee();
        }
        else if(nr == 9) {
            order.showStatus();

            String back = nmbrs.next();
            if(back.equals("T")) {
                makeCoffee();
            }
        }
        else if(nr <= -1 && nr >= -5) {
            order.resetSomething(nr);

            String back = nmbrs.next();
            if(back.equals("T")) {
                makeCoffee();
            }
        }
        else if(nr == -9) {
            makeCoffee();
        }
        else {
            System.out.println("Įrašyta neegzistuojanti reikšmė");
        }
    }
}
