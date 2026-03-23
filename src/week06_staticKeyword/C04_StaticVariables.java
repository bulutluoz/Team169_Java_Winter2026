package week06_staticKeyword;

public class C04_StaticVariables {

    public static void main(String[] args) {

        C02_Hemsire h1 = new C02_Hemsire();

        System.out.println(h1.hemIsmi); // null
        System.out.println(h1.hastaneAdi);// Yildiz

        h1.hemIsmi = "Burak";
        h1.hastaneAdi = "Java hastanesi";

        System.out.println(h1.hemIsmi); // Burak
        System.out.println(h1.hastaneAdi);// Java hastanesi


       C02_Hemsire h2 = new C02_Hemsire();

        System.out.println(h2.hemIsmi); // null
        System.out.println(h2.hastaneAdi);  // Java hastanesi

        h2.hemIsmi = "Rasim";
        h2.hastaneAdi = "Kizilay hastanesi";
        System.out.println(h1.hemIsmi); // Burak
        System.out.println(h1.hastaneAdi);// Kizilay hastanesi
        System.out.println(h2.hemIsmi); // Rasim
        System.out.println(h2.hastaneAdi);// Kizilay hastanesi

        C02_Hemsire h3 = new C02_Hemsire();
        h3.hemIsmi = "Omer";
        h3.hastaneAdi = "Nevsehir hastanesi";



        System.out.println(h1.hemIsmi); // Burak
        System.out.println(h1.hastaneAdi);// Nevsehir hastanesi
        System.out.println(h2.hemIsmi); // Rasim
        System.out.println(h2.hastaneAdi);// Nevsehir hastanesi
        System.out.println(h3.hemIsmi); // Omer
        System.out.println(h3.hastaneAdi);// Nevsehir hastanesi


        // NOT 3
        // static variable'lar class'a bagli oldugundan
        // Java static variable'lari Class ismi ile kullanmamizi ister
        System.out.println(C02_Hemsire.hastaneAdi);
        System.out.println(C02_Hemsire.hastaneAdresi);
        System.out.println(C02_Hemsire.bashekim);

        // EGER static variable'lari class adi ile degil,
        // OBJE adi ile cagirirsak, java yine ayni degerleri verir
        // ama erisim yonteminin uygun olmadigini gostermek icin SARIYA BOYAR
        System.out.println(h1.hastaneAdi);
        System.out.println(h2.hastaneAdresi);
        System.out.println(h3.bashekim);
        // Static member 'week06_staticKeyword.C02_Hemsire.hastaneAdi' accessed via instance reference
        // static bir class uyesi olan hastaneAdi instance yontemle kullaniliyor


        // NOT 4
        // instance variable'lar objeye baglidir ve obje ismi ile kullanilmak ZORUNDADIR
        // Class adi ile veya direkt olarak instance variable'lara ULASILAMAZ

        System.out.println(h1.hemIsmi);
        System.out.println(h2.hemAdresi);
        System.out.println(h3.hemTelefonu);

        //System.out.println(C02_Hemsire.hemIsmi);
        //System.out.println(hemAdresi);















    }
}
