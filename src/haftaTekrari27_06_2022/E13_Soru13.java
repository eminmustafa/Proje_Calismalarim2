package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E13_Soru13 {
    public static void main(String[] args) {

         /* Soru 13
        Kullancidan bir sayi alin ve sayinin mutlak degerini yazdirin
         */
        Scanner scan8=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi8= scan8.nextInt();
        System.out.println(sayi8>=0 ? sayi8 : (-1*sayi8) );
    }
}
