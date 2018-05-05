package vcs.lesson_08.Animals;

import vcs.lesson_08.Animals.breeds.Bulldog;
import vcs.lesson_08.Animals.breeds.Persian;
import vcs.lesson_08.Animals.breeds.Poodle;
import vcs.lesson_08.Animals.breeds.Siamese;

public class Animal_run {
    public static void main(String[] args) {
//        Dog dg = new Dog();
//        System.out.println(dg.family);
//
//        Cat ct = new Cat();
//        System.out.println(ct.family);

        Animal  anml0 = new Animal("Animal","Who knows");
        Dog     anml1 = new Dog("Who knows");
        Cat     anml2 = new Cat("Who knows");
        Bulldog anml3 = new Bulldog();
        Poodle anml4 = new Poodle();
        Persian anml5 = new Persian();
        Siamese anml6 = new Siamese();

        anml0.greet();
        anml1.greet();
        anml2.greet();
        anml3.greet();
        anml4.greet();
        anml5.greet();
        anml6.greet();
    }
}
