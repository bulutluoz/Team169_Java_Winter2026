package week06_staticKeyword;

public class C03_InstanceVariables {

    public static void main(String[] args) {

        C02_Hemsire hem1 = new C02_Hemsire();

        System.out.println(hem1.hemIsmi); // null
        hem1.hemIsmi = "Damla";
        System.out.println(hem1.hemIsmi); // Damla


        C02_Hemsire hem2 = new C02_Hemsire();

        System.out.println(hem2.hemIsmi); // null
        hem2.hemIsmi = "Zuhal";
        System.out.println(hem1.hemIsmi); // Damla
        System.out.println(hem2.hemIsmi); // Zuhal
        // System.out.println(hemIsmi); // Damla
        // scope'da hemIsmi diye bir variable yok
        // baska class'daki variable'i direkt kullanmak mumkun degil

        C02_Hemsire hem3 = new C02_Hemsire();
        System.out.println(hem3.hemIsmi); // null
        hem3.hemIsmi = "Betul";


        System.out.println(hem1.hemIsmi); // Damla
        System.out.println(hem2.hemIsmi); // Zuhal
        System.out.println(hem3.hemIsmi); // Betul



    }
}
