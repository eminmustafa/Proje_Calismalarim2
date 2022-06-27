package haftaTekrari27_06_2022;

import java.util.Scanner;

public class E14_Soru14 {
    public static void main(String[] args) {

        /* Soru 14
        Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
         */
            Scanner scan9=new Scanner(System.in);
             System.out.print("Lutfen bir cumle giriniz : ");
             String cumle=scan9.nextLine();
             System.out.print("Lutfen girdiginiz cumleden bir harf giriniz : ");
             String harf=scan9.next().toLowerCase();
              if (cumle.contains(harf)){
                 System.out.println("girdiginiz harf cumlede var");
             }else System.out.println("girdiginiz harf cumlede yok");
    }
}
