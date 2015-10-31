/**
 * Created by agchis on 30.10.2015.
 */
package com.company;
public class PerechiNumerePrimulMaiMare {
    public static void main(String[] args) {
        // write your code here
        int[] a = {24, 35, 8, 75, 9, 43, 73, 65, 23, 55};
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] > a[i]) {
                System.out.print(a[i-1] + " " + a[i] + " , ");
            }
        }
    }
}
