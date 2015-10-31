package com.company;

/**
 * Created by agchis on 30.10.2015.
 */
public class NumereDublateSiImpareTriplate {
    public static void main(String[] args) {
        // write your code here
        int[] a = {23, 546, 347, 467, 525, 5, 18, 4235, 879, 14, 6, 9, 0, 687, 365, 987, 67, 8, 10,17, 21};
        int[] b;
        b = new int[a.length / 2];
        for (int i = 0; i < a.length / 2; i++) {
            b[i] = a[i] * 2;
            System.out.print(b[i] + " , ");
        }
        System.out.print("jumatatea sirului ,");
        for (int i = a.length / 2; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] * 3 + " , ");
            }
            else {
                System.out.print(a[i] + " , ");
            }
        }
    }
}
