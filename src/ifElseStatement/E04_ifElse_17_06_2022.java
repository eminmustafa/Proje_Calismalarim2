package ifElseStatement;

import java.util.Scanner;

public class E04_ifElse_17_06_2022 {
    public static void main(String[] args) {

        /* 1.Soru
        Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
         */

        Scanner tamSayi=new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi giriniz : ");
        int sayi=tamSayi.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cift sayidir");
        }else System.out.println("Girdiginiz sayi tek sayidir");

        System.out.println("*****1.Soru Cevabi*****");

        /* 2.Soru
        Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin
        ORN: ilkHarf=P outout="Pazar,Pazartesi veya Persembe"
             ilkHarf=S output="Sali"
         **Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
        Scanner gun=new Scanner(System.in);
        System.out.print("Lutfen istediginiz gunun ilk harfini giriniz : ");
        String gunIsmiIlkHarf=gun.next().toUpperCase();

        if (gunIsmiIlkHarf.equals("P")){
            System.out.println("Pazartesi,Persembe veya Pazar");
        }if (gunIsmiIlkHarf.equals("S")){
            System.out.println("Sali");
        }if (gunIsmiIlkHarf.equals("C")){
            System.out.println("Carsamba,Cuma veya Cumartesi");
        }
        System.out.println("*****2.Soru Cevabi*****");

        /* 3.Soru
        Kullanicidan  gun ismini alin ve harftaici veya hafta sonu oldugunu yazdirin
        ORN:gun=Pazar outpput="Hafta sonu"
        ORN:gun=Sali outpput="Hafta ici"
        **String icin equals method'unu kullanin
         */
        Scanner gun2=new Scanner(System.in);
        System.out.print("Lutfen bir gun ismi giriniz : ");
        String gunIsmi= gun2.next().toLowerCase();

        if(gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun hafta sonu");

        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") ||gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");

        } else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
       System.out.println("*****3.Soru Cevabi*****");

        /* 4.Soru
        Kullanicidan dikdortgen kenar uzunluklarini isteyin ve dokdortgenin kare olup olmadigini yazdirin
         */
        Scanner dikdortgen = new Scanner(System.in);
        System.out.print("Lutfen 1.kenar uzunlugunu giriniz :");
        double kenar1 =dikdortgen.nextDouble();
        System.out.print("Lutfen 2.kenar uzunlgunu giriniz :");
        double kenar2 =dikdortgen.nextDouble();
        System.out.print("Lutfen 3.kenar uzunlgunu giriniz :");
        double kenar3 =dikdortgen.nextDouble();
        System.out.print("Lutfen 4.kenar uzunlgunu giriniz :");
        double kenar4 =dikdortgen.nextDouble();
        if (kenar1==kenar4 && kenar2==kenar3 && kenar3==kenar2 && kenar4==kenar1){
            System.out.println("Girdiginiz uzunluklar sonucu bu bir karedir ");
        }else System.out.println("Girdiginiz uzunluklar sonucu bu bir kare degildir");
        System.out.println("*****4.Soru Cevabi*****");

        /* 5.Soru
        Kullanicidan bir gun alin eger gun "Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin."Cumartesi"ise ekrana "Yahudiler icin kutsal gun"
        "Pazar"ise ekrana "Hiristiyanlar icin kutsal gun"yazdirin
         */
        Scanner kutsalGun = new Scanner(System.in);
        System.out.print("Lutfen bir gun ismi giriniz : ");
        String gun8=kutsalGun.next().toLowerCase();

        if (gun8.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun Cuma namazini kacirma haydi Cami'ye :)");
        }else if (gun8.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun Sabat'in keyfini cikar haydi Havra'ya :)");
        }else if (gun8.equals("pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun Pentekost gunu kutlu olsun haydi Kiliseye :)");
        }else System.out.println("Malesef is gunu calismaya devam :(");
        System.out.println("*****5.Soru Cevabi*****");

        /* 6.Soru
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadiginiz yazdirin
         */
        Scanner karakter = new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz : ");
        char harf=karakter.next().toUpperCase().charAt(0);

        if (harf>='A' && harf<='Z'){
            System.out.println("Girdiginiz karakter bir harf'tir");
        }else System.out.println("Girdigniz karakter bir harf degildir");
        System.out.println("*****6.Soru Cevabi*****");

        /* 7.Soru
        Kullanicidan yasini sorun, eger yas 65'den kucuk ise "emekli olamazsin, calismalisin", 65'e esit veya buyukse
        "Emekli olabilirsin" yazdirin
         */
       Scanner emeklilik = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        double yas=emeklilik.nextDouble();

        if (yas<65){
            System.out.println("Emekli olamazsiniz, hala calismalisiniz ");
        }else if (yas>=65){
            System.out.println("Tekbrikler emekli olabilirsiniz");
        }else
          System.out.println("*****7.Soru Cevabi*****");

        /* 8.soru
        Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu birbrine esit ise ekrana"Eskenar ucgen"yazdirim
        Diger durunlarda ekrana"Eskenar degil"yazdirin
         */
        Scanner esKenar = new Scanner(System.in);
        System.out.print("Lutfen ucgenin 1.kenar uzunlugunu giriniz : ");
        double kenarBir=esKenar.nextDouble();
        System.out.print("Lutfen ucgenin 2.kenar uzunlugunu giriniz : ");
        double kenarIki=esKenar.nextDouble();
        System.out.print("Lutfen ucgenin 3.kenar uzunlugunu giriniz : ");
        double kenarUc=esKenar.nextDouble();

        if(kenarBir==kenarIki && kenarIki==kenarUc && kenarBir==kenarUc){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }
        System.out.println("*****8.Soru Cevabi*****");


    }
}
