package com.company;

import java.util.Scanner;

/**
 * Created by agchis on 28.10.2015.
 */
public class CifreImpareSiPatrat {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 0;
        int c = 0;
        int k = 0;
        int j = 0;
        while (a > 0) {
            if ((a % 10) % 2 != 0) {
                b = b + a % 10 * RidicareLaPutere(10, k) ;
                k = k + 1;
            } else {
                if ((a % 10) > 3) {
                    c = (a % 10) * (a % 10) * RidicareLaPutere(10,j) + c;
                    j = j + 2;
                } else {
                    c = a % 10 * a % 10 * RidicareLaPutere(10, j) + c;
                    j = j + 1;
                }
            }
            a = a / 10;
        }

        System.out.println("b = " + b + " ; iar c = " + c);
    }

    static int RidicareLaPutere(int numar, int putere) {
        int nrLaPutere = 1;
        for (int i = 0; i < putere; i++) {
            nrLaPutere = nrLaPutere * numar;
        }
        return nrLaPutere;
    }
}
