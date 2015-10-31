package com.company;
import java.util.Scanner;
/**
 * Created by agchis on 26.10.2015.
 */
public class NumarPalindrom {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int nr = in.nextInt();
        int copieNumar = nr;
        int numarCifre = 0;
        if (nr < 10) {
            System.out.println("numarul este palindrom!");
        } else {
            while (nr > 0) {
                numarCifre = numarCifre + 1;
                nr = nr / 10;
            }

            int i;
            int k = numarCifre;
            for (i = 1; i <= numarCifre / 2; i++) {
                System.out.println(copieNumar);
                if (copieNumar / RidicareLaPutere(10, k - 1) != copieNumar % 10) {

                    System.out.println("Numarul nu este palindrom");
                    break;
                }
                else {
                    copieNumar = (copieNumar % RidicareLaPutere(10, k - 1))/10;
                    k = k - 2;
                    if(i == numarCifre/2) {
                        System.out.println("Numarul este palindrom!");
                    }
                }
            }

        }
    }
    static int RidicareLaPutere(int numar, int putere) {
        int nrLaPutere = numar;
        for (int i = 1; i < putere; i++) {
            nrLaPutere *= numar;
        }
        return nrLaPutere;
    }
}
