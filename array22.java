package one_d_array;

import java.util.*;

public class array22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] engagement = new double[n];

        for (int i = 0; i < n; i++) {
            engagement[i] = sc.nextDouble();
        }

        double total = 0;
        double max = engagement[0];
        double min = engagement[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            total += engagement[i];

            if (engagement[i] > max) {
                max = engagement[i];
                maxIndex = i;
            }

            if (engagement[i] < min) {
                min = engagement[i];
                minIndex = i;
            }
        }

        double average = total / n;
        double viralThreshold = average * 2;

        int viralCount = 0;
        ArrayList<Integer> topPosts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (engagement[i] > viralThreshold) {
                viralCount++;
                topPosts.add(i + 1); 
            }
        }

       
        System.out.println("Total Posts: " + n);
        System.out.printf("Average Engagement: %.2f%%\n", average);
        System.out.printf("Peak Engagement: %.2f%% (Post %d)\n", max, maxIndex + 1);
        System.out.printf("Lowest Engagement: %.2f%% (Post %d)\n", min, minIndex + 1);
        System.out.println("Viral Posts (>200% avg): " + viralCount);
        System.out.printf("Viral Threshold: %.2f%%\n", viralThreshold);
        System.out.println("Top Performers: " + topPosts);

        sc.close();
    }
}
