package string;

import java.util.*;

public class Str9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println("Version Comparison:");

        for (int i = 1; i <= t; i++) {
            String v1 = sc.next();
            String v2 = sc.next();

            String[] a = v1.split("\\.");
            String[] b = v2.split("\\.");
            int n = Math.max(a.length, b.length);

            String result = "Equal";
            for (int j = 0; j < n; j++) {
                int num1 = (j < a.length) ? Integer.parseInt(a[j]) : 0;
                int num2 = (j < b.length) ? Integer.parseInt(b[j]) : 0;

                if (num1 > num2) {
                    result = "Greater";
                    break;
                } else if (num1 < num2) {
                    result = "Smaller";
                    break;
                }
            }

            System.out.println(i + ". " + v1 + " vs " + v2 + " -> " + result);
        }

        sc.close();
    }
}