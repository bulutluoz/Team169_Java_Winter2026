package week07_accessModifier_encapsulation;

public class C01_DataClass {

    /*
        Java, bir class'daki datalara (variable, method, constructor ..)
        herkesin ulasmasi yerine
        Kodu yazan kisinin belirleyecegi yetkiye sahip olan class'larin kullanabilmesi icin
        4 kademe olusturmustur.

        Bir variable veya method olustururken
        bu kademelerden hangisinin secilecegine karar vermek icin
        requirements'a bakilmasi gerekir

        Java'daki 4 erisim kademesi access modifier olarak adlandirilir
        en dar olandan en genis olana dogru siralama
        1- private ==> sadece icinde bulundugu class'dan kullanilabilecek datalar
        2- default access modifier => icinde bulundugu class ve icinde bulundugu package'dan kullanilabilecek datalar
        3- protected => icinde bulundugu class
                        icinde bulundugu package
                        baska package altindaki ilintili class'lar (child class)
        4- public =>  icinde bulundugu class
                      icinde bulundugu package
                      baska package altindaki ilintili class'lar (child class)
                      baska package altindaki ilintisiz class'lar (child olmayan class'lar)
                      yani proje kapsamindaki TUM CLASS'lardan kullanilabilecek datalar


        Java'da class seviyesinde olusturulan her sey (variable, method, constructor ..)
        MUTLAKA bir access modifier'a sahip olmalidir.

        Eger class uyesinin public, protected veya private olmasi isteniyorsa,
        bu access modifier'lar class uyesinin bas kismina yazilmalidir.

        Eger bu 3 access modifier'dan biri yazili degilse
        o class uyesi "default access modifier" a sahiptir.

     */

    public C01_DataClass(){

    }

    static private int sayiPrivateS;
    static String strDefaultAccModS; // default access modifier
    static protected char chrProtectedS;
    static public double dblPublicS;

    private int sayiPrivateI;
    String strDefaultAccModI; // default access modifier
    protected char chrProtectedI;
    public double dblPublicI;

    public static void method1(){

    }

    void method2(){ // gorunurde bir access modifier yok,
                    // method2'nin access modifier'i default access modifier'dir

    }

    static String method3(){// gorunurde bir access modifier yok,
                            // method3'nin access modifier'i default access modifier'dir

        return "";
    }

    public int method4(){
        sayiPrivateS = 23;
        System.out.println(sayiPrivateS);
        System.out.println(sayiPrivateI);
        strDefaultAccModS = "Java";
        System.out.println(strDefaultAccModI);


        return 3;
    }
}
