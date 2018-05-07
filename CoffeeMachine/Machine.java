package vcs.CoffeeMachine;

public class Machine {
    private static final int MAX_USAGE_COUNT = 7;
    private int usageCounter;
    Products products;

    public Machine() {
        this.usageCounter = 0;
        products = new Products();
    }

    public int getUsageCounter() {
        return usageCounter;
    }

    public int getMaxCounter() {
        return MAX_USAGE_COUNT;
    }

    public void plusCounter() {
        this.usageCounter++;
    }

    public void resetCounter() {
        this.usageCounter = 0;
    }

    public void coffeeMade(String title) {
        System.out.println(title+" made!");
        System.out.println();
    }

    public void coffeeAmericano() {
        double needWater = 0.25;
        double needMilk = 0.0;
        double needSugar = 0.05;
        double needBeans = 0.05;

        if(this.products.enoughtProducts(needWater, needMilk, needSugar, needBeans) == true && usageCounter < MAX_USAGE_COUNT) {
            this.products.useWater(needWater);
            this.products.useMilk(needMilk);
            this.products.useSugar(needSugar);
            this.products.useBeans(needBeans);
            this.plusCounter();
            this.coffeeMade("Americano");
        } else if(usageCounter == MAX_USAGE_COUNT) {
            System.out.print("Machine is overused! Clean machine? -> [CL] ");
            Machine_run.listenToUser();
        } else {
            this.products.notEnoughProducts(needWater, needMilk, needSugar, needBeans);
            Machine_run.listenToUser();
        }
    }

    public void coffeeEspresso() {
        double needWater = 0.075;
        double needMilk = 0.0;
        double needSugar = 0.1;
        double needBeans = 0.075;

        if(this.products.enoughtProducts(needWater, needMilk, needSugar, needBeans) == true && usageCounter < MAX_USAGE_COUNT) {
            this.products.useWater(needWater);
            this.products.useMilk(needMilk);
            this.products.useSugar(needSugar);
            this.products.useBeans(needBeans);
            this.plusCounter();
            this.coffeeMade("Espresso");
        } else if(usageCounter == MAX_USAGE_COUNT) {
            System.out.print("Machine is overused! Clean machine? -> [CL] ");
            Machine_run.listenToUser();
        } else {
            this.products.notEnoughProducts(needWater, needMilk, needSugar, needBeans);
            Machine_run.listenToUser();
        }
    }

    public void coffeeLatte() {
        double needWater = 0.2;
        double needMilk = 0.05;
        double needSugar = 0.1;
        double needBeans = 0.05;

        if(this.products.enoughtProducts(needWater, needMilk, needSugar, needBeans) == true && usageCounter < MAX_USAGE_COUNT) {
            this.products.useWater(needWater);
            this.products.useMilk(needMilk);
            this.products.useSugar(needSugar);
            this.products.useBeans(needBeans);
            this.plusCounter();
            this.coffeeMade("Latte");
        } else if(usageCounter == MAX_USAGE_COUNT) {
            System.out.print("Machine is overused! Clean machine? -> [CL] ");
            Machine_run.listenToUser();
        } else {
            this.products.notEnoughProducts(needWater, needMilk, needSugar, needBeans);
            Machine_run.listenToUser();
        }
    }

    public void coffeeCapuccino() {
        double needWater = 0.22;
        double needMilk = 0.03;
        double needSugar = 0.05;
        double needBeans = 0.05;

        if(this.products.enoughtProducts(needWater, needMilk, needSugar, needBeans) == true && usageCounter < MAX_USAGE_COUNT) {
            this.products.useWater(needWater);
            this.products.useMilk(needMilk);
            this.products.useSugar(needSugar);
            this.products.useBeans(needBeans);
            this.plusCounter();
            this.coffeeMade("Capuccino");
        } else if(usageCounter == MAX_USAGE_COUNT) {
            System.out.print("Machine is overused! Clean machine? -> [CL] ");
            Machine_run.listenToUser();
        } else {
            this.products.notEnoughProducts(needWater, needMilk, needSugar, needBeans);
            Machine_run.listenToUser();
        }
    }
}
