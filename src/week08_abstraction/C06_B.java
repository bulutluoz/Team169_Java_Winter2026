package week08_abstraction;

import java.util.ArrayList;
import java.util.List;

public class C06_B extends C03_KuralciParent{
    /*
        Abstract class'lar kendilerinden OBJE olusturmak icin degil
        Child class'larinin ORTAK OZELLIKLERINI belirlemek icin olusturulur

        Ornegin C03 class'i der ki:
        benim tum child class'larimda method1, method2, method3 bulunur
     */

    public static void main(String[] args) {

        // C03_KuralciParent obj1 = new C03_KuralciParent();
        // 'C03_KuralciParent' is abstract; cannot be instantiated
        // C03 class'i abstract oldugundan obje olusturulamaz
        // SEBEBI : C03 abstract class oldugundan
        //          icinde body'si olmayan abstract method'lar var
        //          eger bu class'dan obje olusturulursa
        // obj1.method1();
        //          gibi calistirilamayacak ozellikler olusur
        //          Java bunu engellemek icin
        //          abstract class'lardan obje olusturulmasina izin vermez.


        C03_KuralciParent obj1 = new C06_B();
        obj1.method1(); // B class method1


        // bugune kadar aslinda bu ozelligi kullaniyorduk
        // ama farkinda degildik

        // List<String> isimler = new List<>();
        // 'List' is abstract; cannot be instantiated

        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar.contains(9));

        /*
            List abstract oldugu icin 36.satirda obje olusturulmasina Java izin vermedi

            cunku List abstract yapi ve icinde child class'larinin bulundurmak zorunda oldugu abstract method'lar var

            ornegin List class'inda abstract contains(); vardi, body'si yoktu
                    contains(){} body'li olarak List'in child'i olan ArrayList'de var
                    ve 39.satirda olusturulan sayilar listesi
                    contains method'unu ArrayList'deki abstracty olmayan method'dan calistirir.
         */



    }


    public void method1() {
        System.out.println("B class method1");
    }

    public void method2() {
        System.out.println("B class method2");
    }

    public void method3() {
        System.out.println("B class method3");
    }
}
