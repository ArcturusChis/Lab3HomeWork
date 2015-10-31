package com.company;

import java.util.Scanner;

/**
 * Created by agchis on 30.10.2015.
 */

public class Factorial {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int factorial = 1;
        if (n == 0) {
            System.out.println("0! = 1");
        }
        else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println(n + "! = " + factorial);
        }
    }
}
