package vcs.lesson_03;

import java.util.Scanner;
import java.util.stream.IntStream;

public class tasks_arrays {
    public static void main(String[] args) {

        // Task 1 & 2
        int arr[] = {1,66,2,8,33,5,2};

        // int sum = IntStream.of(arr).sum();
        double sum = getSum(arr);
        System.out.println("Sum: "+sum);

        double aver = getAverage(arr);
        System.out.println("Average: "+aver);

        int min = getMinValue(arr);
        System.out.println("Smallest: "+min);

        int max = getMaxValue(arr);
        System.out.println("Biggest: "+max);

        // Task 3 & 2a & 9. Array copy method #1
        int copy[] = new int[arr.length];
        copy = arr.clone();
        System.out.print("Copy #1: ");
        for(int i=0; i < copy.length; ++i) {
            if(i > 0) {
                System.out.print(", ");
            }
            System.out.print(copy[i]);
        }
        System.out.println();

        // Task 3 & 2b. Array copy method #2
        int[] copy2 = arr.clone();
        System.out.print("Copy #2:");
        for(int cp : copy2) {
            System.out.print(" "+cp);
        }
        System.out.println();

        // Task 4 & 5
        int nArr[] = createArray();
        System.out.print("List: ");
        for(int prnt : nArr) {
            System.out.print(prnt+" ");
        }
        System.out.println();
        System.out.println("Sum: "+ getSum(nArr));
        System.out.println("Average: "+ getAverage(nArr));
        System.out.println("Multiplication: "+ getMultip(nArr));

        // Task 6
        System.out.println();
        compare(arr,copy);

        // Task 7
        System.out.println();
        System.out.print("Enter any number from 0 to 10: ");
        Scanner sc = new Scanner(System.in);
        int any_num = sc.nextInt();
        int num_enters = 0;
        while (any_num != -1) {
            if(any_num >= 0 && any_num <= 10) {
                ++num_enters;
            }

            System.out.print("Enter new number from 0 to 10: ");
            any_num = sc.nextInt();
        }
        System.out.println("Total correct numbers entered: "+num_enters);

        // Task 8
        System.out.println();
        while (true) {
            System.out.print("Enter number you are looking for: ");
            int srch_num = sc.nextInt();

            if(srch_num >= 0) {
                int found = -1;
                for (int i = 0; i < arr.length; ++i) {
                    if (arr[i] == srch_num) {
                        found = i;
                        break;
                    }
                }

                System.out.println("Number position in array: "+found);
            } else {
                break;
            }
        }
    }

    // Task 2c
    static double getSum(int[] x) {
        int sum = x[0];
        for(int i=1; i < x.length; ++i) {
            sum += x[i];
        }
        return sum;
    }

    // Task 2d & 5
    static double getAverage(int[] x) {
        int sum = IntStream.of(x).sum();
        double aver = 1.0d * sum / x.length;
        return aver;
    }

    // Task 5 (partially)
    static double getMultip(int[] x) {
        int mult = x[0];
        for(int i=1; i < x.length; ++i) {
            mult *= x[i];
        }
        return mult;
    }

    // Task 2e & 5
    static int getMinValue(int[] x) {
        int min = x[0];
        for(int i=1; i < x.length; ++i) {
           if(x[i] < min) min = x[i];
        }
        return min;
    }

    // Task 2f & 5
    static int getMaxValue(int[] x) {
        int max = x[0];
        for(int i=1; i < x.length; ++i) {
           if(x[i] > max) max = x[i];
        }
        return max;
    }

    // Task 5
    static int[] createArray(){
        Scanner crt = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter length of array: ");
        int ilgis = crt.nextInt();

        int nArr[] = new int[ilgis];
        for(int i=0; i<ilgis; ++i) {
            System.out.print("Enter number #"+i+": ");
            int sk = crt.nextInt();
            nArr[i] = sk;
        }
        return nArr;
    }

    // Task 6
    static boolean compare(int[] ar1, int[] ar2) {
        if(ar1.length == ar2.length) {
            for(int i=0;i<ar1.length;++i) {
                if(ar1[i] != ar2[i]) {
                    System.out.println("Arrays are not hte same");
                    return false;
                }
            }
            System.out.println("Arrays are the same");
            return true;
        } else {
            System.out.println("Arrays length is not the same");
            return false;
        }
    }
}