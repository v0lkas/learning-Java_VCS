package vcs.CoffeeMachine;

import java.util.Scanner;

public class Machine_run {
    public static Machine machine = new Machine();

    public static void main(String[] args) {

        boolean loop = true;
        while(loop == true) {
            if(machine.getUsageCounter() < machine.getMaxCounter()) {
                System.out.println("Make Americano -> [AM]");
                System.out.println("Make Espresso -> [ES]");
                System.out.println("Make Latte -> [LT]");
                System.out.println("Make Cappuccino -> [CP]");
                System.out.print("YOUR CHOICE: ");
            } else {
                System.out.print("Machine is overused! Clean machine? -> [CL] ");
            }
            loop = listenToUser();
        }
    }

    public static boolean listenToUser() {
        boolean loop = true;

        Scanner listen = new Scanner(System.in);

        String input = listen.next();

        System.out.println();
        if(input.toLowerCase().equals("am")) {
            machine.coffeeAmericano();
        } else if(input.toLowerCase().equals("es")) {
            machine.coffeeEspresso();
        } else if(input.toLowerCase().equals("lt")) {
            machine.coffeeLatte();
        } else if(input.toLowerCase().equals("cp")) {
            machine.coffeeCapuccino();
        } else if(input.toLowerCase().equals("wt")) {
            machine.products.resetWater(3.0);
            System.out.println("Water refilled!");
        } else if(input.toLowerCase().equals("ml")) {
            machine.products.resetMilk(1.0);
            System.out.println("Milk refilled!");
        } else if(input.toLowerCase().equals("sg")) {
            machine.products.resetSugar(0.5);
            System.out.println("Sugar refilled!");
        } else if(input.toLowerCase().equals("bn")) {
            machine.products.resetBeans(1.0);
            System.out.println("Beans refilled!");
        } else if(input.toLowerCase().equals("cl")) {
            machine.resetCounter();
            System.out.println("Machine cleaned!");
            System.out.println();
        } else if(input.toLowerCase().equals("ch")) {
            System.out.println("LEFT PRODUCTS:");
            System.out.println("Water: "+ machine.products.getWater() +" (refill -> [WT])");
            System.out.println("Milk:  "+ machine.products.getMilk() +" (refill -> [ML])");
            System.out.println("Sugar: "+ machine.products.getSugar() +" (refill -> [SG])");
            System.out.println("Beans: "+ machine.products.getBeans() +" (refill -> [BN])");
            System.out.println("Usage: "+ machine.getUsageCounter() +" of "+ machine.getMaxCounter() +" (clean -> [CL])");
            System.out.println("--");
            System.out.println("GO BACK -> [BC]");
            System.out.print("YOUR CHOICE: ");
            listenToUser();
        } else if(input.toLowerCase().equals("sh")) {
            System.out.println("Coffee machine has been shut down.");
            loop = false;
        }

        return loop;
    }
}
