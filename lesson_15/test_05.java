package vcs.lesson_15;

class BBB {
    int sk = 2;

    public BBB() {
        this(3);
        System.out.println(sk);
    }

    // private BBB(int sk) {        (default test)
    public BBB(int sk) {
        this.sk = sk;
    }
}

public class test_05 {

    // public static void main(String[] args) {
    public static void main(String[] args) {
        new BBB();
        new BBB(5);
    }
}
