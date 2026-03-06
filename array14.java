package one_d_array;
import java.util.Scanner;
public class array14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		double[] a = new double[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextDouble();
		}
		double total =0;
		double max = a[0];
		for(int i=0;i<n;i++) {
			total+=a[i];
			if(a[i]>max) {
				max=a[i];
			}
		}
		double avg = total/(double)n;
		double threshold = (80.0/100.0)*avg;
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]<threshold) {
				count++;
			}
		}
		System.out.println("Total Plots:"+n);
		System.out.printf("Total Harvest:%.2f",total);
		System.out.println();
		System.out.printf("Average Yield:%.2f",avg);
		System.out.println();
		System.out.printf("Highest Yield:%.2f",max);
		System.out.println();
		System.out.println("Underperforming Plots: "+count);
		System.out.printf("Performance Threshold:%.2f",threshold);
	}

}
