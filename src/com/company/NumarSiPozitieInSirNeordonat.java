package com.company;
import java.util.Scanner;

/**
 * Created by agchis on 30.10.2015.
 */
public class NumarSiPozitieInSirNeordonat {
    public static void main(String[] args) {
        int[] a = {78, 56, 23, 98, 2, 27, 13, 25, 29, 19, 45, 322, 67, 87, 49, 53, 11, 7, 29};
        Scanner in = new Scanner(System.in);
        int numar = in.nextInt();
        int m = 0;
        for (int i = 0; i < a.length; i++) {
            if (numar == a[i]) {
                System.out.println("Numarul " + numar + " se afla in sir pe pozitia " + (i + 1));
            }
            else {
                m = m + 1;
            }

        }
        if (m == a.length)
                System.out.println("Numarul nu se afla in sir");

    }
}
