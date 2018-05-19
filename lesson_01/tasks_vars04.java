package vcs.lesson_01;

public class tasks_vars04 {
    public static void main(String[] args) {
        String str1 = "black cat walked over the street";
        String str2 = "white cat was laying on the tree";

        String exmpl1 = str1 + str2;
        String exmpl2 = str1 +" and "+ str2;

        System.out.println(exmpl1);
        System.out.println(exmpl2);

        System.out.println(str1+", "+str2);
        System.out.println("The "+str1+" and the "+str2+".");
        System.out.printf("The %s and the %s.",str1,str2);
    }
}
