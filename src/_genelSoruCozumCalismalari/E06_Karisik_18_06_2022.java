package _genelSoruCozumCalismalari;

public class E06_Karisik_18_06_2022 {


    // Naive method to find a pair in an array with a given sum
    public static void findPair(int[] nums, int target) {

        // consider each element except the last
        for (int i = 0; i < nums.length - 1; i++) {
            // start from the i'th element until the last element
            for (int j = i + 1; j < nums.length; j++) {
                // if the desired sum is found, print it
                if (nums[i] + nums[j] == target) {
                    System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
                    return;
                }
            }
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }

    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 3, 1};
        int target = 10;

        findPair(nums, target);


        String x = "10";
        int y = 20;
        String z = x + y;  // z will be 1020 (a String)

        String a = "10";
        String b = "20";
        String c = a + b;  // z will be 1020 (a String)

        int t = 10;
        int u = 20;
        int o = t + u;  // z will be 30 (an integer/number)

            /*
            \n  ----> alt satira gecer
            \t  ----> metin yatayda bir tab miktari kaydirir.
            \'	----> '	tek tirnak
            \"	----> "	cift tirnak
            \\	----> \	ters slash
             */

            /*
            if--->Belirtilen koşul doğruysa yürütülecek kod bloğunu belirtmek için kullanın
            else--->Aynı koşul yanlışsa yürütülecek kod bloğunu belirtmek için kullanın
            else if--->İlk koşul yanlışsa, test edilecek yeni bir koşul belirtmek için kullanın .
             switch--->Yürütülecek birçok alternatif kod bloğu belirtmek için kullanın

             */

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // *******Ternary 3'lu oparator****

            /*
            if else  altarnatif olarak yapilan oparatorler
            if---> yerine  ?
            else----> yerine :
            kullanilabilir
             */


        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                    /*  int i = 0;
                        while (i < 5) {
                        System.out.println(i);
                        i++;
                    }
                    */

                    /*
                    int i = 0;
                    do {
                       System.out.println(i);
                      i++;
                    }
                     while (i < 5);
                     */


        }
    }
}


