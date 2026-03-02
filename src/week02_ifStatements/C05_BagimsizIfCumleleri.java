package week02_ifStatements;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {

    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
        // ve asagidaki sartlari kontrol ederek istenen cumleleri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
        if (sayi1 < sayi2){
            System.out.println("birinci sayi daha kucuk");
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        if (sayi1 > 0){
            System.out.println("birinci sayi sifirdan buyuk");
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        if (sayi2 > 50){
            System.out.println("ikinci sayi 50'den buyuk");
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
        }

        // 5- yukardaki sartlarin hicbiri saglanmazsa, "nasil sayi sectin? hic bir sarti saglamiyor" yazdirin
        if (!(sayi1 < sayi2) && !(sayi1 > 0) && !(sayi2 > 50) && !(sayi2 % 5 == 0)){
            System.out.println("nasil sayi sectin? hic bir sarti saglamiyor");
        }

        // 6- yukardaki sartlarin hepsi saglanirsa, "mukemmel sayi" yazdirin
        if ((sayi1 < sayi2) && (sayi1 > 0) && (sayi2 > 50) && (sayi2 % 5 == 0)){
            System.out.println("mukemmel sayi");
        }
    }
}
