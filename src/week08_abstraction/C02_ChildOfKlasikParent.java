package week08_abstraction;

public class C02_ChildOfKlasikParent extends C01_KlasikParentClass{

    /*
        C02 class'i C01'i parent edinmekle
        1- OTOMATIK OLARAK C01 class'indaki tum ozellliklere (class level variable + method) sahip olur
        2- Child class isterse parent class'daki ozellikleri kabul etmeyip, kendisine uyarlayabilir
        3- Child class isterse parent class'da olmayan yeni ozellikler ekleyebilir

        Ozetle, klasik inheritance'da
        Child class parent class'dan daha avantajlidir.
        Parent class'in child class'a kural koyma yetkisi YOK.
     */

    static String str = "child";
    boolean mantikliMi = true;

    public static void method2(){
        System.out.println("child class method2");
    }
    public static void method4(){
        System.out.println("child class method4");
    }

    public static void main(String[] args) {

        System.out.println(str); // child
        System.out.println(sayi); // 5
        basHarf = 'C';

        method1(); // parent class method1
        method2(); // child class method2
        method3(); // parent class method3


    }


}
