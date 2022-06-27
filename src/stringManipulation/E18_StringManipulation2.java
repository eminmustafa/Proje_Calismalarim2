package stringManipulation;

import java.util.Scanner;

public class E18_StringManipulation2 {
    public static void main(String[] args) {

         /*
        Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String cumle=scan.nextLine().toLowerCase();
        System.out.print("Lutfen bir harf giriniz : ");
        String harf=scan.next().toLowerCase();

        System.out.println(cumle.contains(harf));
    }
}
