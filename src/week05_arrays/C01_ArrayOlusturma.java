package week05_arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {

        String isim = "Ali" ;
        int sayi = 89;


        sayi = 87;

        // bugune kadar bir variable olustururken
        // data turu + variable ismi + atama isareti + variable degeri + ;


        // olusturdugumuz variable'in BIR ARRAY oldugunu java'ya deklare etmeliyiz.
        // bunun icin [] kullanilir

        String[] ogrenciIsimleri = { "Ali", "Veli", "Yasar", "Kemal" };

        int sayilar[] = {4,6,8,2,5,0}; // 6 tane int eleman alabilen bir array

        // ogrenciIsimleri variable'inin data turu => Array
        // sayilar variable'nin data turu => Array
        // basda yazan String veya int,
        // o array'in icine hangi data turunden elemanlar konulabilecegini belirtir.


        // bir array olusturulurken,
        // array'in icine konulacak degerlerin data turu (String, int ...) belirlenir
        // ve array bu data turu disinda deger kabul etmez.

        String[] ogrenciIsimleri2 = { "Ali", "Veli", "Yasar", "Kemal", "5", "d" };


        int[] fiyatlar = new int[3]; // [0, 0, 0]
        // array olusturulurken 2 sey deklare edilmek zorundadir
        // 1- icine konulacak elemanlarin data turu => int
        // 2- kac eleman olacagi (length) => 3
        // icine konulacak fiyatlar henuz atanmadigi icin,
        // Java default olarak belirledigi standart degerleri atama yapar.

        String[] urunListesi = new String[5]; // [null, null, null, null, null]




    }
}
