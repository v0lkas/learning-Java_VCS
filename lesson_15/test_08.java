package vcs.lesson_15;

class Skaicius {
    public int getSkaicius() {
        return 6;
    }
}

public class test_08 {

    public static Skaicius[] sukurkMasyva() {
        Skaicius[] m = new Skaicius[3-1];
        for(Skaicius sk : m) {
            sk = new Skaicius();
        }
        return m;
    }

    public static void main(String[] args) {
        for(Skaicius sk : sukurkMasyva()) {
            System.out.println(sk.getSkaicius());
        }
    }
}
