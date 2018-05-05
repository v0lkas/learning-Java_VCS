package vcs.lesson_08.Animals.breeds;

import vcs.lesson_08.Animals.Animal;

public class Bulldog extends Animal {

    public Bulldog() {
        super("Dog", "Bulldog");
    }

    @Override
    public void greet() {
        System.out.println(family+" "+breed);
    }
}
