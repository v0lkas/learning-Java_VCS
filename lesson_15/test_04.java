package vcs.lesson_15;

class AAA {
    int sk = 2;

    public AAA() {
        this(3);
        System.out.println(sk);
    }

    private AAA(int sk) {
        sk = sk;
    }
}

public class test_04 {

    public static void main(String[] args) {
        new AAA();
    }
}
