package week02_ifStatements;

import java.util.Scanner;

public class C04_SusluparantezKullanilmazsa {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();



//        if (sayi % 3 == 0){
//            System.out.println("Uc ile bolunebilen sayi");
//            System.out.println("3 ile bolunen sayilar guzeldir");
//        }
//
//
//        if (sayi % 5 == 0){
//            System.out.println("Bes ile bolunebilen sayi");
//            System.out.println("5 ile bolunen sayilar da guzeldir");
//        }



        // EGER if statement'da boolean sarttan sonra { } kullanmazsak
        // ilk ; e kadar olan kisim if body olur,
        // sonraki kodlar if statement'in disinda kalir

        // Demek ki if sartina bagli kodumuz sadece 1 satir ise {} kullanmasak da olur
        // AMMMAAA if sartina bagli kod 1 satirdan uzunsa MUTLAKA {} kullanilmalidir.

        if (sayi % 3 == 0)
            System.out.println("Uc ile bolunebilen sayi");
            System.out.println("3 ile bolunen sayilar guzeldir");
            System.out.println("3 ile bolunme 3.satir");



        if (sayi % 5 == 0)
            System.out.println("Bes ile bolunebilen sayi");
            System.out.println("5 ile bolunen sayilar da guzeldir");


    }
}
