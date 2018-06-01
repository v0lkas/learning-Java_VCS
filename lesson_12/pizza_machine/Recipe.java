package vcs.lesson_12.pizza_machine;

public interface Recipe {
    public Products getNeededProducts(int pizzaSize);

    public void setProducts(Products products);

    public void setSize(int size);

    public void setTitle(String title);

    public String getTitle();
}
