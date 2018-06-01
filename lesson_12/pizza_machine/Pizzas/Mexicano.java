package vcs.lesson_12.pizza_machine.Pizzas;

import vcs.lesson_12.pizza_machine.Pizza;
import vcs.lesson_12.pizza_machine.Recipe;

public class Mexicano extends Pizza {

    public Mexicano(Recipe recipe, int size) {
        super(recipe,size);
    }

    @Override
    public String getTitle() {
        return "Mexicano";
    }
}
