package stringManipulation;

public class E23_StringManipulation7 {
    public static void main(String[] args) {

         /*
        String methodlarini kullanrak "Java ogrenmek123 Cok guzel@ " ifadesini
        String'ini "Jaza ogrenmek cok guzel" sekline getirin
         */

        String str="Java ogrenmek123 Cok guzel@ ";
        str=str.trim();
        str=str.replaceAll("\\s","XX");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        str=str.replaceAll("\\d","");
        System.out.println(str);
        str=str.replace("Java","Jaza").replace("Cok","cok");
        str=str.replaceAll("XX"," ");
        System.out.println(str);
    }
}
