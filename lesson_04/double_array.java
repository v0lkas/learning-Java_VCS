package vcs.lesson_04;

import java.util.stream.IntStream;

public class double_array {
    public static void main(String[] args) {
        // uzduotis_1(2,10);

        int[][] uzd_2 = {
            {1,8,6,8},
            {65,55,677,22},
            {0,3,55,1}
        };
//      uzduotis_2_a(uzd_2);
//      uzduotis_2_b(uzd_2);
//      uzduotis_2_c(uzd_2);
//      uzduotis_2_d(uzd_2);
//      uzduotis_2_e(uzd_2);
//      uzduotis_2_f(uzd_2);
//      uzduotis_2_g(uzd_2);

//      uzduotis_6(10,10);
    }

    static void uzduotis_2_a(int[][] arr) {
        System.out.println("Užduotis 2.a.:");
        System.out.println(arr[0][0]+" "+arr[0][1]+" "+arr[0][2]+" "+arr[0][3]);
    }

    static void uzduotis_2_b(int[][] arr) {
        System.out.println("Užduotis 2.b.:");
        System.out.println(arr[0][0]+" "+arr[1][0]+" "+arr[2][0]);
    }

    static void uzduotis_2_c(int[][] arr) {
        System.out.println("Užduotis 2.c.:");
        for(int i1 = 0; i1 < arr[0].length; ++i1) {
            System.out.print(arr[0][i1]+" ");
        }
        System.out.println();
    }

    static void uzduotis_2_d(int[][] arr) {
        System.out.println("Užduotis 2.d.:");
        for(int i0 = 0; i0 < arr.length; ++i0) {
            System.out.print(arr[i0][0]+" ");
        }
        System.out.println();
    }

    static void uzduotis_2_e(int[][] arr) {
        System.out.println("Užduotis 2.e.:");
        for(int i0 = 0; i0 < arr.length; ++i0) {
            for(int i1 = 0; i1 < arr[i0].length; ++i1) {
                System.out.print(arr[i0][i1]+" ");
            }
            System.out.println();
        }
    }

    static void uzduotis_2_f(int[][] arr) {
        System.out.println("Užduotis 2.f.:");
        int suma = 0;
        for(int i0 = 0; i0 < arr.length; ++i0) {
            suma += IntStream.of(arr[i0]).sum();
        }
        System.out.println(suma);
    }

    static void uzduotis_2_g(int[][] arr) {
        System.out.println("Užduotis 2.g.:");
        int suma = 0;
        int min = 0;
        int max = 0;
        int total = 0;

        for(int i0 = 0; i0 < arr.length; ++i0) {
            suma += IntStream.of(arr[i0]).sum();
            total += arr[i0].length;
            for(int i1 = 0; i1 < arr[i0].length; ++i1) {
                if (min > arr[i0][i1]) min = arr[i0][i1];
                if (max < arr[i0][i1]) max = arr[i0][i1];
            }
        }

        double avrg = 1d * suma / total;
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Avr: "+avrg);
    }

    static void uzduotis_1(int a, int b) {
        System.out.println("Užduotis 1:");
        for(int i = 1; i <= a; ++i) {
            for(int i2 = 1; i2 <= b; ++i2)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        return;
    }

    static void uzduotis_6(int a,int b) {
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
