package vcs.lesson_15;

public class test_02 {

    public static void main(String [] argv) {
        StringBuilder b = new StringBuilder("A");
        b.append("B");
        b.append("C");

        String str = new String("D");
        str.replaceAll("D", "F");

        b.append(str);
        b.deleteCharAt(0);

        System.out.println(b.toString() +" "+ b +" "+ b.indexOf("A"));
    }
}
