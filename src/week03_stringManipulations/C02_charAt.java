package week03_stringManipulations;

public class C02_charAt {
    public static void main(String[] args) {

        String isim = "Ali Desidero";

        System.out.println(isim.charAt(0)); // A  ismin 0. index'deki karakterini verir
                                            //    insan olarak dusundugumuzde bu ismin 1.harfidir

        System.out.println(isim.charAt(7)); // i

        // ismin 10.karakterini yazdirin
        // index 0'dan basladigi icin 10.karakter icin index= 9 olur

        System.out.println(isim.charAt(9)); // e

        // olmayan bir index istenirse

        System.out.println(isim.charAt(34)); // syntax hatasi yok, java altini kirmizi cizmez
        // run ettikten sonra verilen 34.index'i bulamadigi icin hata verir
        // StringIndexOutOfBoundsException verilen index String'in sinirlari disinda
        // bu hata kod run edildiginde ortaya ciktigi icin
        // Run Time Error (RTE) denir


        // System.out.println(isim.charAt("34"));  compile time error CTE ,
        // java kod yazildigi anda mantik hatasini (syntax error) anlar ve altini kirmizi cizer



    }
}
