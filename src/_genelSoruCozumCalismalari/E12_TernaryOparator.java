package _genelSoruCozumCalismalari;

import java.util.Scanner;

public class E12_TernaryOparator {
    public static void main(String[] args) {

        /*Soru1
        iki sayi alin ve buyuk olmayan sayiyi yazdirin
         */
       int sayi1=9;
       int sayi2=11;
       System.out.println( sayi1<sayi2 ?  sayi1  : sayi2);

        /*Soru2
         bir tamsayi alin ve sayinin tek veya cift ldugunu yazdirin
         */
        int tekCift=10;
        System.out.println(tekCift%2==0 ? "cift sayi": "tek sayi");

        /*Soru3
        Kullancidan bir sayi alin ve sayinin mutlak degerini yazdirin
         */
       Scanner scan= new Scanner(System.in);
       System.out.print("lütfen bir sayi giriniz : ");
       double sayi=scan.nextDouble();
       System.out.println(sayi>=0 ? sayi : (-1*sayi));

       /*Soru4
        Kullancidan bir sayi alin, Sayi pozitifse "Sayi pozitif" yazdirin, negatifse sayinin karesini alin
        */
       Scanner scan1=new Scanner(System.in);
       System.out.print("Lutfen bir sayi giriniz : ");
       double sayi5= scan1.nextDouble();
       System.out.println(sayi5>0 ? "Sayi pozitif" : (sayi5*sayi5));


    }
}
