package _genelSoruCozumCalismalari;

import java.util.Scanner;

public class garipSoru {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz :");
        String cumle = scan.nextLine();
        System.out.print("Lutfen bir kelime giriniz :");
        String kelime = scan.next().toLowerCase();
        int birinciKelime = cumle.indexOf(kelime); // indexOf bize index veya -1 donderir
        int ikinciKullanim = cumle.indexOf(kelime, birinciKelime + 1); // burdada bulunan kelimeden sonrasina bakiyoruz
        if (birinciKelime == (-1)) { // kullanicidan istedigimiz icin olumsuz'undan yola cikmaliyiz
            System.out.println("Girilen kelime cumlede kullanilmamis");
        } else if (ikinciKullanim == (-1)) { // bir ust'deki if'den kurtulursa burasi calisacak ve buda girilen kelime cumlede var demektir
            // ayni -1 taktigiyle burasi calisirsa 1 tane var demek yoksa eger else'ye duser ve kelimenin 1'den fazla kullanildigi ortaya cikar
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        } else {
            System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis");


        }
    }
}

