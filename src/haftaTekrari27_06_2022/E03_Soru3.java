package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E03_Soru3 {
    public static void main(String[] args) {

        /* Soru 3
        Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere sahipse
        "farkli isaretlerde sayilarda islem yapamazsin" yazdirin,
        satilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.
         */
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        System.out.print("Birinci tamsayi :");
        int tamsayi1=scan2.nextInt();
        System.out.print("Ikinci tamsayi :");
        int tamsayi2=scan2.nextInt();

        if (tamsayi1>0 && tamsayi2>0){
            System.out.println("Sayilarin toplami : " + (tamsayi1+tamsayi2));
        }else if (tamsayi1<0 && tamsayi2<0){
            System.out.println("Sayilarin carpimi : " + (tamsayi1*tamsayi2));
        }else if(tamsayi1<0 && tamsayi2>0 || tamsayi2<0 && tamsayi1>0){
            System.out.println("farkli isaretlerde sayilarda islem yapamazsin");
        }else System.out.println("sifir carpmaya gore yutan elemandir");
    }
}
