package vcs.CoffeeMachine;

public class Products {
    private double water;   // ltr
    private double milk;    // ltr
    private double sugar;   // kg
    private double beans;   // kg

    public Products() {
        this.water = 3.0;
        this.milk = 1.0;
        this.sugar = 0.5;
        this.beans = 1.0;
    }

    public Products(double water, double milk, double sugar, double beans) {
        this.water = water;
        this.milk  = milk;
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
        if(new_counter > 0) {
            this.water = new_counter;
        }
    }

    public void resetMilk(double new_counter) {
        if(new_counter > 0) {
            this.milk = new_counter;
        }
    }

    public void resetSugar(double new_counter) {
        if(new_counter > 0) {
            this.sugar = new_counter;
        }
    }

    public void resetBeans(double new_counter) {
        if(new_counter > 0) {
            this.beans = new_counter;
        }
    }

    public boolean enoughtProducts(double needWater,double  needMilk, double needSugar, double needBeans) {
        if(this.water >= needWater && this.milk >= needMilk && this.sugar >= needSugar && this.beans >= needBeans) {
            return true;
        } else {
            return false;
        }
    }

    public void notEnoughProducts(double needWater,double  needMilk, double needSugar, double needBeans) {
        if(this.water < needWater) {
            System.out.println("Add Water! -> [WT]");
        }
        if(this.milk < needMilk) {
            System.out.println("Add Milk! -> [ML]");
        }
        if(this.sugar < needSugar) {
            System.out.println("Add Sugar! -> [SG]");
        }
        if(this.beans < needBeans) {
            System.out.println("Add Beans! -> [BN]");
        }
        System.out.println("Check all products balances -> [CH].");
    }

}
