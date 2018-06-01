package vcs.lesson_12.pizza_machine.Pizzas;

import vcs.lesson_12.pizza_machine.Pizza;
import vcs.lesson_12.pizza_machine.Products;
import vcs.lesson_12.pizza_machine.Recipe;

public class Margarita extends Pizza {

    public Margarita() {
        super(new MargaritaRecipe(), 10);
        super.getRecipe().setSize(5);
        super.getRecipe().setTitle("Margarita");
        super.getRecipe().setProducts(new Products(1, 1, 1, 1, 1));
    }

    @Override
    public String getTitle() {
        return getRecipe().getTitle();
    }

    public String toString() {
        return "A pizza" + super.getRecipe().getTitle();
    }
}
