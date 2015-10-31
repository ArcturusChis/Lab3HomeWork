package com.company;
import java.util.Scanner;
/**
 * Created by agchis on 25.10.2015.
 */
public class SumaSiProdusulCifrelor {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int nr = in.nextInt();
        int suma = 0;
        int produsul = 1;
        int copiaNr = nr;
        int numarCifre = 0;
        int cifraMin = 9;
        int cifraMax = 0;
        int ultimaCifra;
        //verifica daca numarul este 0
        if(nr == 0) {
            System.out.println("Numarul este nul !!!");
        }
        else {
            //Calculeaza suma si produsul, nr de cifre, cifra minima si maxima
            while (nr > 0) {
                ultimaCifra = nr % 10;
                suma = suma + ultimaCifra;
                produsul = produsul * ultimaCifra;
                numarCifre = numarCifre + 1;
                if (cifraMin >= ultimaCifra) {
                    cifraMin = ultimaCifra;
                }
                if (cifraMax <= ultimaCifra) {
                    cifraMax = ultimaCifra;
                }
                nr = (nr - nr % 10) / 10;
            }
            System.out.println("Suma cifrelor este: " + suma);
            System.out.println("Produsul cifrelor este: " + produsul);
            System.out.println("Numarul cifrelor este: " + numarCifre);
            System.out.println("Cifra minima este: " + cifraMin);
            System.out.println("Cifra maxima este: " + cifraMax);

        }

        //Calculeaza cifra de control
        int k = suma;
        int sumaIntermed = 0;
        while(k > 9) {
            suma = k;
            while (suma > 0) {
                ultimaCifra = suma % 10;
                sumaIntermed = sumaIntermed +ultimaCifra;
                suma = (suma - suma % 10) / 10;
            }
            k = sumaIntermed;
            sumaIntermed = 0;
        }
        System.out.println("Cifra de control a numarului este: " + k);
        System.out.println("Numarul initial este: " + copiaNr);

    }
}
