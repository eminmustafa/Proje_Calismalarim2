package soruCozumCalismalari;

import java.util.Scanner;

public class E07_IfElse_ArtikYil {

    public static void main(String[] args) {

        // Kullanidan yasini isteyinn 65'den kucukse "Emekli olamazsiniz"
        // 65 ve uzeriyse " Emekli olabilirsiniz" yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();

        if (yas<65 && yas>0){
            System.out.println("Uzgunuz emekli olamazsiniz");
        }else System.out.println("Tebrikler emekli olabilirsiniz");

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }








    }
}
