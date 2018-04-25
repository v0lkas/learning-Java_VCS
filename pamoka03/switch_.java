package vcs.pamoka03;

import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {
        String[] meniu = {
                "1. Sumavimas",
                "2. Daugyba",
                "3. Pakėlimas kvadratu"
        };

        for (String item : meniu) {
            System.out.println(item);
        }

        boolean testi_cikla;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Pasirinkite savo variantą nuo 1 iki " + meniu.length + ": ");
            int variantas = sc.nextInt();

            switch (variantas) {
                case 1:
                    testi_cikla = sudetis();
                    break;
                case 2:
                    testi_cikla = daugyba();
                    break;
                case 3:
                    testi_cikla = kvadratas();
                    break;
                default:
                    System.out.println("Pasirinkimo klaida!");
                    testi_cikla = true;
                    break;
            }
        } while(testi_cikla);
    }

    static boolean sudetis() {
        Scanner scalc = new Scanner(System.in);

        System.out.print("Įveskite skaičių nr. 1: ");
        int sk1 = scalc.nextInt();
        System.out.print("Įveskite skaičių nr. 2: ");
        int sk2 = scalc.nextInt();
        int rezultatas = sk1 + sk2;

        System.out.println("REZULTATAS: "+rezultatas);

        return sk1 > 0 && sk2 > 0 && rezultatas > 0;
    }

    static boolean daugyba() {
        Scanner scalc = new Scanner(System.in);

        System.out.print("Įveskite skaičių nr. 1: ");
        int sk1 = scalc.nextInt();
        System.out.print("Įveskite skaičių nr. 2: ");
        int sk2 = scalc.nextInt();
        int rezultatas = sk1 * sk2;

        System.out.println("REZULTATAS: "+rezultatas);

        return sk1 > 0 && sk2 > 0 && rezultatas > 0;
    }

    static boolean kvadratas() {
        Scanner scalc = new Scanner(System.in);

        System.out.print("Įveskite skaičių: ");
        int sk = scalc.nextInt();
        double rezultatas = Math.pow(sk,2);

        System.out.println("REZULTATAS: "+rezultatas);

        return sk > 0 && rezultatas > 0;
    }
}
