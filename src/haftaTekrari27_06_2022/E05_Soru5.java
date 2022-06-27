package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E05_Soru5 {
    public static void main(String[] args) {


        /* Soru 5
        Kullanicidan 100 uzerinden notunu isteyin.Not'u harf sistemine cevirip yazdirin.
        50'den kucukse "D",50-60 arasi "C",60-80 arasi "B", 80'nin uzerinde ise "A"
         */
        Scanner scan3=new Scanner(System.in);
        System.out.print("Lutfen 100 uzerinden notunuzu giriniz : ");
        int not =scan3.nextInt();
        if (not>=80 && not <=100){
            System.out.println("Notunuz : \'A\'");
        }else if (not>=60){
            System.out.println("Notunuz : \'B\'");
        }else if (not>=50){
            System.out.println("Notunuz : \'C\'");
        }else System.out.println("Notunuz : \'D\'");
    }
}
