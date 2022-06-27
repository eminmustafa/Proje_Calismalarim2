package stringManipulation;

import java.util.Scanner;

public class E26_StringManipulation10 {
    public static void main(String[] args) {

        /*
        Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 4 harfli bir kelime giriniz : ");
        String kelime =scan.next().toUpperCase();
        System.out.println("Girilen kelimenin tersten yazlisi : "+kelime.substring(3)+kelime.substring(2,3)+
                                                                  kelime.substring(1,2)+kelime.substring(0,1));

    }
}
