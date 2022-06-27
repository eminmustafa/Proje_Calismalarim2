package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E07_Soru7 {
    public static void main(String[] args) {

         /* Soru 7
        Kullanicidan ismini alip basharfini ve son harfini buyuk harflerle yazdirin
         */
        Scanner scan5= new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String isim=scan5.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(isim.length()-1).toUpperCase();
        System.out.print("Isminizin ilk ve son harfi : "+isim);
    }
}
