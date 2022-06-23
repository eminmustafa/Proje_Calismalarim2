package soruCozumCalismalari;

public class E16_OcaSorulari {
    public static void main(String[] args) {

      int num1 = 9;

      int num2 = num1++;


      if (num2 < 10) {
          System.out.println(num2 + " Hello World");
      } else {
          System.out.println(num1 + " Hello Universel");
      }
       int x = 3;
      System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);


       final char a = 'A', d = 'D'; // final keyword variable'in son degerini belirler
       char grade = 'B';
       switch (grade) {
           case a:
           case 'B':
               System.out.print("great");
           case 'C':
               System.out.print("good");
               break;
           case d:
           case 'F':
               System.out.print("not good");
       }
    }
}

