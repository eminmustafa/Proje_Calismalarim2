package stringManipulation;

import java.util.Scanner;

public class E25_StringManipulation9 {
    public static void main(String[] args) {

         /*
        Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String isim=scan.nextLine().toUpperCase();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyisim=scan.nextLine().toUpperCase();

        if (isim.length()>soyisim.length()){
            System.out.println("Isminiz soyisminizden daha uzun : " +isim);
        }else if (isim.length()<soyisim.length()){
            System.out.println("Soyisminiz isminizden daha uzun : " +soyisim);
        }else System.out.println("Isminiz ve soyisminiz'in uzunlugu esit :"+isim.concat(" "+soyisim));

    }
}
