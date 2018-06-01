package vcs.lesson_12.pizza_machine;

public class Products {
    private double dough;
    private double cheese;
    private double tomatoes;
    private double sausage;
    private double sauce;

    public Products(double dough, double cheese, double tomatoes, double sausage, double sauce) {
        this.dough = dough;
        this.cheese = cheese;
        this.tomatoes = tomatoes;
        this.sausage = sausage;
        this.sauce = sauce;
    }

    public double getDough() {
        return dough;
    }

    public void setDough(double dough) {
        this.dough = dough;
    }

    public double getCheese() {
        return cheese;
    }

    public void setCheese(double cheese) {
        this.cheese = cheese;
    }

    public double getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(double tomatoes) {
        this.tomatoes = tomatoes;
    }

    public double getSausage() {
        return sausage;
    }

    public void setSausage(double sausage) {
        this.sausage = sausage;
    }

    public double getSauce() {
        return sauce;
    }

    public void setSauce(double sauce) {
        this.sauce = sauce;
    }
}
