package week02_ifStatements;

import java.util.Scanner;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {


        // kullanicidan bir tamsayi isteyin



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        // sayi 100'den kucukse "uygun sayi" yazdirin
        if (sayi<100){
            System.out.println("Girdiginiz "+ sayi + " sayisi " + "uygun sayi");
        }


        // girilen sayi cift ise "cift sayi" yazdirin
        // bu sart yukardaki sart ile baglantili degil

        if (sayi % 2 == 0){
            System.out.println("Girdiginiz "+ sayi + " sayisi " + "cift sayi");
        }

        // bagimsiz if cumleleri kodun geri kalani ile ilgilenmez
        // boolean sart true ise if body calisir
        // boolean sart false ise if body calismaz


        // if body'nin calismamasi, if statement'in calismadigi anlamina gelmez
        // kontrol yapilip iceri girmeye uygun deger olmadigi anlasilir
        // Yani "if statement calisti ama uygun deger olmadigi icin if body devreye girmedi" diyebiliriz.

        // girilen sayi 5'in kati ise "5 ile bolunebilen sayi" yazdirin

        if (sayi % 5 == 0){
            System.out.println("Girdiginiz "+ sayi + " sayisi " + "5 ile bolunebilen sayi");
        }


        // birden fazla bagimsiz if cumlesi oldugunda
        // tum if body'lerinin calismasi mumkun oldugu gibi
        // hic bir if body'sinin calismama ihtimali de vardir

    }
}
