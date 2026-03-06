package one_d_array;

import java.util.*;

public class array25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] risk = new int[n];
        for (int i = 0; i < n; i++) {
            risk[i] = sc.nextInt();
        }

        int total = 0;
        int max = risk[0];
        int min = risk[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            total += risk[i];

            if (risk[i] > max) {
                max = risk[i];
                maxIndex = i;
            }

            if (risk[i] < min) {
                min = risk[i];
                minIndex = i;
            }
        }

        double average = (double) total / n;
        double threshold = average * 2;

        int criticalCount = 0;
        ArrayList<Integer> alertEvents = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (risk[i] > threshold) {
                criticalCount++;
                alertEvents.add(i + 1); 
            }
        }

        
        System.out.println("Security Events Analyzed: " + n);
        System.out.printf("Average Risk Score: %.2f\n", average);
        System.out.println("Highest Risk Event: " + max + " (Event " + (maxIndex + 1) + ")");
        System.out.println("Lowest Risk Event: " + min + " (Event " + (minIndex + 1) + ")");
        System.out.println("Critical Threats (>200% avg): " + criticalCount);
        System.out.printf("Threat Threshold: %.2f\n", threshold);
        System.out.println("Alert Events: " + alertEvents);

       
    }
}