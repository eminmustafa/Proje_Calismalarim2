package _genelSoruCozumCalismalari;

public class E09_Switch_20_06_2022 {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;
            case 'B':
                System.out.println("Cok Guzel : Gectiniz");
                break;
            case 'C':
                System.out.println("Iyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Fena Degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Malesef Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
}
