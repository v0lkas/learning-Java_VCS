package vcs.lesson_15;

interface ABC16 {
    public void sayAbc();
}

class A16 implements ABC16 {
    public void sayAbc() {
        System.out.println("abc!");
    }
}

class B16 extends A16 {
    public void sayAbc() {
        super.sayAbc();
        System.out.println("ABC!");
    }

}

class C16 extends A16 {
    public void sayAbc() {
        System.out.println("ABC!");
    }
}

public class test_16 {
    public static void main(String[] args) {
        ABC16[] m = { new A16(), new B16(), new C16() };
        for(ABC16 abc16 : m) {
            abc16.sayAbc();
        }
    }
}
