package _genelSoruCozumCalismalari;

import java.util.Scanner;

public class E02_scanner_16_06_2022 {
    public static void main(String[] args) {

        // 1.SORU Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner matematikselIslemler = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        System.out.print("Tamsayi 1 : ");
        int sayi1= matematikselIslemler.nextInt();
        System.out.print("Tamsayi 2 : ");
        int sayi2= matematikselIslemler.nextInt();

        System.out.println("Girdiginiz iki tamsayinin toplami : " + (sayi1+sayi2));
        System.out.println("Girdiginiz iki tamsayinin farki   : " + (sayi1-sayi2));
        System.out.println("Girdiginiz iki tamsayinin carpimi : " + (sayi1*sayi2));
        System.out.println("******1.SORU cevabi******");

        // 2.SORU  Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin

        Scanner kare = new Scanner(System.in);
        System.out.print("Lutfen karenin kenar uzunlugunu giriniz : ");
        double kenarUzunlugu=kare.nextDouble();
        double kareniniCevresi=kenarUzunlugu*4;
        double kareninAlani=kenarUzunlugu*kenarUzunlugu;

        System.out.println("Karenin cevresi : " + kareniniCevresi);
        System.out.println("Karenin alani   : " + kareninAlani);
        System.out.println("******2.SORU cevabi******");

        // 3.SORU Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner cember = new Scanner(System.in);
        System.out.print("Lutfen cemberin yaricapini giriniz : ");

        double yaricap= cember.nextDouble();
        double cemberinCevresi=2*yaricap*3.14*yaricap;
        double daireninAlani=3.14*yaricap*yaricap;
        System.out.println("Cemberin cevresi : " + cemberinCevresi);
        System.out.println("Dairenin alani   : " + daireninAlani);
        System.out.println("******3.SORU cevabi******");


        // 4.SORU Kullanicidan dikdorgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip prizmanin hacmini hesaplayi[ yazdirin

        Scanner dikdortgen = new Scanner(System.in);
        System.out.print("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz : ");
        double kisaKenar=dikdortgen.nextDouble();
        System.out.print("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz : ");
        double uzunKenar=dikdortgen.nextDouble();
        System.out.print("Lutfen dikdortgenin yukseklik uzunlugunu giriniz  : ");
        double yukseklik=dikdortgen.nextDouble();
        System.out.println("Dikdortgenler pirizmasinin hacmi : " + kisaKenar*uzunKenar*yukseklik);
        System.out.println("******4.SORU cevabi******");

        /* 5.SORU Kullanicidan ismini ve soyisimini isteyip asagidaki sekilde yazdiri
                 Isminiz : ALI CAN
                 Soyisimiz : MERT
                 Kursumuza katiliminiz alinmistir, tesekkur ederiz
         */

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String isim=scan1.nextLine().toUpperCase();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyIsim=scan1.nextLine().toUpperCase();
        System.out.println("Isminiz    : " + isim +
                          "\nSoyisminiz : " + soyIsim +
                           "\nKursumuza katiliminiz alinmistir, tesekkur ederiz");
        System.out.println("******5.SORU cevabi******");


        /* 6.SORU Kullanicidan ismini ve soyismini alip aralrinda bir bosluk olusturarak asagidaku sekulde yazdiriniz
                Isim-Soyisim : ALI MERT CAN
         */

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz    : ");
        String isim1=scan2.nextLine().toUpperCase();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyIsim1=scan2.nextLine().toUpperCase();
        System.out.println("Isim-Soyisim : " + isim1 +" "+ soyIsim1);
        System.out.println("******6.SORU cevabi******");

        // 7.SORU Kullanicidan ismini alip isminin bas harflerini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");

        char ilkHarf=scan.next().toUpperCase().charAt(0);

        System.out.println("Isminizin ilk harfi : " +  ilkHarf);
        System.out.println("******7.SORU cevabi******");

    }

}
