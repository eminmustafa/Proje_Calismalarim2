package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E02_Soru2 {
    public static void main(String[] args) {

        /* Soru 2
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadiginiz yazdirin
         */
        Scanner harf= new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz : ");
        char karakter=harf.next().toUpperCase().charAt(0);

        if (karakter>='a' && karakter<='z' || karakter>='A' && karakter<='Z'){
            System.out.println("Girdiginiz karakter bir harftir");
        }else System.out.println("Girdiginiz karakter harf degildir");
    }
}
