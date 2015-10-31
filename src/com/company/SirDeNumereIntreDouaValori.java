package com.company;

import java.util.Scanner;

/**
 * Created by agchis on 30.10.2015.
 */
public class SirDeNumereIntreDouaValori {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();
        int[] a = {23, 546, 347, 467, 525, 5, 18, 4235, 879, 14, 6, 9, 0, 687, 365, 987, 67, 8, 10,17, 21};
        int[] sir;
        int k = 0;
        sir = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= min && a[i] <= max) {
                k = k+1;
                sir[k] = a[i];
                System.out.print(sir[k] + " , ");
            }
        }
        if (k == 0) {
            System.out.println("Nu exista nici un numar cuprins intre " + min + " si " + max);
        }

    }
}
