package soruCozumCalismalari;

import java.util.Scanner;

public class E10_IfElseStatement {
    public static void main(String[] args) {

         /*
        bir kisi magazadan 100 TL ve uzeri alis veris yaparsa %10 indirim
        200TL ve uzeri alis veris yaparsa %15 indirim
        300TL VE UZERI alis veris yaparsa %20indirim kazandigini
        ve odeyecegi miktari ekrana yazan C # kodlarini yaziniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen FIYAT giriniz :");
        double fiyat=scan.nextDouble();
        if (fiyat>=100 && fiyat<200){
            System.out.println("indirim kazandiniz \nodeyeceginiz tutar : "+( fiyat-(fiyat*10/100)));
        } else if (fiyat>=200 && fiyat<300) {
            System.out.println("indirim kazandiniz \nodeyeceginiz tutar :"+(fiyat-(fiyat*15/100)));
        }else if (fiyat>=300){
            System.out.println("indirim kazandiniz \nodeceginiz fiyat :" +(fiyat-(fiyat*20/100)));
        }


    }
}
