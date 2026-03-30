package week07_accessModifier_encapsulation;

public class C03_Encapsulation {

    /*
        Encapsulation her class veya her variable icin kullanilacak bir consept DEGILDIR
        Sadece belirli ozel durumlarda kullanilir, Ve bu ozel durumda kullanilabilecek TEK YONTEMDIR

        Bir class'daki variable'lara NEREDEN ULASILABILECEGINI => access modifier
        NASIL ULASILABILECEGINI => static/instance olmasi belirler

        EGER bir variable'a deger atama yetkisi ile variable'in degerini goruntuleme yetkisini AYIRMAK ISTERSENIZ
        ENCAPSULATION kullanmak zorundasiniz.

     */

    public static void main(String[] args) {
        //        BIR VARIABLE'a acces modifier sayesinde ulasabiliyorsak
        //        o variable'a HEM DEGER ATAMASI yapabilir,
        //        HEM DE var olan degerini yazdirabiliriz

        // Ornegin Encapsulation class'indan
        // DataClass'indaki variable'lara ulasmak istedigimizde
        // bu class'lar ayni package da olduklari icin
        // public, default access modifier ve protected olanlara ulasabiliriz
        // sadece private variable'lara ulasamayiz

        // static olanlara class adiyla ulasalim
        System.out.println(C01_DataClass.dblPublicS); // 0.0
        C01_DataClass.dblPublicS = 35;
        System.out.println(C01_DataClass.dblPublicS); // 35.0

        System.out.println(C01_DataClass.strDefaultAccModS); // null
        C01_DataClass.strDefaultAccModS = "java candir";
        System.out.println(C01_DataClass.strDefaultAccModS); // java candir


        // instance olanlara obje uzerinden ulasabiliriz
        C01_DataClass obj1 = new C01_DataClass();
        System.out.println(obj1.chrProtectedI); // a
        obj1.chrProtectedI ='9';
        System.out.println(obj1.chrProtectedI); // 9


        //        BIR VARIABLE'a acces modifier sayesinde ulasamiyorsak
        //        o variable'a NE DEGER ATAMASI yapabilir,
        //        NE DE var olan degerini yazdirabiliriz

//        System.out.println(C01_DataClass.sayiPrivateS);
//        C01_DataClass.sayiPrivateS = 45;
//
//        System.out.println(obj1.sayiPrivateI);
//        obj1.sayiPrivateI = 56;



    }
}
