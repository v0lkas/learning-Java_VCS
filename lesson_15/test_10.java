package vcs.lesson_15;

public class test_10 {

    public static Skaicius3[] sukurkMasyva() {
        Skaicius3[] m = new Skaicius3[0];
        for(int i = 0; i < m.length; i++) {
            m[i] = new Skaicius3();
        }
        return m;
    }

    public static void main(String[] args) {
        for(Skaicius3 sk : sukurkMasyva()) {
            System.out.println(sk.getSkaicius());
        }
    }
}

class Skaicius3 {
    int sk = 5;
    public int getSkaicius() {
        return sk;
    }
}
