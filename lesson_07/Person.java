package vcs.lesson_07;

public class Person {
    // public - pasiekiama iš bet kur
    public void hello() {
        System.out.println("Hello");
    }

    // protected - pasiekiama tik tame pačiame pakete
    protected void speak() {
        System.out.println("Speak");
    }

    // private ž pasiekiama tik toje pačioje klasėje
    private void bye() {
        System.out.println("Bye");
    }
}
