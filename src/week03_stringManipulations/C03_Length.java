package week03_stringManipulations;

import java.util.Scanner;

public class C03_Length {
    public static void main(String[] args) {

        String cumle = "Ali topu at.";
        String isim = "Ali uzunkavaklaraltindayataruyumazoglu";

        System.out.println(isim.length()); // 38
        System.out.println(cumle.length()); // 12


        // cumledeki son karakteri yazdirin
        System.out.println(cumle.charAt(12-1)); // .

        // isim variable'inin degerinin son karakterini yazdirin
        System.out.println(isim.charAt(38-1)); // u


        // kullanicidan bir kullanici adi isteyin
        // ve son karakterini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kullanici adi giriniz...");
        String kullaniciAdi = scanner.nextLine();

        System.out.println(kullaniciAdi.charAt(kullaniciAdi.length() -1));

        // kullanici adinin sondan 3.karakterini yazdirin
        System.out.println(kullaniciAdi.charAt(kullaniciAdi.length() -3));


    }
}
