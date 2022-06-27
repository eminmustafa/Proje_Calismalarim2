package _genelSoruCozumCalismalari;

public class E01_calisma_15_06_2022 {
    public static void main(String[] args) {

        // Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        int sayi=10;
        boolean guzelMi=true;
        char sayim='3';

        System.out.println(sayi); // 10
        System.out.println("sayi"); // sayi
        System.out.println(guzelMi); // true
        System.out.println(sayim); // 3
        System.out.println("sayi : " + sayi); // sayi : 10

        // isim ve soyisim icin iki variable olusturun ve bunlari
        //     isminiz : Mehmet
        //     soyisminiz : Bulutluoz
        //     seklinde yazdirin

        String isim="Mehmet";
        String soyisim="Bulutluoz";

        System.out.println("isminiz    : " + isim);
        System.out.println("soyisminiz : "+ soyisim);



        // Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin


        double sayi2=12.2; // hafizafa 64 bit kullanmaktadir
        float sayi3=12.3f; // hafizafa 64 bit kullanmaktadir

        int sayi1 =-2147483648; // hafizafa 32 bit yer kaplamaktadir
        int sayicik=2147483647;
        byte sayi4=-128; // hafizada 8 bit yer kaplamaktadir
        byte sayi6=127;
        short sayi7=-32768; // hafizafa 16 bit yer kaplamaktadir
        short sayi8=32767;

        // byte<short<int<long<float(ondalikli)<double(ondalikli) ** primitive data turleri
        // String ** non- primitive data turu

        //Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin

        byte sayi9=7;
        double sayi10=12.3;

        double toplam=sayi9+sayi10;

        System.out.println("********");
        System.out.println(toplam);

        //char data turunde bir variable olusturun ve yazdirin

        char chr='@'; // tek tirnak icerisinde yazilir
        // tek karakter icermelidir
        // eger char'i matematiksel isleme sokarsak devreye ASCII tablosu girer
        System.out.println("*******");
        System.out.println(chr);

        //Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        float sayi11=1000f;
        char sayi12='?';

        double toplam2=sayi11/sayi12;
        System.out.println("********");
        System.out.println("toplam2 : " + toplam2);
        // double toplam2 : 15.873015873015873
        // float  toplam2 : 15.873015403747559

    }

}
