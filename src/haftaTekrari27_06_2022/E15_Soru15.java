package haftaTekrari27_06_2022;

public class E15_Soru15 {
    public static void main(String[] args) {

        /* Soru 15
        String methodlarini kullanrak "Java ogrenmek123 cok guzel@ " ifadesini
        "Java ogrEnmEk Cok guzEl" yazdirin sonra
        "Jaza ogrenmek cok guzel" sekline getirin
         */
             String str="Java ogrenmek123 Cok guzel@ ";
              System.out.println(str);
              str=str.replaceAll("\\s","XX");
              System.out.println(str);
              str=str.replaceAll("\\W","");
              System.out.println(str);
              str=str.replaceAll("\\d","");
              str=str.trim();
              System.out.println(str);
              str=str.replace("ogrenmek"," ogrEnmEk ").
                      replace("cok"," Cok").
                      replace("guzel"," guzEl");
              System.out.println(str);

              str=str.replace("Java","Jaza").replace("ogrEnmEk","ogrenmek").
              replace("Cok","cok").replace("guzEl","guzel");
              str=str.replaceAll("\\W","");
              System.out.println(str);
              str=str.replace("XX"," ");
              // str=str.trim();
              System.out.println(str);
    }
}
