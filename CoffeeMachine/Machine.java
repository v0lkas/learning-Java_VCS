package vcs.CoffeeMachine;

public class Machine {
    private final int max_counter = 10;
    private int usageCounter;

    public Machine(int usageCounter) {
        this.usageCounter = usageCounter;
    }

    public int getUsageCounter() {
        return usageCounter;
    }

    public void plusCounter() {
        this.usageCounter++;
    }

    public void resetCounter(int new_counter) {
        this.usageCounter = new_counter;
    }
}
