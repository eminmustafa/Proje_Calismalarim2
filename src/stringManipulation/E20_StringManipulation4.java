package stringManipulation;

import java.util.Scanner;

public class E20_StringManipulation4 {
    public static void main(String[] args) {

        /*
        Kullanicidan email adresini girmesini isteyin
        mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz"
        @gmail/com ile bitiyorsa "Email adresiniz kaydedildi"
        @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin" yazdirim
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen email adresinizi giriniz : ");
        String email = scan.next().toLowerCase();


    }
}
