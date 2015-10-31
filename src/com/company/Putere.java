package com.company;

import java.util.Scanner;

/**
 * Created by agchis on 28.10.2015.
 */
public class Putere {
    static double RidicareLaPutere(int numar, int putere) {
        double nrLaPutere = numar;
        for (int i = 1; i < putere; i++) {
            nrLaPutere *= numar;
        }
        return nrLaPutere;
    }


    public static void main(String[] args) {
        System.out.println( RidicareLaPutere(10, 10));

    }
}