package one_d_array;
import java.util.Scanner;
public class array9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		double[] a = new double[n];
		
		for(int i=0;i<n;i++) {
			a[i]=scan.nextDouble();
		}
		double max=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		double min = max;
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		double sum =0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		double avg = sum/(double)n;
		System.out.println("Total Stores:"+n);
		System.out.printf("Highest Sales:$%.2f",max);
		System.out.println();
		System.out.printf("Lowest Sales:$%.2f",min);
		System.out.println();
		System.out.printf("Total Sales:$%.2f",sum);
		System.out.println();
		System.out.printf("Average Sales:$%.2f",avg);
	}

}
