package vcs.lesson_15;

interface ABC18 {
    public void sayAbc();
}

class A18 implements ABC18 {
    public void sayAbc() {
        System.out.println("abc!");
    }
}

class B18 extends A18 {
    public void sayAbc() {
        super.sayAbc();
        System.out.println("ABC!");
    }
}

class C18 extends A18 {
    public void sayAbc() {
        System.out.println("!!!");
    }
}

public class test_18 {
    public static void main(String[] args) {
        ABC18[] m = { null, new A18(), new B18(), new C18() };
        try {
            for(int i = 0; i <= m.length; i++) {
                try {
                    m[i].sayAbc();
                } catch (NullPointerException e) {
                    System.err.println("000");
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("-1");
        }
    }
}
