package com.company;
import java.util.Scanner;

/**
 * Created by agchis on 25.10.2015.
 */
public class NumarInversPalindrom {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int nr = in.nextInt();
        int invers = 0;
        int copieNr = nr;
        int ultimaCifra;
        while (nr >0) {
            ultimaCifra = nr % 10;
            invers = invers * 10 + ultimaCifra;
            nr = nr / 10;
        }
        System.out.println("Numarul invers este: " + invers);
        if (invers == copieNr) {
            System.out.println("Numarul este palindrom !");
        }
        else {
            System.out.println("Numarul nu este palindrom !");
        }

    }
}
