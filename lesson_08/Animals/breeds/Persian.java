package vcs.lesson_08.Animals.breeds;

import vcs.lesson_08.Animals.Animal;

public class Persian extends Animal {

    public Persian() {
        super("Cat", "Persian");
    }

    @Override
    public void greet() {
        System.out.println(family+" "+breed);
    }
}
