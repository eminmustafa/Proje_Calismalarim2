package stringManipulation;

import java.util.Scanner;

public class E22_StringManipulation6 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle isteyin
        cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak yazdirin
        "kucuk" kelimesi icermiyorsa tum cumleyi kucuk harf olarak yazdirin
        iki kelimeyide icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String cumle=scan.nextLine();
        if (cumle.contains("buyuk") || cumle.contains("BUYUK") ){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains("kucuk") || cumle.contains("KUCUK")){
            System.out.println(cumle.toLowerCase());
        }else System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");

    }
}
