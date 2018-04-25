package vcs.lesson_03;

import java.util.Scanner;
import java.util.stream.IntStream;

public class array_ {
    public static void main(String[] args) {
        int arr[] = {1,66,2,8,33,5,2};

        //int suma = IntStream.of(arr).sum();
        double suma = getSum(arr);
        System.out.println("Suma: "+suma);

        double aver = getAverage(arr);
        System.out.println("Vidurkis: "+aver);

        int min = getMinValue(arr);
        System.out.println("Mažiausias: "+min);

        int max = getMaxValue(arr);
        System.out.println("Didžiausias: "+max);

        int copy[] = new int[arr.length];
        copy = arr.clone();
        System.out.print("Kopija: ");
        for(int cp : copy) {
            System.out.print(cp+" ");
        }
        System.out.println();

        int nArr[] = createArray();
        System.out.print("Sąrašas: ");
        for(int prnt : nArr) {
            System.out.print(prnt+" ");
        }
        System.out.println();
        System.out.println("Suma: "+ getSum(nArr) +"; Vidurkis: "+ getSum(nArr) +"; Sandauga: "+ getMultip(nArr));
    }

    static double getSum(int[] x) {
        int sum = x[0];
        for(int i=1; i < x.length; ++i) {
            sum += x[i];
        }
        return sum;
    }

    static double getAverage(int[] x) {
        int suma = IntStream.of(x).sum();   // gudrybė
        double aver = 1.0d * suma / x.length;
        return aver;
    }

    static double getMultip(int[] x) {
        int mult = x[0];
        for(int i=1; i < x.length; ++i) {
            mult *= x[i];
        }
        return mult;
    }

    static int getMinValue(int[] x) {
        int min = x[0];
        for(int i=1; i < x.length; ++i) {
           if(x[i] < min) min = x[i];
        }
        return min;
    }

    static int getMaxValue(int[] x) {
        int max = x[0];
        for(int i=1; i < x.length; ++i) {
           if(x[i] > max) max = x[i];
        }
        return max;
    }

    static int[] createArray(){
        Scanner crt = new Scanner(System.in);

        System.out.print("Koks bus masyvo ilgis? ");
        int ilgis = crt.nextInt();

        int nArr[] = new int[ilgis];
        for(int i=0; i<ilgis; ++i) {
            System.out.print("Įveskite skaičių nr. "+i+": ");
            int sk = crt.nextInt();
            nArr[i] = sk;
        }
        return nArr;
    }
}