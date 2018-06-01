package vcs.lesson_15;

class A13 {
    public String toString() {
        return this.getClass().getName();
    }
}

class B13 extends A13 {}

class C13 extends B13 {}

class D13 extends C13 {}

public class test_13 {

    public static void main(String[] args) {
        System.out.println(new A13());
        System.out.println(new B13());
        System.out.println(new D13());
    }
}
