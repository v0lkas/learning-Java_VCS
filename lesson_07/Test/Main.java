package vcs.lesson_07.Test;

import vcs.lesson_07.Person;
import vcs.lesson_07.Programmer;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.hello();
        // p.speak();
        // p.bye();
        // p.code();

        Programmer pr = new Programmer();
        pr.hello();
        // pr.speak();
        // pr.bye();
        pr.code();
    }
}

