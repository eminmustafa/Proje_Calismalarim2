package _genelSoruCozumCalismalari;

import java.util.Scanner;

public class E13_SwitchStatement {
    public static void main(String[] args) {

        /*Soru1
        Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
         */
        Scanner kacinciGunu = new Scanner(System.in);
        System.out.print("Lutfen haftanin kacinci gunde oldugunuzu yaziniz :");
        int gun = kacinciGunu.nextInt();
        switch (gun) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("Yanlis giris yaptiniz Tekrar deneyiniz");

        }

        /*Soru2
        Kullanicidan kacinci ay oldugunu sorun ve ay isini yazdirin
         */
        Scanner kacinciAy = new Scanner(System.in);
        System.out.print("Lutfen kacinci ay'da oldugunuz yaziniz :");
        int ay = kacinciAy.nextInt();
        switch (ay) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("Yanlis giris yaptiniz");

        }

        /*Soru3
        Kullanicidan bir sayi girmesini isteyin
        Girilen sayi
        10 ise "Iki basamakli en kucuk sayi"
        100 ise "Uc basamakli en kucuk sayi"
        1000 ise "Dort basamakli en kucuk sayi"
        diger durumlarda "Girdiginiz sayiyi degistirin" yazdirin
         */
        Scanner kacBasamak = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = kacBasamak.nextInt();

        switch (sayi) {
            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdiginiz sayiyi degistirin");

        }


        /*Soru4
        Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
        Kullanici S girerse "Software"
        D girerse "Developer"
        E girerse "Engineer"
        T girerse "In Testing" yazdirin
         */

        Scanner kisaltma = new Scanner(System.in);
        System.out.print("Lutfen \"SDET\" kisaltmasinda harflerden birini giriniz :");
        char harf = kisaltma.next().toUpperCase().charAt(0);
        switch (harf) {
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:

        }

        /*Soru5
        Kullanicidan gun ismini alip haftaici veya haftasonu yazdirin.
         */
        Scanner hafta = new Scanner(System.in);
        System.out.print("Lutfen gun ismi giriniz : ");
        String gunIsmi = hafta.next().toLowerCase();
        switch (gunIsmi) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
        }

    }
}
