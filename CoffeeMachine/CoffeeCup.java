package vcs.CoffeeMachine;

public class CoffeeCup extends Cup {
    private String coffeeName;
    private boolean coffeeReady;
    private Products products;

    public CoffeeCup(String coffeeName, boolean coffeeReady, Products products) {
        this.coffeeName = coffeeName;
        this.coffeeReady = coffeeReady;
        this.products = products;
    }
}
