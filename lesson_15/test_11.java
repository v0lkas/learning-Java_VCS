package vcs.lesson_15;

class A11 {
    int sk = 5;
    public void printSk() {
        System.out.println(sk);
    }
}

class B11 extends A11 {
    public void printSk() {
        System.out.println(sk+sk);
    }
}

class C11 extends B11 {
    int sk = 3; // does nothing, C11 takes value from B11
}

public class test_11 {

    public static void main(String[] args) {
        new A11().printSk();
        new B11().printSk();
        new C11().printSk();
    }
}
