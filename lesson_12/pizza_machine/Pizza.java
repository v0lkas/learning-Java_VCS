package vcs.lesson_12.pizza_machine;

public abstract class Pizza {

    private Recipe recipe;
    private int size;

    public Pizza(Recipe recipe, int size) {
        this.recipe = recipe;
        this.size = size;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public int getSize() {
        return size;
    }

    public abstract String getTitle();

//    public String toString() {
//        return "Pizza: " + getClass().getName();
//    }
}