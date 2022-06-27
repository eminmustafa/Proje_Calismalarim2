package haftaTekrari27_06_2022;

public class E12_Soru12 {
    public static void main(String[] args) {

        /* Soru 12
        Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
        10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
          olsun
         */
        int fiyat=9;
        String sonuc=fiyat< 10 ? "ucuz" : fiyat<=20 ? "normal" : "pahali" ;
        System.out.println(sonuc);
    }
}
