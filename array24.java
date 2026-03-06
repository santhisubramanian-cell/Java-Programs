package one_d_array;

import java.util.*;

public class array24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] value = new double[n];
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextDouble();
        }

        double total = 0;
        double max = value[0];
        double min = value[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            total += value[i];

            if (value[i] > max) {
                max = value[i];
                maxIndex = i;
            }

            if (value[i] < min) {
                min = value[i];
                minIndex = i;
            }
        }

        double average = total / n;
        double bargainThreshold = average * 0.7;
        double premiumThreshold = average * 1.5;

        int bargainCount = 0;
        int premiumCount = 0;
        for (int i = 0; i < n; i++) {
            if (value[i] < bargainThreshold) {
                bargainCount++;
            }
            if (value[i] > premiumThreshold) {
                premiumCount++;
            }
        }
        System.out.println("Total Properties: " + n);
        System.out.printf("Portfolio Value: $%.2f\n", total);
        System.out.printf("Average Property Value: $%.2f\n", average);
        System.out.printf("Most Valuable: $%.2f (Property %d)\n", max, maxIndex + 1);
        System.out.printf("Least Valuable: $%.2f (Property %d)\n", min, minIndex + 1);
        System.out.println("Bargain Properties (<70% avg): " + bargainCount);
        System.out.println("Premium Properties (>150% avg): " + premiumCount);

        
    }
}