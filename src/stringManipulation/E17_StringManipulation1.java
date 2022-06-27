package stringManipulation;

import java.util.Scanner;

public class E17_StringManipulation1 {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini alip basharfini ve son harfini buyuk harflerle yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isiminizi giriniz : ");
        String isim=scan.nextLine().toLowerCase();
        System.out.println("Isminizin ilk ve son harfi : "+isim.substring(0,1).toUpperCase()+
                                                           isim.substring(isim.length()-1).toUpperCase());

    }
}
