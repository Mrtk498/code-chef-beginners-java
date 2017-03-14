package COOMILK;

import java.util.Scanner;

public class compare_strings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cooOrMilk = new String[50];
        String[] result = new String[50];
        System.out.println(">");
        int testCases = Integer.parseInt(input.next());

        for (int i = 0; i < testCases; i++) {
            String flag = "YES";
            System.out.println(">");
            int numOfMin = Integer.parseInt(input.next());
            for (int j = 0; j < numOfMin; j++) {
                System.out.println(">>");
                cooOrMilk[j] = input.next();
                if (j != 0 && "cookie".equalsIgnoreCase(cooOrMilk[j]) && "cookie".equalsIgnoreCase(cooOrMilk[j - 1])) {
                    flag = "NO";
                }
            }
            if ("cookie".equalsIgnoreCase(cooOrMilk[numOfMin - 1])) {
                flag = "NO";
            }
            result[i] = flag;
        }

        for (int i = 0; i < testCases; i++) {
            System.out.println(result[i]);
        }
    }

}
 