package vcs.lesson_15;

class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }
}

class C extends Object {
    public C() {
        super();
        System.out.println("C");
    }
}

public class test_01 {

    public static void main(String [] argv) {
        new A();
        new B();
        new C();
    }
}
