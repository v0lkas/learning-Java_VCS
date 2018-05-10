package vcs.CoffeeMachine;

import vcs.CoffeeMachine.CoffeeCups.AmericanoCoffeeCup;
import vcs.CoffeeMachine.CoffeeCups.CappuccinoCoffeeCup;
import vcs.CoffeeMachine.CoffeeCups.EspressoCoffeeCup;
import vcs.CoffeeMachine.CoffeeCups.LatteCoffeeCup;

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

    public AmericanoCoffeeCup coffeeAmericano() {
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
            //Machine_run.listenToUser();
        }
        Products p = new Products(needWater,needMilk,needSugar,needBeans);
        return new AmericanoCoffeeCup(p);
    }

    public EspressoCoffeeCup coffeeEspresso() {
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
            //Machine_run.listenToUser();
        }
        Products p = new Products(needWater,needMilk,needSugar,needBeans);
        return new EspressoCoffeeCup(p);
    }

    public LatteCoffeeCup coffeeLatte() {
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
            //Machine_run.listenToUser();
        }
        Products p = new Products(needWater,needMilk,needSugar,needBeans);
        return new LatteCoffeeCup(p);
    }

    public CappuccinoCoffeeCup coffeeCapuccino() {
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
            //Machine_run.listenToUser();
        }
        Products p = new Products(needWater,needMilk,needSugar,needBeans);
        return new CappuccinoCoffeeCup(p);
    }

    public CoffeeCup makeCoffee(String coffeeType) {
        if(coffeeType.toLowerCase().equals("am")) {
            return this.coffeeAmericano();
        } else if(coffeeType.toLowerCase().equals("es")) {
            return this.coffeeEspresso();
        } else if(coffeeType.toLowerCase().equals("lt")) {
            return this.coffeeLatte();
        } else  {
            return this.coffeeCapuccino();
        }
    }
}
