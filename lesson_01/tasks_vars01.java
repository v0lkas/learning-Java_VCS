package vcs.lesson_01;

public class tasks_vars01 {
    public static void main(String[] args) {

        boolean var1 = true;        // [true or false]
        byte    var2 = 64;          // [-128 , 127]
        short   var3 = 6400;        // [-32,768 , 32,767]
        char    var4 = '\u0430';    // [‘\u0000’ , \uffff ] or [0 , 65535]
        int     var5 = 299415161;   // [-2.147.483.648 , 2.147.483.647]
        long    var6 = 941684110;   // [-263^63, 263^63-1 ]
        float   var7 = 10.99f;      // [32-bit 754 floating-point]
        double  var8 = 10.99;       // [65-bit 754 floating point]
        String  var9 = "This is string";

        System.out.println("1: "+ var1);
        System.out.println("2: "+ var2);
        System.out.println("3: "+ var3);
        System.out.println("4: "+ var4);
        System.out.println("5: "+ var5);
        System.out.println("6: "+ var6);
        System.out.println("7: "+ var7);
        System.out.println("8: "+ var8);
        System.out.println("9: "+ var9);
    }
}
