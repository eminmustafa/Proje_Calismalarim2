package soruCozumCalismalari;

import java.util.Scanner;

public class E11_IfElseStatements {
    public static void main(String[] args) {
        /* Soru1
        Kullanicidan gun  ismini yazmasini isteyin.Girilen  isim gecerli bir gun ise gun isminin 1.2. ve 3. harflerini ilk harf buyuk
        diger ikisi kucuk olarak yazdirin, gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin
         */
        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen bir gun ismi giriniz : ");
        String gun=scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")){
            System.out.println("Paz");
        }else if (gun.equals("sali")){
            System.out.println("Sal");
        }else if (gun.equals("carsamba")){
            System.out.println("Car");
        }else if (gun.equals("persembe")){
            System.out.println("Per");
        }else if (gun.equals("cuma")){
            System.out.println("Cum");
        }else if (gun.equals("cumartesi")){
            System.out.println("Cum");
        }else if (gun.equals("pazar")){
            System.out.println("Paz");
        }else System.out.println("Gecerli gun ismi giriniz");


        System.out.println("************:)***********:}************:]**************:>***********");
        /* Soru7
        Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
        Kural 1 : 4 ile bolunemeyen yillar artik yil degildir
        Kural 2 : 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        Kural 3 : 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olan yillar artik yildir
         */
        Scanner artikYil = new Scanner(System.in);
        System.out.print("Lutfen yil giriniz :");
        int yil = artikYil.nextInt();

        if (yil%100==0){
            if (yil%400==0){
                System.out.println("Artik yil");
            }else System.out.println("Artik yil degil");
        }else if (yil%4==0){
            System.out.println("Artik yil");
        }else System.out.println("Artik yil degil");

    }
}
