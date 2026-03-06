package one_d_array;

import java.util.*;

public class array23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = sc.nextInt();
        }

        int total = 0;
        int max = output[0];
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            total += output[i];

            if (output[i] > max) {
                max = output[i];
                maxIndex = i;
            }
        }

        double average = (double) total / n;
        double threshold = average * 0.9;

        int underperformCount = 0;
        ArrayList<Integer> priorityLines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (output[i] < threshold) {
                underperformCount++;
                priorityLines.add(i + 1); 
            }
        }
        System.out.println("Production Lines: " + n);
        System.out.println("Total Output: " + total + " units");
        System.out.printf("Average Output: %.2f units/hour\n", average);
        System.out.println("Top Producer: Line " + (maxIndex + 1) + " (" + max + " units)");
        System.out.println("Underperforming Lines: " + underperformCount);
        System.out.printf("Performance Threshold: %.2f units\n", threshold);
        System.out.println("Priority Lines: " + priorityLines);

        
    }
}