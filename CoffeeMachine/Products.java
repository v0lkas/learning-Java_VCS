package vcs.CoffeeMachine;

public class Products {
    private double water;   // ltr
    private double milk;    // ltr
    private double sugar;   // kg
    private double beans;   // kg

    public Products(double water, double milk, double sugar, double beans) {
        this.water = water;
        this.milk = milk;
        this.sugar = sugar;
        this.beans = beans;
    }

    public double getWater() {
        return water;
    }

    public double getMilk() {
        return milk;
    }

    public double getSugar() {
        return sugar;
    }

    public double getBeans() {
        return beans;
    }

    public void useWater(double usage) {
        this.water -= usage;
    }

    public void useMilk(double usage) {
        this.milk -= usage;
    }

    public void useSugar(double usage) {
        this.sugar -= usage;
    }

    public void useBeans(double usage) {
        this.beans -= usage;
    }

    public void resetWater(double new_counter) {
        this.water = new_counter;
    }

    public void resetMilk(double new_counter) {
        this.milk = new_counter;
    }

    public void resetSugar(double new_counter) {
        this.sugar = new_counter;
    }

    public void resetBeans(double new_counter) {
        this.beans = new_counter;
    }
}
