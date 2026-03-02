package week03_stringManipulations;

import java.util.Locale;

public class C01_toUppercase_toLowercase {

    public static void main(String[] args) {

        String str = "Ali okula git";

        System.out.println(str.toUpperCase()); // ALI OKULA GIT

        // String'de hazir method'larla yapilan degisiklikler kalici olmaz

        System.out.println(str); // Ali okula git

        // degisikligin kalici olmasi isteniyorsa atama yapilmalidir

        str = str.toUpperCase();

        System.out.println(str); // ALI OKULA GIT

        System.out.println(str.toLowerCase()); // ali okula git


        System.out.println(str); // ALI OKULA GIT

        System.out.println(str = str.toLowerCase()); // ali okula git


        System.out.println(str.toUpperCase()); // ALI OKULA GIT

        // eger bir string'de kullanilan metinde kucuk-buyuk harf donusumu bilgisayarin dilinden farkli ise
        // ornegin bilgisayar dili ingilizce, ama biz turkce olarak i -> İ yapmak istiyorsak

        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR"))); // ALİ OKULA GİT

        System.out.println(str.toUpperCase(Locale.TRADITIONAL_CHINESE)); // ALI OKULA GIT


    }
}
