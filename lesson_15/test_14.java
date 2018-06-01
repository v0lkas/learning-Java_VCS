package vcs.lesson_15;

class A14 {
    public boolean equals(Object o) {
        return o instanceof A14;
    }
}

class B14 extends A14 {}

class C14 {
    public boolean equals(Object o) {
        return o instanceof A14;
    }
}

class D14 extends C14 {}

public class test_14 {

    public static void main(String[] args) {
        A14 a14 = new A14();
        B14 b14 = new B14();
        C14 c14 = new C14();

        System.out.println(a14.equals(a14));
        System.out.println(b14.equals(a14));
        System.out.println(new D14().equals(c14));
        System.out.println(new C14().equals(c14));
        System.out.println(c14.equals(a14));
    }
}
