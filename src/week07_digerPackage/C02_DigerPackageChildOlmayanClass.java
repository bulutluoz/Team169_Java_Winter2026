package week07_digerPackage;

import week07_accessModifier_encapsulation.C01_DataClass;

public class C02_DigerPackageChildOlmayanClass {

    public static void main(String[] args) {
        // static variable'lara ulasalim
        C01_DataClass.dblPublicS = 45;
        // public olarak isaretlenen bir class uyesi
        // proje icindeki her class'dan kullanilabilir.



        // System.out.println(C01_DataClass.chrProtectedS);
        // 'chrProtectedS' has protected access in 'week07_accessModifier_encapsulation.C01_DataClass'
        // protected access modifier'a sahip oldugundan
        // kendi class'indan
        // icinde bulundugu package'daki diger class'dan
        // baska package'daki child class'dan kullanilabilir
        // baska package altindaki child olmayan class'dan KULLANILAMAZ

        //System.out.println(C01_DataClass.sayiPrivateS);
        // 'sayiPrivateS' has private access in 'week07_accessModifier_encapsulation.C01_DataClass'
        // private access modifier'a disardaki hic bir class'dan ulasilamaz


        // System.out.println(C01_DataClass.strDefaultAccModS);
        // 'strDefaultAccModS' is not public in 'week07_accessModifier_encapsulation.C01_DataClass'.
        // Cannot be accessed from outside package
        // default access modifier'a sahip oldugu icin, package disindan ULASILAMAZ
    }
}
