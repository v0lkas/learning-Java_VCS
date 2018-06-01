package vcs.lesson_15;

class b {
    public int b;

    public b() {
        b++;
    }

    public b(int b){
        this.b = b;
    }

    public b b(b b) {
        b.b++;
        return b;
    }

    public b clone() {
        b b2 = new b();
        b2.b = b;
        return b2;
    }
}

public class test_07 {

    public static void main(String[] args) {
        b b = new b(5);
        b.b(b);

        System.out.println(b.b);
        System.out.println(++b.clone().b);
    }
}
