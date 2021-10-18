package ba.unsa.etf.rpr;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static int sumaCifara(int num) {
        int suma = 0;
        while (num != 0) {
            suma = suma + (num % 10);
            num = num / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
        System.out.print("Unesite pozitivan broj: ");
        int broj = input.nextInt();

        if (broj < 1) {
            System.out.println("Neispravan unos!");
            exit(0);
        }

        System.out.println("Brojevi: ");
        for (int i = 1; i <= broj; i++) {
            if (i % sumaCifara(i) == 0)
                System.out.println(i + " | Suma Cifara: " + sumaCifara(i));

            if (i == broj) break;
        }
    }
}
