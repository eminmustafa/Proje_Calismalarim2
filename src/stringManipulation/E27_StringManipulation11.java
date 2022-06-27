package stringManipulation;

import java.util.Scanner;

public class E27_StringManipulation11 {
    public static void main(String[] args) {

         /*
        Kullaniciya derse katilip katilmak istemedigini sorun
        evet derse, cevabini ve "Derse katiliminiz onaylanmistir" yazdirin
        hayir derse, cevabini ve "Sonraki derslerimize bekleriz" yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Derse katilmak istermisiniz ? \nEvet veya Hayir yaziniz : ");
        String cevap=scan.next().toLowerCase();
        System.out.println((cevap.equals("evet")) ? "Derse katiliminiz onaylanmistir" : "Sonraki derslerimize bekleriz");
    }
}
