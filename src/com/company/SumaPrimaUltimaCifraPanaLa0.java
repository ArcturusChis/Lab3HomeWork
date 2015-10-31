/**
 * Created by agchis on 30.10.2015.
 */
public class SumaPrimaUltimaCifraPanaLa0 {
    public static void main(String[] args) {
        // write your code here
        int[] a = {23, 546, 347, 467, 525, 5, 18, 4235, 879, 14, 6, 9, 130, 687, 0, 365, 987, 67, 8};
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 10) {
                suma = suma + SumaPrimaSiUltimaCifra(a[i]);
                System.out.println(SumaPrimaSiUltimaCifra(a[i]));
            }
            else {
                if (a[i] == 0)
                    break;
            }

        }
        System.out.println("Suma ceruta este: " + suma);

    }


    static int SumaPrimaSiUltimaCifra(int numar) {
        int sumaPsiU = 0;
        int ultimaCifra;
        ultimaCifra = numar % 10;
        while (numar > 10){
            numar = numar / 10;
        }
        sumaPsiU = ultimaCifra + numar;

        return sumaPsiU;
    }
}


