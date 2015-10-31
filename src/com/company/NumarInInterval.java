/**
 * Created by agchis on 26.10.2015.
 */
package com.company;
import java.util.Scanner;

public class NumarInInterval {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int nr = in.nextInt();
        if (nr>=9 && nr <=24) {
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }
    }
}
