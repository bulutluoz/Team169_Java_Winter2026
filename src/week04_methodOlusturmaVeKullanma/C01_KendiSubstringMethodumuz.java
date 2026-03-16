package week04_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C01_KendiSubstringMethodumuz {


    public static void main(String[] args) {
        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

            ornek metin  : Ali topu tut.
            baslangic indexi = 2
            bitis indexi = 7

            output : i top
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Baslangic ve bitis index'lerini giriniz...");
        int  baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();

        if (baslangic < 0 || baslangic > metin.length()-1 || bitis<0 || bitis > metin.length()-1){
            System.out.println("girilen index'ler metnin sinirlari disinda");
        } else if (baslangic > bitis) {
            System.out.println("baslangic index'i bitis index'inden buyuk olamaz");
        } else {
            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(metin.charAt(i));
            }
        }


        // ayni islemi String ile hazir method kullanarak da yapabiliriz
        System.out.println(metin.substring(baslangic,bitis));


        String str = "Java ne guzel";

        str.replace("J","H"); // str'i Hava ne guzel

        System.out.println(str.charAt(2));
        char besinciHarf = str.charAt(5);



    }
}
