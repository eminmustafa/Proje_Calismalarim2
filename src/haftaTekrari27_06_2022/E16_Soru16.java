package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E16_Soru16 {
    public static void main(String[] args) {

        /* Soru 16
        Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
        iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdiri
        ornek
        input = Ali
        output = lilili
        input = el
        output = el
       */
             Scanner scan15=new Scanner(System.in);
             System.out.print("Lutfen bir kelime giriniz : ");
             String kelime = scan15.next();
             if (kelime.length()>=3){
                 System.out.println(kelime.substring(kelime.length()-2)+
                         kelime.substring(kelime.length()-2)+kelime.substring(kelime.length()-2));
             }else System.out.println( kelime);

    }
}
