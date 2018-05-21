package vcs.lesson_04;

public class tasks_6_multiplication {
    public static void main(String[] args) {
        task_6(5,5);
    }

    static void task_6(int a,int b) {
        int[][] daugyba = new int[a][b];
        for(int i0 = 0; i0 <= a; ++i0) {
            for(int i1 = 0; i1 <= b; ++i1)
            {
                int calc = i0 * i1;
                if(i0 > 0 && i1 > 0) {
                    int row = i0 - 1;
                    int clm = i0 - 1;
                    daugyba[row][clm] = calc;
                }

                if(i0 == 0) {
                    if(i1 == 0)         System.out.print("     |");
                    else {
                        System.out.printf("%3s",i1);
                        System.out.print("x |");
                    }
                }
                else {
                    if(i1 == 0) {
                        System.out.printf("%3s",i0);
                        System.out.print("x |");
                    }
                    else {
                        System.out.printf("%4s",calc);
                        System.out.print(" |");
                    }
                }
            }
            System.out.println();
            for(int i1 = 0; i1 <= b; ++i1) {
                System.out.print("------");
            }
            System.out.println();
        }
    }
}
