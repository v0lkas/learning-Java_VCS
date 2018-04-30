package vcs.lesson_06;

import java.util.Scanner;

public class Coffee_run {
    public static void main(String[] args) {
        makeCoffee();
    }

    static void makeCoffee() {
        Coffee order = new Coffee();

        Scanner nmbrs = new Scanner(System.in);

        boolean userBrake = false;
        while (userBrake != true) {

            System.out.println();
            if (order.isReady()) {
                for (int i = 0; i < order.getProducts().length; i++) {
                    System.out.println("[" + i + "] " + order.getProducts()[i]);
                }
            } else {
                System.out.println("[-1] Papildyti cukraus.");
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

            if (nr >= 0 && nr < order.getProducts().length) {
                order.makeDrink(order.getProducts()[nr], order.getUsages()[nr]);
            } else if (nr == 9) {
                order.showStatus();

                userBrake = goBack();
            } else if (nr <= -1 && nr >= -5) {
                order.resetCounter(nr);

                System.out.println("Skaitliukas atstatytas!");

                userBrake = goBack();
            } else {
                System.out.println("Įrašyta neegzistuojanti reikšmė");
            }
        }
    }

    static boolean goBack() {
        Scanner nmbrs = new Scanner(System.in);

        boolean ret = false;
        String back;
        do {
            System.out.println("--");
            System.out.println("Grįžti į užsakymo pradžią (T)?");
            System.out.println("Išjungti kavos aparatą (N)?");

            back = nmbrs.next();
            if (back.toLowerCase().equals("n")) {
                ret = true;
                System.out.println("Kavos aparatas išjungtas.");
            }
        } while(!back.toLowerCase().equals("t") && !back.toLowerCase().equals("n"));
        return ret;
    }
}
