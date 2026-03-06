package one_d_array;
import java.util.Scanner;
public class array20 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] completion = new int[n];
        
        for(int i=0;i<n;i++) {
        	completion[i]=scan.nextInt();
        }
        int totalStudents = completion.length;
        int sum = 0;
        int max = completion[0];
        int min = completion[0];
        int maxIndex = 0;
        int minIndex = 0;
        int atRisk = 0;

        for (int i = 0; i < completion.length; i++) {
            sum += completion[i];

            if (completion[i] > max) {
                max = completion[i];
                maxIndex = i;
            }

            if (completion[i] < min) {
                min = completion[i];
                minIndex = i;
            }

            if (completion[i] < 60) {
                atRisk++;
            }
        }

        double average = (double) sum / totalStudents;
        double successRate = ((double)(totalStudents - atRisk) / totalStudents) * 100;

        System.out.println("Total Students: " + totalStudents);
        System.out.printf("Average Completion: %.2f%%\n", average);
        System.out.println("Highest Completion: " + max + "% (Student " + (maxIndex + 1) + ")");
        System.out.println("Lowest Completion: " + min + "% (Student " + (minIndex + 1) + ")");
        System.out.println("At-Risk Students (<60%): " + atRisk);
        System.out.printf("Success Rate: %.2f%%\n", successRate);
    }
}