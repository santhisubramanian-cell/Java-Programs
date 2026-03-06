package one_d_array;
import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double[] a = new double[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextDouble();
		}
		double max = a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		double min=max;
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		double range = min-max;
		double sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		double avg = sum/(double)n;
		System.out.println("Number of Readings:"+n);
		System.out.println();		
		System.out.printf("Maximum Temperature:%.2fC",max);
		System.out.println();
		System.out.printf("Minimum Temperature:%.2fC",min);
		System.out.println();
		System.out.printf("Temperature Range: %.2fC",Math.abs(range));
		System.out.println();
		System.out.printf("Average Temperature: %.2fC",avg);
		
		
	}


}
