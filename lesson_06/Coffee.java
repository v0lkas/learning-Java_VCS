package vcs.lesson_06;

public class Coffee {
    private double sugar;       // kg
    private double beans;       // kg
    private double water;       // ltr
    private double milk;        // ltr
    private int usage;          // number of used times
    private int max_usage;      // number of max uses

    public Coffee() {
        this.max_usage = 5;
        this.sugar = 1.0;
        this.beans = 1.0;
        this.water = 3.0;
        this.milk = 1.0;
        this.usage = 0;
    }

    String[] products = {
        "Americano",
        "Espresso",
        "Double Espresso",
        "Latte",
        "Capuchino"
    };

    double[][] usages = {
        // sugar, beans, water, milk
        {0.05, 0.05, 0.2, 0.0},
        {0.1, 0.075, 0.05, 0.0},
        {0.15, 0.15, 0.1, 0.0},
        {0.05, 0.05, 0.15, 0.1},
        {0.025, 0.05, 0.2, 0.05}
    };

    public String[] getProducts() {
        return products;
    }

    public double[][] getUsages() {
        return usages;
    }

    public double maxUsage(int nr) {
        double max = 0;
        for (int i = 0; i < usages.length; i++) {
            if(usages[i][nr] > max) {
                max = usages[i][nr];
            }
        }
        return max;
    }

    public boolean isReady() {
        if(sugar >= maxUsage(0) && beans >= maxUsage(1) && water >= maxUsage(2) && milk >= maxUsage(3) && usage < max_usage) {
            return true;
        }
        else {
            if(sugar <= maxUsage(0)) {
                System.out.println("Trūksta cukraus!");
            }
            if(beans <= maxUsage(1)) {
                System.out.println("Trūksta kavos pupelių!");
            }
            if(water <= maxUsage(2)) {
                System.out.println("Trūksta vandens!");
            }
            if(milk <= maxUsage(3)) {
                System.out.println("Trūksta pieno!");
            }
            if(usage == max_usage) {
                System.out.println("Būtinas aparato valymas!");
            }
            return false;
        }
    }

    public void showStatus() {
        System.out.println("Cukraus likutis: "+sugar);
        System.out.println("Pupelių likutis: "+beans);
        System.out.println("Vandens likutis: "+water);
        System.out.println("Pieno likutis: "+milk);

        int left = max_usage - usage;
        System.out.println("Naudojimų iki valymo: "+left);
    }

    public void resetCounter(int nr) {
        if(nr == -1) {
            this.sugar = 1;
        }
        else if(nr == -2) {
            this.beans = 1;
        }
        else if(nr == -3) {
            this.water = 3;
        }
        else if(nr == -4) {
            this.milk = 1;
        }
        else if(nr == -5) {
            this.usage = 0;
        }
    }

    protected void makeDrink(String title, double[] data) {
        if(isReady() == true) {
            this.usage++;
            this.sugar -= data[0];
            this.beans -= data[1];
            this.water -= data[2];
            this.milk -= data[3];

            System.out.println(title + " pagaminta!");
        }
    }
}
