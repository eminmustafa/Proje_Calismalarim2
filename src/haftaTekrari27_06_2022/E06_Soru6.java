package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E06_Soru6 {
    public static void main(String[] args) {

        /* Soru 6
        Nested if kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        eger ilk harfi buyuk harf ise "A" olup olmadigini kontrol edin.ILk harf A ise "Gecerli sifre"
        degilse "Gecersiz sifre" yazdirin
         */
        Scanner scan4=new Scanner(System.in);
        System.out.print("Lutfen sifrenizi giriniz : ");
        char sifre=scan4.next().charAt(0);

        if ( sifre>='A' || sifre<='Z'){
            if (sifre=='A') {
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }
        }else {
            System.out.println("Gecersiz sifre");
        }
    }
}
