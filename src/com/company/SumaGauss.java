package com.company;
import java.util.Scanner;
/**
 * Created by agchis on 26.10.2015.
 */
public class SumaGauss {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int nr = in.nextInt();
        int suma = nr * ( nr + 1 ) / 2;
        System.out.println("Suma primelor " + nr + " numere este: " + suma);
    }
}
