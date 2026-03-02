package week02_ifStatements;

import java.util.Scanner;

public class C03_EskenarUcgen {

    public static void main(String[] args) {
        // kullanicidan bir ucgenin kenar uzunluklarini alin
        // kenar uzunluklari birbirine esit ise "Eskenar ucgen" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

       // if (kenar1 == kenar2 == kenar3){ // Operator '==' cannot be applied to 'boolean', 'double'
            // java'da 3'lu karsilastirma olmaz
            // bunu 2 parcaya bolup mantiksal operatorler ve/veya dan uygun olan ile birlestirebiliriz
        // }

        if (kenar1>0  && kenar1 == kenar2   &&  kenar1== kenar3 ){
            System.out.println("Eskenar ucgen");
        }

    }
}
