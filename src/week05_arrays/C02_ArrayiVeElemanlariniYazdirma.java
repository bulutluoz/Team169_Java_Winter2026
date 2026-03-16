package week05_arrays;

import java.util.Arrays;

public class C02_ArrayiVeElemanlariniYazdirma {
    public static void main(String[] args) {

        int[] fiyatlar = new int[3]; // [0, 0, 0]

        String[] urunListesi = new String[5]; // [null, null, null, null, null]

        String[] ogrenciIsimleri = { "Ali", "Veli", "Yasar", "Kemal" };

        int sayilar[] = {4,6,8,2,5,0};

        // array'i yazdirmak ile array'in icindeki bir elemani yazdirmak farkli seylerdir.

        // Array'deki bir elemani yazdirmak isterseniz arrayIsmi[elemaninIndexi]

        System.out.println(ogrenciIsimleri[2]); // Yasar

        System.out.println(sayilar[3]); // 2

        // sayilar array'inin en sondaki elemanini yazdirin

        System.out.println(sayilar[5]); // 0
        System.out.println(sayilar[sayilar.length-1]); // 0


        // TUM ARRAY'i yazdirmak istersek

        System.out.println("Sayilar arr : " + sayilar); //  Sayilar arr : [I@6aaa5eb0
        System.out.println("Ogrenci isimleri arr : " + ogrenciIsimleri); // Ogrenci isimleri arr : [Ljava.lang.String;@1a407d53

        // yazdirmak istedigimiz array non-primitive'dir
        // non-primitive'ler direk YAZDIRILAMAYABILIR
        // Array bunlardan biridir, array'i direkt olarak yazdiramazsiniz.

        System.out.println(Arrays.toString(sayilar)); // [4, 6, 8, 2, 5, 0]
        System.out.println(Arrays.toString(ogrenciIsimleri)); // [Ali, Veli, Yasar, Kemal]
        System.out.println(Arrays.toString(fiyatlar)); // [0, 0, 0]
        System.out.println(Arrays.toString(urunListesi)); // [null, null, null, null, null]

    }
}
