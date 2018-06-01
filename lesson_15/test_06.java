package vcs.lesson_15;

class a {
    public static int a;
    public a() {
        a++;
    }
    public a clone() {
        a a2 = new a();
        a2.a = a;
        return a2;
    }
}

public class test_06 {

    public static void main(String[] args) {

        a a = new a();
        a = a.clone().clone();
        System.out.println(a.a);
        System.out.println(a.clone().a);
    }
}
