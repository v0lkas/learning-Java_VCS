package vcs.lesson_08.Animals;

public class Cat extends Animal {

    public Cat(String breed) {
        super("Cat", breed);
    }

    @Override
    public void greet() {
        System.out.println("All humans are slaves");
    }
}
