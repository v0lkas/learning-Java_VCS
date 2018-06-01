package vcs.lesson_12.pizza_machine.Pizzas;

import vcs.lesson_12.pizza_machine.Pizza;
import vcs.lesson_12.pizza_machine.Recipe;

public class Amerigo extends Pizza {

    public Amerigo(Recipe recipe, int size) {
        super(recipe,size);
    }

    @Override
    public String getTitle() {
        return "Amerigo";
    }
}
