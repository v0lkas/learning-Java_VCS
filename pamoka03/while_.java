package vcs.pamoka03;

public class while_ {
    public static void main(String[] args) {
        int x = 5;
        while (x < 5) {
            System.out.println(x);
            x++;
        }

        System.out.println("---");

        x = 5;
        do {
            System.out.println(x);
            x++;
        } while (x < 5);
    }
}
