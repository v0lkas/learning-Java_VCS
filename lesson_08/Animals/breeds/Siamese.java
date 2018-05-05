package vcs.lesson_08.Animals.breeds;

import vcs.lesson_08.Animals.Animal;

public class Siamese extends Animal {

    public Siamese() {
        super("Cat", "Siamese");
    }

    @Override
    public void greet() {
        System.out.println(family+" "+breed);
    }
}
