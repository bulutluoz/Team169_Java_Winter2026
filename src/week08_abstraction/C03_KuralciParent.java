package week08_abstraction;

public abstract class C03_KuralciParent {

    /*
        C01 ve c02'de gorduk ki
        klasik inheritance'da parent class child class'lar uzerinde hic bir yetkiye sahip degil

        EGERRRRR
        bir class olusturuldugunda
        bu class'i parent edinen child class'larin MUTLAKA BULUNDURMASI GEREKEN method'lari belirlemek gerekirse
        Java'da abstraction kullanilmasi gerekir.

        Yani,
        eger bir parent class'da child class'larin mutlaka bulundurmasi gereken method'lari belirlemek icin
        abstraction kullanilir

        1- parent class'i olusturan kisi,
           hangi method'larin child class'lar icin zorunlu
           hangi method'larin child class'lar icin opsiyonel oldugunu belirler
     */
    /*
        Zorunluluk belirlemek isteniyorsa
        1- parent class abstract olarak belirlenmelidir
           bunun icin class deklarasyonuna abstract keyword yazilir

        2- zorunlu olan method'lari da abstract yapmaliyiz
           bunun icin method deklarasyonuna abstract yazmaliyiz.

        3- abstract method'lar normal method'lardan farklidir
           bu method'lar normal bir method gibi calismak icin degil
           SADECE kural belirlemek icin kullanilir.
           (standartlardaki bir cumle gibidir)
           bu method'larin body'si OLMAZ
     */

    // child class'larin zorunlu olarak bulundurmasi gereken method'lar
    public abstract void method1();
    // C03 class'ini parent edinen class'lar method1 BULUNDURMAK ZORUNDADIR

    public abstract void method2();

    public abstract void method3();


    // child class'larin zorunlu olarak bulundurmasi gerekmeyen method'lar
    public void method4(){
        System.out.println("kuralci parent class method4");
    }

    public void method5(){
        System.out.println("kuralci parent class method5");
    }


}
