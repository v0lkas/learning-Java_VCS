package vcs.lesson_15;

class Skaicius2 {
    public int getSkaicius() {
        return 99;
    }
}

public class test_09 {

    public static Skaicius2[] sukurkMasyva() {
        Skaicius2[] m = new Skaicius2[3-1];
        for(int i = 0; i < m.length; i++) {
            Skaicius2 sk = m[i];    // null
            sk = new Skaicius2();   // null
        }
        return m;
    }

    public static void main(String[] args) {
        for(Skaicius2 sk : sukurkMasyva()) {
            System.out.println(sk.getSkaicius()); // returns NullPointerException
        }
    }
}
