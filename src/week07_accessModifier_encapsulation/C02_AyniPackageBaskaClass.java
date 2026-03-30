package week07_accessModifier_encapsulation;

public class C02_AyniPackageBaskaClass {

    public static void main(String[] args) {


        C01_DataClass obj = new C01_DataClass();
        // baska class'daki variable'lara ulasmak icin
        // o variable'lara NASIL ulasacagimiza static/instance olmasina gore karar veririz
        // eger static ise ClassAdi.variableAdi
        // eger instance ise objeAdi.variableAdi

        // static olanlar
        C01_DataClass.dblPublicS=34;
        System.out.println(C01_DataClass.dblPublicS);
        C01_DataClass.chrProtectedS = 'a';
        System.out.println(C01_DataClass.chrProtectedS);
        System.out.println(C01_DataClass.strDefaultAccModS);
        // System.out.println(C01_DataClass.sayiPrivateS);
        // 'sayiPrivateS' has private access in 'week07_accessModifier_encapsulation.C01_DataClass'
        // private olarak belirlenen variable'lara KENDI CLASS"I disindan ERISILEMEZ


        // insrtance olanlar
        System.out.println(obj.dblPublicI);
        System.out.println(obj.chrProtectedI);
        System.out.println(obj.strDefaultAccModI);
        // System.out.println(obj.sayiPrivateI);
        // 'sayiPrivateI' has private access in 'week07_accessModifier_encapsulation.C01_DataClass'
        // private olarak belirlenen variable'lara KENDI CLASS"I disindan ERISILEMEZ
    }
}
