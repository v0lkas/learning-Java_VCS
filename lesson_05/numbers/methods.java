package vcs.lesson_05.numbers;

public class methods {
    public static String lyginis(int a) {
        int sk = a % 2;

        if(sk == 1) return "Nelyginis";
        else        return "Lyginis";
    }

    public static int paskutinis(int a) {
        int sk = a % 10;
        return sk;
    }

    public static int pirmas(int a) {
        int sk = a / 100 % 10;
        return sk;
    }

    public static int nlength(int a) {
        int sk = (int)(Math.log10(a)+1);
        return sk;
    }

    public static int exchange(int a) {
        int ln = (int)(Math.log10(a)+1);
        int sk = a;
        int new_sk = 0;

        for(int i = 1; i <= ln; ++i) {
            int tmp_sk = paskutinis(sk);
            sk = (sk - tmp_sk) / 10;
            // Math.pow(2,2);
            for(int j = i; j < ln; j++) {
                tmp_sk *= 10;
            }
            new_sk += tmp_sk;
        }
        return new_sk;
    }
}
