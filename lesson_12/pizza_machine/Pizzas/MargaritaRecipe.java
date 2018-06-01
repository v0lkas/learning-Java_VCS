package vcs.lesson_12.pizza_machine.Pizzas;

import vcs.lesson_12.pizza_machine.Products;
import vcs.lesson_12.pizza_machine.Recipe;

public class MargaritaRecipe implements Recipe {

    private Products recipeProducts;
    private int pizzaSize;
    private String title;

    @Override
    public Products getNeededProducts(int pizzaSize) {
        if(recipeProducts == null || pizzaSize == 0 || title == null) {
            System.err.println("Not enough data.");
            return null;
        }
        // TODO calculate products
        System.err.println("Products can not be counted.");
        return new Products(1, 1, 1, 1, 1);
    }

    @Override
    public void setProducts(Products products) {
        this.recipeProducts = products;
    }

    @Override
    public void setSize(int size) {
        this.pizzaSize = pizzaSize;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
