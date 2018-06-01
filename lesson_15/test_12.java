package vcs.lesson_15;

class A12 {
    int sk = 5;
    public void printSk() {
        System.out.println(sk);
    }
}

class B12 extends A12 {
    public void printSk() {
        System.out.println(sk);
    }
}

class C12 extends B12 {
    int sk = 3; // nothing, uses B12
}

class D12 extends C12 {
    int sk = 9;

    public void printSk() {
        System.out.println(sk);
        super.printSk();
    }
}

public class test_12 {
    public static void main(String[] args) {
        new A12().printSk();
        new B12().printSk();
        new C12().printSk();
        new D12().printSk();
    }
}
