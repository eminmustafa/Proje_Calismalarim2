package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E09_Soru9 {
    public static void main(String[] args) {

        /* Soru 9
        Kullanicidan bir tamsayi isteyin ve
        Sayi tekse  "Neyse nedir adim
                     Buyrun kimlige bakin
                     Bana yeryuvarin donmek icin ihtiyaci yok "
        Sayi ciftse "Sur ufle duymadim
                     Birsey mi dedin hacim
                     Ufak bir kiyamete itirazim yok " yazidirin. :)
         */

        Scanner scan12=new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi giriniz : ");
        int tamSayi=scan12.nextInt();
        if (tamSayi%2!=0){
            System.out.println("Neyse nedir adim\n" +
                    "Buyrun kimlige bakin\n" +
                    "Bana yeryuvarin donmek icin ihtiyaci yok");
        }else System.out.println("Sur ufle duymadim\n" +
                "Birsey mi dedin hacim\n" +
                "Ufak bir kiyamete itirazim yok");
    }
}
