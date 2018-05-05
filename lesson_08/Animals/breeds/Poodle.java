package vcs.lesson_08.Animals.breeds;

import vcs.lesson_08.Animals.Animal;

public class Poodle extends Animal {

    public Poodle() {
        super("Dog", "Poodle");
    }

    @Override
    public void greet() {
        System.out.println(family+" "+breed);
    }
}
