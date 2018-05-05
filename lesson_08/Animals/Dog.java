package vcs.lesson_08.Animals;

public class Dog extends Animal {

    public Dog(String breed) {
        super("Dog", breed);
    }

    @Override
    public void greet() {
        System.out.println("Woof woof");
    }
}
