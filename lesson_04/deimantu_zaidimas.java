package vcs.lesson_04;

import java.util.Random;
import java.util.Scanner;

public class deimantu_zaidimas {
    public static void main(String[] args) {
        zaidimas();

        System.out.print("Ar norite pakartoti žaidimą (T / N)? ");
        Scanner psr = new Scanner(System.in);
        String pasirinkimas = psr.next();
        if(pasirinkimas.toLowerCase().equals("t")) {
            System.out.println();
            System.out.println();
            zaidimas();
        }
    }

    static void zaidimas() {
        // Sukuriamas zaidimas
        int diamondCount = 0;
        int[][] game = new int[5][5];
        while (diamondCount != 7) {
            int x = new Random().nextInt(4);
            int y = new Random().nextInt(4);

            if(game[x][y] != 1) {
                game[x][y] = 1;
                ++diamondCount;
            }
        }

        for(int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.print(" (?) ");
            }
            System.out.println();
        }

        int nr = 0;
        int atsp = 0;
        for(int i = 0; i < 7; ++i) {
            Scanner crt = new Scanner(System.in);

            ++nr;
            System.out.print("Spėkite, deimanto nr."+nr+" eilutę (1-5): ");
            int eil = crt.nextInt();
            System.out.print("Spėkite, deimanto nr."+nr+" stulpelį (1-5): ");
            int stp = crt.nextInt();

            if(eil >= 1 && eil <= 5 && stp >= 1 && stp <= 5) {
                --eil;
                --stp;
                if(game[eil][stp] == 1) {
                    game[eil][stp] = 2;
                    ++atsp;
                }
                else if(game[eil][stp] == 0)    game[eil][stp] = 3;
                else                            System.out.println("Toks spėjimas jau buvo.");

                for(int i2 = 0; i2 < 5; ++i2) {
                    for (int j2 = 0; j2 < 5; ++j2) {
                        if(game[i2][j2] == 2)         System.out.print(" (*) ");
                        else if(game[i2][j2] == 3)    System.out.print(" (x) ");
                        else                          System.out.print(" (?) ");
                    }
                    System.out.println();
                }
            }
            else System.out.println("KLAIDINGAI NURODYTAS RUOŽAS!");
        }

        System.out.println();
        System.out.println("Teisingų atsakymų: "+atsp+" iš 7");
            if(atsp >= 3)   System.out.println("VALIO!!!");
            else            System.out.println(":(((((((");
        System.out.println();
    }
}
