package vcs.lesson_15;

class AA {
    private int sk;

    public int getSk() {
        return sk;
    }

    public void setSk(int sk) {
        System.out.println(sk);
        this.sk = sk;
    }
}

public class test_03 {

    public static void main(String[] args) {
        AA a = new AA();
        int sk = a.getSk();
        sk++;
        System.out.println(sk++);
        a.setSk(++sk);
        a.setSk(sk);
    }
}
