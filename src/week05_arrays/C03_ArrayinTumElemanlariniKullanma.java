package week05_arrays;

import java.util.Arrays;

public class C03_ArrayinTumElemanlariniKullanma {

    public static void main(String[] args) {

        int sayilar[] = {4,6,8,2,5,0};

        // array'deki tum elementleri aralarinda - olarak yazdirin

        System.out.println(Arrays.toString(sayilar)); // [4, 6, 8, 2, 5, 0]

        System.out.println(
               sayilar[0] + "-" +
               sayilar[1] + "-" +
               sayilar[2] + "-" +
               sayilar[3] + "-" +
               sayilar[4] + "-" +
               sayilar[5]
        );

        // EGER bir array'deki tum elemanlari kullanamak istersek
        // for loop kullanmak gerekir

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + "-");
        }
    }
}
