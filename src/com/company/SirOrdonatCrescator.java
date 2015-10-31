/**
 * Created by agchis on 30.10.2015.
 */
package com.company;
public class SirOrdonatCrescator {
    public static void main(String[] args) {
        // write your code here
        int[] a = {2,4,7,8,14,19,23,47,28,35,37,38,46,48,49,50};
        int m = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] > a[i]) {
                m = 1;
            }
        }
        if (m == 0) {
            System.out.println("Sirul este crescator");
        }
        else {

                int i,schimbat,aux;
                do
                {
                    schimbat = 0;
                    for(i = 0; i < a.length-1; i++) //parcurgem vectorul
                        if(a[i] > a[i+1]) //daca valoarea i din vectorul a este
                        //mai mica decat cea de pe pozitia i+1
                        { //interschimbare
                            aux = a[i];
                            a[i] = a[i+1];
                            a[i+1] = aux;
                            schimbat = 1;
                        }

                }while(schimbat == 1);

                for (i = 0; i < a.length; i++){
                    System.out.print(a[i] + " , ");
            }

        }
    }
}
