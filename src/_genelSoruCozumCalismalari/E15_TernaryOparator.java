package _genelSoruCozumCalismalari;

public class E15_TernaryOparator {
    public static void main(String[] args) {


        int a =2;
        int b =2;
        int e =b<1 ? b++ : ++a;
        System.out.println(b+","+a+","+e);


        int y = 1;
        int z = 1;

        int j = y<10 ? ++y : z++;


        System.out.println(y + "," + z + "," + j);







    }
}
