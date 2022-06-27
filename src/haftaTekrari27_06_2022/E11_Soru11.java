package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E11_Soru11 {
    public static void main(String[] args) {

        /* Soru 11
        Kullanicidan 4 basamakli bir sayi girmesini isteyin.Girdigi sayi 5'e bolunuyorsa son rakamini kontrol edin.
        Son rakami 0 ise "5'e bolunen tek sayi" yazdirin
        Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin"yazdirin
         */
        Scanner scan6 = new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir sayi giriniz : ");
        int sayi4 = scan6.nextInt();

        if (sayi4 % 5 == 0) {
            if (sayi4 % 10 == 0) {
                System.out.println("5'e bolunen cift sayi");
            } else {
                System.out.println("5'bolunen tek sayi");
            }
        } else {
            System.out.println("Tekrar deneyin");

        }
    }
}