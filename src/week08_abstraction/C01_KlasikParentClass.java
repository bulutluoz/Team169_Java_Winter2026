package week08_abstraction;

public class C01_KlasikParentClass {

    /*
        Java'da insanlardan farkli olarak
        Parent class'lar child class'larini belirlemez,
        Child class'lar istedikleri bir class'i parent edinebilirler
        bunun icin child class extends keyword'unu kullanir.


     */

    static String str = "parent";
    static int sayi = 5;
    static char basHarf = 'A';


    static public void method1(){
        System.out.println("parent class method1");
    }

    static public void method2(){
        System.out.println("parent class method2");
    }

    static public void method3(){
        System.out.println("parent class method3");
    }
}
