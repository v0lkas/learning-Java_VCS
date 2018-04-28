package vcs.lesson_06;

public class Coffee {
    private double sugar;       // kg
    private double beans;       // kg
    private double water;       // ltr
    private double milk;       // ltr
    private int usage;          // number of used times
    private int max_usage;      // number of max uses

    public Coffee() {
        sugar = 1;
        beans = 1;
        water = 3;
        milk = 1;
        usage = 0;
        max_usage = 100;
    }

    public boolean isReady() {
        if(sugar > 0 && beans > 0 && water > 0 && milk > 0 && usage < max_usage) {
            System.out.println("Aparatas pasiruošęs! Prašome pasirinkti kavą:");
            return true;
        }
        else {
            if(sugar <= 0) {
                System.out.println("Trūksta cukraus!");
            }
            if(beans <= 0) {
                System.out.println("Trūksta kavos pupelių!");
            }
            if(water <= 0) {
                System.out.println("Trūksta vandens!");
            }
            if(milk <= 0) {
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

        System.out.println("--");
        System.out.print("Grįžti į užsakymo pradžią (T)? ");
    }

    public void resetSomething(int nr) {
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

    public void makeCoffe(String title, double sugar, double beans, double water, double milk) {
        this.usage -= 1;
        this.sugar -= sugar;
        this.beans -= beans;
        this.water -= water;
        this.milk -= milk;

        System.out.println(title+" pagaminta!");
    }

    public void setUsage() {
        this.usage = 0;
        System.out.println("Kavos aparatas išvalytas!");
    }


}
