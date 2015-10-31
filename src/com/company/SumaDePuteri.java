package com.company;
import java.util.Scanner;

/**
 * Created by agchis on 30.10.2015.
 */
public class SumaDePuteri {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int sumaDePuteri = 0;
        for (int i = 0; i <= n; i++) {
            sumaDePuteri = sumaDePuteri + RidicareLaPutere(x, i);
        }
        System.out.println("Suma puterilor lui " + x + " este: " + sumaDePuteri);
    }


    static int RidicareLaPutere(int numar, int putere) {
        int nrLaPutere = 1;
        for (int i = 0; i < putere; i++) {
            nrLaPutere = nrLaPutere * numar;
        }
        return nrLaPutere;
    }
}

