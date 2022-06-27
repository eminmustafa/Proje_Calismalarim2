package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E08_Soru8 {
    public static void main(String[] args) {

        /* Soru 8
        Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
         */
        Scanner scan10=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz :");
        String isim=scan10.nextLine().toUpperCase();
        System.out.print("Lutfen soyisminizi giriniz :");
        String soyisim=scan10.nextLine().toUpperCase();

        if (isim.length() < soyisim.length()){
            System.out.println("Soyisminiz isminizden uzundur : "+ soyisim);
        }else if( isim.length() > soyisim.length() ){
            System.out.println("Isminiz soyisminizden uzundur : "+ isim);
        }else System.out.println("Isminiz ve Soyismini'in uzunlugu esittir");
    }
}
