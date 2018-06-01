package vcs.lesson_12.pizza_machine;

public interface iMachine {
    public Pizza makePizza(String title, int size);

    public void addProducts(Products products);
}
