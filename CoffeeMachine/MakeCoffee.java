package vcs.CoffeeMachine;

public class MakeCoffee {
    public static void main(String[] args) {
        makeCoffee();
    }

    static void makeCoffee() {
        String[] coffeeNames = {"Americano","Espresso","Double Espresso","Latte","Capuchinno"};
        double[][] coffeeProducts = {
                {0.25, 0.0, 0.05, 0.05},
                {0.075, 0.0, 0.1, 0.075},
                {0.15, 0.0, 0.15, 0.15},
                {0.2, 0.05, 0.1, 0.05},
                {0.22, 0.03, 0.05, 0.05}
        };
    }
}
