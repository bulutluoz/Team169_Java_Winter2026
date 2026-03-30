package week07_digerPackage;

import week07_accessModifier_encapsulation.C01_DataClass;

public class C01_DigerPackageChildClass extends C01_DataClass {

    public static void main(String[] args) {

        // static variable'lara ulasalim
        C01_DataClass.dblPublicS = 45;
        System.out.println(C01_DataClass.chrProtectedS);

        // System.out.println(C01_DataClass.sayiPrivateS);
        // 'sayiPrivateS' has private access in 'week07_accessModifier_encapsulation.C01_DataClass'
        // private access modifier'a disardaki hic bir class'dan ulasilamaz


        // System.out.println(C01_DataClass.strDefaultAccModS);
        // 'strDefaultAccModS' is not public in 'week07_accessModifier_encapsulation.C01_DataClass'.
        // Cannot be accessed from outside package
        // default access modifier'a sahip oldugu icin, package disindan ULASILAMAZ

    }

}
