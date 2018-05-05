package vcs.lesson_08.Animals;

public class Animal {
    public String family;
    public String breed;

    public Animal(String family, String breed) {
        this.family = family;
        this.breed = breed;
    }

    public void greet() {
        System.out.println("I am an animal");
    }
}
