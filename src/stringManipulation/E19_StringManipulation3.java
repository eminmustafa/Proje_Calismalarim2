package stringManipulation;

import java.util.Scanner;

public class E19_StringManipulation3 {
    public static void main(String[] args) {

         /*
        Kullanicidan bir cumle ve bir kelime isteyin kelimenin cumledeki
        kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
            -Girilen kelime cumlede kullanimamis
            -Girilen kelime cumlede 1 kere kullanilmis
            -Girilen kleime cumlede 1'den fazla kullanilmis
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String cumle=scan.nextLine().toLowerCase();
        System.out.print("Lutfen girdiginiz cumleden bir kelime yaziniz : ");
        String kelime=scan.nextLine().toLowerCase();

        if ( !cumle.contains(kelime)){
            System.out.println("Girilen kelime cumlede kullanimamis");
        }else if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        }else System.out.println("Girilen kleime cumlede 1'den fazla kullanilmis");
    }
}
