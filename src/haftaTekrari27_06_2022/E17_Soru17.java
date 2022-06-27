package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E17_Soru17 {
    public static void main(String[] args) {

        /*  Soru 17
         Kullanicidan bir karakter girmesini isteyip, o karakterin ascii degerini yazdirin
		 ORNEK:
		         INPUT : #
		 		 OUTPUT : girdiginiz # karakterinin ascii degeri = 125'dir.
		 */

             Scanner scan17=new Scanner(System.in);
             System.out.print("Lutfen bir karakter giriniz : ");
             char karakter8=scan17.next().toLowerCase().charAt(0);
             System.out.println("Girdiginiz karakter'in ASCII degeri : " + 1*karakter8 );
    }
}
