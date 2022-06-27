package haftaTekrari27_06_2022;

public class E04_Soru4 {
    public static void main(String[] args) {

        /* Soru 4
        Isminizi ve soyisminizi yazdirin sonra tersten yazdiriniz :)
         */
        String isimSoyisim="Emin Yuksel";
        System.out.println("Isim Soyisminiz      :"+isimSoyisim);
        System.out.println("Isim Soyisin Tersten :"+isimSoyisim.substring(10)+isimSoyisim.substring(9,10)+isimSoyisim.
                substring(8,9)+isimSoyisim.substring(7,8)+isimSoyisim.substring(6,7)+isimSoyisim.substring(5,6)+
                isimSoyisim.substring(4,5)+isimSoyisim.substring(3,4)+isimSoyisim.
                substring(2,3)+isimSoyisim.substring(1,2)+isimSoyisim.substring(0,1));
    }
}
