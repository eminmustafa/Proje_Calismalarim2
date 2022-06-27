package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E10_Soru10 {
    public static void main(String[] args) {

        /* Soru 10
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin.
        Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
        ***lutfen switch case method'unu kullanarak cozunuz :)***
         */
        Scanner scan14=new Scanner(System.in);
        System.out.print("Lutfen is unvaniniza giriniz :");
        String jobTitle = scan14.nextLine().toLowerCase();

        switch (jobTitle){
            case "qa" :
                System.out.println("Unvanini : Quality Analyst" );
                break;
            case "dev" :
                System.out.println("Unvanini : Developer" );
                break;
            case "ba ":
                System.out.println("Unvanini : Business Analyst" );
                break;
            case "pm":
                System.out.println("Unvanini : Project Manager" );
                break;
            default:
                System.out.println("Yanlis giris yaptiniz lutfen tekrar deniyiniz");
       }
   }

}
