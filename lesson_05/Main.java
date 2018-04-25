package vcs.lesson_05;

public class Main {
    public static void main(String[] args) {
        double a = 1.25;
        System.out.println(a);
        int b = (int) a;
        System.out.println(b);

        // method 1
        double c = 1d * 4/3;
        System.out.println(c);
        // method 2
        double d = 4.0/3;
        System.out.println(d);
        // method 3 <-- recomended
        double e = (double) 4/3;
        System.out.println(e);


        String s1 = "I Love ";
        s1 += "Java";
        String s2 = "I ";
        s2 += "Love Java";
        if(s1 == s2)        System.out.println("s1 == s2");
        else                System.out.println("s1 != s2");             // <--
        if(s1.equals(s2))   System.out.println("s1 equals s2");         // <--
        else                System.out.println("s1 is not equals s2");
    }
}
